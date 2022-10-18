package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollbackTrigger extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the rollback trigger. If a specified trigger is missing, the entire stack operation fails and is rolled back.
    */
  var Arn: typings.awsSdk.clientsCloudformationMod.Arn
  
  /**
    * The resource type of the rollback trigger. Specify either AWS::CloudWatch::Alarm or AWS::CloudWatch::CompositeAlarm resource types.
    */
  var Type: typings.awsSdk.clientsCloudformationMod.Type
}
object RollbackTrigger {
  
  inline def apply(Arn: Arn, Type: Type): RollbackTrigger = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollbackTrigger]
  }
  
  extension [Self <: RollbackTrigger](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
