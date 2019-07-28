package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCustomKeyStoreResponse extends js.Object {
  /**
    * A unique identifier for the new custom key store.
    */
  var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined
}

object CreateCustomKeyStoreResponse {
  @scala.inline
  def apply(CustomKeyStoreId: CustomKeyStoreIdType = null): CreateCustomKeyStoreResponse = {
    val __obj = js.Dynamic.literal()
    if (CustomKeyStoreId != null) __obj.updateDynamic("CustomKeyStoreId")(CustomKeyStoreId)
    __obj.asInstanceOf[CreateCustomKeyStoreResponse]
  }
}

