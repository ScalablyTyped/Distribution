package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomKeyStoresListEntry extends StObject {
  
  /**
    * A unique identifier for the CloudHSM cluster that is associated with an CloudHSM key store. This field appears only when the CustomKeyStoreType is AWS_CLOUDHSM.
    */
  var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType] = js.undefined
  
  /**
    * Describes the connection error. This field appears in the response only when the ConnectionState is FAILED. Many failures can be resolved by updating the properties of the custom key store. To update a custom key store, disconnect it (DisconnectCustomKeyStore), correct the errors (UpdateCustomKeyStore), and try to connect again (ConnectCustomKeyStore). For additional help resolving these errors, see How to Fix a Connection Failure in Key Management Service Developer Guide.  All custom key stores:     INTERNAL_ERROR — KMS could not complete the request due to an internal error. Retry the request. For ConnectCustomKeyStore requests, disconnect the custom key store before trying to connect again.    NETWORK_ERRORS — Network errors are preventing KMS from connecting the custom key store to its backing key store.    CloudHSM key stores:     CLUSTER_NOT_FOUND — KMS cannot find the CloudHSM cluster with the specified cluster ID.    INSUFFICIENT_CLOUDHSM_HSMS — The associated CloudHSM cluster does not contain any active HSMs. To connect a custom key store to its CloudHSM cluster, the cluster must contain at least one active HSM.    INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET — At least one private subnet associated with the CloudHSM cluster doesn't have any available IP addresses. A CloudHSM key store connection requires one free IP address in each of the associated private subnets, although two are preferable. For details, see How to Fix a Connection Failure in the Key Management Service Developer Guide.    INVALID_CREDENTIALS — The KeyStorePassword for the custom key store doesn't match the current password of the kmsuser crypto user in the CloudHSM cluster. Before you can connect your custom key store to its CloudHSM cluster, you must change the kmsuser account password and update the KeyStorePassword value for the custom key store.    SUBNET_NOT_FOUND — A subnet in the CloudHSM cluster configuration was deleted. If KMS cannot find all of the subnets in the cluster configuration, attempts to connect the custom key store to the CloudHSM cluster fail. To fix this error, create a cluster from a recent backup and associate it with your custom key store. (This process creates a new cluster configuration with a VPC and private subnets.) For details, see How to Fix a Connection Failure in the Key Management Service Developer Guide.    USER_LOCKED_OUT — The kmsuser CU account is locked out of the associated CloudHSM cluster due to too many failed password attempts. Before you can connect your custom key store to its CloudHSM cluster, you must change the kmsuser account password and update the key store password value for the custom key store.    USER_LOGGED_IN — The kmsuser CU account is logged into the associated CloudHSM cluster. This prevents KMS from rotating the kmsuser account password and logging into the cluster. Before you can connect your custom key store to its CloudHSM cluster, you must log the kmsuser CU out of the cluster. If you changed the kmsuser password to log into the cluster, you must also and update the key store password value for the custom key store. For help, see How to Log Out and Reconnect in the Key Management Service Developer Guide.    USER_NOT_FOUND — KMS cannot find a kmsuser CU account in the associated CloudHSM cluster. Before you can connect your custom key store to its CloudHSM cluster, you must create a kmsuser CU account in the cluster, and then update the key store password value for the custom key store.    External key stores:     INVALID_CREDENTIALS — One or both of the XksProxyAuthenticationCredential values is not valid on the specified external key store proxy.    XKS_PROXY_ACCESS_DENIED — KMS requests are denied access to the external key store proxy. If the external key store proxy has authorization rules, verify that they permit KMS to communicate with the proxy on your behalf.    XKS_PROXY_INVALID_CONFIGURATION — A configuration error is preventing the external key store from connecting to its proxy. Verify the value of the XksProxyUriPath.    XKS_PROXY_INVALID_RESPONSE — KMS cannot interpret the response from the external key store proxy. If you see this connection error code repeatedly, notify your external key store proxy vendor.    XKS_PROXY_INVALID_TLS_CONFIGURATION — KMS cannot connect to the external key store proxy because the TLS configuration is invalid. Verify that the XKS proxy supports TLS 1.2 or 1.3. Also, verify that the TLS certificate is not expired, and that it matches the hostname in the XksProxyUriEndpoint value, and that it is signed by a certificate authority included in the Trusted Certificate Authorities list.    XKS_PROXY_NOT_REACHABLE — KMS can't communicate with your external key store proxy. Verify that the XksProxyUriEndpoint and XksProxyUriPath are correct. Use the tools for your external key store proxy to verify that the proxy is active and available on its network. Also, verify that your external key manager instances are operating properly. Connection attempts fail with this connection error code if the proxy reports that all external key manager instances are unavailable.    XKS_PROXY_TIMED_OUT — KMS can connect to the external key store proxy, but the proxy does not respond to KMS in the time allotted. If you see this connection error code repeatedly, notify your external key store proxy vendor.    XKS_VPC_ENDPOINT_SERVICE_INVALID_CONFIGURATION — The Amazon VPC endpoint service configuration doesn't conform to the requirements for an KMS external key store.   The VPC endpoint service must be an endpoint service for interface endpoints in the caller's Amazon Web Services account.   It must have a network load balancer (NLB) connected to at least two subnets, each in a different Availability Zone.   The Allow principals list must include the KMS service principal for the Region, cks.kms.&lt;region&gt;.amazonaws.com, such as cks.kms.us-east-1.amazonaws.com.   It must not require acceptance of connection requests.   It must have a private DNS name. The private DNS name for an external key store with VPC_ENDPOINT_SERVICE connectivity must be unique in its Amazon Web Services Region.   The domain of the private DNS name must have a verification status of verified.   The TLS certificate specifies the private DNS hostname at which the endpoint is reachable.      XKS_VPC_ENDPOINT_SERVICE_NOT_FOUND — KMS can't find the VPC endpoint service that it uses to communicate with the external key store proxy. Verify that the XksProxyVpcEndpointServiceName is correct and the KMS service principal has service consumer permissions on the Amazon VPC endpoint service.  
    */
  var ConnectionErrorCode: js.UndefOr[ConnectionErrorCodeType] = js.undefined
  
  /**
    * Indicates whether the custom key store is connected to its backing key store. For an CloudHSM key store, the ConnectionState indicates whether it is connected to its CloudHSM cluster. For an external key store, the ConnectionState indicates whether it is connected to the external key store proxy that communicates with your external key manager. You can create and use KMS keys in your custom key stores only when its ConnectionState is CONNECTED. The ConnectionState value is DISCONNECTED only if the key store has never been connected or you use the DisconnectCustomKeyStore operation to disconnect it. If the value is CONNECTED but you are having trouble using the custom key store, make sure that the backing key store is reachable and active. For an CloudHSM key store, verify that its associated CloudHSM cluster is active and contains at least one active HSM. For an external key store, verify that the external key store proxy and external key manager are connected and enabled. A value of FAILED indicates that an attempt to connect was unsuccessful. The ConnectionErrorCode field in the response indicates the cause of the failure. For help resolving a connection failure, see Troubleshooting a custom key store in the Key Management Service Developer Guide.
    */
  var ConnectionState: js.UndefOr[ConnectionStateType] = js.undefined
  
  /**
    * The date and time when the custom key store was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A unique identifier for the custom key store.
    */
  var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined
  
  /**
    * The user-specified friendly name for the custom key store.
    */
  var CustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType] = js.undefined
  
  /**
    * Indicates the type of the custom key store. AWS_CLOUDHSM indicates a custom key store backed by an CloudHSM cluster. EXTERNAL_KEY_STORE indicates a custom key store backed by an external key store proxy and external key manager outside of Amazon Web Services.
    */
  var CustomKeyStoreType: js.UndefOr[typings.awsSdk.clientsKmsMod.CustomKeyStoreType] = js.undefined
  
  /**
    * The trust anchor certificate of the CloudHSM cluster associated with an CloudHSM key store. When you initialize the cluster, you create this certificate and save it in the customerCA.crt file. This field appears only when the CustomKeyStoreType is AWS_CLOUDHSM.
    */
  var TrustAnchorCertificate: js.UndefOr[TrustAnchorCertificateType] = js.undefined
  
  /**
    * Configuration settings for the external key store proxy (XKS proxy). The external key store proxy translates KMS requests into a format that your external key manager can understand. The proxy configuration includes connection information that KMS requires. This field appears only when the CustomKeyStoreType is EXTERNAL_KEY_STORE.
    */
  var XksProxyConfiguration: js.UndefOr[XksProxyConfigurationType] = js.undefined
}
object CustomKeyStoresListEntry {
  
