package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransliterationModules extends js.Object

/**
  * Old transliteration module enumeration.
  *
  * Use with {@link XTransliteration.loadModule()} and {@link com.sun.star.util.SearchOptions.transliterateFlags()}
  *
  * Note that values >=0x100 are logically or'ed with other values!
  */
@JSGlobal("com.sun.star.i18n.TransliterationModules")
@js.native
object TransliterationModules extends js.Object {
  @js.native
  sealed trait END_OF_MODULE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait FULLWIDTH_HALFWIDTH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait HALFWIDTH_FULLWIDTH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait HIRAGANA_KATAKANA
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait IGNORE_CASE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait IGNORE_KANA
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait IGNORE_MASK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  /** Ignore full width and half width characters when comparing strings by transliteration service. */
  @js.native
  sealed trait IGNORE_WIDTH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait KATAKANA_HIRAGANA
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait LOWERCASE_UPPERCASE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait NON_IGNORE_MASK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait NumToTextFormalHangul_ko
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait NumToTextFormalLower_ko
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait NumToTextFormalUpper_ko
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait NumToTextLower_zh_CN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait NumToTextLower_zh_TW
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait NumToTextUpper_zh_CN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait NumToTextUpper_zh_TW
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait UPPERCASE_LOWERCASE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait ignoreBaFa_ja_JP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait ignoreHyuByu_ja_JP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  /** Ignore Katakana YA/A following the character in either I or E row in Japanese fuzzy search. */
  @js.native
  sealed trait ignoreIandEfollowedByYa_ja_JP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait ignoreIterationMark_ja_JP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  /** Ignore Katakana KI/KU following the character in SA column in Japanese fuzzy search. */
  @js.native
  sealed trait ignoreKiKuFollowedBySa_ja_JP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait ignoreMiddleDot_ja_JP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait ignoreMinusSign_ja_JP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait ignoreProlongedSoundMark_ja_JP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait ignoreSeZe_ja_JP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait ignoreSeparator_ja_JP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait ignoreSize_ja_JP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait ignoreSpace_ja_JP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait ignoreTiJi_ja_JP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  /** Ignore Japanese traditional Katakana and Hiragana characters in Japanese fuzzy search. */
  @js.native
  sealed trait ignoreTraditionalKana_ja_JP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  /** Ignore Japanese traditional Kanji characters in Japanese fuzzy search. */
  @js.native
  sealed trait ignoreTraditionalKanji_ja_JP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait ignoreZiZu_ja_JP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait largeToSmall_ja_JP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  @js.native
  sealed trait smallToLarge_ja_JP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules
  
  /* 0 */ val END_OF_MODULE: END_OF_MODULE with scala.Double = js.native
  /* 4 */ val FULLWIDTH_HALFWIDTH: FULLWIDTH_HALFWIDTH with scala.Double = js.native
  /* 3 */ val HALFWIDTH_FULLWIDTH: HALFWIDTH_FULLWIDTH with scala.Double = js.native
  /* 6 */ val HIRAGANA_KATAKANA: HIRAGANA_KATAKANA with scala.Double = js.native
  /* 256 */ val IGNORE_CASE: IGNORE_CASE with scala.Double = js.native
  /* 512 */ val IGNORE_KANA: IGNORE_KANA with scala.Double = js.native
  /* -256 */ val IGNORE_MASK: IGNORE_MASK with scala.Double = js.native
  /* 1024 */ val IGNORE_WIDTH: IGNORE_WIDTH with scala.Double = js.native
  /* 5 */ val KATAKANA_HIRAGANA: KATAKANA_HIRAGANA with scala.Double = js.native
  /* 2 */ val LOWERCASE_UPPERCASE: LOWERCASE_UPPERCASE with scala.Double = js.native
  /* 255 */ val NON_IGNORE_MASK: NON_IGNORE_MASK with scala.Double = js.native
  /* 11 */ val NumToTextFormalHangul_ko: NumToTextFormalHangul_ko with scala.Double = js.native
  /* 12 */ val NumToTextFormalLower_ko: NumToTextFormalLower_ko with scala.Double = js.native
  /* 13 */ val NumToTextFormalUpper_ko: NumToTextFormalUpper_ko with scala.Double = js.native
  /* 7 */ val NumToTextLower_zh_CN: NumToTextLower_zh_CN with scala.Double = js.native
  /* 9 */ val NumToTextLower_zh_TW: NumToTextLower_zh_TW with scala.Double = js.native
  /* 8 */ val NumToTextUpper_zh_CN: NumToTextUpper_zh_CN with scala.Double = js.native
  /* 10 */ val NumToTextUpper_zh_TW: NumToTextUpper_zh_TW with scala.Double = js.native
  /* 1 */ val UPPERCASE_LOWERCASE: UPPERCASE_LOWERCASE with scala.Double = js.native
  /* 262144 */ val ignoreBaFa_ja_JP: ignoreBaFa_ja_JP with scala.Double = js.native
  /* 1048576 */ val ignoreHyuByu_ja_JP: ignoreHyuByu_ja_JP with scala.Double = js.native
  /* 4194304 */ val ignoreIandEfollowedByYa_ja_JP: ignoreIandEfollowedByYa_ja_JP with scala.Double = js.native
  /* 32768 */ val ignoreIterationMark_ja_JP: ignoreIterationMark_ja_JP with scala.Double = js.native
  /* 8388608 */ val ignoreKiKuFollowedBySa_ja_JP: ignoreKiKuFollowedBySa_ja_JP with scala.Double = js.native
  /* 67108864 */ val ignoreMiddleDot_ja_JP: ignoreMiddleDot_ja_JP with scala.Double = js.native
  /* 16384 */ val ignoreMinusSign_ja_JP: ignoreMinusSign_ja_JP with scala.Double = js.native
  /* 33554432 */ val ignoreProlongedSoundMark_ja_JP: ignoreProlongedSoundMark_ja_JP with scala.Double = js.native
  /* 2097152 */ val ignoreSeZe_ja_JP: ignoreSeZe_ja_JP with scala.Double = js.native
  /* 65536 */ val ignoreSeparator_ja_JP: ignoreSeparator_ja_JP with scala.Double = js.native
  /* 16777216 */ val ignoreSize_ja_JP: ignoreSize_ja_JP with scala.Double = js.native
  /* 134217728 */ val ignoreSpace_ja_JP: ignoreSpace_ja_JP with scala.Double = js.native
  /* 524288 */ val ignoreTiJi_ja_JP: ignoreTiJi_ja_JP with scala.Double = js.native
  /* 8192 */ val ignoreTraditionalKana_ja_JP: ignoreTraditionalKana_ja_JP with scala.Double = js.native
  /* 4096 */ val ignoreTraditionalKanji_ja_JP: ignoreTraditionalKanji_ja_JP with scala.Double = js.native
  /* 131072 */ val ignoreZiZu_ja_JP: ignoreZiZu_ja_JP with scala.Double = js.native
  /* 536870912 */ val largeToSmall_ja_JP: largeToSmall_ja_JP with scala.Double = js.native
  /* 268435456 */ val smallToLarge_ja_JP: smallToLarge_ja_JP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.TransliterationModules with scala.Double
  ] = js.native
}

