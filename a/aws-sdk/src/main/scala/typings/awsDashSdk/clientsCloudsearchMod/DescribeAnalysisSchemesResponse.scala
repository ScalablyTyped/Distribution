package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAnalysisSchemesResponse extends js.Object {
  /**
    * The analysis scheme descriptions.
    */
  var AnalysisSchemes: AnalysisSchemeStatusList
}

object DescribeAnalysisSchemesResponse {
  @scala.inline
  def apply(AnalysisSchemes: AnalysisSchemeStatusList): DescribeAnalysisSchemesResponse = {
    val __obj = js.Dynamic.literal(AnalysisSchemes = AnalysisSchemes)
  
    __obj.asInstanceOf[DescribeAnalysisSchemesResponse]
  }
}

