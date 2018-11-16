package typings
package androiduixLib.androidNs.textNs.methodNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.method.ReplacementTransformationMethod")
@js.native
abstract class ReplacementTransformationMethod () extends TransformationMethod {
  /* protected */ def getOriginal(): js.Array[java.lang.String] = js.native
  /* protected */ def getReplacement(): js.Array[java.lang.String] = js.native
  /* CompleteClass */
  override def getTransformation(source: java.lang.String, view: androiduixLib.androidNs.viewNs.View): java.lang.String = js.native
  /* CompleteClass */
  override def onFocusChanged(
    view: androiduixLib.androidNs.viewNs.View,
    sourceText: java.lang.String,
    focused: scala.Boolean,
    direction: scala.Double,
    previouslyFocusedRect: androiduixLib.androidNs.graphicsNs.Rect
  ): scala.Unit = js.native
}

