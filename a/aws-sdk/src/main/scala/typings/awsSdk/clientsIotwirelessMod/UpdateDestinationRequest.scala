package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDestinationRequest extends StObject {
  
  /**
    * A new description of the resource.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.Description] = js.undefined
  
  /**
    * The new rule name or topic rule to send messages to.
    */
  var Expression: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.Expression] = js.undefined
  
  /**
    * The type of value in Expression.
    */
  var ExpressionType: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.ExpressionType] = js.undefined
  
  /**
    * The new name of the resource.
    */
  var Name: DestinationName
  
  /**
    * The ARN of the IAM Role that authorizes the destination.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.RoleArn] = js.undefined
}
object UpdateDestinationRequest {
  
  inline def apply(Name: DestinationName): UpdateDestinationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDestinationRequest]
  }
  
  extension [Self <: UpdateDestinationRequest](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionType(value: ExpressionType): Self = StObject.set(x, "ExpressionType", value.asInstanceOf[js.Any])
    
    inline def setExpressionTypeUndefined: Self = StObject.set(x, "ExpressionType", js.undefined)
    
    inline def setExpressionUndefined: Self = StObject.set(x, "Expression", js.undefined)
    
    inline def setName(value: DestinationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
