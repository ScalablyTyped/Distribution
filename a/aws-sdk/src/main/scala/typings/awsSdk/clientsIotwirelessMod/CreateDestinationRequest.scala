package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDestinationRequest extends StObject {
  
  /**
    * Each resource must have a unique client request token. If you try to create a new resource with the same token as a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate a unique client request. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.ClientRequestToken] = js.undefined
  
  /**
    * The description of the new resource.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.Description] = js.undefined
  
  /**
    * The rule name or topic rule to send messages to.
    */
  var Expression: typings.awsSdk.clientsIotwirelessMod.Expression
  
  /**
    * The type of value in Expression.
    */
  var ExpressionType: typings.awsSdk.clientsIotwirelessMod.ExpressionType
  
  /**
    * The name of the new resource.
    */
  var Name: DestinationName
  
  /**
    * The ARN of the IAM Role that authorizes the destination.
    */
  var RoleArn: typings.awsSdk.clientsIotwirelessMod.RoleArn
  
  /**
    * The tags to attach to the new destination. Tags are metadata that you can use to manage a resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateDestinationRequest {
  
  inline def apply(Expression: Expression, ExpressionType: ExpressionType, Name: DestinationName, RoleArn: RoleArn): CreateDestinationRequest = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDestinationRequest]
  }
  
  extension [Self <: CreateDestinationRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionType(value: ExpressionType): Self = StObject.set(x, "ExpressionType", value.asInstanceOf[js.Any])
    
    inline def setName(value: DestinationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
