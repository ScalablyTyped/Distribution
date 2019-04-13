package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcLinks extends js.Object {
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfVpcLink] = js.undefined
  var position: js.UndefOr[String] = js.undefined
}

object VpcLinks {
  @scala.inline
  def apply(items: ListOfVpcLink = null, position: String = null): VpcLinks = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[VpcLinks]
  }
}

