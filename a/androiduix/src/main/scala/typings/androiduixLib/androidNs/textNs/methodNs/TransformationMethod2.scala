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
    getTransformation: js.Function2[java.lang.String, androiduixLib.androidNs.viewNs.View, java.lang.String],
    onFocusChanged: js.Function5[
      androiduixLib.androidNs.viewNs.View, 
      java.lang.String, 
      scala.Boolean, 
      scala.Double, 
      androiduixLib.androidNs.graphicsNs.Rect, 
      scala.Unit
    ],
    setLengthChangesAllowed: js.Function1[scala.Boolean, scala.Unit]
  ): TransformationMethod2 = {
    val __obj = js.Dynamic.literal(getTransformation = getTransformation, onFocusChanged = onFocusChanged, setLengthChangesAllowed = setLengthChangesAllowed)
  
    __obj.asInstanceOf[TransformationMethod2]
  }
}

