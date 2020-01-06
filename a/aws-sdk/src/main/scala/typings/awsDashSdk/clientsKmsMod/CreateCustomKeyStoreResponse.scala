package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCustomKeyStoreResponse extends js.Object {
  /**
    * A unique identifier for the new custom key store.
    */
  var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.native
}

object CreateCustomKeyStoreResponse {
  @scala.inline
  def apply(CustomKeyStoreId: CustomKeyStoreIdType = null): CreateCustomKeyStoreResponse = {
    val __obj = js.Dynamic.literal()
    if (CustomKeyStoreId != null) __obj.updateDynamic("CustomKeyStoreId")(CustomKeyStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomKeyStoreResponse]
  }
}

