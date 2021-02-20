package typings.atom.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeNonWordCharacters extends StObject {
  
  var includeNonWordCharacters: js.UndefOr[Boolean] = js.native
  
  var wordRegex: js.UndefOr[RegExp] = js.native
}
object IncludeNonWordCharacters {
  
  @scala.inline
  def apply(): IncludeNonWordCharacters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeNonWordCharacters]
  }
  
  @scala.inline
  implicit class IncludeNonWordCharactersMutableBuilder[Self <: IncludeNonWordCharacters] (val x: Self) extends AnyVal {
    
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
