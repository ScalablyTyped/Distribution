package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTaskTemplateResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the task template resource.
    */
  var Arn: TaskTemplateArn
  
  /**
    * The identifier of the task template resource.
    */
  var Id: TaskTemplateId
}
object CreateTaskTemplateResponse {
  
  inline def apply(Arn: TaskTemplateArn, Id: TaskTemplateId): CreateTaskTemplateResponse = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTaskTemplateResponse]
  }
  
  extension [Self <: CreateTaskTemplateResponse](x: Self) {
    
    inline def setArn(value: TaskTemplateArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setId(value: TaskTemplateId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
