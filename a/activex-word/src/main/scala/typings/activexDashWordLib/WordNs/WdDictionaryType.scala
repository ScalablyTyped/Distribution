package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdDictionaryType extends js.Object

@JSGlobal("Word.WdDictionaryType")
@js.native
object WdDictionaryType extends js.Object {
  @js.native
  sealed trait wdGrammar
    extends activexDashWordLib.WordNs.WdDictionaryType
  
  @js.native
  sealed trait wdHangulHanjaConversion
    extends activexDashWordLib.WordNs.WdDictionaryType
  
  @js.native
  sealed trait wdHangulHanjaConversionCustom
    extends activexDashWordLib.WordNs.WdDictionaryType
  
  @js.native
  sealed trait wdHyphenation
    extends activexDashWordLib.WordNs.WdDictionaryType
  
  @js.native
  sealed trait wdSpelling
    extends activexDashWordLib.WordNs.WdDictionaryType
  
  @js.native
  sealed trait wdSpellingComplete
    extends activexDashWordLib.WordNs.WdDictionaryType
  
  @js.native
  sealed trait wdSpellingCustom
    extends activexDashWordLib.WordNs.WdDictionaryType
  
  @js.native
  sealed trait wdSpellingLegal
    extends activexDashWordLib.WordNs.WdDictionaryType
  
  @js.native
  sealed trait wdSpellingMedical
    extends activexDashWordLib.WordNs.WdDictionaryType
  
  @js.native
  sealed trait wdThesaurus
    extends activexDashWordLib.WordNs.WdDictionaryType
  
  /* 1 */ val wdGrammar: wdGrammar with scala.Double = js.native
  /* 8 */ val wdHangulHanjaConversion: wdHangulHanjaConversion with scala.Double = js.native
  /* 9 */ val wdHangulHanjaConversionCustom: wdHangulHanjaConversionCustom with scala.Double = js.native
  /* 3 */ val wdHyphenation: wdHyphenation with scala.Double = js.native
  /* 0 */ val wdSpelling: wdSpelling with scala.Double = js.native
  /* 4 */ val wdSpellingComplete: wdSpellingComplete with scala.Double = js.native
  /* 5 */ val wdSpellingCustom: wdSpellingCustom with scala.Double = js.native
  /* 6 */ val wdSpellingLegal: wdSpellingLegal with scala.Double = js.native
  /* 7 */ val wdSpellingMedical: wdSpellingMedical with scala.Double = js.native
  /* 2 */ val wdThesaurus: wdThesaurus with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdDictionaryType with scala.Double] = js.native
}

