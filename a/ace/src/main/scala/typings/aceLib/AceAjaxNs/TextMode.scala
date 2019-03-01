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
    autoOutdent: js.Function3[js.Any, js.Any, js.Any, scala.Unit],
    checkOutdent: js.Function3[js.Any, js.Any, js.Any, scala.Boolean],
    createModeDelegates: js.Function1[js.Any, scala.Unit],
    createWorker: js.Function1[js.Any, js.Any],
    getNextLineIndent: js.Function3[js.Any, js.Any, js.Any, java.lang.String],
    getTokenizer: js.Function0[js.Any],
    toggleCommentLines: js.Function4[js.Any, js.Any, js.Any, js.Any, scala.Unit],
    transformAction: js.Function5[js.Any, js.Any, js.Any, js.Any, js.Any, js.Any]
  ): TextMode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoOutdent")(autoOutdent)
    __obj.updateDynamic("checkOutdent")(checkOutdent)
    __obj.updateDynamic("createModeDelegates")(createModeDelegates)
    __obj.updateDynamic("createWorker")(createWorker)
    __obj.updateDynamic("getNextLineIndent")(getNextLineIndent)
    __obj.updateDynamic("getTokenizer")(getTokenizer)
    __obj.updateDynamic("toggleCommentLines")(toggleCommentLines)
    __obj.updateDynamic("transformAction")(transformAction)
    __obj.asInstanceOf[TextMode]
  }
}

