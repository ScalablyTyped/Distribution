package typings.appiumAdb.anon

import typings.appiumAdb.appiumAdbStrings.off
import typings.appiumAdb.appiumAdbStrings.on
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POWERACOFF extends StObject {
  
  var POWER_AC_OFF: off
  
  var POWER_AC_ON: on
}
object POWERACOFF {
  
  inline def apply(): POWERACOFF = {
    val __obj = js.Dynamic.literal(POWER_AC_OFF = "off", POWER_AC_ON = "on")
    __obj.asInstanceOf[POWERACOFF]
  }
  
  extension [Self <: POWERACOFF](x: Self) {
    
    inline def setPOWER_AC_OFF(value: off): Self = StObject.set(x, "POWER_AC_OFF", value.asInstanceOf[js.Any])
    
    inline def setPOWER_AC_ON(value: on): Self = StObject.set(x, "POWER_AC_ON", value.asInstanceOf[js.Any])
  }
}
