package typings.aureliaPal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TypeofXMLHttpRequest extends StObject {
    
    val DONE: Double
    
    val HEADERS_RECEIVED: Double
    
    val LOADING: Double
    
    val OPENED: Double
    
    val UNSENT: Double
  }
  object TypeofXMLHttpRequest {
    
    @scala.inline
    def apply(DONE: Double, HEADERS_RECEIVED: Double, LOADING: Double, OPENED: Double, UNSENT: Double): TypeofXMLHttpRequest = {
      val __obj = js.Dynamic.literal(DONE = DONE.asInstanceOf[js.Any], HEADERS_RECEIVED = HEADERS_RECEIVED.asInstanceOf[js.Any], LOADING = LOADING.asInstanceOf[js.Any], OPENED = OPENED.asInstanceOf[js.Any], UNSENT = UNSENT.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofXMLHttpRequest]
    }
    
    @scala.inline
    implicit class TypeofXMLHttpRequestMutableBuilder[Self <: TypeofXMLHttpRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDONE(value: Double): Self = StObject.set(x, "DONE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHEADERS_RECEIVED(value: Double): Self = StObject.set(x, "HEADERS_RECEIVED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLOADING(value: Double): Self = StObject.set(x, "LOADING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOPENED(value: Double): Self = StObject.set(x, "OPENED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUNSENT(value: Double): Self = StObject.set(x, "UNSENT", value.asInstanceOf[js.Any])
    }
  }
}
