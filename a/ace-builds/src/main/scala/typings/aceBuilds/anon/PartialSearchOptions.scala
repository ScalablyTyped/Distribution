package typings.aceBuilds.anon

import typings.aceBuilds.mod.Ace.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ace-builds.ace-builds.Ace.SearchOptions> */
trait PartialSearchOptions extends StObject {
  
  var backwards: js.UndefOr[Boolean] = js.undefined
  
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  var needle: js.UndefOr[String | js.RegExp] = js.undefined
  
  var preserveCase: js.UndefOr[Boolean] = js.undefined
  
  var preventScroll: js.UndefOr[Boolean] = js.undefined
  
  var range: js.UndefOr[Range] = js.undefined
  
  var regExp: js.UndefOr[Boolean] = js.undefined
  
  var skipCurrent: js.UndefOr[Boolean] = js.undefined
  
  var start: js.UndefOr[Range] = js.undefined
  
  var wholeWord: js.UndefOr[Boolean] = js.undefined
  
  var wrap: js.UndefOr[Boolean] = js.undefined
}
object PartialSearchOptions {
  
  inline def apply(): PartialSearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSearchOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialSearchOptions] (val x: Self) extends AnyVal {
    
    inline def setBackwards(value: Boolean): Self = StObject.set(x, "backwards", value.asInstanceOf[js.Any])
    
    inline def setBackwardsUndefined: Self = StObject.set(x, "backwards", js.undefined)
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setNeedle(value: String | js.RegExp): Self = StObject.set(x, "needle", value.asInstanceOf[js.Any])
    
    inline def setNeedleUndefined: Self = StObject.set(x, "needle", js.undefined)
    
    inline def setPreserveCase(value: Boolean): Self = StObject.set(x, "preserveCase", value.asInstanceOf[js.Any])
    
    inline def setPreserveCaseUndefined: Self = StObject.set(x, "preserveCase", js.undefined)
    
    inline def setPreventScroll(value: Boolean): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
    
    inline def setPreventScrollUndefined: Self = StObject.set(x, "preventScroll", js.undefined)
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRegExp(value: Boolean): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
    
    inline def setRegExpUndefined: Self = StObject.set(x, "regExp", js.undefined)
    
    inline def setSkipCurrent(value: Boolean): Self = StObject.set(x, "skipCurrent", value.asInstanceOf[js.Any])
    
    inline def setSkipCurrentUndefined: Self = StObject.set(x, "skipCurrent", js.undefined)
    
    inline def setStart(value: Range): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setWholeWord(value: Boolean): Self = StObject.set(x, "wholeWord", value.asInstanceOf[js.Any])
    
    inline def setWholeWordUndefined: Self = StObject.set(x, "wholeWord", js.undefined)
    
    inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
