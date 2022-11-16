package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePermissionInput extends StObject {
  
  /**
    * 
    */
  var ActionType: PermissionActionType
  
  /**
    * 
    */
  var ResourceArn: Arn
  
  /**
    * 
    */
  var SourceResourceArn: Arn
}
object PutResourcePermissionInput {
  
  inline def apply(ActionType: PermissionActionType, ResourceArn: Arn, SourceResourceArn: Arn): PutResourcePermissionInput = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any], SourceResourceArn = SourceResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePermissionInput]
  }
  
  extension [Self <: PutResourcePermissionInput](x: Self) {
    
    inline def setActionType(value: PermissionActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceResourceArn(value: Arn): Self = StObject.set(x, "SourceResourceArn", value.asInstanceOf[js.Any])
  }
}
