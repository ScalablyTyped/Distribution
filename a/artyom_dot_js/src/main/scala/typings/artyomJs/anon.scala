package typings.artyomJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FatalityPromiseCallback extends StObject {
    
    var fatalityPromiseCallback: js.UndefOr[js.Any] = js.native
    
    var lastSay: js.UndefOr[js.Any] = js.native
    
    var redirectRecognizedTextOutput: js.UndefOr[js.Any] = js.native
    
    var remoteProcessorHandler: js.UndefOr[js.Any] = js.native
  }
  object FatalityPromiseCallback {
    
    @scala.inline
    def apply(): FatalityPromiseCallback = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FatalityPromiseCallback]
    }
    
    @scala.inline
    implicit class FatalityPromiseCallbackMutableBuilder[Self <: FatalityPromiseCallback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFatalityPromiseCallback(value: js.Any): Self = StObject.set(x, "fatalityPromiseCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFatalityPromiseCallbackUndefined: Self = StObject.set(x, "fatalityPromiseCallback", js.undefined)
      
      @scala.inline
      def setLastSay(value: js.Any): Self = StObject.set(x, "lastSay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastSayUndefined: Self = StObject.set(x, "lastSay", js.undefined)
      
      @scala.inline
      def setRedirectRecognizedTextOutput(value: js.Any): Self = StObject.set(x, "redirectRecognizedTextOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectRecognizedTextOutputUndefined: Self = StObject.set(x, "redirectRecognizedTextOutput", js.undefined)
      
      @scala.inline
      def setRemoteProcessorHandler(value: js.Any): Self = StObject.set(x, "remoteProcessorHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteProcessorHandlerUndefined: Self = StObject.set(x, "remoteProcessorHandler", js.undefined)
    }
  }
}
