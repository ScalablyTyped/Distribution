package typings.atom.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeNonWordCharacters extends StObject {
  
  var includeNonWordCharacters: js.UndefOr[Boolean] = js.undefined
  
  var wordRegex: js.UndefOr[RegExp] = js.undefined
}
object IncludeNonWordCharacters {
  
  inline def apply(): IncludeNonWordCharacters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeNonWordCharacters]
  }
  
  extension [Self <: IncludeNonWordCharacters](x: Self) {
    
    inline def setIncludeNonWordCharacters(value: Boolean): Self = StObject.set(x, "includeNonWordCharacters", value.asInstanceOf[js.Any])
    
    inline def setIncludeNonWordCharactersUndefined: Self = StObject.set(x, "includeNonWordCharacters", js.undefined)
    
    inline def setWordRegex(value: RegExp): Self = StObject.set(x, "wordRegex", value.asInstanceOf[js.Any])
    
    inline def setWordRegexUndefined: Self = StObject.set(x, "wordRegex", js.undefined)
  }
}
