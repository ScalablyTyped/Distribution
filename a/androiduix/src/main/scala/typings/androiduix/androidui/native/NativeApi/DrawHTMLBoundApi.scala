package typings.androiduix.androidui.native.NativeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawHTMLBoundApi extends js.Object {
  def hideDrawHTMLBound(viewHash: Double): Unit
  def showDrawHTMLBound(viewHash: Double, left: Double, top: Double, right: Double, bottom: Double): Unit
}

object DrawHTMLBoundApi {
  @scala.inline
  def apply(
    hideDrawHTMLBound: Double => Unit,
    showDrawHTMLBound: (Double, Double, Double, Double, Double) => Unit
  ): DrawHTMLBoundApi = {
    val __obj = js.Dynamic.literal(hideDrawHTMLBound = js.Any.fromFunction1(hideDrawHTMLBound), showDrawHTMLBound = js.Any.fromFunction5(showDrawHTMLBound))
    __obj.asInstanceOf[DrawHTMLBoundApi]
  }
}

