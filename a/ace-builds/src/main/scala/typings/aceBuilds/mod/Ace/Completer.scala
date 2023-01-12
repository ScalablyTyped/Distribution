package typings.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Completer extends StObject {
  
  def getCompletions(editor: Editor, session: EditSession, position: Point, prefix: String, callback: CompleterCallback): Unit
  
  var identifierRegexps: js.UndefOr[js.Array[js.RegExp]] = js.undefined
}
object Completer {
  
  inline def apply(getCompletions: (Editor, EditSession, Point, String, CompleterCallback) => Unit): Completer = {
    val __obj = js.Dynamic.literal(getCompletions = js.Any.fromFunction5(getCompletions))
    __obj.asInstanceOf[Completer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Completer] (val x: Self) extends AnyVal {
    
    inline def setGetCompletions(value: (Editor, EditSession, Point, String, CompleterCallback) => Unit): Self = StObject.set(x, "getCompletions", js.Any.fromFunction5(value))
    
    inline def setIdentifierRegexps(value: js.Array[js.RegExp]): Self = StObject.set(x, "identifierRegexps", value.asInstanceOf[js.Any])
    
    inline def setIdentifierRegexpsUndefined: Self = StObject.set(x, "identifierRegexps", js.undefined)
    
    inline def setIdentifierRegexpsVarargs(value: js.RegExp*): Self = StObject.set(x, "identifierRegexps", js.Array(value*))
  }
}
