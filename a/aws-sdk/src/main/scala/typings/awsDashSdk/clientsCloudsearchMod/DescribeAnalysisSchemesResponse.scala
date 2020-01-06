package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAnalysisSchemesResponse extends js.Object {
  /**
    * The analysis scheme descriptions.
    */
  var AnalysisSchemes: AnalysisSchemeStatusList = js.native
}

object DescribeAnalysisSchemesResponse {
  @scala.inline
  def apply(AnalysisSchemes: AnalysisSchemeStatusList): DescribeAnalysisSchemesResponse = {
    val __obj = js.Dynamic.literal(AnalysisSchemes = AnalysisSchemes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeAnalysisSchemesResponse]
  }
}

