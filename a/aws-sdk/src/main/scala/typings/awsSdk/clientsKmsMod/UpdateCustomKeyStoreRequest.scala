package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCustomKeyStoreRequest extends StObject {
  
  /**
    * Associates the custom key store with a related CloudHSM cluster. This parameter is valid only for custom key stores with a CustomKeyStoreType of AWS_CLOUDHSM. Enter the cluster ID of the cluster that you used to create the custom key store or a cluster that shares a backup history and has the same cluster certificate as the original cluster. You cannot use this parameter to associate a custom key store with an unrelated cluster. In addition, the replacement cluster must fulfill the requirements for a cluster associated with a custom key store. To view the cluster certificate of a cluster, use the DescribeClusters operation. To change this value, the CloudHSM key store must be disconnected.
    */
  var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType] = js.undefined
  
  /**
    * Identifies the custom key store that you want to update. Enter the ID of the custom key store. To find the ID of a custom key store, use the DescribeCustomKeyStores operation.
    */
  var CustomKeyStoreId: CustomKeyStoreIdType
  
  /**
    * Enter the current password of the kmsuser crypto user (CU) in the CloudHSM cluster that is associated with the custom key store. This parameter is valid only for custom key stores with a CustomKeyStoreType of AWS_CLOUDHSM. This parameter tells KMS the current password of the kmsuser crypto user (CU). It does not set or change the password of any users in the CloudHSM cluster. To change this value, the CloudHSM key store must be disconnected.
    */
  var KeyStorePassword: js.UndefOr[KeyStorePasswordType] = js.undefined
  
  /**
    * Changes the friendly name of the custom key store to the value that you specify. The custom key store name must be unique in the Amazon Web Services account.  Do not include confidential or sensitive information in this field. This field may be displayed in plaintext in CloudTrail logs and other output.  To change this value, an CloudHSM key store must be disconnected. An external key store can be connected or disconnected.
    */
  var NewCustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType] = js.undefined
  
  /**
    * Changes the credentials that KMS uses to sign requests to the external key store proxy (XKS proxy). This parameter is valid only for custom key stores with a CustomKeyStoreType of EXTERNAL_KEY_STORE. You must specify both the AccessKeyId and SecretAccessKey value in the authentication credential, even if you are only updating one value. This parameter doesn't establish or change your authentication credentials on the proxy. It just tells KMS the credential that you established with your external key store proxy. For example, if you rotate the credential on your external key store proxy, you can use this parameter to update the credential in KMS. You can change this value when the external key store is connected or disconnected.
    */
  var XksProxyAuthenticationCredential: js.UndefOr[XksProxyAuthenticationCredentialType] = js.undefined
  
  /**
    * Changes the connectivity setting for the external key store. To indicate that the external key store proxy uses a Amazon VPC endpoint service to communicate with KMS, specify VPC_ENDPOINT_SERVICE. Otherwise, specify PUBLIC_ENDPOINT. If you change the XksProxyConnectivity to VPC_ENDPOINT_SERVICE, you must also change the XksProxyUriEndpoint and add an XksProxyVpcEndpointServiceName value.  If you change the XksProxyConnectivity to PUBLIC_ENDPOINT, you must also change the XksProxyUriEndpoint and specify a null or empty string for the XksProxyVpcEndpointServiceName value. To change this value, the external key store must be disconnected.
    */
  var XksProxyConnectivity: js.UndefOr[XksProxyConnectivityType] = js.undefined
  
  /**
    * Changes the URI endpoint that KMS uses to connect to your external key store proxy (XKS proxy). This parameter is valid only for custom key stores with a CustomKeyStoreType of EXTERNAL_KEY_STORE. For external key stores with an XksProxyConnectivity value of PUBLIC_ENDPOINT, the protocol must be HTTPS. For external key stores with an XksProxyConnectivity value of VPC_ENDPOINT_SERVICE, specify https:// followed by the private DNS name associated with the VPC endpoint service. Each external key store must use a different private DNS name. The combined XksProxyUriEndpoint and XksProxyUriPath values must be unique in the Amazon Web Services account and Region. To change this value, the external key store must be disconnected.
    */
  var XksProxyUriEndpoint: js.UndefOr[XksProxyUriEndpointType] = js.undefined
  
  /**
    * Changes the base path to the proxy APIs for this external key store. To find this value, see the documentation for your external key manager and external key store proxy (XKS proxy). This parameter is valid only for custom key stores with a CustomKeyStoreType of EXTERNAL_KEY_STORE. The value must start with / and must end with /kms/xks/v1, where v1 represents the version of the KMS external key store proxy API. You can include an optional prefix between the required elements such as /example/kms/xks/v1. The combined XksProxyUriEndpoint and XksProxyUriPath values must be unique in the Amazon Web Services account and Region. You can change this value when the external key store is connected or disconnected.
    */
  var XksProxyUriPath: js.UndefOr[XksProxyUriPathType] = js.undefined
  
  /**
    * Changes the name that KMS uses to identify the Amazon VPC endpoint service for your external key store proxy (XKS proxy). This parameter is valid when the CustomKeyStoreType is EXTERNAL_KEY_STORE and the XksProxyConnectivity is VPC_ENDPOINT_SERVICE. To change this value, the external key store must be disconnected.
    */
  var XksProxyVpcEndpointServiceName: js.UndefOr[XksProxyVpcEndpointServiceNameType] = js.undefined
}
object UpdateCustomKeyStoreRequest {
  
