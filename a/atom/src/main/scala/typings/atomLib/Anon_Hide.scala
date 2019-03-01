package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hide extends js.Object {
  var hide: scala.Double
  var show: scala.Double
}

object Anon_Hide {
  @scala.inline
  def apply(hide: scala.Double, show: scala.Double): Anon_Hide = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_Hide]
  }
}

