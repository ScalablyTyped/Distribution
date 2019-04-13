package typings
package awsDashSdkLib.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCustomKeyStoreRequest extends js.Object {
  /**
    * Associates the custom key store with a related AWS CloudHSM cluster.  Enter the cluster ID of the cluster that you used to create the custom key store or a cluster that shares a backup history with the original cluster. You cannot use this parameter to associate a custom key store with a different cluster. Clusters that share a backup history have the same cluster certificate. To view the cluster certificate of a cluster, use the DescribeClusters operation.
    */
  var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType] = js.undefined
  /**
    * Identifies the custom key store that you want to update. Enter the ID of the custom key store. To find the ID of a custom key store, use the DescribeCustomKeyStores operation.
    */
  var CustomKeyStoreId: CustomKeyStoreIdType
  /**
    * Enter the current password of the kmsuser crypto user (CU) in the AWS CloudHSM cluster that is associated with the custom key store. This parameter tells AWS KMS the current password of the kmsuser crypto user (CU). It does not set or change the password of any users in the AWS CloudHSM cluster.
    */
  var KeyStorePassword: js.UndefOr[KeyStorePasswordType] = js.undefined
  /**
    * Changes the friendly name of the custom key store to the value that you specify. The custom key store name must be unique in the AWS account.
    */
  var NewCustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType] = js.undefined
}

object UpdateCustomKeyStoreRequest {
  @scala.inline
  def apply(
    CustomKeyStoreId: CustomKeyStoreIdType,
    CloudHsmClusterId: CloudHsmClusterIdType = null,
    KeyStorePassword: KeyStorePasswordType = null,
    NewCustomKeyStoreName: CustomKeyStoreNameType = null
  ): UpdateCustomKeyStoreRequest = {
    val __obj = js.Dynamic.literal(CustomKeyStoreId = CustomKeyStoreId)
    if (CloudHsmClusterId != null) __obj.updateDynamic("CloudHsmClusterId")(CloudHsmClusterId)
    if (KeyStorePassword != null) __obj.updateDynamic("KeyStorePassword")(KeyStorePassword)
    if (NewCustomKeyStoreName != null) __obj.updateDynamic("NewCustomKeyStoreName")(NewCustomKeyStoreName)
    __obj.asInstanceOf[UpdateCustomKeyStoreRequest]
  }
}

