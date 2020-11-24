package typings.activexWord.anon

import typings.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FromState extends js.Object {
  
  val Doc: Document = js.native
  
  val FromState: Double = js.native
  
  val Handled: Boolean = js.native
  
  val ToState: Double = js.native
}
object FromState {
  
  @scala.inline
  def apply(Doc: Document, FromState: Double, Handled: Boolean, ToState: Double): FromState = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], FromState = FromState.asInstanceOf[js.Any], Handled = Handled.asInstanceOf[js.Any], ToState = ToState.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromState]
  }
  
  @scala.inline
  implicit class FromStateOps[Self <: FromState] (val x: Self) extends AnyVal {
    
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
    def setDoc(value: Document): Self = this.set("Doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromState(value: Double): Self = this.set("FromState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandled(value: Boolean): Self = this.set("Handled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToState(value: Double): Self = this.set("ToState", value.asInstanceOf[js.Any])
  }
}
