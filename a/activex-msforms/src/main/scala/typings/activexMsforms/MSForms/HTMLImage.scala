package typings.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLImage extends StObject {
  
  var Action: String = js.native
  
  var Encoding: String = js.native
  
  var HTMLName: String = js.native
  
  var HTMLType: String = js.native
  
  @JSName("MSForms.HTMLImage_typekey")
  var MSFormsDotHTMLImage_typekey: HTMLImage = js.native
  
  var Method: String = js.native
  
  var Source: String = js.native
}
object HTMLImage {
  
  @scala.inline
  def apply(
    Action: String,
    Encoding: String,
    HTMLName: String,
    HTMLType: String,
    MSFormsDotHTMLImage_typekey: HTMLImage,
    Method: String,
    Source: String
  ): HTMLImage = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any], Method = Method.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLImage_typekey")(MSFormsDotHTMLImage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLImage]
  }
  
  @scala.inline
  implicit class HTMLImageMutableBuilder[Self <: HTMLImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "Encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTMLName(value: String): Self = StObject.set(x, "HTMLName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTMLType(value: String): Self = StObject.set(x, "HTMLType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSFormsDotHTMLImage_typekey(value: HTMLImage): Self = StObject.set(x, "MSForms.HTMLImage_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "Method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
  }
}
