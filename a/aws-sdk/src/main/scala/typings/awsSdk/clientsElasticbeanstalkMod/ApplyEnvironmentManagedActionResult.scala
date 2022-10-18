package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyEnvironmentManagedActionResult extends StObject {
  
  /**
    * A description of the managed action.
    */
  var ActionDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The action ID of the managed action.
    */
  var ActionId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of managed action.
    */
  var ActionType: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.ActionType] = js.undefined
  
  /**
    * The status of the managed action.
    */
  var Status: js.UndefOr[String] = js.undefined
}
object ApplyEnvironmentManagedActionResult {
  
  inline def apply(): ApplyEnvironmentManagedActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyEnvironmentManagedActionResult]
  }
  
  extension [Self <: ApplyEnvironmentManagedActionResult](x: Self) {
    
    inline def setActionDescription(value: String): Self = StObject.set(x, "ActionDescription", value.asInstanceOf[js.Any])
    
    inline def setActionDescriptionUndefined: Self = StObject.set(x, "ActionDescription", js.undefined)
    
    inline def setActionId(value: String): Self = StObject.set(x, "ActionId", value.asInstanceOf[js.Any])
    
    inline def setActionIdUndefined: Self = StObject.set(x, "ActionId", js.undefined)
    
    inline def setActionType(value: ActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "ActionType", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
