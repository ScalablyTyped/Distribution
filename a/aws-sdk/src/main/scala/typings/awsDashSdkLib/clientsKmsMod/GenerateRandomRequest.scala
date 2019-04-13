package typings
package awsDashSdkLib.clientsKmsMod

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
  def apply(
    CustomKeyStoreId: CustomKeyStoreIdType = null,
    NumberOfBytes: js.UndefOr[NumberOfBytesType] = js.undefined
  ): GenerateRandomRequest = {
    val __obj = js.Dynamic.literal()
    if (CustomKeyStoreId != null) __obj.updateDynamic("CustomKeyStoreId")(CustomKeyStoreId)
    if (!js.isUndefined(NumberOfBytes)) __obj.updateDynamic("NumberOfBytes")(NumberOfBytes)
    __obj.asInstanceOf[GenerateRandomRequest]
  }
}

