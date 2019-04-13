package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistrationConfig extends js.Object {
  /**
    * The ARN of the role.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
  /**
    * The template body.
    */
  var templateBody: js.UndefOr[TemplateBody] = js.undefined
}

object RegistrationConfig {
  @scala.inline
  def apply(roleArn: RoleArn = null, templateBody: TemplateBody = null): RegistrationConfig = {
    val __obj = js.Dynamic.literal()
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    if (templateBody != null) __obj.updateDynamic("templateBody")(templateBody)
    __obj.asInstanceOf[RegistrationConfig]
  }
}

