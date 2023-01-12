package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Batch extends StObject {
  
  /**
    * End time of batch to split ingestion.
    */
  var EndTime: js.Date
  
  /**
    * Start time of batch to split ingestion.
    */
  var StartTime: js.Date
}
object Batch {
  
  inline def apply(EndTime: js.Date, StartTime: js.Date): Batch = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Batch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Batch] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
