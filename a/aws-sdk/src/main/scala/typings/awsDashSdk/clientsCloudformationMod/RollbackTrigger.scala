package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollbackTrigger extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the rollback trigger. If a specified trigger is missing, the entire stack operation fails and is rolled back. 
    */
  var Arn: typings.awsDashSdk.clientsCloudformationMod.Arn
  /**
    * The resource type of the rollback trigger. Currently, AWS::CloudWatch::Alarm is the only supported resource type.
    */
  var Type: typings.awsDashSdk.clientsCloudformationMod.Type
}

object RollbackTrigger {
  @scala.inline
  def apply(Arn: Arn, Type: Type): RollbackTrigger = {
    val __obj = js.Dynamic.literal(Arn = Arn, Type = Type)
  
    __obj.asInstanceOf[RollbackTrigger]
  }
}

