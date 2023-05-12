package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunGroupListItem extends StObject {
  
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
    * The group's maximum CPU count setting.
    */
  var maxCpus: js.UndefOr[RunGroupListItemMaxCpusInteger] = js.undefined
  
  /**
    * The group's maximum duration setting in minutes.
    */
  var maxDuration: js.UndefOr[RunGroupListItemMaxDurationInteger] = js.undefined
  
  /**
    *  The maximum GPUs that can be used by a run group. 
    */
  var maxGpus: js.UndefOr[RunGroupListItemMaxGpusInteger] = js.undefined
  
  /**
    * The group's maximum concurrent run setting.
    */
  var maxRuns: js.UndefOr[RunGroupListItemMaxRunsInteger] = js.undefined
  
  /**
    * The group's name.
    */
  var name: js.UndefOr[RunGroupName] = js.undefined
}
object RunGroupListItem {
  
  inline def apply(): RunGroupListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunGroupListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunGroupListItem] (val x: Self) extends AnyVal {
    
    inline def setArn(value: RunGroupArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setId(value: RunGroupId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMaxCpus(value: RunGroupListItemMaxCpusInteger): Self = StObject.set(x, "maxCpus", value.asInstanceOf[js.Any])
    
    inline def setMaxCpusUndefined: Self = StObject.set(x, "maxCpus", js.undefined)
    
    inline def setMaxDuration(value: RunGroupListItemMaxDurationInteger): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    inline def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
    
    inline def setMaxGpus(value: RunGroupListItemMaxGpusInteger): Self = StObject.set(x, "maxGpus", value.asInstanceOf[js.Any])
    
    inline def setMaxGpusUndefined: Self = StObject.set(x, "maxGpus", js.undefined)
    
    inline def setMaxRuns(value: RunGroupListItemMaxRunsInteger): Self = StObject.set(x, "maxRuns", value.asInstanceOf[js.Any])
    
    inline def setMaxRunsUndefined: Self = StObject.set(x, "maxRuns", js.undefined)
    
    inline def setName(value: RunGroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
