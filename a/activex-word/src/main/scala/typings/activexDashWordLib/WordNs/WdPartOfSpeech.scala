package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdPartOfSpeech extends js.Object

@JSGlobal("Word.WdPartOfSpeech")
@js.native
object WdPartOfSpeech extends js.Object {
  @js.native
  sealed trait wdAdjective
    extends activexDashWordLib.WordNs.WdPartOfSpeech
  
  @js.native
  sealed trait wdAdverb
    extends activexDashWordLib.WordNs.WdPartOfSpeech
  
  @js.native
  sealed trait wdConjunction
    extends activexDashWordLib.WordNs.WdPartOfSpeech
  
  @js.native
  sealed trait wdIdiom
    extends activexDashWordLib.WordNs.WdPartOfSpeech
  
  @js.native
  sealed trait wdInterjection
    extends activexDashWordLib.WordNs.WdPartOfSpeech
  
  @js.native
  sealed trait wdNoun
    extends activexDashWordLib.WordNs.WdPartOfSpeech
  
  @js.native
  sealed trait wdOther
    extends activexDashWordLib.WordNs.WdPartOfSpeech
  
  @js.native
  sealed trait wdPreposition
    extends activexDashWordLib.WordNs.WdPartOfSpeech
  
  @js.native
  sealed trait wdPronoun
    extends activexDashWordLib.WordNs.WdPartOfSpeech
  
  @js.native
  sealed trait wdVerb
    extends activexDashWordLib.WordNs.WdPartOfSpeech
  
  /* 0 */ val wdAdjective: wdAdjective with scala.Double = js.native
  /* 2 */ val wdAdverb: wdAdverb with scala.Double = js.native
  /* 5 */ val wdConjunction: wdConjunction with scala.Double = js.native
  /* 8 */ val wdIdiom: wdIdiom with scala.Double = js.native
  /* 7 */ val wdInterjection: wdInterjection with scala.Double = js.native
  /* 1 */ val wdNoun: wdNoun with scala.Double = js.native
  /* 9 */ val wdOther: wdOther with scala.Double = js.native
  /* 6 */ val wdPreposition: wdPreposition with scala.Double = js.native
  /* 4 */ val wdPronoun: wdPronoun with scala.Double = js.native
  /* 3 */ val wdVerb: wdVerb with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdPartOfSpeech with scala.Double] = js.native
}

