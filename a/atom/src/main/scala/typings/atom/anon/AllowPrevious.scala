package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowPrevious extends StObject {
  
  var allowPrevious: js.UndefOr[Boolean] = js.undefined
  
  var includeNonWordCharacters: js.UndefOr[Boolean] = js.undefined
  
  var wordRegex: js.UndefOr[js.RegExp] = js.undefined
}
object AllowPrevious {
  
  inline def apply(): AllowPrevious = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowPrevious]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowPrevious] (val x: Self) extends AnyVal {
    
    inline def setAllowPrevious(value: Boolean): Self = StObject.set(x, "allowPrevious", value.asInstanceOf[js.Any])
    
    inline def setAllowPreviousUndefined: Self = StObject.set(x, "allowPrevious", js.undefined)
    
    inline def setIncludeNonWordCharacters(value: Boolean): Self = StObject.set(x, "includeNonWordCharacters", value.asInstanceOf[js.Any])
    
    inline def setIncludeNonWordCharactersUndefined: Self = StObject.set(x, "includeNonWordCharacters", js.undefined)
    
    inline def setWordRegex(value: js.RegExp): Self = StObject.set(x, "wordRegex", value.asInstanceOf[js.Any])
    
    inline def setWordRegexUndefined: Self = StObject.set(x, "wordRegex", js.undefined)
  }
}
