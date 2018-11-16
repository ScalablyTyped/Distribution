package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlUnderlineStyle extends js.Object

@JSGlobal("Word.XlUnderlineStyle")
@js.native
object XlUnderlineStyle extends js.Object {
  @js.native
  sealed trait xlUnderlineStyleDouble
    extends activexDashWordLib.WordNs.XlUnderlineStyle
  
  @js.native
  sealed trait xlUnderlineStyleDoubleAccounting
    extends activexDashWordLib.WordNs.XlUnderlineStyle
  
  @js.native
  sealed trait xlUnderlineStyleNone
    extends activexDashWordLib.WordNs.XlUnderlineStyle
  
  @js.native
  sealed trait xlUnderlineStyleSingle
    extends activexDashWordLib.WordNs.XlUnderlineStyle
  
  @js.native
  sealed trait xlUnderlineStyleSingleAccounting
    extends activexDashWordLib.WordNs.XlUnderlineStyle
  
  /* -4119 */ val xlUnderlineStyleDouble: xlUnderlineStyleDouble with scala.Double = js.native
  /* 5 */ val xlUnderlineStyleDoubleAccounting: xlUnderlineStyleDoubleAccounting with scala.Double = js.native
  /* -4142 */ val xlUnderlineStyleNone: xlUnderlineStyleNone with scala.Double = js.native
  /* 2 */ val xlUnderlineStyleSingle: xlUnderlineStyleSingle with scala.Double = js.native
  /* 4 */ val xlUnderlineStyleSingleAccounting: xlUnderlineStyleSingleAccounting with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlUnderlineStyle with scala.Double] = js.native
}

