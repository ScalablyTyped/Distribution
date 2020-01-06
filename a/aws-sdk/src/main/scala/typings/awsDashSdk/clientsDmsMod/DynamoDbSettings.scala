package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamoDbSettings extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) used by the service access IAM role. 
    */
  var ServiceAccessRoleArn: String = js.native
}

object DynamoDbSettings {
  @scala.inline
  def apply(ServiceAccessRoleArn: String): DynamoDbSettings = {
    val __obj = js.Dynamic.literal(ServiceAccessRoleArn = ServiceAccessRoleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DynamoDbSettings]
  }
}

