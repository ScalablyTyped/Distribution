package typings.ace.AceAjax

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextMode extends StObject {
  
  def autoOutdent(state: Any, doc: Document, row: Double): Unit = js.native
  
  def checkOutdent(state: Any, line: String, input: String): Boolean = js.native
  
  def createModeDelegates(mapping: StringDictionary[String]): Unit = js.native
  
  def createWorker(session: IEditSession): Any = js.native
  
  def getCompletions(state: String, session: IEditSession, pos: Position, prefix: String): js.Array[Completion] = js.native
  
  def getKeywords(): js.Array[String | js.RegExp] = js.native
  def getKeywords(append: Boolean): js.Array[String | js.RegExp] = js.native
  
  def getNextLineIndent(state: Any, line: String, tab: String): String = js.native
  
  def getTokenizer(): Tokenizer = js.native
  
  def toggleBlockComment(state: Any, session: IEditSession, range: Range, cursor: Position): Unit = js.native
  
  def toggleCommentLines(state: Any, session: IEditSession, startRow: Double, endRow: Double): Unit = js.native
  
  def transformAction(state: String, action: String, editor: Editor, session: IEditSession, text: String): Any = js.native
}
