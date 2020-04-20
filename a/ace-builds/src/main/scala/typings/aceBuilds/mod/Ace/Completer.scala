package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Completer extends js.Object {
  def getCompletions(editor: Editor, session: EditSession, position: Point, prefix: String, callback: CompleterCallback): Unit
}

object Completer {
  @scala.inline
  def apply(getCompletions: (Editor, EditSession, Point, String, CompleterCallback) => Unit): Completer = {
    val __obj = js.Dynamic.literal(getCompletions = js.Any.fromFunction5(getCompletions))
    __obj.asInstanceOf[Completer]
  }
}

