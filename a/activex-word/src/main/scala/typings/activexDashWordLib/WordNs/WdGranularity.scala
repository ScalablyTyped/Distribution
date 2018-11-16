package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdGranularity extends js.Object

@JSGlobal("Word.WdGranularity")
@js.native
object WdGranularity extends js.Object {
  @js.native
  sealed trait wdGranularityCharLevel
    extends activexDashWordLib.WordNs.WdGranularity
  
  @js.native
  sealed trait wdGranularityWordLevel
    extends activexDashWordLib.WordNs.WdGranularity
  
  /* 0 */ val wdGranularityCharLevel: wdGranularityCharLevel with scala.Double = js.native
  /* 1 */ val wdGranularityWordLevel: wdGranularityWordLevel with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdGranularity with scala.Double] = js.native
}

