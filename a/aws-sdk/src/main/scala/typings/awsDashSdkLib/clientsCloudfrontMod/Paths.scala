package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paths extends js.Object {
  /**
    * A complex type that contains a list of the paths that you want to invalidate.
    */
  var Items: js.UndefOr[PathList] = js.undefined
  /**
    * The number of objects that you want to invalidate.
    */
  var Quantity: integer
}

object Paths {
  @scala.inline
  def apply(Quantity: integer, Items: PathList = null): Paths = {
    val __obj = js.Dynamic.literal(Quantity = Quantity)
    if (Items != null) __obj.updateDynamic("Items")(Items)
    __obj.asInstanceOf[Paths]
  }
}

