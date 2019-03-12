package typings
package aceLib.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextMode extends js.Object {
  def autoOutdent(state: js.Any, doc: js.Any, row: js.Any): scala.Unit
  def checkOutdent(state: js.Any, line: js.Any, input: js.Any): scala.Boolean
  def createModeDelegates(mapping: js.Any): scala.Unit
  def createWorker(session: js.Any): js.Any
  def getNextLineIndent(state: js.Any, line: js.Any, tab: js.Any): java.lang.String
  def getTokenizer(): js.Any
  def toggleCommentLines(state: js.Any, doc: js.Any, startRow: js.Any, endRow: js.Any): scala.Unit
  def transformAction(state: js.Any, action: js.Any, editor: js.Any, session: js.Any, param: js.Any): js.Any
}

object TextMode {
  @scala.inline
  def apply(
    autoOutdent: (js.Any, js.Any, js.Any) => scala.Unit,
    checkOutdent: (js.Any, js.Any, js.Any) => scala.Boolean,
    createModeDelegates: js.Any => scala.Unit,
    createWorker: js.Any => js.Any,
    getNextLineIndent: (js.Any, js.Any, js.Any) => java.lang.String,
    getTokenizer: () => js.Any,
    toggleCommentLines: (js.Any, js.Any, js.Any, js.Any) => scala.Unit,
    transformAction: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any
  ): TextMode = {
    val __obj = js.Dynamic.literal(autoOutdent = js.Any.fromFunction3(autoOutdent), checkOutdent = js.Any.fromFunction3(checkOutdent), createModeDelegates = js.Any.fromFunction1(createModeDelegates), createWorker = js.Any.fromFunction1(createWorker), getNextLineIndent = js.Any.fromFunction3(getNextLineIndent), getTokenizer = js.Any.fromFunction0(getTokenizer), toggleCommentLines = js.Any.fromFunction4(toggleCommentLines), transformAction = js.Any.fromFunction5(transformAction))
  
    __obj.asInstanceOf[TextMode]
  }
}

