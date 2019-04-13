package typings
package awsDashSdkLib.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpgradeElasticsearchDomainRequest extends js.Object {
  var DomainName: awsDashSdkLib.clientsEsMod.DomainName
  /**
    *  This flag, when set to True, indicates that an Upgrade Eligibility Check needs to be performed. This will not actually perform the Upgrade. 
    */
  var PerformCheckOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * The version of Elasticsearch that you intend to upgrade the domain to.
    */
  var TargetVersion: ElasticsearchVersionString
}

object UpgradeElasticsearchDomainRequest {
  @scala.inline
  def apply(
    DomainName: DomainName,
    TargetVersion: ElasticsearchVersionString,
    PerformCheckOnly: js.UndefOr[Boolean] = js.undefined
  ): UpgradeElasticsearchDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, TargetVersion = TargetVersion)
    if (!js.isUndefined(PerformCheckOnly)) __obj.updateDynamic("PerformCheckOnly")(PerformCheckOnly)
    __obj.asInstanceOf[UpgradeElasticsearchDomainRequest]
  }
}

