package typings.androiduix.androidNs.textNs.methodNs

import typings.androiduix.androidNs.graphicsNs.Rect
import typings.androiduix.androidNs.viewNs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformationMethod extends js.Object {
  def getTransformation(source: String, view: View): String
  def onFocusChanged(view: View, sourceText: String, focused: Boolean, direction: Double, previouslyFocusedRect: Rect): Unit
}

object TransformationMethod {
  @scala.inline
  def apply(
    getTransformation: (String, View) => String,
    onFocusChanged: (View, String, Boolean, Double, Rect) => Unit
  ): TransformationMethod = {
    val __obj = js.Dynamic.literal(getTransformation = js.Any.fromFunction2(getTransformation), onFocusChanged = js.Any.fromFunction5(onFocusChanged))
  
    __obj.asInstanceOf[TransformationMethod]
  }
}

