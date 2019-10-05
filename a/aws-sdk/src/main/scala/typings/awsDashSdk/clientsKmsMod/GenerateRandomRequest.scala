package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateRandomRequest extends js.Object {
  /**
    * Generates the random byte string in the AWS CloudHSM cluster that is associated with the specified custom key store. To find the ID of a custom key store, use the DescribeCustomKeyStores operation.
    */
  var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined
  /**
    * The length of the byte string.
    */
  var NumberOfBytes: js.UndefOr[NumberOfBytesType] = js.undefined
}

object GenerateRandomRequest {
  @scala.inline
  def apply(CustomKeyStoreId: CustomKeyStoreIdType = null, NumberOfBytes: Int | Double = null): GenerateRandomRequest = {
    val __obj = js.Dynamic.literal()
    if (CustomKeyStoreId != null) __obj.updateDynamic("CustomKeyStoreId")(CustomKeyStoreId)
    if (NumberOfBytes != null) __obj.updateDynamic("NumberOfBytes")(NumberOfBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateRandomRequest]
  }
}

