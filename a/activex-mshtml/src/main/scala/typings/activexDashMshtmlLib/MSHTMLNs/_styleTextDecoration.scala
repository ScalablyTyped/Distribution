package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait _styleTextDecoration extends js.Object

@JSGlobal("MSHTML._styleTextDecoration")
@js.native
object _styleTextDecoration extends js.Object {
  @js.native
  sealed trait styleTextDecorationBlink
    extends activexDashMshtmlLib.MSHTMLNs._styleTextDecoration
  
  @js.native
  sealed trait styleTextDecorationLineThrough
    extends activexDashMshtmlLib.MSHTMLNs._styleTextDecoration
  
  @js.native
  sealed trait styleTextDecorationNone
    extends activexDashMshtmlLib.MSHTMLNs._styleTextDecoration
  
  @js.native
  sealed trait styleTextDecorationOverline
    extends activexDashMshtmlLib.MSHTMLNs._styleTextDecoration
  
  @js.native
  sealed trait styleTextDecorationUnderline
    extends activexDashMshtmlLib.MSHTMLNs._styleTextDecoration
  
  @js.native
  sealed trait styleTextDecoration_Max
    extends activexDashMshtmlLib.MSHTMLNs._styleTextDecoration
  
  /* 4 */ val styleTextDecorationBlink: styleTextDecorationBlink with scala.Double = js.native
  /* 3 */ val styleTextDecorationLineThrough: styleTextDecorationLineThrough with scala.Double = js.native
  /* 0 */ val styleTextDecorationNone: styleTextDecorationNone with scala.Double = js.native
  /* 2 */ val styleTextDecorationOverline: styleTextDecorationOverline with scala.Double = js.native
  /* 1 */ val styleTextDecorationUnderline: styleTextDecorationUnderline with scala.Double = js.native
  /* 2147483647 */ val styleTextDecoration_Max: styleTextDecoration_Max with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMshtmlLib.MSHTMLNs._styleTextDecoration with scala.Double] = js.native
}

