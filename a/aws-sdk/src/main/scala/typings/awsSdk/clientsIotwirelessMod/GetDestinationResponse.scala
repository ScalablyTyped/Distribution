package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDestinationResponse extends StObject {
  
  /**
    * The Amazon Resource Name of the resource.
    */
  var Arn: js.UndefOr[DestinationArn] = js.undefined
  
  /**
    * The description of the resource.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.Description] = js.undefined
  
  /**
    * The rule name or topic rule to send messages to.
    */
  var Expression: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.Expression] = js.undefined
  
  /**
    * The type of value in Expression.
    */
  var ExpressionType: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.ExpressionType] = js.undefined
  
  /**
    * The name of the resource.
    */
  var Name: js.UndefOr[DestinationName] = js.undefined
  
  /**
    * The ARN of the IAM Role that authorizes the destination.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.RoleArn] = js.undefined
}
object GetDestinationResponse {
  
  inline def apply(): GetDestinationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDestinationResponse]
  }
  
  extension [Self <: GetDestinationResponse](x: Self) {
    
    inline def setArn(value: DestinationArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionType(value: ExpressionType): Self = StObject.set(x, "ExpressionType", value.asInstanceOf[js.Any])
    
    inline def setExpressionTypeUndefined: Self = StObject.set(x, "ExpressionType", js.undefined)
    
    inline def setExpressionUndefined: Self = StObject.set(x, "Expression", js.undefined)
    
    inline def setName(value: DestinationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
