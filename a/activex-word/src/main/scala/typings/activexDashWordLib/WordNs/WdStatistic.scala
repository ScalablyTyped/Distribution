package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdStatistic extends js.Object

@JSGlobal("Word.WdStatistic")
@js.native
object WdStatistic extends js.Object {
  @js.native
  sealed trait wdStatisticCharacters
    extends activexDashWordLib.WordNs.WdStatistic
  
  @js.native
  sealed trait wdStatisticCharactersWithSpaces
    extends activexDashWordLib.WordNs.WdStatistic
  
  @js.native
  sealed trait wdStatisticFarEastCharacters
    extends activexDashWordLib.WordNs.WdStatistic
  
  @js.native
  sealed trait wdStatisticLines
    extends activexDashWordLib.WordNs.WdStatistic
  
  @js.native
  sealed trait wdStatisticPages
    extends activexDashWordLib.WordNs.WdStatistic
  
  @js.native
  sealed trait wdStatisticParagraphs
    extends activexDashWordLib.WordNs.WdStatistic
  
  @js.native
  sealed trait wdStatisticWords
    extends activexDashWordLib.WordNs.WdStatistic
  
  /* 3 */ val wdStatisticCharacters: wdStatisticCharacters with scala.Double = js.native
  /* 5 */ val wdStatisticCharactersWithSpaces: wdStatisticCharactersWithSpaces with scala.Double = js.native
  /* 6 */ val wdStatisticFarEastCharacters: wdStatisticFarEastCharacters with scala.Double = js.native
  /* 1 */ val wdStatisticLines: wdStatisticLines with scala.Double = js.native
  /* 2 */ val wdStatisticPages: wdStatisticPages with scala.Double = js.native
  /* 4 */ val wdStatisticParagraphs: wdStatisticParagraphs with scala.Double = js.native
  /* 0 */ val wdStatisticWords: wdStatisticWords with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdStatistic with scala.Double] = js.native
}

