package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomKeyStoreRequest extends StObject {
  
  /**
    * Identifies the CloudHSM cluster for an CloudHSM key store. This parameter is required for custom key stores with CustomKeyStoreType of AWS_CLOUDHSM. Enter the cluster ID of any active CloudHSM cluster that is not already associated with a custom key store. To find the cluster ID, use the DescribeClusters operation.
    */
  var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType] = js.undefined
  
  /**
    * Specifies a friendly name for the custom key store. The name must be unique in your Amazon Web Services account and Region. This parameter is required for all custom key stores.  Do not include confidential or sensitive information in this field. This field may be displayed in plaintext in CloudTrail logs and other output. 
    */
  var CustomKeyStoreName: CustomKeyStoreNameType
  
  /**
    * Specifies the type of custom key store. The default value is AWS_CLOUDHSM. For a custom key store backed by an CloudHSM cluster, omit the parameter or enter AWS_CLOUDHSM. For a custom key store backed by an external key manager outside of Amazon Web Services, enter EXTERNAL_KEY_STORE. You cannot change this property after the key store is created.
    */
  var CustomKeyStoreType: js.UndefOr[typings.awsSdk.clientsKmsMod.CustomKeyStoreType] = js.undefined
  
  /**
    * Specifies the kmsuser password for an CloudHSM key store. This parameter is required for custom key stores with a CustomKeyStoreType of AWS_CLOUDHSM. Enter the password of the  kmsuser crypto user (CU) account in the specified CloudHSM cluster. KMS logs into the cluster as this user to manage key material on your behalf. The password must be a string of 7 to 32 characters. Its value is case sensitive. This parameter tells KMS the kmsuser account password; it does not change the password in the CloudHSM cluster.
    */
  var KeyStorePassword: js.UndefOr[KeyStorePasswordType] = js.undefined
  
  /**
    * Specifies the certificate for an CloudHSM key store. This parameter is required for custom key stores with a CustomKeyStoreType of AWS_CLOUDHSM. Enter the content of the trust anchor certificate for the CloudHSM cluster. This is the content of the customerCA.crt file that you created when you initialized the cluster.
    */
  var TrustAnchorCertificate: js.UndefOr[TrustAnchorCertificateType] = js.undefined
  
  /**
    * Specifies an authentication credential for the external key store proxy (XKS proxy). This parameter is required for all custom key stores with a CustomKeyStoreType of EXTERNAL_KEY_STORE. The XksProxyAuthenticationCredential has two required elements: RawSecretAccessKey, a secret key, and AccessKeyId, a unique identifier for the RawSecretAccessKey. For character requirements, see XksProxyAuthenticationCredentialType. KMS uses this authentication credential to sign requests to the external key store proxy on your behalf. This credential is unrelated to Identity and Access Management (IAM) and Amazon Web Services credentials. This parameter doesn't set or change the authentication credentials on the XKS proxy. It just tells KMS the credential that you established on your external key store proxy. If you rotate your proxy authentication credential, use the UpdateCustomKeyStore operation to provide the new credential to KMS.
    */
  var XksProxyAuthenticationCredential: js.UndefOr[XksProxyAuthenticationCredentialType] = js.undefined
  
  /**
    * Indicates how KMS communicates with the external key store proxy. This parameter is required for custom key stores with a CustomKeyStoreType of EXTERNAL_KEY_STORE. If the external key store proxy uses a public endpoint, specify PUBLIC_ENDPOINT. If the external key store proxy uses a Amazon VPC endpoint service for communication with KMS, specify VPC_ENDPOINT_SERVICE. For help making this choice, see Choosing a connectivity option in the Key Management Service Developer Guide. An Amazon VPC endpoint service keeps your communication with KMS in a private address space entirely within Amazon Web Services, but it requires more configuration, including establishing a Amazon VPC with multiple subnets, a VPC endpoint service, a network load balancer, and a verified private DNS name. A public endpoint is simpler to set up, but it might be slower and might not fulfill your security requirements. You might consider testing with a public endpoint, and then establishing a VPC endpoint service for production tasks. Note that this choice does not determine the location of the external key store proxy. Even if you choose a VPC endpoint service, the proxy can be hosted within the VPC or outside of Amazon Web Services such as in your corporate data center.
    */
  var XksProxyConnectivity: js.UndefOr[XksProxyConnectivityType] = js.undefined
  
  /**
    * Specifies the endpoint that KMS uses to send requests to the external key store proxy (XKS proxy). This parameter is required for custom key stores with a CustomKeyStoreType of EXTERNAL_KEY_STORE. The protocol must be HTTPS. KMS communicates on port 443. Do not specify the port in the XksProxyUriEndpoint value. For external key stores with XksProxyConnectivity value of VPC_ENDPOINT_SERVICE, specify https:// followed by the private DNS name of the VPC endpoint service. For external key stores with PUBLIC_ENDPOINT connectivity, this endpoint must be reachable before you create the custom key store. KMS connects to the external key store proxy while creating the custom key store. For external key stores with VPC_ENDPOINT_SERVICE connectivity, KMS connects when you call the ConnectCustomKeyStore operation. The value of this parameter must begin with https://. The remainder can contain upper and lower case letters (A-Z and a-z), numbers (0-9), dots (.), and hyphens (-). Additional slashes (/ and \) are not permitted.  Uniqueness requirements:     The combined XksProxyUriEndpoint and XksProxyUriPath values must be unique in the Amazon Web Services account and Region.   An external key store with PUBLIC_ENDPOINT connectivity cannot use the same XksProxyUriEndpoint value as an external key store with VPC_ENDPOINT_SERVICE connectivity in the same Amazon Web Services Region.   Each external key store with VPC_ENDPOINT_SERVICE connectivity must have its own private DNS name. The XksProxyUriEndpoint value for external key stores with VPC_ENDPOINT_SERVICE connectivity (private DNS name) must be unique in the Amazon Web Services account and Region.  
    */
  var XksProxyUriEndpoint: js.UndefOr[XksProxyUriEndpointType] = js.undefined
  
  /**
    * Specifies the base path to the proxy APIs for this external key store. To find this value, see the documentation for your external key store proxy. This parameter is required for all custom key stores with a CustomKeyStoreType of EXTERNAL_KEY_STORE. The value must start with / and must end with /kms/xks/v1 where v1 represents the version of the KMS external key store proxy API. This path can include an optional prefix between the required elements such as /prefix/kms/xks/v1.  Uniqueness requirements:     The combined XksProxyUriEndpoint and XksProxyUriPath values must be unique in the Amazon Web Services account and Region.  
    */
  var XksProxyUriPath: js.UndefOr[XksProxyUriPathType] = js.undefined
  
  /**
    * Specifies the name of the Amazon VPC endpoint service for interface endpoints that is used to communicate with your external key store proxy (XKS proxy). This parameter is required when the value of CustomKeyStoreType is EXTERNAL_KEY_STORE and the value of XksProxyConnectivity is VPC_ENDPOINT_SERVICE. The Amazon VPC endpoint service must fulfill all requirements for use with an external key store.   Uniqueness requirements:    External key stores with VPC_ENDPOINT_SERVICE connectivity can share an Amazon VPC, but each external key store must have its own VPC endpoint service and private DNS name.  
    */
  var XksProxyVpcEndpointServiceName: js.UndefOr[XksProxyVpcEndpointServiceNameType] = js.undefined
}
object CreateCustomKeyStoreRequest {
  
