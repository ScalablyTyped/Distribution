package typings.activexWord.anon

import typings.activexWord.Word.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromState extends StObject {
  
  val Doc: Document
  
  val FromState: Double
  
  val Handled: Boolean
  
  val ToState: Double
}
object FromState {
  
  @scala.inline
  def apply(Doc: Document, FromState: Double, Handled: Boolean, ToState: Double): FromState = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], FromState = FromState.asInstanceOf[js.Any], Handled = Handled.asInstanceOf[js.Any], ToState = ToState.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromState]
  }
  
  @scala.inline
  implicit class FromStateMutableBuilder[Self <: FromState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoc(value: Document): Self = StObject.set(x, "Doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromState(value: Double): Self = StObject.set(x, "FromState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "Handled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToState(value: Double): Self = StObject.set(x, "ToState", value.asInstanceOf[js.Any])
  }
}
