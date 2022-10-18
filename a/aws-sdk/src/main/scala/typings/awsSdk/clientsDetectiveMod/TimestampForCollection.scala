package typings.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestampForCollection extends StObject {
  
  /**
    * The data and time when data collection began for a source package. The value is an ISO8601 formatted string. For example, 2021-08-18T16:35:56.284Z.
    */
  var Timestamp: js.UndefOr[js.Date] = js.undefined
}
object TimestampForCollection {
  
  inline def apply(): TimestampForCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimestampForCollection]
  }
  
  extension [Self <: TimestampForCollection](x: Self) {
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
