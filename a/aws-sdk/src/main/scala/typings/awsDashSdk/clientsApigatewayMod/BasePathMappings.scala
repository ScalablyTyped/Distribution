package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasePathMappings extends js.Object {
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfBasePathMapping] = js.native
  var position: js.UndefOr[String] = js.native
}

object BasePathMappings {
  @scala.inline
  def apply(items: ListOfBasePathMapping = null, position: String = null): BasePathMappings = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePathMappings]
  }
}

