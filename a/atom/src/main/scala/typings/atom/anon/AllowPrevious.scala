package typings.atom.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowPrevious extends StObject {
  
  var allowPrevious: js.UndefOr[Boolean] = js.native
  
  var includeNonWordCharacters: js.UndefOr[Boolean] = js.native
  
  var wordRegex: js.UndefOr[RegExp] = js.native
}
object AllowPrevious {
  
  @scala.inline
  def apply(): AllowPrevious = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowPrevious]
  }
  
  @scala.inline
  implicit class AllowPreviousMutableBuilder[Self <: AllowPrevious] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowPrevious(value: Boolean): Self = StObject.set(x, "allowPrevious", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPreviousUndefined: Self = StObject.set(x, "allowPrevious", js.undefined)
    
    @scala.inline
    def setIncludeNonWordCharacters(value: Boolean): Self = StObject.set(x, "includeNonWordCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNonWordCharactersUndefined: Self = StObject.set(x, "includeNonWordCharacters", js.undefined)
    
    @scala.inline
    def setWordRegex(value: RegExp): Self = StObject.set(x, "wordRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordRegexUndefined: Self = StObject.set(x, "wordRegex", js.undefined)
  }
}
