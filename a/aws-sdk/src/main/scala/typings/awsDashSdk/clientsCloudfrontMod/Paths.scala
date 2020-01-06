package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Paths extends js.Object {
  /**
    * A complex type that contains a list of the paths that you want to invalidate.
    */
  var Items: js.UndefOr[PathList] = js.native
  /**
    * The number of invalidation paths specified for the objects that you want to invalidate.
    */
  var Quantity: integer = js.native
}

object Paths {
  @scala.inline
  def apply(Quantity: integer, Items: PathList = null): Paths = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paths]
  }
}

