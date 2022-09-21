package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminationHealth extends StObject {
  
  /**
    * The source IP address.
    */
  var Source: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp, in ISO 8601 format.
    */
  var Timestamp: js.UndefOr[js.Date] = js.undefined
}
object TerminationHealth {
  
  inline def apply(): TerminationHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminationHealth]
  }
  
  extension [Self <: TerminationHealth](x: Self) {
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
