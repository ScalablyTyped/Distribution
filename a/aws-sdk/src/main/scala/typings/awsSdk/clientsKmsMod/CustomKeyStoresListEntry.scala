package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomKeyStoresListEntry extends StObject {
  
  /**
    * A unique identifier for the CloudHSM cluster that is associated with the custom key store.
    */
  var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType] = js.undefined
  
  /**
    * Describes the connection error. This field appears in the response only when the ConnectionState is FAILED. For help resolving these errors, see How to Fix a Connection Failure in Key Management Service Developer Guide. Valid values are:    CLUSTER_NOT_FOUND - KMS cannot find the CloudHSM cluster with the specified cluster ID.    INSUFFICIENT_CLOUDHSM_HSMS - The associated CloudHSM cluster does not contain any active HSMs. To connect a custom key store to its CloudHSM cluster, the cluster must contain at least one active HSM.    INTERNAL_ERROR - KMS could not complete the request due to an internal error. Retry the request. For ConnectCustomKeyStore requests, disconnect the custom key store before trying to connect again.    INVALID_CREDENTIALS - KMS does not have the correct password for the kmsuser crypto user in the CloudHSM cluster. Before you can connect your custom key store to its CloudHSM cluster, you must change the kmsuser account password and update the key store password value for the custom key store.    NETWORK_ERRORS - Network errors are preventing KMS from connecting to the custom key store.    SUBNET_NOT_FOUND - A subnet in the CloudHSM cluster configuration was deleted. If KMS cannot find all of the subnets in the cluster configuration, attempts to connect the custom key store to the CloudHSM cluster fail. To fix this error, create a cluster from a recent backup and associate it with your custom key store. (This process creates a new cluster configuration with a VPC and private subnets.) For details, see How to Fix a Connection Failure in the Key Management Service Developer Guide.    USER_LOCKED_OUT - The kmsuser CU account is locked out of the associated CloudHSM cluster due to too many failed password attempts. Before you can connect your custom key store to its CloudHSM cluster, you must change the kmsuser account password and update the key store password value for the custom key store.    USER_LOGGED_IN - The kmsuser CU account is logged into the the associated CloudHSM cluster. This prevents KMS from rotating the kmsuser account password and logging into the cluster. Before you can connect your custom key store to its CloudHSM cluster, you must log the kmsuser CU out of the cluster. If you changed the kmsuser password to log into the cluster, you must also and update the key store password value for the custom key store. For help, see How to Log Out and Reconnect in the Key Management Service Developer Guide.    USER_NOT_FOUND - KMS cannot find a kmsuser CU account in the associated CloudHSM cluster. Before you can connect your custom key store to its CloudHSM cluster, you must create a kmsuser CU account in the cluster, and then update the key store password value for the custom key store.  
    */
  var ConnectionErrorCode: js.UndefOr[ConnectionErrorCodeType] = js.undefined
  
  /**
    * Indicates whether the custom key store is connected to its CloudHSM cluster. You can create and use KMS keys in your custom key stores only when its connection state is CONNECTED. The value is DISCONNECTED if the key store has never been connected or you use the DisconnectCustomKeyStore operation to disconnect it. If the value is CONNECTED but you are having trouble using the custom key store, make sure that its associated CloudHSM cluster is active and contains at least one active HSM. A value of FAILED indicates that an attempt to connect was unsuccessful. The ConnectionErrorCode field in the response indicates the cause of the failure. For help resolving a connection failure, see Troubleshooting a Custom Key Store in the Key Management Service Developer Guide.
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
    * The trust anchor certificate of the associated CloudHSM cluster. When you initialize the cluster, you create this certificate and save it in the customerCA.crt file.
    */
  var TrustAnchorCertificate: js.UndefOr[TrustAnchorCertificateType] = js.undefined
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
    
    inline def setTrustAnchorCertificate(value: TrustAnchorCertificateType): Self = StObject.set(x, "TrustAnchorCertificate", value.asInstanceOf[js.Any])
    
    inline def setTrustAnchorCertificateUndefined: Self = StObject.set(x, "TrustAnchorCertificate", js.undefined)
  }
}
