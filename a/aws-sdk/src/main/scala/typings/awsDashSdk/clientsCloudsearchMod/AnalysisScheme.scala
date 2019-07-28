package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalysisScheme extends js.Object {
  var AnalysisOptions: js.UndefOr[typings.awsDashSdk.clientsCloudsearchMod.AnalysisOptions] = js.undefined
  var AnalysisSchemeLanguage: typings.awsDashSdk.clientsCloudsearchMod.AnalysisSchemeLanguage
  var AnalysisSchemeName: StandardName
}

object AnalysisScheme {
  @scala.inline
  def apply(
    AnalysisSchemeLanguage: AnalysisSchemeLanguage,
    AnalysisSchemeName: StandardName,
    AnalysisOptions: AnalysisOptions = null
  ): AnalysisScheme = {
    val __obj = js.Dynamic.literal(AnalysisSchemeLanguage = AnalysisSchemeLanguage.asInstanceOf[js.Any], AnalysisSchemeName = AnalysisSchemeName)
    if (AnalysisOptions != null) __obj.updateDynamic("AnalysisOptions")(AnalysisOptions)
    __obj.asInstanceOf[AnalysisScheme]
  }
}

