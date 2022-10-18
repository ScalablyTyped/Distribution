package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFilterResponse extends StObject {
  
  /**
    * Specifies the action that is to be applied to the findings that match the filter.
    */
  var Action: FilterAction
  
  /**
    * The description of the filter.
    */
  var Description: js.UndefOr[FilterDescription] = js.undefined
  
  /**
    * Represents the criteria to be used in the filter for querying findings.
    */
  var FindingCriteria: typings.awsSdk.clientsGuarddutyMod.FindingCriteria
  
  /**
    * The name of the filter.
    */
  var Name: FilterName
  
  /**
    * Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings.
    */
  var Rank: js.UndefOr[FilterRank] = js.undefined
  
  /**
    * The tags of the filter resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object GetFilterResponse {
  
  inline def apply(Action: FilterAction, FindingCriteria: FindingCriteria, Name: FilterName): GetFilterResponse = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], FindingCriteria = FindingCriteria.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFilterResponse]
  }
  
  extension [Self <: GetFilterResponse](x: Self) {
    
    inline def setAction(value: FilterAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: FilterDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFindingCriteria(value: FindingCriteria): Self = StObject.set(x, "FindingCriteria", value.asInstanceOf[js.Any])
    
    inline def setName(value: FilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRank(value: FilterRank): Self = StObject.set(x, "Rank", value.asInstanceOf[js.Any])
    
    inline def setRankUndefined: Self = StObject.set(x, "Rank", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
