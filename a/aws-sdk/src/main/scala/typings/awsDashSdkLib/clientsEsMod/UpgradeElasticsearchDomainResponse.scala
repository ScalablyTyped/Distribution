package typings
package awsDashSdkLib.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpgradeElasticsearchDomainResponse extends js.Object {
  var DomainName: js.UndefOr[DomainName] = js.undefined
  /**
    *  This flag, when set to True, indicates that an Upgrade Eligibility Check needs to be performed. This will not actually perform the Upgrade. 
    */
  var PerformCheckOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * The version of Elasticsearch that you intend to upgrade the domain to.
    */
  var TargetVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined
}

object UpgradeElasticsearchDomainResponse {
  @scala.inline
  def apply(
    DomainName: DomainName = null,
    PerformCheckOnly: js.UndefOr[Boolean] = js.undefined,
    TargetVersion: ElasticsearchVersionString = null
  ): UpgradeElasticsearchDomainResponse = {
    val __obj = js.Dynamic.literal()
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName)
    if (!js.isUndefined(PerformCheckOnly)) __obj.updateDynamic("PerformCheckOnly")(PerformCheckOnly)
    if (TargetVersion != null) __obj.updateDynamic("TargetVersion")(TargetVersion)
    __obj.asInstanceOf[UpgradeElasticsearchDomainResponse]
  }
}

