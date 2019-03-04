package typings
package androiduixLib.androidNs.viewNs.ViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnLayoutChangeListener extends js.Object {
  def onLayoutChange(
    v: androiduixLib.androidNs.viewNs.View,
    left: scala.Double,
    top: scala.Double,
    right: scala.Double,
    bottom: scala.Double,
    oldLeft: scala.Double,
    oldTop: scala.Double,
    oldRight: scala.Double,
    oldBottom: scala.Double
  ): scala.Unit
}

object OnLayoutChangeListener {
  @scala.inline
  def apply(
    onLayoutChange: js.Function9[
      androiduixLib.androidNs.viewNs.View, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Unit
    ]
  ): OnLayoutChangeListener = {
    val __obj = js.Dynamic.literal(onLayoutChange = onLayoutChange)
  
    __obj.asInstanceOf[OnLayoutChangeListener]
  }
}