  inline def apply(CustomKeyStoreId: CustomKeyStoreIdType): UpdateCustomKeyStoreRequest = {
    val __obj = js.Dynamic.literal(CustomKeyStoreId = CustomKeyStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCustomKeyStoreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCustomKeyStoreRequest] (val x: Self) extends AnyVal {
    
    inline def setCloudHsmClusterId(value: CloudHsmClusterIdType): Self = StObject.set(x, "CloudHsmClusterId", value.asInstanceOf[js.Any])
    
    inline def setCloudHsmClusterIdUndefined: Self = StObject.set(x, "CloudHsmClusterId", js.undefined)
    
    inline def setCustomKeyStoreId(value: CustomKeyStoreIdType): Self = StObject.set(x, "CustomKeyStoreId", value.asInstanceOf[js.Any])
    
    inline def setKeyStorePassword(value: KeyStorePasswordType): Self = StObject.set(x, "KeyStorePassword", value.asInstanceOf[js.Any])
    
    inline def setKeyStorePasswordUndefined: Self = StObject.set(x, "KeyStorePassword", js.undefined)
    
    inline def setNewCustomKeyStoreName(value: CustomKeyStoreNameType): Self = StObject.set(x, "NewCustomKeyStoreName", value.asInstanceOf[js.Any])
    
    inline def setNewCustomKeyStoreNameUndefined: Self = StObject.set(x, "NewCustomKeyStoreName", js.undefined)
    
    inline def setXksProxyAuthenticationCredential(value: XksProxyAuthenticationCredentialType): Self = StObject.set(x, "XksProxyAuthenticationCredential", value.asInstanceOf[js.Any])
    
    inline def setXksProxyAuthenticationCredentialUndefined: Self = StObject.set(x, "XksProxyAuthenticationCredential", js.undefined)
    
    inline def setXksProxyConnectivity(value: XksProxyConnectivityType): Self = StObject.set(x, "XksProxyConnectivity", value.asInstanceOf[js.Any])
    
    inline def setXksProxyConnectivityUndefined: Self = StObject.set(x, "XksProxyConnectivity", js.undefined)
    
    inline def setXksProxyUriEndpoint(value: XksProxyUriEndpointType): Self = StObject.set(x, "XksProxyUriEndpoint", value.asInstanceOf[js.Any])
    
    inline def setXksProxyUriEndpointUndefined: Self = StObject.set(x, "XksProxyUriEndpoint", js.undefined)
    
    inline def setXksProxyUriPath(value: XksProxyUriPathType): Self = StObject.set(x, "XksProxyUriPath", value.asInstanceOf[js.Any])
    
    inline def setXksProxyUriPathUndefined: Self = StObject.set(x, "XksProxyUriPath", js.undefined)
    
    inline def setXksProxyVpcEndpointServiceName(value: XksProxyVpcEndpointServiceNameType): Self = StObject.set(x, "XksProxyVpcEndpointServiceName", value.asInstanceOf[js.Any])
    
    inline def setXksProxyVpcEndpointServiceNameUndefined: Self = StObject.set(x, "XksProxyVpcEndpointServiceName", js.undefined)
  }
}
