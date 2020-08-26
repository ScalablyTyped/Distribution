package typings.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Completer extends js.Object {
  /**
    * Provides tooltip information about a completion result.
    * @param item The completion result
    */
  var getDocTooltip: js.UndefOr[js.Function1[/* item */ Completion, Unit]] = js.native
  /**
    * Provides possible completion results asynchronously using the given callback.
    * @param editor The editor to associate with
    * @param session The `EditSession` to refer to
    * @param pos An object containing the row and column
    * @param prefix The prefixing string before the current position
    * @param callback Function to provide the results or error
    */
  def getCompletions(editor: Editor, session: IEditSession, pos: Position, prefix: String, callback: CompletionCallback): Unit = js.native
}

object Completer {
  @scala.inline
  def apply(getCompletions: (Editor, IEditSession, Position, String, CompletionCallback) => Unit): Completer = {
    val __obj = js.Dynamic.literal(getCompletions = js.Any.fromFunction5(getCompletions))
    __obj.asInstanceOf[Completer]
  }
  @scala.inline
  implicit class CompleterOps[Self <: Completer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetCompletions(value: (Editor, IEditSession, Position, String, CompletionCallback) => Unit): Self = this.set("getCompletions", js.Any.fromFunction5(value))
    @scala.inline
    def setGetDocTooltip(value: /* item */ Completion => Unit): Self = this.set("getDocTooltip", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetDocTooltip: Self = this.set("getDocTooltip", js.undefined)
  }
  
}

