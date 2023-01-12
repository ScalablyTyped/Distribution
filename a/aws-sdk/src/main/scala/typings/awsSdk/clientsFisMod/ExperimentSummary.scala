package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentSummary extends StObject {
  
  /**
    * The time that the experiment was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the experiment template.
    */
  var experimentTemplateId: js.UndefOr[ExperimentTemplateId] = js.undefined
  
  /**
    * The ID of the experiment.
    */
  var id: js.UndefOr[ExperimentId] = js.undefined
  
  /**
    * The state of the experiment.
    */
  var state: js.UndefOr[ExperimentState] = js.undefined
  
  /**
    * The tags for the experiment.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object ExperimentSummary {
  
  inline def apply(): ExperimentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExperimentSummary] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setExperimentTemplateId(value: ExperimentTemplateId): Self = StObject.set(x, "experimentTemplateId", value.asInstanceOf[js.Any])
    
    inline def setExperimentTemplateIdUndefined: Self = StObject.set(x, "experimentTemplateId", js.undefined)
    
    inline def setId(value: ExperimentId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setState(value: ExperimentState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
