package typings
package awsDashSdkLib.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomKeyStoresListEntry extends js.Object {
  /**
    * A unique identifier for the AWS CloudHSM cluster that is associated with the custom key store.
    */
  var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType] = js.undefined
  /**
    * Describes the connection error. Valid values are:    CLUSTER_NOT_FOUND - AWS KMS cannot find the AWS CloudHSM cluster with the specified cluster ID.    INSUFFICIENT_CLOUDHSM_HSMS - The associated AWS CloudHSM cluster does not contain any active HSMs. To connect a custom key store to its AWS CloudHSM cluster, the cluster must contain at least one active HSM.    INVALID_CREDENTIALS - AWS KMS does not have the correct password for the kmsuser crypto user in the AWS CloudHSM cluster.    NETWORK_ERRORS - Network errors are preventing AWS KMS from connecting to the custom key store.    USER_LOCKED_OUT - The kmsuser CU account is locked out of the associated AWS CloudHSM cluster due to too many failed password attempts. Before you can connect your custom key store to its AWS CloudHSM cluster, you must change the kmsuser account password and update the password value for the custom key store.   For help with connection failures, see Troubleshooting Custom Key Stores in the AWS Key Management Service Developer Guide.
    */
  var ConnectionErrorCode: js.UndefOr[ConnectionErrorCodeType] = js.undefined
  /**
    * Indicates whether the custom key store is connected to its AWS CloudHSM cluster. You can create and use CMKs in your custom key stores only when its connection state is CONNECTED. The value is DISCONNECTED if the key store has never been connected or you use the DisconnectCustomKeyStore operation to disconnect it. If the value is CONNECTED but you are having trouble using the custom key store, make sure that its associated AWS CloudHSM cluster is active and contains at least one active HSM. A value of FAILED indicates that an attempt to connect was unsuccessful. For help resolving a connection failure, see Troubleshooting a Custom Key Store in the AWS Key Management Service Developer Guide.
    */
  var ConnectionState: js.UndefOr[ConnectionStateType] = js.undefined
  /**
    * The date and time when the custom key store was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.undefined
  /**
    * A unique identifier for the custom key store.
    */
  var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined
  /**
    * The user-specified friendly name for the custom key store.
    */
  var CustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType] = js.undefined
  /**
    * The trust anchor certificate of the associated AWS CloudHSM cluster. When you initialize the cluster, you create this certificate and save it in the customerCA.crt file.
    */
  var TrustAnchorCertificate: js.UndefOr[TrustAnchorCertificateType] = js.undefined
}

object CustomKeyStoresListEntry {
  @scala.inline
  def apply(
    CloudHsmClusterId: CloudHsmClusterIdType = null,
    ConnectionErrorCode: ConnectionErrorCodeType = null,
    ConnectionState: ConnectionStateType = null,
    CreationDate: DateType = null,
    CustomKeyStoreId: CustomKeyStoreIdType = null,
    CustomKeyStoreName: CustomKeyStoreNameType = null,
    TrustAnchorCertificate: TrustAnchorCertificateType = null
  ): CustomKeyStoresListEntry = {
    val __obj = js.Dynamic.literal()
    if (CloudHsmClusterId != null) __obj.updateDynamic("CloudHsmClusterId")(CloudHsmClusterId)
    if (ConnectionErrorCode != null) __obj.updateDynamic("ConnectionErrorCode")(ConnectionErrorCode.asInstanceOf[js.Any])
    if (ConnectionState != null) __obj.updateDynamic("ConnectionState")(ConnectionState.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (CustomKeyStoreId != null) __obj.updateDynamic("CustomKeyStoreId")(CustomKeyStoreId)
    if (CustomKeyStoreName != null) __obj.updateDynamic("CustomKeyStoreName")(CustomKeyStoreName)
    if (TrustAnchorCertificate != null) __obj.updateDynamic("TrustAnchorCertificate")(TrustAnchorCertificate)
    __obj.asInstanceOf[CustomKeyStoresListEntry]
  }
}

