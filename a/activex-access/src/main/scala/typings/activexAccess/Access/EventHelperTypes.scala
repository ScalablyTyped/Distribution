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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventHelperTypes {
  
  type WebBrowserControlBeforeNavigate2ArgNames = js.Tuple7[pDisp, URL, flags, TargetFrameName, PostData, Headers, Cancel]
  
  @js.native
  trait WebBrowserControlBeforeNavigate2Parameter extends StObject {
    
    var Cancel: Boolean = js.native
    
    val Headers: js.Any = js.native
    
    val PostData: js.Any = js.native
    
    val TargetFrameName: String | Null = js.native
    
    val URL: String = js.native
    
    val flags: Double = js.native
    
    val pDisp: js.Any = js.native
  }
  object WebBrowserControlBeforeNavigate2Parameter {
    
    @scala.inline
    def apply(Cancel: Boolean, Headers: js.Any, PostData: js.Any, URL: String, flags: Double, pDisp: js.Any): WebBrowserControlBeforeNavigate2Parameter = {
      val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Headers = Headers.asInstanceOf[js.Any], PostData = PostData.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], pDisp = pDisp.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebBrowserControlBeforeNavigate2Parameter]
    }
    
    @scala.inline
    implicit class WebBrowserControlBeforeNavigate2ParameterMutableBuilder[Self <: WebBrowserControlBeforeNavigate2Parameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "Headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPDisp(value: js.Any): Self = StObject.set(x, "pDisp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostData(value: js.Any): Self = StObject.set(x, "PostData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetFrameName(value: String): Self = StObject.set(x, "TargetFrameName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetFrameNameNull: Self = StObject.set(x, "TargetFrameName", null)
      
      @scala.inline
      def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    }
  }
}
