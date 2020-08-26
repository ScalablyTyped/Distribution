package typings.androiduix.android.text.TextUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EllipsizeCallback extends js.Object {
  def ellipsized(start: Double, end: Double): Unit = js.native
}

object EllipsizeCallback {
  @scala.inline
  def apply(ellipsized: (Double, Double) => Unit): EllipsizeCallback = {
    val __obj = js.Dynamic.literal(ellipsized = js.Any.fromFunction2(ellipsized))
    __obj.asInstanceOf[EllipsizeCallback]
  }
  @scala.inline
  implicit class EllipsizeCallbackOps[Self <: EllipsizeCallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEllipsized(value: (Double, Double) => Unit): Self = this.set("ellipsized", js.Any.fromFunction2(value))
  }
  
}

