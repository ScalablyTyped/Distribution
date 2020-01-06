package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLJobConfig extends js.Object {
  /**
    * How long a job is allowed to run, or how many candidates a job is allowed to generate.
    */
  var CompletionCriteria: js.UndefOr[AutoMLJobCompletionCriteria] = js.native
  /**
    * Security configuration for traffic encryption or Amazon VPC settings.
    */
  var SecurityConfig: js.UndefOr[AutoMLSecurityConfig] = js.native
}

object AutoMLJobConfig {
  @scala.inline
  def apply(
    CompletionCriteria: AutoMLJobCompletionCriteria = null,
    SecurityConfig: AutoMLSecurityConfig = null
  ): AutoMLJobConfig = {
    val __obj = js.Dynamic.literal()
    if (CompletionCriteria != null) __obj.updateDynamic("CompletionCriteria")(CompletionCriteria.asInstanceOf[js.Any])
    if (SecurityConfig != null) __obj.updateDynamic("SecurityConfig")(SecurityConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLJobConfig]
  }
}

