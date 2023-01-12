package typings.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLImage extends StObject {
  
  var Action: String
  
  var Encoding: String
  
  var HTMLName: String
  
  var HTMLType: String
  
  /* private */ @JSName("MSForms.HTMLImage_typekey")
  var MSFormsDotHTMLImage_typekey: HTMLImage
  
  var Method: String
  
  var Source: String
}
object HTMLImage {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: HTMLImage] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: String): Self = StObject.set(x, "Encoding", value.asInstanceOf[js.Any])
    
    inline def setHTMLName(value: String): Self = StObject.set(x, "HTMLName", value.asInstanceOf[js.Any])
    
    inline def setHTMLType(value: String): Self = StObject.set(x, "HTMLType", value.asInstanceOf[js.Any])
    
    inline def setMSFormsDotHTMLImage_typekey(value: HTMLImage): Self = StObject.set(x, "MSForms.HTMLImage_typekey", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "Method", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
  }
}
