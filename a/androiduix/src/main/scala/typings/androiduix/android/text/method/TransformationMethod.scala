package typings.androiduix.android.text.method

import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformationMethod extends js.Object {
  def getTransformation(source: String, view: View): String
  def onFocusChanged(view: View, sourceText: String, focused: Boolean, direction: Double, previouslyFocusedRect: Rect): Unit
}

@JSGlobal("android.text.method.TransformationMethod")
@js.native
object TransformationMethod extends js.Object {
  def isImpl(obj: js.Any): Boolean = js.native
}

