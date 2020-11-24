package typings.androiduix.android.text.method

import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformationMethod extends js.Object {
  
  def getTransformation(source: String, view: View): String = js.native
  
  def onFocusChanged(view: View, sourceText: String, focused: Boolean, direction: Double, previouslyFocusedRect: Rect): Unit = js.native
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
  
  @scala.inline
  implicit class TransformationMethodOps[Self <: TransformationMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetTransformation(value: (String, View) => String): Self = this.set("getTransformation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnFocusChanged(value: (View, String, Boolean, Double, Rect) => Unit): Self = this.set("onFocusChanged", js.Any.fromFunction5(value))
  }
}
