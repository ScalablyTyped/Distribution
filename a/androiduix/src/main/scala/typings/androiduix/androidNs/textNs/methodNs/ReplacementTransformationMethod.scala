package typings.androiduix.androidNs.textNs.methodNs

import typings.androiduix.androidNs.graphicsNs.Rect
import typings.androiduix.androidNs.viewNs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.method.ReplacementTransformationMethod")
@js.native
abstract class ReplacementTransformationMethod () extends TransformationMethod {
  /* protected */ def getOriginal(): js.Array[String] = js.native
  /* protected */ def getReplacement(): js.Array[String] = js.native
  /* CompleteClass */
  override def getTransformation(source: String, view: View): String = js.native
  /* CompleteClass */
  override def onFocusChanged(view: View, sourceText: String, focused: Boolean, direction: Double, previouslyFocusedRect: Rect): Unit = js.native
}

