package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CMimeTypes extends StObject {
  
  @JSName("MSHTML.CMimeTypes_typekey")
  var MSHTMLDotCMimeTypes_typekey: CMimeTypes = js.native
  
  val length: Double = js.native
}
object CMimeTypes {
  
  @scala.inline
  def apply(MSHTMLDotCMimeTypes_typekey: CMimeTypes, length: Double): CMimeTypes = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.CMimeTypes_typekey")(MSHTMLDotCMimeTypes_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMimeTypes]
  }
  
  @scala.inline
  implicit class CMimeTypesMutableBuilder[Self <: CMimeTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotCMimeTypes_typekey(value: CMimeTypes): Self = StObject.set(x, "MSHTML.CMimeTypes_typekey", value.asInstanceOf[js.Any])
  }
}
