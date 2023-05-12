package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerStatusSummary extends StObject {
  
  /**
    * The number of servers successfully analyzed, partially successful or failed analysis.
    */
  var count: js.UndefOr[Integer] = js.undefined
  
  /**
    * The status of the run time.
    */
  var runTimeAssessmentStatus: js.UndefOr[RunTimeAssessmentStatus] = js.undefined
}
object ServerStatusSummary {
  
  inline def apply(): ServerStatusSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerStatusSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerStatusSummary] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setRunTimeAssessmentStatus(value: RunTimeAssessmentStatus): Self = StObject.set(x, "runTimeAssessmentStatus", value.asInstanceOf[js.Any])
    
    inline def setRunTimeAssessmentStatusUndefined: Self = StObject.set(x, "runTimeAssessmentStatus", js.undefined)
  }
}
