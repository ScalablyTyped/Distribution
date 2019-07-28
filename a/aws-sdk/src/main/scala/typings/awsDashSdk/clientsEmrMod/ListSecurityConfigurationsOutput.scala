package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSecurityConfigurationsOutput extends js.Object {
  /**
    * A pagination token that indicates the next set of results to retrieve. Include the marker in the next ListSecurityConfiguration call to retrieve the next page of results, if required.
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsEmrMod.Marker] = js.undefined
  /**
    * The creation date and time, and name, of each security configuration.
    */
  var SecurityConfigurations: js.UndefOr[SecurityConfigurationList] = js.undefined
}

object ListSecurityConfigurationsOutput {
  @scala.inline
  def apply(Marker: Marker = null, SecurityConfigurations: SecurityConfigurationList = null): ListSecurityConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (SecurityConfigurations != null) __obj.updateDynamic("SecurityConfigurations")(SecurityConfigurations)
    __obj.asInstanceOf[ListSecurityConfigurationsOutput]
  }
}

