package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersioningConfiguration extends js.Object {
  /**
    * How many versions of data set contents will be kept. The "unlimited" parameter must be false.
    */
  var maxVersions: js.UndefOr[MaxVersions] = js.undefined
  /**
    * If true, unlimited versions of data set contents will be kept.
    */
  var unlimited: js.UndefOr[UnlimitedVersioning] = js.undefined
}

object VersioningConfiguration {
  @scala.inline
  def apply(
    maxVersions: js.UndefOr[MaxVersions] = js.undefined,
    unlimited: js.UndefOr[UnlimitedVersioning] = js.undefined
  ): VersioningConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxVersions)) __obj.updateDynamic("maxVersions")(maxVersions)
    if (!js.isUndefined(unlimited)) __obj.updateDynamic("unlimited")(unlimited)
    __obj.asInstanceOf[VersioningConfiguration]
  }
}

