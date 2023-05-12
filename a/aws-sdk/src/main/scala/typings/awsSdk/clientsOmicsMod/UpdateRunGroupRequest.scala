package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRunGroupRequest extends StObject {
  
  /**
    * The group's ID.
    */
  var id: RunGroupId
  
  /**
    * The maximum number of CPUs to use.
    */
  var maxCpus: js.UndefOr[UpdateRunGroupRequestMaxCpusInteger] = js.undefined
  
  /**
    * A maximum run time for the group in minutes.
    */
  var maxDuration: js.UndefOr[UpdateRunGroupRequestMaxDurationInteger] = js.undefined
  
  /**
    *  The maximum GPUs that can be used by a run group. 
    */
  var maxGpus: js.UndefOr[UpdateRunGroupRequestMaxGpusInteger] = js.undefined
  
  /**
    * The maximum number of concurrent runs for the group.
    */
  var maxRuns: js.UndefOr[UpdateRunGroupRequestMaxRunsInteger] = js.undefined
  
  /**
    * A name for the group.
    */
  var name: js.UndefOr[RunGroupName] = js.undefined
}
object UpdateRunGroupRequest {
  
  inline def apply(id: RunGroupId): UpdateRunGroupRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRunGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateRunGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: RunGroupId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMaxCpus(value: UpdateRunGroupRequestMaxCpusInteger): Self = StObject.set(x, "maxCpus", value.asInstanceOf[js.Any])
    
    inline def setMaxCpusUndefined: Self = StObject.set(x, "maxCpus", js.undefined)
    
    inline def setMaxDuration(value: UpdateRunGroupRequestMaxDurationInteger): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    inline def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
    
    inline def setMaxGpus(value: UpdateRunGroupRequestMaxGpusInteger): Self = StObject.set(x, "maxGpus", value.asInstanceOf[js.Any])
    
    inline def setMaxGpusUndefined: Self = StObject.set(x, "maxGpus", js.undefined)
    
    inline def setMaxRuns(value: UpdateRunGroupRequestMaxRunsInteger): Self = StObject.set(x, "maxRuns", value.asInstanceOf[js.Any])
    
    inline def setMaxRunsUndefined: Self = StObject.set(x, "maxRuns", js.undefined)
    
    inline def setName(value: RunGroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
