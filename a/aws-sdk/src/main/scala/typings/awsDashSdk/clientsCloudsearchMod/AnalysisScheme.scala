package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalysisScheme extends js.Object {
  var AnalysisOptions: js.UndefOr[typings.awsDashSdk.clientsCloudsearchMod.AnalysisOptions] = js.native
  var AnalysisSchemeLanguage: typings.awsDashSdk.clientsCloudsearchMod.AnalysisSchemeLanguage = js.native
  var AnalysisSchemeName: StandardName = js.native
}

object AnalysisScheme {
  @scala.inline
  def apply(
    AnalysisSchemeLanguage: AnalysisSchemeLanguage,
    AnalysisSchemeName: StandardName,
    AnalysisOptions: AnalysisOptions = null
  ): AnalysisScheme = {
    val __obj = js.Dynamic.literal(AnalysisSchemeLanguage = AnalysisSchemeLanguage.asInstanceOf[js.Any], AnalysisSchemeName = AnalysisSchemeName.asInstanceOf[js.Any])
    if (AnalysisOptions != null) __obj.updateDynamic("AnalysisOptions")(AnalysisOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisScheme]
  }
}

