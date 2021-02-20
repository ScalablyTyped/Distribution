package typings.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Completer extends StObject {
  
  def getCompletions(editor: Editor, session: EditSession, position: Point, prefix: String, callback: CompleterCallback): Unit = js.native
}
object Completer {
  
  @scala.inline
  def apply(getCompletions: (Editor, EditSession, Point, String, CompleterCallback) => Unit): Completer = {
    val __obj = js.Dynamic.literal(getCompletions = js.Any.fromFunction5(getCompletions))
    __obj.asInstanceOf[Completer]
  }
  
  @scala.inline
  implicit class CompleterMutableBuilder[Self <: Completer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCompletions(value: (Editor, EditSession, Point, String, CompleterCallback) => Unit): Self = StObject.set(x, "getCompletions", js.Any.fromFunction5(value))
  }
}
