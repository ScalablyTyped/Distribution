package typings.awsDashSdk.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollbackTrigger extends js.Object {
  /**
    * This property corresponds to the content of the same name for the AWS CloudFormation RollbackTrigger
    Data Type.
    */
  var Arn: __string
  /**
    * This property corresponds to the content of the same name for the AWS CloudFormation RollbackTrigger
    Data Type.
    */
  var Type: __string
}

object RollbackTrigger {
  @scala.inline
  def apply(Arn: __string, Type: __string): RollbackTrigger = {
    val __obj = js.Dynamic.literal(Arn = Arn, Type = Type)
  
    __obj.asInstanceOf[RollbackTrigger]
  }
}

