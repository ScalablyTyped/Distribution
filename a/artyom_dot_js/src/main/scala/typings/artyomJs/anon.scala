package typings.artyomJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FatalityPromiseCallback extends StObject {
    
    var fatalityPromiseCallback: js.UndefOr[Any] = js.undefined
    
    var lastSay: js.UndefOr[Any] = js.undefined
    
    var redirectRecognizedTextOutput: js.UndefOr[Any] = js.undefined
    
    var remoteProcessorHandler: js.UndefOr[Any] = js.undefined
  }
  object FatalityPromiseCallback {
    
    inline def apply(): FatalityPromiseCallback = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FatalityPromiseCallback]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FatalityPromiseCallback] (val x: Self) extends AnyVal {
      
      inline def setFatalityPromiseCallback(value: Any): Self = StObject.set(x, "fatalityPromiseCallback", value.asInstanceOf[js.Any])
      
      inline def setFatalityPromiseCallbackUndefined: Self = StObject.set(x, "fatalityPromiseCallback", js.undefined)
      
      inline def setLastSay(value: Any): Self = StObject.set(x, "lastSay", value.asInstanceOf[js.Any])
      
      inline def setLastSayUndefined: Self = StObject.set(x, "lastSay", js.undefined)
      
      inline def setRedirectRecognizedTextOutput(value: Any): Self = StObject.set(x, "redirectRecognizedTextOutput", value.asInstanceOf[js.Any])
      
      inline def setRedirectRecognizedTextOutputUndefined: Self = StObject.set(x, "redirectRecognizedTextOutput", js.undefined)
      
      inline def setRemoteProcessorHandler(value: Any): Self = StObject.set(x, "remoteProcessorHandler", value.asInstanceOf[js.Any])
      
      inline def setRemoteProcessorHandlerUndefined: Self = StObject.set(x, "remoteProcessorHandler", js.undefined)
    }
  }
}
