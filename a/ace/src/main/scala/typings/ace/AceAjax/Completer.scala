package typings.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Completer extends StObject {
  
  /**
    * Provides possible completion results asynchronously using the given callback.
    * @param editor The editor to associate with
    * @param session The `EditSession` to refer to
    * @param pos An object containing the row and column
    * @param prefix The prefixing string before the current position
    * @param callback Function to provide the results or error
    */
  def getCompletions(editor: Editor, session: IEditSession, pos: Position, prefix: String, callback: CompletionCallback): Unit
  
  /**
    * Provides tooltip information about a completion result.
    * @param item The completion result
    */
  var getDocTooltip: js.UndefOr[js.Function1[/* item */ Completion, Unit]] = js.undefined
}
object Completer {
  
  @scala.inline
  def apply(getCompletions: (Editor, IEditSession, Position, String, CompletionCallback) => Unit): Completer = {
    val __obj = js.Dynamic.literal(getCompletions = js.Any.fromFunction5(getCompletions))
    __obj.asInstanceOf[Completer]
  }
  
  @scala.inline
  implicit class CompleterMutableBuilder[Self <: Completer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCompletions(value: (Editor, IEditSession, Position, String, CompletionCallback) => Unit): Self = StObject.set(x, "getCompletions", js.Any.fromFunction5(value))
    
    @scala.inline
    def setGetDocTooltip(value: /* item */ Completion => Unit): Self = StObject.set(x, "getDocTooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDocTooltipUndefined: Self = StObject.set(x, "getDocTooltip", js.undefined)
  }
}
