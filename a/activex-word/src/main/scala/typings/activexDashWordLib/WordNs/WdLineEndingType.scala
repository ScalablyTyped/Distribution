package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdLineEndingType extends js.Object

@JSGlobal("Word.WdLineEndingType")
@js.native
object WdLineEndingType extends js.Object {
  @js.native
  sealed trait wdCRLF
    extends activexDashWordLib.WordNs.WdLineEndingType
  
  @js.native
  sealed trait wdCROnly
    extends activexDashWordLib.WordNs.WdLineEndingType
  
  @js.native
  sealed trait wdLFCR
    extends activexDashWordLib.WordNs.WdLineEndingType
  
  @js.native
  sealed trait wdLFOnly
    extends activexDashWordLib.WordNs.WdLineEndingType
  
  @js.native
  sealed trait wdLSPS
    extends activexDashWordLib.WordNs.WdLineEndingType
  
  /* 0 */ val wdCRLF: wdCRLF with scala.Double = js.native
  /* 1 */ val wdCROnly: wdCROnly with scala.Double = js.native
  /* 3 */ val wdLFCR: wdLFCR with scala.Double = js.native
  /* 2 */ val wdLFOnly: wdLFOnly with scala.Double = js.native
  /* 4 */ val wdLSPS: wdLSPS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdLineEndingType with scala.Double] = js.native
}

