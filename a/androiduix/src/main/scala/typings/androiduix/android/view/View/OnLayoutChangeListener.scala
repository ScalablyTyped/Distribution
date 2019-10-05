package typings.androiduix.android.view.View

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnLayoutChangeListener extends js.Object {
  def onLayoutChange(
    v: typings.androiduix.android.view.View,
    left: Double,
    top: Double,
    right: Double,
    bottom: Double,
    oldLeft: Double,
    oldTop: Double,
    oldRight: Double,
    oldBottom: Double
  ): Unit
}

object OnLayoutChangeListener {
  @scala.inline
  def apply(
    onLayoutChange: (typings.androiduix.android.view.View, Double, Double, Double, Double, Double, Double, Double, Double) => Unit
  ): OnLayoutChangeListener = {
    val __obj = js.Dynamic.literal(onLayoutChange = js.Any.fromFunction9(onLayoutChange))
  
    __obj.asInstanceOf[OnLayoutChangeListener]
  }
}

