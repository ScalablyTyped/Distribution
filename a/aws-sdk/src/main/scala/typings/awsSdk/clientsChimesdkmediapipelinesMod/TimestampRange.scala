package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestampRange extends StObject {
  
  /**
    * The ending timestamp for the specified range.
    */
  var EndTimestamp: js.Date
  
  /**
    * The starting timestamp for the specified range.
    */
  var StartTimestamp: js.Date
}
object TimestampRange {
  
  inline def apply(EndTimestamp: js.Date, StartTimestamp: js.Date): TimestampRange = {
    val __obj = js.Dynamic.literal(EndTimestamp = EndTimestamp.asInstanceOf[js.Any], StartTimestamp = StartTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestampRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimestampRange] (val x: Self) extends AnyVal {
    
    inline def setEndTimestamp(value: js.Date): Self = StObject.set(x, "EndTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStartTimestamp(value: js.Date): Self = StObject.set(x, "StartTimestamp", value.asInstanceOf[js.Any])
  }
}
