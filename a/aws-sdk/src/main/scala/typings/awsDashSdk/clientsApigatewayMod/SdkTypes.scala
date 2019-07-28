package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SdkTypes extends js.Object {
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfSdkType] = js.undefined
  var position: js.UndefOr[String] = js.undefined
}

object SdkTypes {
  @scala.inline
  def apply(items: ListOfSdkType = null, position: String = null): SdkTypes = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[SdkTypes]
  }
}

