package typings
package autobahnLib.autobahnMod.autobahnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPublication extends js.Object {
  var id: scala.Double
}

object IPublication {
  @scala.inline
  def apply(id: scala.Double): IPublication = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[IPublication]
  }
}

