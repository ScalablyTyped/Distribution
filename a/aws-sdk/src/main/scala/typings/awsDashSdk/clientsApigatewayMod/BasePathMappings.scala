package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePathMappings extends js.Object {
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfBasePathMapping] = js.undefined
  var position: js.UndefOr[String] = js.undefined
}

object BasePathMappings {
  @scala.inline
  def apply(items: ListOfBasePathMapping = null, position: String = null): BasePathMappings = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[BasePathMappings]
  }
}

