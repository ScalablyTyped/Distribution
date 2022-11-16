package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcePermissionInput extends StObject {
  
  /**
    * 
    */
  var ActionType: js.UndefOr[PermissionActionType] = js.undefined
  
  /**
    * 
    */
  var ResourceArn: Arn
}
object GetResourcePermissionInput {
  
  inline def apply(ResourceArn: Arn): GetResourcePermissionInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcePermissionInput]
  }
  
  extension [Self <: GetResourcePermissionInput](x: Self) {
    
    inline def setActionType(value: PermissionActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "ActionType", js.undefined)
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
