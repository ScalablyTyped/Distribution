package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourcePermissionInput extends StObject {
  
  /**
    * 
    */
  var ActionType: js.UndefOr[PermissionActionType] = js.undefined
  
  /**
    * 
    */
  var ResourceArn: Arn
  
  /**
    * 
    */
  var SourceResourceArn: js.UndefOr[Arn] = js.undefined
}
object DeleteResourcePermissionInput {
  
  inline def apply(ResourceArn: Arn): DeleteResourcePermissionInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourcePermissionInput]
  }
  
  extension [Self <: DeleteResourcePermissionInput](x: Self) {
    
    inline def setActionType(value: PermissionActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "ActionType", js.undefined)
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceResourceArn(value: Arn): Self = StObject.set(x, "SourceResourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceResourceArnUndefined: Self = StObject.set(x, "SourceResourceArn", js.undefined)
  }
}
