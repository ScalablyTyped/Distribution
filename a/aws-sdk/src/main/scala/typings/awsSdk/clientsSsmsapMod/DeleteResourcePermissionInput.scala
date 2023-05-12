package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourcePermissionInput extends StObject {
  
  /**
    * Delete or restore the permissions on the target database.
    */
  var ActionType: js.UndefOr[PermissionActionType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: Arn
  
  /**
    * The Amazon Resource Name (ARN) of the source resource.
    */
  var SourceResourceArn: js.UndefOr[Arn] = js.undefined
}
object DeleteResourcePermissionInput {
  
  inline def apply(ResourceArn: Arn): DeleteResourcePermissionInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourcePermissionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResourcePermissionInput] (val x: Self) extends AnyVal {
    
    inline def setActionType(value: PermissionActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "ActionType", js.undefined)
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceResourceArn(value: Arn): Self = StObject.set(x, "SourceResourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceResourceArnUndefined: Self = StObject.set(x, "SourceResourceArn", js.undefined)
  }
}
