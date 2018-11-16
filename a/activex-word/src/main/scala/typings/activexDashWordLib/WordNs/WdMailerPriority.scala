package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdMailerPriority extends js.Object

@JSGlobal("Word.WdMailerPriority")
@js.native
object WdMailerPriority extends js.Object {
  @js.native
  sealed trait wdPriorityHigh
    extends activexDashWordLib.WordNs.WdMailerPriority
  
  @js.native
  sealed trait wdPriorityLow
    extends activexDashWordLib.WordNs.WdMailerPriority
  
  @js.native
  sealed trait wdPriorityNormal
    extends activexDashWordLib.WordNs.WdMailerPriority
  
  /* 3 */ val wdPriorityHigh: wdPriorityHigh with scala.Double = js.native
  /* 2 */ val wdPriorityLow: wdPriorityLow with scala.Double = js.native
  /* 1 */ val wdPriorityNormal: wdPriorityNormal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdMailerPriority with scala.Double] = js.native
}

