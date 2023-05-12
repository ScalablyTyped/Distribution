package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRunGroupResponse extends StObject {
  
  /**
    * The group's ARN.
    */
  var arn: js.UndefOr[RunGroupArn] = js.undefined
  
  /**
    * When the group was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The group's ID.
    */
  var id: js.UndefOr[RunGroupId] = js.undefined
  
  /**
    * The group's maximum number of CPUs to use.
    */
  var maxCpus: js.UndefOr[GetRunGroupResponseMaxCpusInteger] = js.undefined
  
  /**
    * The group's maximum run time in minutes.
    */
  var maxDuration: js.UndefOr[GetRunGroupResponseMaxDurationInteger] = js.undefined
  
  /**
    *  The maximum GPUs that can be used by a run group. 
    */
  var maxGpus: js.UndefOr[GetRunGroupResponseMaxGpusInteger] = js.undefined
  
  /**
    * The maximum number of concurrent runs for the group.
    */
  var maxRuns: js.UndefOr[GetRunGroupResponseMaxRunsInteger] = js.undefined
  
  /**
    * The group's name.
    */
  var name: js.UndefOr[RunGroupName] = js.undefined
  
  /**
    * The group's tags.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object GetRunGroupResponse {
  
  inline def apply(): GetRunGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRunGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRunGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: RunGroupArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setId(value: RunGroupId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMaxCpus(value: GetRunGroupResponseMaxCpusInteger): Self = StObject.set(x, "maxCpus", value.asInstanceOf[js.Any])
    
    inline def setMaxCpusUndefined: Self = StObject.set(x, "maxCpus", js.undefined)
    
    inline def setMaxDuration(value: GetRunGroupResponseMaxDurationInteger): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    inline def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
    
    inline def setMaxGpus(value: GetRunGroupResponseMaxGpusInteger): Self = StObject.set(x, "maxGpus", value.asInstanceOf[js.Any])
    
    inline def setMaxGpusUndefined: Self = StObject.set(x, "maxGpus", js.undefined)
    
    inline def setMaxRuns(value: GetRunGroupResponseMaxRunsInteger): Self = StObject.set(x, "maxRuns", value.asInstanceOf[js.Any])
    
    inline def setMaxRunsUndefined: Self = StObject.set(x, "maxRuns", js.undefined)
    
    inline def setName(value: RunGroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
