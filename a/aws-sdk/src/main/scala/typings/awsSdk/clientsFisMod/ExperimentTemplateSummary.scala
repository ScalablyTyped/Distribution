package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentTemplateSummary extends StObject {
  
  /**
    * The time that the experiment template was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the experiment template.
    */
  var description: js.UndefOr[ExperimentTemplateDescription] = js.undefined
  
  /**
    * The ID of the experiment template.
    */
  var id: js.UndefOr[ExperimentTemplateId] = js.undefined
  
  /**
    * The time that the experiment template was last updated.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The tags for the experiment template.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object ExperimentTemplateSummary {
  
  inline def apply(): ExperimentTemplateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentTemplateSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExperimentTemplateSummary] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: ExperimentTemplateDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: ExperimentTemplateId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
