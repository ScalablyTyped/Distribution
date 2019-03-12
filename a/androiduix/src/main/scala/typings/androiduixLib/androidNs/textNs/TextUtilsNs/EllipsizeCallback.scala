package typings
package androiduixLib.androidNs.textNs.TextUtilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EllipsizeCallback extends js.Object {
  def ellipsized(start: scala.Double, end: scala.Double): scala.Unit
}

object EllipsizeCallback {
  @scala.inline
  def apply(ellipsized: (scala.Double, scala.Double) => scala.Unit): EllipsizeCallback = {
    val __obj = js.Dynamic.literal(ellipsized = js.Any.fromFunction2(ellipsized))
  
    __obj.asInstanceOf[EllipsizeCallback]
  }
}

