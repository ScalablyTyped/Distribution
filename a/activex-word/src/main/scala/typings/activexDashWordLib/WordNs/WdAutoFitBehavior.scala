package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdAutoFitBehavior extends js.Object

@JSGlobal("Word.WdAutoFitBehavior")
@js.native
object WdAutoFitBehavior extends js.Object {
  @js.native
  sealed trait wdAutoFitContent
    extends activexDashWordLib.WordNs.WdAutoFitBehavior
  
  @js.native
  sealed trait wdAutoFitFixed
    extends activexDashWordLib.WordNs.WdAutoFitBehavior
  
  @js.native
  sealed trait wdAutoFitWindow
    extends activexDashWordLib.WordNs.WdAutoFitBehavior
  
  /* 1 */ val wdAutoFitContent: wdAutoFitContent with scala.Double = js.native
  /* 0 */ val wdAutoFitFixed: wdAutoFitFixed with scala.Double = js.native
  /* 2 */ val wdAutoFitWindow: wdAutoFitWindow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdAutoFitBehavior with scala.Double] = js.native
}