  inline def apply(): CustomKeyStoresListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomKeyStoresListEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomKeyStoresListEntry] (val x: Self) extends AnyVal {
    
    inline def setCloudHsmClusterId(value: CloudHsmClusterIdType): Self = StObject.set(x, "CloudHsmClusterId", value.asInstanceOf[js.Any])
    
    inline def setCloudHsmClusterIdUndefined: Self = StObject.set(x, "CloudHsmClusterId", js.undefined)
    
    inline def setConnectionErrorCode(value: ConnectionErrorCodeType): Self = StObject.set(x, "ConnectionErrorCode", value.asInstanceOf[js.Any])
    
    inline def setConnectionErrorCodeUndefined: Self = StObject.set(x, "ConnectionErrorCode", js.undefined)
    
    inline def setConnectionState(value: ConnectionStateType): Self = StObject.set(x, "ConnectionState", value.asInstanceOf[js.Any])
    
    inline def setConnectionStateUndefined: Self = StObject.set(x, "ConnectionState", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setCustomKeyStoreId(value: CustomKeyStoreIdType): Self = StObject.set(x, "CustomKeyStoreId", value.asInstanceOf[js.Any])
    
    inline def setCustomKeyStoreIdUndefined: Self = StObject.set(x, "CustomKeyStoreId", js.undefined)
    
    inline def setCustomKeyStoreName(value: CustomKeyStoreNameType): Self = StObject.set(x, "CustomKeyStoreName", value.asInstanceOf[js.Any])
    
    inline def setCustomKeyStoreNameUndefined: Self = StObject.set(x, "CustomKeyStoreName", js.undefined)
    
    inline def setCustomKeyStoreType(value: CustomKeyStoreType): Self = StObject.set(x, "CustomKeyStoreType", value.asInstanceOf[js.Any])
    
    inline def setCustomKeyStoreTypeUndefined: Self = StObject.set(x, "CustomKeyStoreType", js.undefined)
    
    inline def setTrustAnchorCertificate(value: TrustAnchorCertificateType): Self = StObject.set(x, "TrustAnchorCertificate", value.asInstanceOf[js.Any])
    
    inline def setTrustAnchorCertificateUndefined: Self = StObject.set(x, "TrustAnchorCertificate", js.undefined)
    
    inline def setXksProxyConfiguration(value: XksProxyConfigurationType): Self = StObject.set(x, "XksProxyConfiguration", value.asInstanceOf[js.Any])
    
    inline def setXksProxyConfigurationUndefined: Self = StObject.set(x, "XksProxyConfiguration", js.undefined)
  }
}
