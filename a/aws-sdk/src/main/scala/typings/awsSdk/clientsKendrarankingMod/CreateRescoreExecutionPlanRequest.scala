package typings.awsSdk.clientsKendrarankingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRescoreExecutionPlanRequest extends StObject {
  
  /**
    * You can set additional capacity units to meet the needs of your rescore execution plan. You are given a single capacity unit by default. If you want to use the default capacity, you don't set additional capacity units. For more information on the default capacity and additional capacity units, see Adjusting capacity.
    */
  var CapacityUnits: js.UndefOr[CapacityUnitsConfiguration] = js.undefined
  
  /**
    * A token that you provide to identify the request to create a rescore execution plan. Multiple calls to the CreateRescoreExecutionPlanRequest API with the same client token will create only one rescore execution plan.
    */
  var ClientToken: js.UndefOr[ClientTokenName] = js.undefined
  
  /**
    * A description for the rescore execution plan.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsKendrarankingMod.Description] = js.undefined
  
  /**
    * A name for the rescore execution plan.
    */
  var Name: RescoreExecutionPlanName
  
  /**
    * A list of key-value pairs that identify or categorize your rescore execution plan. You can also use tags to help control access to the rescore execution plan. Tag keys and values can consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + - @.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateRescoreExecutionPlanRequest {
  
  inline def apply(Name: RescoreExecutionPlanName): CreateRescoreExecutionPlanRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRescoreExecutionPlanRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRescoreExecutionPlanRequest] (val x: Self) extends AnyVal {
    
    inline def setCapacityUnits(value: CapacityUnitsConfiguration): Self = StObject.set(x, "CapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setCapacityUnitsUndefined: Self = StObject.set(x, "CapacityUnits", js.undefined)
    
    inline def setClientToken(value: ClientTokenName): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: RescoreExecutionPlanName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
