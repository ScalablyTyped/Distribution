package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdAraSpeller extends js.Object

@JSGlobal("Word.WdAraSpeller")
@js.native
object WdAraSpeller extends js.Object {
  @js.native
  sealed trait wdBoth
    extends activexDashWordLib.WordNs.WdAraSpeller
  
  @js.native
  sealed trait wdFinalYaa
    extends activexDashWordLib.WordNs.WdAraSpeller
  
  @js.native
  sealed trait wdInitialAlef
    extends activexDashWordLib.WordNs.WdAraSpeller
  
  @js.native
  sealed trait wdNone
    extends activexDashWordLib.WordNs.WdAraSpeller
  
  /* 3 */ val wdBoth: wdBoth with scala.Double = js.native
  /* 2 */ val wdFinalYaa: wdFinalYaa with scala.Double = js.native
  /* 1 */ val wdInitialAlef: wdInitialAlef with scala.Double = js.native
  /* 0 */ val wdNone: wdNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdAraSpeller with scala.Double] = js.native
}

