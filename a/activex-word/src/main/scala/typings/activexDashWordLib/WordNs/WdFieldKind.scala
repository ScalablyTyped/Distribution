package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdFieldKind extends js.Object

@JSGlobal("Word.WdFieldKind")
@js.native
object WdFieldKind extends js.Object {
  @js.native
  sealed trait wdFieldKindCold
    extends activexDashWordLib.WordNs.WdFieldKind
  
  @js.native
  sealed trait wdFieldKindHot
    extends activexDashWordLib.WordNs.WdFieldKind
  
  @js.native
  sealed trait wdFieldKindNone
    extends activexDashWordLib.WordNs.WdFieldKind
  
  @js.native
  sealed trait wdFieldKindWarm
    extends activexDashWordLib.WordNs.WdFieldKind
  
  /* 3 */ val wdFieldKindCold: wdFieldKindCold with scala.Double = js.native
  /* 1 */ val wdFieldKindHot: wdFieldKindHot with scala.Double = js.native
  /* 0 */ val wdFieldKindNone: wdFieldKindNone with scala.Double = js.native
  /* 2 */ val wdFieldKindWarm: wdFieldKindWarm with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdFieldKind with scala.Double] = js.native
}

