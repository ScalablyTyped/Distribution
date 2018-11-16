package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdAutoVersions extends js.Object

@JSGlobal("Word.WdAutoVersions")
@js.native
object WdAutoVersions extends js.Object {
  @js.native
  sealed trait wdAutoVersionOff
    extends activexDashWordLib.WordNs.WdAutoVersions
  
  @js.native
  sealed trait wdAutoVersionOnClose
    extends activexDashWordLib.WordNs.WdAutoVersions
  
  /* 0 */ val wdAutoVersionOff: wdAutoVersionOff with scala.Double = js.native
  /* 1 */ val wdAutoVersionOnClose: wdAutoVersionOnClose with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdAutoVersions with scala.Double] = js.native
}

