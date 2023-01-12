package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentTemplateTarget extends StObject {
  
  /**
    * The filters to apply to identify target resources using specific attributes.
    */
  var filters: js.UndefOr[ExperimentTemplateTargetFilterList] = js.undefined
  
  /**
    * The resource type parameters.
    */
  var parameters: js.UndefOr[ExperimentTemplateTargetParameterMap] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of the targets.
    */
  var resourceArns: js.UndefOr[ResourceArnList] = js.undefined
  
  /**
    * The tags for the target resources.
    */
  var resourceTags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The resource type.
    */
  var resourceType: js.UndefOr[TargetResourceTypeId] = js.undefined
  
  /**
    * Scopes the identified resources to a specific count or percentage.
    */
  var selectionMode: js.UndefOr[ExperimentTemplateTargetSelectionMode] = js.undefined
}
object ExperimentTemplateTarget {
  
  inline def apply(): ExperimentTemplateTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentTemplateTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExperimentTemplateTarget] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: ExperimentTemplateTargetFilterList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: ExperimentTemplateTargetFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setParameters(value: ExperimentTemplateTargetParameterMap): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setResourceArns(value: ResourceArnList): Self = StObject.set(x, "resourceArns", value.asInstanceOf[js.Any])
    
    inline def setResourceArnsUndefined: Self = StObject.set(x, "resourceArns", js.undefined)
    
    inline def setResourceArnsVarargs(value: ResourceArn*): Self = StObject.set(x, "resourceArns", js.Array(value*))
    
    inline def setResourceTags(value: TagMap): Self = StObject.set(x, "resourceTags", value.asInstanceOf[js.Any])
    
    inline def setResourceTagsUndefined: Self = StObject.set(x, "resourceTags", js.undefined)
    
    inline def setResourceType(value: TargetResourceTypeId): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setSelectionMode(value: ExperimentTemplateTargetSelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
  }
}