  inline def apply(CustomKeyStoreName: CustomKeyStoreNameType): CreateCustomKeyStoreRequest = {
    val __obj = js.Dynamic.literal(CustomKeyStoreName = CustomKeyStoreName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomKeyStoreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCustomKeyStoreRequest] (val x: Self) extends AnyVal {
    
    inline def setCloudHsmClusterId(value: CloudHsmClusterIdType): Self = StObject.set(x, "CloudHsmClusterId", value.asInstanceOf[js.Any])
    
    inline def setCloudHsmClusterIdUndefined: Self = StObject.set(x, "CloudHsmClusterId", js.undefined)
    
    inline def setCustomKeyStoreName(value: CustomKeyStoreNameType): Self = StObject.set(x, "CustomKeyStoreName", value.asInstanceOf[js.Any])
    
    inline def setCustomKeyStoreType(value: CustomKeyStoreType): Self = StObject.set(x, "CustomKeyStoreType", value.asInstanceOf[js.Any])
    
    inline def setCustomKeyStoreTypeUndefined: Self = StObject.set(x, "CustomKeyStoreType", js.undefined)
    
    inline def setKeyStorePassword(value: KeyStorePasswordType): Self = StObject.set(x, "KeyStorePassword", value.asInstanceOf[js.Any])
    
    inline def setKeyStorePasswordUndefined: Self = StObject.set(x, "KeyStorePassword", js.undefined)
    
    inline def setTrustAnchorCertificate(value: TrustAnchorCertificateType): Self = StObject.set(x, "TrustAnchorCertificate", value.asInstanceOf[js.Any])
    
    inline def setTrustAnchorCertificateUndefined: Self = StObject.set(x, "TrustAnchorCertificate", js.undefined)
    
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
