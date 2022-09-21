package typings.appiumAdb.anon

import typings.appiumAdb.appiumAdbStrings.edge
import typings.appiumAdb.appiumAdbStrings.evdo
import typings.appiumAdb.appiumAdbStrings.full
import typings.appiumAdb.appiumAdbStrings.gprs
import typings.appiumAdb.appiumAdbStrings.gsm
import typings.appiumAdb.appiumAdbStrings.hsdpa
import typings.appiumAdb.appiumAdbStrings.lte
import typings.appiumAdb.appiumAdbStrings.scsd
import typings.appiumAdb.appiumAdbStrings.umts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EDGE extends StObject {
  
  // GPRS (up: 28.8, down: 57.6).
  var EDGE: edge
  
  // LTE (up: 58,000, down: 173,000).
  var EVDO: evdo
  
  // EVDO (up: 75,000, down: 280,000).
  var FULL: full
  
  // HSCSD (up: 14.4, down: 57.6).
  var GPRS: gprs
  
  var GSM: gsm
  
  // UMTS/3G (up: 384.0, down: 384.0).
  var HSDPA: hsdpa
  
  // HSDPA (up: 5760.0, down: 13,980.0).
  var LTE: lte
  
  // GSM/CSD (up: 14.4, down: 14.4).
  var SCSD: scsd
  
  // EDGE/EGPRS (up: 473.6, down: 473.6).
  var UMTS: umts
}
object EDGE {
  
  inline def apply(): EDGE = {
    val __obj = js.Dynamic.literal(EDGE = "edge", EVDO = "evdo", FULL = "full", GPRS = "gprs", GSM = "gsm", HSDPA = "hsdpa", LTE = "lte", SCSD = "scsd", UMTS = "umts")
    __obj.asInstanceOf[EDGE]
  }
  
  extension [Self <: EDGE](x: Self) {
    
    inline def setEDGE(value: edge): Self = StObject.set(x, "EDGE", value.asInstanceOf[js.Any])
    
    inline def setEVDO(value: evdo): Self = StObject.set(x, "EVDO", value.asInstanceOf[js.Any])
    
    inline def setFULL(value: full): Self = StObject.set(x, "FULL", value.asInstanceOf[js.Any])
    
    inline def setGPRS(value: gprs): Self = StObject.set(x, "GPRS", value.asInstanceOf[js.Any])
    
    inline def setGSM(value: gsm): Self = StObject.set(x, "GSM", value.asInstanceOf[js.Any])
    
    inline def setHSDPA(value: hsdpa): Self = StObject.set(x, "HSDPA", value.asInstanceOf[js.Any])
    
    inline def setLTE(value: lte): Self = StObject.set(x, "LTE", value.asInstanceOf[js.Any])
    
    inline def setSCSD(value: scsd): Self = StObject.set(x, "SCSD", value.asInstanceOf[js.Any])
    
    inline def setUMTS(value: umts): Self = StObject.set(x, "UMTS", value.asInstanceOf[js.Any])
  }
}
