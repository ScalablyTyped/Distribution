package typings.aureliaPal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TypeofXMLHttpRequest extends StObject {
    
    /* standard dom */
    val DONE: Double
    
    /* standard dom */
    val HEADERS_RECEIVED: Double
    
    /* standard dom */
    val LOADING: Double
    
    /* standard dom */
    val OPENED: Double
    
    /* standard dom */
    val UNSENT: Double
  }
  object TypeofXMLHttpRequest {
    
    inline def apply(DONE: Double, HEADERS_RECEIVED: Double, LOADING: Double, OPENED: Double, UNSENT: Double): TypeofXMLHttpRequest = {
      val __obj = js.Dynamic.literal(DONE = DONE.asInstanceOf[js.Any], HEADERS_RECEIVED = HEADERS_RECEIVED.asInstanceOf[js.Any], LOADING = LOADING.asInstanceOf[js.Any], OPENED = OPENED.asInstanceOf[js.Any], UNSENT = UNSENT.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofXMLHttpRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofXMLHttpRequest] (val x: Self) extends AnyVal {
      
      inline def setDONE(value: Double): Self = StObject.set(x, "DONE", value.asInstanceOf[js.Any])
      
      inline def setHEADERS_RECEIVED(value: Double): Self = StObject.set(x, "HEADERS_RECEIVED", value.asInstanceOf[js.Any])
      
      inline def setLOADING(value: Double): Self = StObject.set(x, "LOADING", value.asInstanceOf[js.Any])
      
      inline def setOPENED(value: Double): Self = StObject.set(x, "OPENED", value.asInstanceOf[js.Any])
      
      inline def setUNSENT(value: Double): Self = StObject.set(x, "UNSENT", value.asInstanceOf[js.Any])
    }
  }
}
