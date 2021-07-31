package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.algoliaClientSearchStrings.full
import typings.algoliaClientSearch.algoliaClientSearchStrings.none
import typings.algoliaClientSearch.algoliaClientSearchStrings.partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnippetMatch extends StObject {
  
  val matchLevel: none | partial | full
  
  val value: String
}
object SnippetMatch {
  
  @scala.inline
  def apply(matchLevel: none | partial | full, value: String): SnippetMatch = {
    val __obj = js.Dynamic.literal(matchLevel = matchLevel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnippetMatch]
  }
  
  @scala.inline
  implicit class SnippetMatchMutableBuilder[Self <: SnippetMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatchLevel(value: none | partial | full): Self = StObject.set(x, "matchLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
