package typings.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyntaxMode extends js.Object {
  def autoOutdent(state: js.Any, doc: Document, row: Double): Unit = js.native
  def checkOutdent(state: js.Any, line: String, input: String): Boolean = js.native
  def createModeDelegates(mapping: StringDictionary[String]): Unit = js.native
  // TODO implement WorkerClient types
  def createWorker(session: EditSession): js.Any = js.native
  def getCompletions(state: String, session: EditSession, pos: Point, prefix: String): js.Array[Completion] = js.native
  def getKeywords(): js.Array[String | RegExp] = js.native
  def getKeywords(append: Boolean): js.Array[String | RegExp] = js.native
  def getNextLineIndent(state: js.Any, line: String, tab: String): String = js.native
  def getTokenizer(): Tokenizer = js.native
  def toggleBlockComment(state: js.Any, session: EditSession, range: Range, cursor: Point): Unit = js.native
  def toggleCommentLines(state: js.Any, session: EditSession, startRow: Double, endRow: Double): Unit = js.native
  def transformAction(state: String, action: String, editor: Editor, session: EditSession, text: String): js.Any = js.native
}

