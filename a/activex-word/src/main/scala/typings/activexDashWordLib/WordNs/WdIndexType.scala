package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdIndexType extends js.Object

@JSGlobal("Word.WdIndexType")
@js.native
object WdIndexType extends js.Object {
  @js.native
  sealed trait wdIndexIndent
    extends activexDashWordLib.WordNs.WdIndexType
  
  @js.native
  sealed trait wdIndexRunin
    extends activexDashWordLib.WordNs.WdIndexType
  
  /* 0 */ val wdIndexIndent: wdIndexIndent with scala.Double = js.native
  /* 1 */ val wdIndexRunin: wdIndexRunin with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdIndexType with scala.Double] = js.native
}

