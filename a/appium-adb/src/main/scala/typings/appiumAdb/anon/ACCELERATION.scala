package typings.appiumAdb.anon

import typings.appiumAdb.appiumAdbStrings.acceleration
import typings.appiumAdb.appiumAdbStrings.humidity
import typings.appiumAdb.appiumAdbStrings.light
import typings.appiumAdb.appiumAdbStrings.pressure
import typings.appiumAdb.appiumAdbStrings.proximity
import typings.appiumAdb.appiumAdbStrings.temperature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ACCELERATION extends StObject {
  
  var ACCELERATION: acceleration
  
  var HUMIDITY: humidity
  
  var LIGHT: light
  
  var PRESSURE: pressure
  
  var PROXIMITY: proximity
  
  var TEMPERATURE: temperature
}
object ACCELERATION {
  
  inline def apply(): ACCELERATION = {
    val __obj = js.Dynamic.literal(ACCELERATION = "acceleration", HUMIDITY = "humidity", LIGHT = "light", PRESSURE = "pressure", PROXIMITY = "proximity", TEMPERATURE = "temperature")
    __obj.asInstanceOf[ACCELERATION]
  }
  
  extension [Self <: ACCELERATION](x: Self) {
    
    inline def setACCELERATION(value: acceleration): Self = StObject.set(x, "ACCELERATION", value.asInstanceOf[js.Any])
    
    inline def setHUMIDITY(value: humidity): Self = StObject.set(x, "HUMIDITY", value.asInstanceOf[js.Any])
    
    inline def setLIGHT(value: light): Self = StObject.set(x, "LIGHT", value.asInstanceOf[js.Any])
    
    inline def setPRESSURE(value: pressure): Self = StObject.set(x, "PRESSURE", value.asInstanceOf[js.Any])
    
    inline def setPROXIMITY(value: proximity): Self = StObject.set(x, "PROXIMITY", value.asInstanceOf[js.Any])
    
    inline def setTEMPERATURE(value: temperature): Self = StObject.set(x, "TEMPERATURE", value.asInstanceOf[js.Any])
  }
}
