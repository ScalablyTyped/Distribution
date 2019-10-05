package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.UndoRecord")
@js.native
class UndoRecord protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Creator: Double = js.native
  val CustomRecordLevel: Double = js.native
  val CustomRecordName: String = js.native
  val IsRecordingCustomRecord: Boolean = js.native
  val Parent: js.Any = js.native
  var `Word.UndoRecord_typekey`: UndoRecord = js.native
  def EndCustomRecord(): Unit = js.native
  /** @param string [Name=''] */
  def StartCustomRecord(): Unit = js.native
  def StartCustomRecord(Name: String): Unit = js.native
}

