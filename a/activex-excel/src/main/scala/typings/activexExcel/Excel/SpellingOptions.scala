package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpellingOptions extends js.Object {
  var ArabicModes: XlArabicModes
  var ArabicStrictAlefHamza: Boolean
  var ArabicStrictFinalYaa: Boolean
  var ArabicStrictTaaMarboota: Boolean
  var BrazilReform: XlPortugueseReform
  var DictLang: Double
  @JSName("Excel.SpellingOptions_typekey")
  var ExcelDotSpellingOptions_typekey: SpellingOptions
  var GermanPostReform: Boolean
  var HebrewModes: XlHebrewModes
  var IgnoreCaps: Boolean
  var IgnoreFileNames: Boolean
  var IgnoreMixedDigits: Boolean
  var KoreanCombineAux: Boolean
  var KoreanProcessCompound: Boolean
  var KoreanUseAutoChangeList: Boolean
  var PortugalReform: XlPortugueseReform
  var RussianStrictE: Boolean
  var SpanishModes: XlSpanishModes
  var SuggestMainOnly: Boolean
  var UserDict: String
}

object SpellingOptions {
  @scala.inline
  def apply(
    ArabicModes: XlArabicModes,
    ArabicStrictAlefHamza: Boolean,
    ArabicStrictFinalYaa: Boolean,
    ArabicStrictTaaMarboota: Boolean,
    BrazilReform: XlPortugueseReform,
    DictLang: Double,
    ExcelDotSpellingOptions_typekey: SpellingOptions,
    GermanPostReform: Boolean,
    HebrewModes: XlHebrewModes,
    IgnoreCaps: Boolean,
    IgnoreFileNames: Boolean,
    IgnoreMixedDigits: Boolean,
    KoreanCombineAux: Boolean,
    KoreanProcessCompound: Boolean,
    KoreanUseAutoChangeList: Boolean,
    PortugalReform: XlPortugueseReform,
    RussianStrictE: Boolean,
    SpanishModes: XlSpanishModes,
    SuggestMainOnly: Boolean,
    UserDict: String
  ): SpellingOptions = {
    val __obj = js.Dynamic.literal(ArabicModes = ArabicModes.asInstanceOf[js.Any], ArabicStrictAlefHamza = ArabicStrictAlefHamza.asInstanceOf[js.Any], ArabicStrictFinalYaa = ArabicStrictFinalYaa.asInstanceOf[js.Any], ArabicStrictTaaMarboota = ArabicStrictTaaMarboota.asInstanceOf[js.Any], BrazilReform = BrazilReform.asInstanceOf[js.Any], DictLang = DictLang.asInstanceOf[js.Any], GermanPostReform = GermanPostReform.asInstanceOf[js.Any], HebrewModes = HebrewModes.asInstanceOf[js.Any], IgnoreCaps = IgnoreCaps.asInstanceOf[js.Any], IgnoreFileNames = IgnoreFileNames.asInstanceOf[js.Any], IgnoreMixedDigits = IgnoreMixedDigits.asInstanceOf[js.Any], KoreanCombineAux = KoreanCombineAux.asInstanceOf[js.Any], KoreanProcessCompound = KoreanProcessCompound.asInstanceOf[js.Any], KoreanUseAutoChangeList = KoreanUseAutoChangeList.asInstanceOf[js.Any], PortugalReform = PortugalReform.asInstanceOf[js.Any], RussianStrictE = RussianStrictE.asInstanceOf[js.Any], SpanishModes = SpanishModes.asInstanceOf[js.Any], SuggestMainOnly = SuggestMainOnly.asInstanceOf[js.Any], UserDict = UserDict.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SpellingOptions_typekey")(ExcelDotSpellingOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpellingOptions]
  }
}

