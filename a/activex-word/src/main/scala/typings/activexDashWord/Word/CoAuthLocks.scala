package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.CoAuthLocks")
@js.native
class CoAuthLocks protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.CoAuthLocks_typekey")
  var WordDotCoAuthLocks_typekey: CoAuthLocks = js.native
  /** @param Word.WdLockType [Type=1] */
  def Add(Range: js.Any): CoAuthLock = js.native
  def Add(Range: js.Any, Type: WdLockType): CoAuthLock = js.native
  def Item(Index: Double): CoAuthLock = js.native
  def RemoveEphemeralLocks(): Unit = js.native
}

