package typings.androiduix.android.text.method

import typings.androiduix.android.graphics.Rect
import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllCapsTransformationMethod extends TransformationMethod2 {
  
  var mEnabled: js.Any = js.native
}
object AllCapsTransformationMethod {
  
  @scala.inline
  def apply(
    getTransformation: (String, View) => String,
    mEnabled: js.Any,
    onFocusChanged: (View, String, Boolean, Double, Rect) => Unit,
    setLengthChangesAllowed: Boolean => Unit
  ): AllCapsTransformationMethod = {
    val __obj = js.Dynamic.literal(getTransformation = js.Any.fromFunction2(getTransformation), mEnabled = mEnabled.asInstanceOf[js.Any], onFocusChanged = js.Any.fromFunction5(onFocusChanged), setLengthChangesAllowed = js.Any.fromFunction1(setLengthChangesAllowed))
    __obj.asInstanceOf[AllCapsTransformationMethod]
  }
  
  @scala.inline
  implicit class AllCapsTransformationMethodOps[Self <: AllCapsTransformationMethod] (val x: Self) extends AnyVal {
    
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
    def setMEnabled(value: js.Any): Self = this.set("mEnabled", value.asInstanceOf[js.Any])
  }
}
