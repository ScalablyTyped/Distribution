package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyValue extends StObject {
  
  /**
    * ISO8601 DateTime of a value for a time series property. The time for when the property value was recorded in ISO 8601 format: YYYY-MM-DDThh:mm:ss[.SSSSSSSSS][Z/±HH:mm].    [YYYY]: year    [MM]: month    [DD]: day    [hh]: hour    [mm]: minute    [ss]: seconds    [.SSSSSSSSS]: additional precision, where precedence is maintained. For example: [.573123] is equal to 573123000 nanoseconds.    Z: default timezone UTC    ± HH:mm: time zone offset in Hours and Minutes.    Required sub-fields: YYYY-MM-DDThh:mm:ss and [Z/±HH:mm]
    */
  var time: js.UndefOr[Time] = js.undefined
  
  /**
    * The timestamp of a value for a time series property.
    */
  var timestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An object that specifies a value for a time series property.
    */
  var value: DataValue
}
object PropertyValue {
  
  inline def apply(value: DataValue): PropertyValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyValue]
  }
  
  extension [Self <: PropertyValue](x: Self) {
    
    inline def setTime(value: Time): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setValue(value: DataValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
