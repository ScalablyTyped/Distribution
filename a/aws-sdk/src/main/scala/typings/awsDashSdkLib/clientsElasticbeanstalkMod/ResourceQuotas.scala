package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceQuotas extends js.Object {
  /**
    * The quota for applications in the AWS account.
    */
  var ApplicationQuota: js.UndefOr[ResourceQuota] = js.undefined
  /**
    * The quota for application versions in the AWS account.
    */
  var ApplicationVersionQuota: js.UndefOr[ResourceQuota] = js.undefined
  /**
    * The quota for configuration templates in the AWS account.
    */
  var ConfigurationTemplateQuota: js.UndefOr[ResourceQuota] = js.undefined
  /**
    * The quota for custom platforms in the AWS account.
    */
  var CustomPlatformQuota: js.UndefOr[ResourceQuota] = js.undefined
  /**
    * The quota for environments in the AWS account.
    */
  var EnvironmentQuota: js.UndefOr[ResourceQuota] = js.undefined
}

object ResourceQuotas {
  @scala.inline
  def apply(
    ApplicationQuota: ResourceQuota = null,
    ApplicationVersionQuota: ResourceQuota = null,
    ConfigurationTemplateQuota: ResourceQuota = null,
    CustomPlatformQuota: ResourceQuota = null,
    EnvironmentQuota: ResourceQuota = null
  ): ResourceQuotas = {
    val __obj = js.Dynamic.literal()
    if (ApplicationQuota != null) __obj.updateDynamic("ApplicationQuota")(ApplicationQuota)
    if (ApplicationVersionQuota != null) __obj.updateDynamic("ApplicationVersionQuota")(ApplicationVersionQuota)
    if (ConfigurationTemplateQuota != null) __obj.updateDynamic("ConfigurationTemplateQuota")(ConfigurationTemplateQuota)
    if (CustomPlatformQuota != null) __obj.updateDynamic("CustomPlatformQuota")(CustomPlatformQuota)
    if (EnvironmentQuota != null) __obj.updateDynamic("EnvironmentQuota")(EnvironmentQuota)
    __obj.asInstanceOf[ResourceQuotas]
  }
}

