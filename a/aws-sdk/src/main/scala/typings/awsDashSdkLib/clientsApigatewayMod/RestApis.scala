package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestApis extends js.Object {
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfRestApi] = js.undefined
  var position: js.UndefOr[String] = js.undefined
}

object RestApis {
  @scala.inline
  def apply(items: ListOfRestApi = null, position: String = null): RestApis = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[RestApis]
  }
}

