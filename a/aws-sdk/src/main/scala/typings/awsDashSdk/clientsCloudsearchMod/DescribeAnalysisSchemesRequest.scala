package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAnalysisSchemesRequest extends js.Object {
  /**
    * The analysis schemes you want to describe.
    */
  var AnalysisSchemeNames: js.UndefOr[StandardNameList] = js.undefined
  /**
    * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the domain you want to describe.
    */
  var DomainName: typings.awsDashSdk.clientsCloudsearchMod.DomainName
}

object DescribeAnalysisSchemesRequest {
  @scala.inline
  def apply(
    DomainName: DomainName,
    AnalysisSchemeNames: StandardNameList = null,
    Deployed: js.UndefOr[Boolean] = js.undefined
  ): DescribeAnalysisSchemesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
    if (AnalysisSchemeNames != null) __obj.updateDynamic("AnalysisSchemeNames")(AnalysisSchemeNames)
    if (!js.isUndefined(Deployed)) __obj.updateDynamic("Deployed")(Deployed)
    __obj.asInstanceOf[DescribeAnalysisSchemesRequest]
  }
}

