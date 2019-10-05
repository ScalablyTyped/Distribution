package typings.awsDashSdk.clientsPollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVoicesInput extends js.Object {
  /**
    * Specifies the engine (standard or neural) used by Amazon Polly when processing input text for speech synthesis. 
    */
  var Engine: js.UndefOr[typings.awsDashSdk.clientsPollyMod.Engine] = js.undefined
  /**
    * Boolean value indicating whether to return any bilingual voices that use the specified language as an additional language. For instance, if you request all languages that use US English (es-US), and there is an Italian voice that speaks both Italian (it-IT) and US English, that voice will be included if you specify yes but not if you specify no.
    */
  var IncludeAdditionalLanguageCodes: js.UndefOr[typings.awsDashSdk.clientsPollyMod.IncludeAdditionalLanguageCodes] = js.undefined
  /**
    *  The language identification tag (ISO 639 code for the language name-ISO 3166 country code) for filtering the list of voices returned. If you don't specify this optional parameter, all available voices are returned. 
    */
  var LanguageCode: js.UndefOr[typings.awsDashSdk.clientsPollyMod.LanguageCode] = js.undefined
  /**
    * An opaque pagination token returned from the previous DescribeVoices operation. If present, this indicates where to continue the listing.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsPollyMod.NextToken] = js.undefined
}

object DescribeVoicesInput {
  @scala.inline
  def apply(
    Engine: Engine = null,
    IncludeAdditionalLanguageCodes: js.UndefOr[Boolean] = js.undefined,
    LanguageCode: LanguageCode = null,
    NextToken: NextToken = null
  ): DescribeVoicesInput = {
    val __obj = js.Dynamic.literal()
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeAdditionalLanguageCodes)) __obj.updateDynamic("IncludeAdditionalLanguageCodes")(IncludeAdditionalLanguageCodes)
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeVoicesInput]
  }
}

