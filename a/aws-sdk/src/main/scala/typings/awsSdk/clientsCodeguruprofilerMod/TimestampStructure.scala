package typings.awsSdk.clientsCodeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestampStructure extends StObject {
  
  /**
    *  A Timestamp. This is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC. 
    */
  var value: js.Date
}
object TimestampStructure {
  
  inline def apply(value: js.Date): TimestampStructure = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestampStructure]
  }
  
  extension [Self <: TimestampStructure](x: Self) {
    
    inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
