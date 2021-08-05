package typings.aceBuilds.mod.Ace

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchOptions extends StObject {
  
  var backwards: Boolean
  
  var caseSensitive: Boolean
  
  var needle: String | RegExp
  
  var preserveCase: Boolean
  
  var preventScroll: Boolean
  
  var range: Range
  
  var regExp: RegExp
  
  var skipCurrent: Boolean
  
  var start: Range
  
  var wholeWord: String
  
  var wrap: Boolean
}
object SearchOptions {
  
  inline def apply(
    backwards: Boolean,
    caseSensitive: Boolean,
    needle: String | RegExp,
    preserveCase: Boolean,
    preventScroll: Boolean,
    range: Range,
    regExp: RegExp,
    skipCurrent: Boolean,
    start: Range,
    wholeWord: String,
    wrap: Boolean
  ): SearchOptions = {
    val __obj = js.Dynamic.literal(backwards = backwards.asInstanceOf[js.Any], caseSensitive = caseSensitive.asInstanceOf[js.Any], needle = needle.asInstanceOf[js.Any], preserveCase = preserveCase.asInstanceOf[js.Any], preventScroll = preventScroll.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], skipCurrent = skipCurrent.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], wholeWord = wholeWord.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
  
  extension [Self <: SearchOptions](x: Self) {
    
    inline def setBackwards(value: Boolean): Self = StObject.set(x, "backwards", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setNeedle(value: String | RegExp): Self = StObject.set(x, "needle", value.asInstanceOf[js.Any])
    
    inline def setPreserveCase(value: Boolean): Self = StObject.set(x, "preserveCase", value.asInstanceOf[js.Any])
    
    inline def setPreventScroll(value: Boolean): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRegExp(value: RegExp): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
    
    inline def setSkipCurrent(value: Boolean): Self = StObject.set(x, "skipCurrent", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Range): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setWholeWord(value: String): Self = StObject.set(x, "wholeWord", value.asInstanceOf[js.Any])
    
    inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
  }
}
