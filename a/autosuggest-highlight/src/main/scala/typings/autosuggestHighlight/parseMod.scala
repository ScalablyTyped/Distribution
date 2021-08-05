package typings.autosuggestHighlight

import typings.autosuggestHighlight.anon.Highlight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  inline def apply(text: String, matches: js.Array[js.Array[Double] | Double]): js.Array[Highlight] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], matches.asInstanceOf[js.Any])).asInstanceOf[js.Array[Highlight]]
  
  @JSImport("autosuggest-highlight/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
