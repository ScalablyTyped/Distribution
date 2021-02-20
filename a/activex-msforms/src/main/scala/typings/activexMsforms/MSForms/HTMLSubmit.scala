package typings.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLSubmit extends StObject {
  
  var Action: String = js.native
  
  var Caption: String = js.native
  
  var Encoding: String = js.native
  
  var HTMLName: String = js.native
  
  var HTMLType: String = js.native
  
  @JSName("MSForms.HTMLSubmit_typekey")
  var MSFormsDotHTMLSubmit_typekey: HTMLSubmit = js.native
  
  var Method: String = js.native
}
object HTMLSubmit {
  
  @scala.inline
  def apply(
    Action: String,
    Caption: String,
    Encoding: String,
    HTMLName: String,
    HTMLType: String,
    MSFormsDotHTMLSubmit_typekey: HTMLSubmit,
    Method: String
  ): HTMLSubmit = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any], Method = Method.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLSubmit_typekey")(MSFormsDotHTMLSubmit_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLSubmit]
  }
  
  @scala.inline
  implicit class HTMLSubmitMutableBuilder[Self <: HTMLSubmit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "Encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTMLName(value: String): Self = StObject.set(x, "HTMLName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTMLType(value: String): Self = StObject.set(x, "HTMLType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSFormsDotHTMLSubmit_typekey(value: HTMLSubmit): Self = StObject.set(x, "MSForms.HTMLSubmit_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "Method", value.asInstanceOf[js.Any])
  }
}
