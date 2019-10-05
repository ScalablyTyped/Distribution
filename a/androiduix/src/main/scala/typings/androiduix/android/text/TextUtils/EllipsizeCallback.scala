package typings.androiduix.android.text.TextUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EllipsizeCallback extends js.Object {
  def ellipsized(start: Double, end: Double): Unit
}

object EllipsizeCallback {
  @scala.inline
  def apply(ellipsized: (Double, Double) => Unit): EllipsizeCallback = {
    val __obj = js.Dynamic.literal(ellipsized = js.Any.fromFunction2(ellipsized))
  
    __obj.asInstanceOf[EllipsizeCallback]
  }
}

