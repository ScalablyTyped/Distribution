package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aliases extends js.Object {
  /**
    * A complex type that contains the CNAME aliases, if any, that you want to associate with this distribution.
    */
  var Items: js.UndefOr[AliasList] = js.undefined
  /**
    * The number of CNAME aliases, if any, that you want to associate with this distribution.
    */
  var Quantity: integer
}

object Aliases {
  @scala.inline
  def apply(Quantity: integer, Items: AliasList = null): Aliases = {
    val __obj = js.Dynamic.literal(Quantity = Quantity)
    if (Items != null) __obj.updateDynamic("Items")(Items)
    __obj.asInstanceOf[Aliases]
  }
}

