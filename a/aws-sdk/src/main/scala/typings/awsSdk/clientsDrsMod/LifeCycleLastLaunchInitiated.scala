package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifeCycleLastLaunchInitiated extends StObject {
  
  /**
    * The date and time the last Source Server launch was initiated.
    */
  var apiCallDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * The ID of the Job that was used to last launch the Source Server.
    */
  var jobID: js.UndefOr[JobID] = js.undefined
  
  /**
    * The Job type that was used to last launch the Source Server.
    */
  var `type`: js.UndefOr[LastLaunchType] = js.undefined
}
object LifeCycleLastLaunchInitiated {
  
  inline def apply(): LifeCycleLastLaunchInitiated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifeCycleLastLaunchInitiated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LifeCycleLastLaunchInitiated] (val x: Self) extends AnyVal {
    
    inline def setApiCallDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "apiCallDateTime", value.asInstanceOf[js.Any])
    
    inline def setApiCallDateTimeUndefined: Self = StObject.set(x, "apiCallDateTime", js.undefined)
    
    inline def setJobID(value: JobID): Self = StObject.set(x, "jobID", value.asInstanceOf[js.Any])
    
    inline def setJobIDUndefined: Self = StObject.set(x, "jobID", js.undefined)
    
    inline def setType(value: LastLaunchType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
