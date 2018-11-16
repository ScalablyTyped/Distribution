package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdWrapType extends js.Object

@JSGlobal("Word.WdWrapType")
@js.native
object WdWrapType extends js.Object {
  @js.native
  sealed trait wdWrapBehind
    extends activexDashWordLib.WordNs.WdWrapType
  
  @js.native
  sealed trait wdWrapFront
    extends activexDashWordLib.WordNs.WdWrapType
  
  @js.native
  sealed trait wdWrapInline
    extends activexDashWordLib.WordNs.WdWrapType
  
  @js.native
  sealed trait wdWrapNone
    extends activexDashWordLib.WordNs.WdWrapType
  
  @js.native
  sealed trait wdWrapSquare
    extends activexDashWordLib.WordNs.WdWrapType
  
  @js.native
  sealed trait wdWrapThrough
    extends activexDashWordLib.WordNs.WdWrapType
  
  @js.native
  sealed trait wdWrapTight
    extends activexDashWordLib.WordNs.WdWrapType
  
  @js.native
  sealed trait wdWrapTopBottom
    extends activexDashWordLib.WordNs.WdWrapType
  
  /* 5 */ val wdWrapBehind: wdWrapBehind with scala.Double = js.native
  /* 3 */ val wdWrapFront: wdWrapFront with scala.Double = js.native
  /* 7 */ val wdWrapInline: wdWrapInline with scala.Double = js.native
  /* 3 */ val wdWrapNone: wdWrapNone with scala.Double = js.native
  /* 0 */ val wdWrapSquare: wdWrapSquare with scala.Double = js.native
  /* 2 */ val wdWrapThrough: wdWrapThrough with scala.Double = js.native
  /* 1 */ val wdWrapTight: wdWrapTight with scala.Double = js.native
  /* 4 */ val wdWrapTopBottom: wdWrapTopBottom with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdWrapType with scala.Double] = js.native
}

