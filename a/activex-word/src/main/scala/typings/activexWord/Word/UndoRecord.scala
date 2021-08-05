package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UndoRecord extends StObject {
  
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
  
  /* private */ @JSName("Word.UndoRecord_typekey")
  var WordDotUndoRecord_typekey: UndoRecord = js.native
}
