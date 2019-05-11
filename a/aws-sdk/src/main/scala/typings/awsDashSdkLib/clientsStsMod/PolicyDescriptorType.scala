package typings
package awsDashSdkLib.clientsStsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyDescriptorType extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IAM managed policy to use as a session policy for the role. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var arn: js.UndefOr[arnType] = js.undefined
}

object PolicyDescriptorType {
  @scala.inline
  def apply(arn: arnType = null): PolicyDescriptorType = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    __obj.asInstanceOf[PolicyDescriptorType]
  }
}

