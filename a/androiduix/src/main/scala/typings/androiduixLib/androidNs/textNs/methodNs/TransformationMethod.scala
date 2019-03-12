package typings
package androiduixLib.androidNs.textNs.methodNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformationMethod extends js.Object {
  def getTransformation(source: java.lang.String, view: androiduixLib.androidNs.viewNs.View): java.lang.String
  def onFocusChanged(
    view: androiduixLib.androidNs.viewNs.View,
    sourceText: java.lang.String,
    focused: scala.Boolean,
    direction: scala.Double,
    previouslyFocusedRect: androiduixLib.androidNs.graphicsNs.Rect
  ): scala.Unit
}

object TransformationMethod {
  @scala.inline
  def apply(
    getTransformation: (java.lang.String, androiduixLib.androidNs.viewNs.View) => java.lang.String,
    onFocusChanged: (androiduixLib.androidNs.viewNs.View, java.lang.String, scala.Boolean, scala.Double, androiduixLib.androidNs.graphicsNs.Rect) => scala.Unit
  ): TransformationMethod = {
    val __obj = js.Dynamic.literal(getTransformation = js.Any.fromFunction2(getTransformation), onFocusChanged = js.Any.fromFunction5(onFocusChanged))
  
    __obj.asInstanceOf[TransformationMethod]
  }
}

