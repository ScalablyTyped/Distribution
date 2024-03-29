package typings.activexAccess.Access

import typings.activexAccess.activexAccessStrings.Cancel
import typings.activexAccess.activexAccessStrings.Headers
import typings.activexAccess.activexAccessStrings.PostData
import typings.activexAccess.activexAccessStrings.TargetFrameName
import typings.activexAccess.activexAccessStrings.URL
import typings.activexAccess.activexAccessStrings.flags
import typings.activexAccess.activexAccessStrings.pDisp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventHelperTypes {
  
  type WebBrowserControlBeforeNavigate2ArgNames = js.Tuple7[pDisp, URL, flags, TargetFrameName, PostData, Headers, Cancel]
  
  trait WebBrowserControlBeforeNavigate2Parameter extends StObject {
    
    var Cancel: Boolean
    
    val Headers: Any
    
    val PostData: Any
    
    val TargetFrameName: String | Null
    
    val URL: String
    
    val flags: Double
    
    val pDisp: Any
  }
  object WebBrowserControlBeforeNavigate2Parameter {
    
    inline def apply(Cancel: Boolean, Headers: Any, PostData: Any, URL: String, flags: Double, pDisp: Any): WebBrowserControlBeforeNavigate2Parameter = {
      val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], PostData = PostData.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any], TargetFrameName = null)
      __obj.asInstanceOf[WebBrowserControlBeforeNavigate2Parameter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebBrowserControlBeforeNavigate2Parameter] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
      
      inline def setPDisp(value: Any): Self = StObject.set(x, "pDisp", value.asInstanceOf[js.Any])
      
      inline def setPostData(value: Any): Self = StObject.set(x, "PostData", value.asInstanceOf[js.Any])
      
      inline def setTargetFrameName(value: String): Self = StObject.set(x, "TargetFrameName", value.asInstanceOf[js.Any])
      
      inline def setTargetFrameNameNull: Self = StObject.set(x, "TargetFrameName", null)
      
      inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    }
  }
}
