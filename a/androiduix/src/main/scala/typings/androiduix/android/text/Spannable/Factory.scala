package typings.androiduix.android.text.Spannable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Factory extends js.Object {
  
  def newSpannable(source: String): typings.androiduix.android.text.Spannable = js.native
}
object Factory {
  
  @scala.inline
  def apply(newSpannable: String => typings.androiduix.android.text.Spannable): Factory = {
    val __obj = js.Dynamic.literal(newSpannable = js.Any.fromFunction1(newSpannable))
    __obj.asInstanceOf[Factory]
  }
  
  @scala.inline
  implicit class FactoryOps[Self <: Factory] (val x: Self) extends AnyVal {
    
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
    def setNewSpannable(value: String => typings.androiduix.android.text.Spannable): Self = this.set("newSpannable", js.Any.fromFunction1(value))
  }
}
