package typings.appiumAdb.anon

import typings.appiumAdb.appiumAdbStrings.accept
import typings.appiumAdb.appiumAdbStrings.call
import typings.appiumAdb.appiumAdbStrings.cancel
import typings.appiumAdb.appiumAdbStrings.hold
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GSMACCEPT extends StObject {
  
  var GSM_ACCEPT: accept
  
  var GSM_CALL: call
  
  var GSM_CANCEL: cancel
  
  var GSM_HOLD: hold
}
object GSMACCEPT {
  
  inline def apply(): GSMACCEPT = {
    val __obj = js.Dynamic.literal(GSM_ACCEPT = "accept", GSM_CALL = "call", GSM_CANCEL = "cancel", GSM_HOLD = "hold")
    __obj.asInstanceOf[GSMACCEPT]
  }
  
  extension [Self <: GSMACCEPT](x: Self) {
    
    inline def setGSM_ACCEPT(value: accept): Self = StObject.set(x, "GSM_ACCEPT", value.asInstanceOf[js.Any])
    
    inline def setGSM_CALL(value: call): Self = StObject.set(x, "GSM_CALL", value.asInstanceOf[js.Any])
    
    inline def setGSM_CANCEL(value: cancel): Self = StObject.set(x, "GSM_CANCEL", value.asInstanceOf[js.Any])
    
    inline def setGSM_HOLD(value: hold): Self = StObject.set(x, "GSM_HOLD", value.asInstanceOf[js.Any])
  }
}
