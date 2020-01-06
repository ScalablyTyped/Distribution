package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpgradeElasticsearchDomainResponse extends js.Object {
  var DomainName: js.UndefOr[typings.awsDashSdk.clientsEsMod.DomainName] = js.native
  /**
    *  This flag, when set to True, indicates that an Upgrade Eligibility Check needs to be performed. This will not actually perform the Upgrade. 
    */
  var PerformCheckOnly: js.UndefOr[Boolean] = js.native
  /**
    * The version of Elasticsearch that you intend to upgrade the domain to.
    */
  var TargetVersion: js.UndefOr[ElasticsearchVersionString] = js.native
}

object UpgradeElasticsearchDomainResponse {
  @scala.inline
  def apply(
    DomainName: DomainName = null,
    PerformCheckOnly: js.UndefOr[scala.Boolean] = js.undefined,
    TargetVersion: ElasticsearchVersionString = null
  ): UpgradeElasticsearchDomainResponse = {
    val __obj = js.Dynamic.literal()
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName.asInstanceOf[js.Any])
    if (!js.isUndefined(PerformCheckOnly)) __obj.updateDynamic("PerformCheckOnly")(PerformCheckOnly.asInstanceOf[js.Any])
    if (TargetVersion != null) __obj.updateDynamic("TargetVersion")(TargetVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradeElasticsearchDomainResponse]
  }
}

