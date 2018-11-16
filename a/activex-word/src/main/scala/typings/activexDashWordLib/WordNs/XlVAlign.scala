package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlVAlign extends js.Object

@JSGlobal("Word.XlVAlign")
@js.native
object XlVAlign extends js.Object {
  @js.native
  sealed trait xlVAlignBottom
    extends activexDashWordLib.WordNs.XlVAlign
  
  @js.native
  sealed trait xlVAlignCenter
    extends activexDashWordLib.WordNs.XlVAlign
  
  @js.native
  sealed trait xlVAlignDistributed
    extends activexDashWordLib.WordNs.XlVAlign
  
  @js.native
  sealed trait xlVAlignJustify
    extends activexDashWordLib.WordNs.XlVAlign
  
  @js.native
  sealed trait xlVAlignTop
    extends activexDashWordLib.WordNs.XlVAlign
  
  /* -4107 */ val xlVAlignBottom: xlVAlignBottom with scala.Double = js.native
  /* -4108 */ val xlVAlignCenter: xlVAlignCenter with scala.Double = js.native
  /* -4117 */ val xlVAlignDistributed: xlVAlignDistributed with scala.Double = js.native
  /* -4130 */ val xlVAlignJustify: xlVAlignJustify with scala.Double = js.native
  /* -4160 */ val xlVAlignTop: xlVAlignTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlVAlign with scala.Double] = js.native
}

