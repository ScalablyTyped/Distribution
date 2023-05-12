package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRunGroupRequest extends StObject {
  
  /**
    * The maximum number of CPUs to use in the group.
    */
  var maxCpus: js.UndefOr[CreateRunGroupRequestMaxCpusInteger] = js.undefined
  
  /**
    * A maximum run time for the group in minutes.
    */
  var maxDuration: js.UndefOr[CreateRunGroupRequestMaxDurationInteger] = js.undefined
  
  /**
    *  The maximum GPUs that can be used by a run group. 
    */
  var maxGpus: js.UndefOr[CreateRunGroupRequestMaxGpusInteger] = js.undefined
  
  /**
    * The maximum number of concurrent runs for the group.
    */
  var maxRuns: js.UndefOr[CreateRunGroupRequestMaxRunsInteger] = js.undefined
  
  /**
    * A name for the group.
    */
  var name: js.UndefOr[RunGroupName] = js.undefined
  
  /**
    * To ensure that requests don't run multiple times, specify a unique ID for each request.
    */
  var requestId: RunGroupRequestId
  
  /**
    * Tags for the group.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateRunGroupRequest {
  
  inline def apply(requestId: RunGroupRequestId): CreateRunGroupRequest = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRunGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRunGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxCpus(value: CreateRunGroupRequestMaxCpusInteger): Self = StObject.set(x, "maxCpus", value.asInstanceOf[js.Any])
    
    inline def setMaxCpusUndefined: Self = StObject.set(x, "maxCpus", js.undefined)
    
    inline def setMaxDuration(value: CreateRunGroupRequestMaxDurationInteger): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    inline def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
    
    inline def setMaxGpus(value: CreateRunGroupRequestMaxGpusInteger): Self = StObject.set(x, "maxGpus", value.asInstanceOf[js.Any])
    
    inline def setMaxGpusUndefined: Self = StObject.set(x, "maxGpus", js.undefined)
    
    inline def setMaxRuns(value: CreateRunGroupRequestMaxRunsInteger): Self = StObject.set(x, "maxRuns", value.asInstanceOf[js.Any])
    
    inline def setMaxRunsUndefined: Self = StObject.set(x, "maxRuns", js.undefined)
    
    inline def setName(value: RunGroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestId(value: RunGroupRequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
