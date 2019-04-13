package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutAccountSettingDefaultRequest extends js.Object {
  /**
    * The resource type to enable the new format for. If serviceLongArnFormat is specified, the ARN for your Amazon ECS services is affected. If taskLongArnFormat is specified, the ARN and resource ID for your Amazon ECS tasks are affected. If containerInstanceLongArnFormat is specified, the ARN and resource ID for your Amazon ECS container instances are affected.
    */
  var name: SettingName
  /**
    * The account setting value for the specified principal ARN. Accepted values are enabled and disabled.
    */
  var value: String
}

object PutAccountSettingDefaultRequest {
  @scala.inline
  def apply(name: SettingName, value: String): PutAccountSettingDefaultRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value)
  
    __obj.asInstanceOf[PutAccountSettingDefaultRequest]
  }
}

