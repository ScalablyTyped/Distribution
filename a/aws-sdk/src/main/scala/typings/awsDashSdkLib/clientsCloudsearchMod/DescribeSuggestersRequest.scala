package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSuggestersRequest extends js.Object {
  /**
    * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the domain you want to describe.
    */
  var DomainName: awsDashSdkLib.clientsCloudsearchMod.DomainName
  /**
    * The suggesters you want to describe.
    */
  var SuggesterNames: js.UndefOr[StandardNameList] = js.undefined
}

object DescribeSuggestersRequest {
  @scala.inline
  def apply(
    DomainName: DomainName,
    Deployed: js.UndefOr[Boolean] = js.undefined,
    SuggesterNames: StandardNameList = null
  ): DescribeSuggestersRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
    if (!js.isUndefined(Deployed)) __obj.updateDynamic("Deployed")(Deployed)
    if (SuggesterNames != null) __obj.updateDynamic("SuggesterNames")(SuggesterNames)
    __obj.asInstanceOf[DescribeSuggestersRequest]
  }
}

