package typings
package androiduixLib.androidNs.textNs.methodNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.method.AllCapsTransformationMethod")
@js.native
class AllCapsTransformationMethod () extends TransformationMethod2 {
  def this(context: js.Any) = this()
  var mEnabled: js.Any = js.native
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
  /* CompleteClass */
  override def setLengthChangesAllowed(allowLengthChanges: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.text.method.AllCapsTransformationMethod")
@js.native
object AllCapsTransformationMethod extends js.Object {
  var TAG: js.Any = js.native
}

