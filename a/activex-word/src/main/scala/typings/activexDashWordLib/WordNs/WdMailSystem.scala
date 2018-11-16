package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdMailSystem extends js.Object

@JSGlobal("Word.WdMailSystem")
@js.native
object WdMailSystem extends js.Object {
  @js.native
  sealed trait wdMAPI
    extends activexDashWordLib.WordNs.WdMailSystem
  
  @js.native
  sealed trait wdMAPIandPowerTalk
    extends activexDashWordLib.WordNs.WdMailSystem
  
  @js.native
  sealed trait wdNoMailSystem
    extends activexDashWordLib.WordNs.WdMailSystem
  
  @js.native
  sealed trait wdPowerTalk
    extends activexDashWordLib.WordNs.WdMailSystem
  
  /* 1 */ val wdMAPI: wdMAPI with scala.Double = js.native
  /* 3 */ val wdMAPIandPowerTalk: wdMAPIandPowerTalk with scala.Double = js.native
  /* 0 */ val wdNoMailSystem: wdNoMailSystem with scala.Double = js.native
  /* 2 */ val wdPowerTalk: wdPowerTalk with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdMailSystem with scala.Double] = js.native
}

