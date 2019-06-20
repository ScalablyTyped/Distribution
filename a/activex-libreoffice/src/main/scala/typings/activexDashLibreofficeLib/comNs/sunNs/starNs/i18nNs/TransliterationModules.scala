package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Old transliteration module enumeration.
  *
  * Use with {@link XTransliteration.loadModule()} and {@link com.sun.star.util.SearchOptions.transliterateFlags()}
  *
  * Note that values >=0x100 are logically or'ed with other values!
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`256`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`512`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`-256`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1024`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`262144`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1048576`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4194304`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`32768`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8388608`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`67108864`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`16384`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`33554432`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`65536`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2097152`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`16777216`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`134217728`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`524288`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8192`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4096`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`131072`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`536870912`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`255`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`11`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`12`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`13`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`9`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`10`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`268435456`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
*/
trait TransliterationModules extends js.Object

object TransliterationModules {
  @scala.inline
  def END_OF_MODULE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  @scala.inline
  def FULLWIDTH_HALFWIDTH: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  @scala.inline
  def HALFWIDTH_FULLWIDTH: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  @scala.inline
  def HIRAGANA_KATAKANA: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6` = this.cast(6)
  @scala.inline
  def IGNORE_CASE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`256` = this.cast(256)
  @scala.inline
  def IGNORE_KANA: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`512` = this.cast(512)
  @scala.inline
  def IGNORE_MASK: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`-256` = this.cast(-256)
  /** Ignore full width and half width characters when comparing strings by transliteration service. */
  @scala.inline
  def IGNORE_WIDTH: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1024` = this.cast(1024)
  @scala.inline
  def KATAKANA_HIRAGANA: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5` = this.cast(5)
  @scala.inline
  def LOWERCASE_UPPERCASE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  @scala.inline
  def NON_IGNORE_MASK: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`255` = this.cast(255)
  @scala.inline
  def NumToTextFormalHangul_ko: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`11` = this.cast(11)
  @scala.inline
  def NumToTextFormalLower_ko: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`12` = this.cast(12)
  @scala.inline
  def NumToTextFormalUpper_ko: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`13` = this.cast(13)
  @scala.inline
  def NumToTextLower_zh_CN: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7` = this.cast(7)
  @scala.inline
  def NumToTextLower_zh_TW: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`9` = this.cast(9)
  @scala.inline
  def NumToTextUpper_zh_CN: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8` = this.cast(8)
  @scala.inline
  def NumToTextUpper_zh_TW: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`10` = this.cast(10)
  @scala.inline
  def UPPERCASE_LOWERCASE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ignoreBaFa_ja_JP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`262144` = this.cast(262144)
  @scala.inline
  def ignoreHyuByu_ja_JP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1048576` = this.cast(1048576)
  /** Ignore Katakana YA/A following the character in either I or E row in Japanese fuzzy search. */
  @scala.inline
  def ignoreIandEfollowedByYa_ja_JP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4194304` = this.cast(4194304)
  @scala.inline
  def ignoreIterationMark_ja_JP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`32768` = this.cast(32768)
  /** Ignore Katakana KI/KU following the character in SA column in Japanese fuzzy search. */
  @scala.inline
  def ignoreKiKuFollowedBySa_ja_JP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8388608` = this.cast(8388608)
  @scala.inline
  def ignoreMiddleDot_ja_JP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`67108864` = this.cast(67108864)
  @scala.inline
  def ignoreMinusSign_ja_JP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`16384` = this.cast(16384)
  @scala.inline
  def ignoreProlongedSoundMark_ja_JP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`33554432` = this.cast(33554432)
  @scala.inline
  def ignoreSeZe_ja_JP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2097152` = this.cast(2097152)
  @scala.inline
  def ignoreSeparator_ja_JP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`65536` = this.cast(65536)
  @scala.inline
  def ignoreSize_ja_JP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`16777216` = this.cast(16777216)
  @scala.inline
  def ignoreSpace_ja_JP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`134217728` = this.cast(134217728)
  @scala.inline
  def ignoreTiJi_ja_JP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`524288` = this.cast(524288)
  /** Ignore Japanese traditional Katakana and Hiragana characters in Japanese fuzzy search. */
  @scala.inline
  def ignoreTraditionalKana_ja_JP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8192` = this.cast(8192)
  /** Ignore Japanese traditional Kanji characters in Japanese fuzzy search. */
  @scala.inline
  def ignoreTraditionalKanji_ja_JP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4096` = this.cast(4096)
  @scala.inline
  def ignoreZiZu_ja_JP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`131072` = this.cast(131072)
  @scala.inline
  def largeToSmall_ja_JP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`536870912` = this.cast(536870912)
  @scala.inline
  def smallToLarge_ja_JP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`268435456` = this.cast(268435456)
}

