package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdUpdateStyleListBehavior extends js.Object

@JSGlobal("Word.WdUpdateStyleListBehavior")
@js.native
object WdUpdateStyleListBehavior extends js.Object {
  @js.native
  sealed trait wdListBehaviorAddBulletsNumbering
    extends activexDashWordLib.WordNs.WdUpdateStyleListBehavior
  
  @js.native
  sealed trait wdListBehaviorKeepPreviousPattern
    extends activexDashWordLib.WordNs.WdUpdateStyleListBehavior
  
  /* 1 */ val wdListBehaviorAddBulletsNumbering: wdListBehaviorAddBulletsNumbering with scala.Double = js.native
  /* 0 */ val wdListBehaviorKeepPreviousPattern: wdListBehaviorKeepPreviousPattern with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdUpdateStyleListBehavior with scala.Double] = js.native
}

