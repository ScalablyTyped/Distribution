package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.CoAuthLocks")
@js.native
class CoAuthLocks protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  var `Word.CoAuthLocks_typekey`: CoAuthLocks = js.native
  /** @param Word.WdLockType [Type=1] */
  def Add(Range: js.Any): CoAuthLock = js.native
  def Add(Range: js.Any, Type: WdLockType): CoAuthLock = js.native
  def Item(Index: scala.Double): CoAuthLock = js.native
  def RemoveEphemeralLocks(): scala.Unit = js.native
}

