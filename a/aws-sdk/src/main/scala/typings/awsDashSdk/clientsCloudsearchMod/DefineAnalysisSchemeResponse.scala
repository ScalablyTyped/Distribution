package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefineAnalysisSchemeResponse extends js.Object {
  var AnalysisScheme: AnalysisSchemeStatus = js.native
}

object DefineAnalysisSchemeResponse {
  @scala.inline
  def apply(AnalysisScheme: AnalysisSchemeStatus): DefineAnalysisSchemeResponse = {
    val __obj = js.Dynamic.literal(AnalysisScheme = AnalysisScheme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefineAnalysisSchemeResponse]
  }
}

