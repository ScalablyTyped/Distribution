package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdAutoMacros extends js.Object

@JSGlobal("Word.WdAutoMacros")
@js.native
object WdAutoMacros extends js.Object {
  @js.native
  sealed trait wdAutoClose
    extends activexDashWordLib.WordNs.WdAutoMacros
  
  @js.native
  sealed trait wdAutoExec
    extends activexDashWordLib.WordNs.WdAutoMacros
  
  @js.native
  sealed trait wdAutoExit
    extends activexDashWordLib.WordNs.WdAutoMacros
  
  @js.native
  sealed trait wdAutoNew
    extends activexDashWordLib.WordNs.WdAutoMacros
  
  @js.native
  sealed trait wdAutoOpen
    extends activexDashWordLib.WordNs.WdAutoMacros
  
  @js.native
  sealed trait wdAutoSync
    extends activexDashWordLib.WordNs.WdAutoMacros
  
  /* 3 */ val wdAutoClose: wdAutoClose with scala.Double = js.native
  /* 0 */ val wdAutoExec: wdAutoExec with scala.Double = js.native
  /* 4 */ val wdAutoExit: wdAutoExit with scala.Double = js.native
  /* 1 */ val wdAutoNew: wdAutoNew with scala.Double = js.native
  /* 2 */ val wdAutoOpen: wdAutoOpen with scala.Double = js.native
  /* 5 */ val wdAutoSync: wdAutoSync with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdAutoMacros with scala.Double] = js.native
}

