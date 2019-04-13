package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  /**
    * User-defined criteria for sending commands that target instances that meet the criteria. Key can be tag:&lt;Amazon EC2 tag&gt; or InstanceIds. For more information about how to send commands that target instances using Key,Value parameters, see Targeting Multiple Instances in the AWS Systems Manager User Guide.
    */
  var Key: js.UndefOr[TargetKey] = js.undefined
  /**
    * User-defined criteria that maps to Key. For example, if you specified tag:ServerRole, you could specify value:WebServer to run a command on instances that include Amazon EC2 tags of ServerRole,WebServer. For more information about how to send commands that target instances using Key,Value parameters, see Sending Commands to a Fleet in the AWS Systems Manager User Guide.
    */
  var Values: js.UndefOr[TargetValues] = js.undefined
}

object Target {
  @scala.inline
  def apply(Key: TargetKey = null, Values: TargetValues = null): Target = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[Target]
  }
}

