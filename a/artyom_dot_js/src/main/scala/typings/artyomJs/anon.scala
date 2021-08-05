package typings.artyomJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FatalityPromiseCallback extends StObject {
    
    var fatalityPromiseCallback: js.UndefOr[js.Any] = js.undefined
    
    var lastSay: js.UndefOr[js.Any] = js.undefined
    
    var redirectRecognizedTextOutput: js.UndefOr[js.Any] = js.undefined
    
    var remoteProcessorHandler: js.UndefOr[js.Any] = js.undefined
  }
  object FatalityPromiseCallback {
    
    inline def apply(): FatalityPromiseCallback = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FatalityPromiseCallback]
    }
    
    extension [Self <: FatalityPromiseCallback](x: Self) {
      
      inline def setFatalityPromiseCallback(value: js.Any): Self = StObject.set(x, "fatalityPromiseCallback", value.asInstanceOf[js.Any])
      
      inline def setFatalityPromiseCallbackUndefined: Self = StObject.set(x, "fatalityPromiseCallback", js.undefined)
      
      inline def setLastSay(value: js.Any): Self = StObject.set(x, "lastSay", value.asInstanceOf[js.Any])
      
      inline def setLastSayUndefined: Self = StObject.set(x, "lastSay", js.undefined)
      
      inline def setRedirectRecognizedTextOutput(value: js.Any): Self = StObject.set(x, "redirectRecognizedTextOutput", value.asInstanceOf[js.Any])
      
      inline def setRedirectRecognizedTextOutputUndefined: Self = StObject.set(x, "redirectRecognizedTextOutput", js.undefined)
      
      inline def setRemoteProcessorHandler(value: js.Any): Self = StObject.set(x, "remoteProcessorHandler", value.asInstanceOf[js.Any])
      
      inline def setRemoteProcessorHandlerUndefined: Self = StObject.set(x, "remoteProcessorHandler", js.undefined)
    }
  }
}
