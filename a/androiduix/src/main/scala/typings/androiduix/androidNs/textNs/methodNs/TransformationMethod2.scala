package typings.androiduix.androidNs.textNs.methodNs

import typings.androiduix.androidNs.graphicsNs.Rect
import typings.androiduix.androidNs.viewNs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformationMethod2 extends TransformationMethod {
  def setLengthChangesAllowed(allowLengthChanges: Boolean): Unit
}

object TransformationMethod2 {
  @scala.inline
  def apply(
    getTransformation: (String, View) => String,
    onFocusChanged: (View, String, Boolean, Double, Rect) => Unit,
    setLengthChangesAllowed: Boolean => Unit
  ): TransformationMethod2 = {
    val __obj = js.Dynamic.literal(getTransformation = js.Any.fromFunction2(getTransformation), onFocusChanged = js.Any.fromFunction5(onFocusChanged), setLengthChangesAllowed = js.Any.fromFunction1(setLengthChangesAllowed))
  
    __obj.asInstanceOf[TransformationMethod2]
  }
}

