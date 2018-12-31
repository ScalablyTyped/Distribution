package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.UndoRecord")
@js.native
class UndoRecord protected () extends js.Object {
  val Application: Application = js.native
  val Creator: scala.Double = js.native
  val CustomRecordLevel: scala.Double = js.native
  val CustomRecordName: java.lang.String = js.native
  val IsRecordingCustomRecord: scala.Boolean = js.native
  val Parent: js.Any = js.native
  var `Word.UndoRecord_typekey`: UndoRecord = js.native
  def EndCustomRecord(): scala.Unit = js.native
  /** @param string [Name=''] */
  def StartCustomRecord(): scala.Unit = js.native
  def StartCustomRecord(Name: java.lang.String): scala.Unit = js.native
}

