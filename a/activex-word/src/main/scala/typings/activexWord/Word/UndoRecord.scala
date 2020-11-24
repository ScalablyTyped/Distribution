package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UndoRecord extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val CustomRecordLevel: Double = js.native
  
  val CustomRecordName: String = js.native
  
  def EndCustomRecord(): Unit = js.native
  
  val IsRecordingCustomRecord: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  /** @param string [Name=''] */
  def StartCustomRecord(): Unit = js.native
  def StartCustomRecord(Name: String): Unit = js.native
  
  @JSName("Word.UndoRecord_typekey")
  var WordDotUndoRecord_typekey: UndoRecord = js.native
}
