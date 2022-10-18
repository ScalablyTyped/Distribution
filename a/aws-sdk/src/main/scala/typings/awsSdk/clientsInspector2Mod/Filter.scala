package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    * The action that is to be applied to the findings that match the filter.
    */
  var action: FilterAction
  
  /**
    * The Amazon Resource Number (ARN) associated with this filter.
    */
  var arn: FilterArn
  
  /**
    * The date and time this filter was created at.
    */
  var createdAt: js.Date
  
  /**
    * Details on the filter criteria associated with this filter.
    */
  var criteria: FilterCriteria
  
  /**
    * A description of the filter.
    */
  var description: js.UndefOr[FilterDescription] = js.undefined
  
  /**
    * The name of the filter.
    */
  var name: FilterName
  
  /**
    * The Amazon Web Services account ID of the account that created the filter.
    */
  var ownerId: OwnerId
  
  /**
    * The reason for the filter.
    */
  var reason: js.UndefOr[FilterReason] = js.undefined
  
  /**
    * The tags attached to the filter.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The date and time the filter was last updated at.
    */
  var updatedAt: js.Date
}
object Filter {
  
  inline def apply(
    action: FilterAction,
    arn: FilterArn,
    createdAt: js.Date,
    criteria: FilterCriteria,
    name: FilterName,
    ownerId: OwnerId,
    updatedAt: js.Date
  ): Filter = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], criteria = criteria.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setAction(value: FilterAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setArn(value: FilterArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCriteria(value: FilterCriteria): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: FilterDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: FilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOwnerId(value: OwnerId): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    
    inline def setReason(value: FilterReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
