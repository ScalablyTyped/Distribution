package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.algoliaClientSearchStrings.full
import typings.algoliaClientSearch.algoliaClientSearchStrings.none
import typings.algoliaClientSearch.algoliaClientSearchStrings.partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightMatch extends StObject {
  
  val fullyHighlighted: js.UndefOr[Boolean] = js.native
  
  val matchLevel: none | partial | full = js.native
  
  val matchedWords: js.Array[String] = js.native
  
  val value: String = js.native
}
object HighlightMatch {
  
  @scala.inline
  def apply(matchLevel: none | partial | full, matchedWords: js.Array[String], value: String): HighlightMatch = {
    val __obj = js.Dynamic.literal(matchLevel = matchLevel.asInstanceOf[js.Any], matchedWords = matchedWords.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightMatch]
  }
  
  @scala.inline
  implicit class HighlightMatchMutableBuilder[Self <: HighlightMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullyHighlighted(value: Boolean): Self = StObject.set(x, "fullyHighlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullyHighlightedUndefined: Self = StObject.set(x, "fullyHighlighted", js.undefined)
    
    @scala.inline
    def setMatchLevel(value: none | partial | full): Self = StObject.set(x, "matchLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedWords(value: js.Array[String]): Self = StObject.set(x, "matchedWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedWordsVarargs(value: String*): Self = StObject.set(x, "matchedWords", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
