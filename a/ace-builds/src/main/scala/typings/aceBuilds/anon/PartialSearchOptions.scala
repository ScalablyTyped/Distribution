package typings.aceBuilds.anon

import typings.aceBuilds.mod.Ace.Range
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ace-builds.ace-builds.Ace.SearchOptions> */
@js.native
trait PartialSearchOptions extends StObject {
  
  var backwards: js.UndefOr[Boolean] = js.native
  
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  var needle: js.UndefOr[String | RegExp] = js.native
  
  var preserveCase: js.UndefOr[Boolean] = js.native
  
  var preventScroll: js.UndefOr[Boolean] = js.native
  
  var range: js.UndefOr[Range] = js.native
  
  var regExp: js.UndefOr[RegExp] = js.native
  
  var skipCurrent: js.UndefOr[Boolean] = js.native
  
  var start: js.UndefOr[Range] = js.native
  
  var wholeWord: js.UndefOr[String] = js.native
  
  var wrap: js.UndefOr[Boolean] = js.native
}
object PartialSearchOptions {
  
  @scala.inline
  def apply(): PartialSearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSearchOptions]
  }
  
  @scala.inline
  implicit class PartialSearchOptionsMutableBuilder[Self <: PartialSearchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackwards(value: Boolean): Self = StObject.set(x, "backwards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackwardsUndefined: Self = StObject.set(x, "backwards", js.undefined)
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    @scala.inline
    def setNeedle(value: String | RegExp): Self = StObject.set(x, "needle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleUndefined: Self = StObject.set(x, "needle", js.undefined)
    
    @scala.inline
    def setPreserveCase(value: Boolean): Self = StObject.set(x, "preserveCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveCaseUndefined: Self = StObject.set(x, "preserveCase", js.undefined)
    
    @scala.inline
    def setPreventScroll(value: Boolean): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventScrollUndefined: Self = StObject.set(x, "preventScroll", js.undefined)
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRegExp(value: RegExp): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegExpUndefined: Self = StObject.set(x, "regExp", js.undefined)
    
    @scala.inline
    def setSkipCurrent(value: Boolean): Self = StObject.set(x, "skipCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipCurrentUndefined: Self = StObject.set(x, "skipCurrent", js.undefined)
    
    @scala.inline
    def setStart(value: Range): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setWholeWord(value: String): Self = StObject.set(x, "wholeWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWholeWordUndefined: Self = StObject.set(x, "wholeWord", js.undefined)
    
    @scala.inline
    def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
