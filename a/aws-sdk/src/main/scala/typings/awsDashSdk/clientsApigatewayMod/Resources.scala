package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resources extends js.Object {
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfResource] = js.undefined
  var position: js.UndefOr[String] = js.undefined
}

object Resources {
  @scala.inline
  def apply(items: ListOfResource = null, position: String = null): Resources = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Resources]
  }
}

