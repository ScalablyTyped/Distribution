package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Distribution extends js.Object {
  /**
    *  
    */
  var amiDistributionConfiguration: js.UndefOr[AmiDistributionConfiguration] = js.native
  /**
    *  
    */
  var licenseConfigurationArns: js.UndefOr[ArnList] = js.native
  /**
    *  
    */
  var region: NonEmptyString = js.native
}

object Distribution {
  @scala.inline
  def apply(
    region: NonEmptyString,
    amiDistributionConfiguration: AmiDistributionConfiguration = null,
    licenseConfigurationArns: ArnList = null
  ): Distribution = {
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any])
    if (amiDistributionConfiguration != null) __obj.updateDynamic("amiDistributionConfiguration")(amiDistributionConfiguration.asInstanceOf[js.Any])
    if (licenseConfigurationArns != null) __obj.updateDynamic("licenseConfigurationArns")(licenseConfigurationArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
}

