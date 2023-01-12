package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataReplicationInitiation extends StObject {
  
  /**
    * Request to query next data initiation date and time.
    */
  var nextAttemptDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Request to query data initiation start date and time.
    */
  var startDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * Request to query data initiation steps.
    */
  var steps: js.UndefOr[DataReplicationInitiationSteps] = js.undefined
}
object DataReplicationInitiation {
  
  inline def apply(): DataReplicationInitiation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataReplicationInitiation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataReplicationInitiation] (val x: Self) extends AnyVal {
    
    inline def setNextAttemptDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "nextAttemptDateTime", value.asInstanceOf[js.Any])
    
    inline def setNextAttemptDateTimeUndefined: Self = StObject.set(x, "nextAttemptDateTime", js.undefined)
    
    inline def setStartDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setSteps(value: DataReplicationInitiationSteps): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setStepsVarargs(value: DataReplicationInitiationStep*): Self = StObject.set(x, "steps", js.Array(value*))
  }
}
