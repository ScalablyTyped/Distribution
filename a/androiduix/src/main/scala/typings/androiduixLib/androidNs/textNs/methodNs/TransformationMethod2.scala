package typings
package androiduixLib.androidNs.textNs.methodNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformationMethod2 extends TransformationMethod {
  def setLengthChangesAllowed(allowLengthChanges: scala.Boolean): scala.Unit
}

object TransformationMethod2 {
  @scala.inline
  def apply(
    getTransformation: (java.lang.String, androiduixLib.androidNs.viewNs.View) => java.lang.String,
    onFocusChanged: (androiduixLib.androidNs.viewNs.View, java.lang.String, scala.Boolean, scala.Double, androiduixLib.androidNs.graphicsNs.Rect) => scala.Unit,
    setLengthChangesAllowed: scala.Boolean => scala.Unit
  ): TransformationMethod2 = {
    val __obj = js.Dynamic.literal(getTransformation = js.Any.fromFunction2(getTransformation), onFocusChanged = js.Any.fromFunction5(onFocusChanged), setLengthChangesAllowed = js.Any.fromFunction1(setLengthChangesAllowed))
  
    __obj.asInstanceOf[TransformationMethod2]
  }
}

