package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpellingOptions extends js.Object {
  var ArabicModes: XlArabicModes = js.native
  var ArabicStrictAlefHamza: Boolean = js.native
  var ArabicStrictFinalYaa: Boolean = js.native
  var ArabicStrictTaaMarboota: Boolean = js.native
  var BrazilReform: XlPortugueseReform = js.native
  var DictLang: Double = js.native
  @JSName("Excel.SpellingOptions_typekey")
  var ExcelDotSpellingOptions_typekey: SpellingOptions = js.native
  var GermanPostReform: Boolean = js.native
  var HebrewModes: XlHebrewModes = js.native
  var IgnoreCaps: Boolean = js.native
  var IgnoreFileNames: Boolean = js.native
  var IgnoreMixedDigits: Boolean = js.native
  var KoreanCombineAux: Boolean = js.native
  var KoreanProcessCompound: Boolean = js.native
  var KoreanUseAutoChangeList: Boolean = js.native
  var PortugalReform: XlPortugueseReform = js.native
  var RussianStrictE: Boolean = js.native
  var SpanishModes: XlSpanishModes = js.native
  var SuggestMainOnly: Boolean = js.native
  var UserDict: String = js.native
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
  @scala.inline
  implicit class SpellingOptionsOps[Self <: SpellingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArabicModes(value: XlArabicModes): Self = this.set("ArabicModes", value.asInstanceOf[js.Any])
    @scala.inline
    def setArabicStrictAlefHamza(value: Boolean): Self = this.set("ArabicStrictAlefHamza", value.asInstanceOf[js.Any])
    @scala.inline
    def setArabicStrictFinalYaa(value: Boolean): Self = this.set("ArabicStrictFinalYaa", value.asInstanceOf[js.Any])
    @scala.inline
    def setArabicStrictTaaMarboota(value: Boolean): Self = this.set("ArabicStrictTaaMarboota", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrazilReform(value: XlPortugueseReform): Self = this.set("BrazilReform", value.asInstanceOf[js.Any])
    @scala.inline
    def setDictLang(value: Double): Self = this.set("DictLang", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcelDotSpellingOptions_typekey(value: SpellingOptions): Self = this.set("Excel.SpellingOptions_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setGermanPostReform(value: Boolean): Self = this.set("GermanPostReform", value.asInstanceOf[js.Any])
    @scala.inline
    def setHebrewModes(value: XlHebrewModes): Self = this.set("HebrewModes", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreCaps(value: Boolean): Self = this.set("IgnoreCaps", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreFileNames(value: Boolean): Self = this.set("IgnoreFileNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreMixedDigits(value: Boolean): Self = this.set("IgnoreMixedDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def setKoreanCombineAux(value: Boolean): Self = this.set("KoreanCombineAux", value.asInstanceOf[js.Any])
    @scala.inline
    def setKoreanProcessCompound(value: Boolean): Self = this.set("KoreanProcessCompound", value.asInstanceOf[js.Any])
    @scala.inline
    def setKoreanUseAutoChangeList(value: Boolean): Self = this.set("KoreanUseAutoChangeList", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortugalReform(value: XlPortugueseReform): Self = this.set("PortugalReform", value.asInstanceOf[js.Any])
    @scala.inline
    def setRussianStrictE(value: Boolean): Self = this.set("RussianStrictE", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpanishModes(value: XlSpanishModes): Self = this.set("SpanishModes", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggestMainOnly(value: Boolean): Self = this.set("SuggestMainOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserDict(value: String): Self = this.set("UserDict", value.asInstanceOf[js.Any])
  }
  
}

