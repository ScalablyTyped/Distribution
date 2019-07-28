package typings.androiduix.androidNs.textNs.methodNs

import typings.androiduix.androidNs.graphicsNs.Rect
import typings.androiduix.androidNs.viewNs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.method.AllCapsTransformationMethod")
@js.native
class AllCapsTransformationMethod () extends TransformationMethod2 {
  def this(context: js.Any) = this()
  var mEnabled: js.Any = js.native
  /* CompleteClass */
  override def getTransformation(source: String, view: View): String = js.native
  /* CompleteClass */
  override def onFocusChanged(view: View, sourceText: String, focused: Boolean, direction: Double, previouslyFocusedRect: Rect): Unit = js.native
  /* CompleteClass */
  override def setLengthChangesAllowed(allowLengthChanges: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("android.text.method.AllCapsTransformationMethod")
@js.native
object AllCapsTransformationMethod extends js.Object {
  var TAG: js.Any = js.native
}

