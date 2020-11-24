package typings.autosuggestHighlight

import typings.autosuggestHighlight.anon.Highlight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("autosuggest-highlight/parse", JSImport.Namespace)
@js.native
object parseMod extends js.Object {
  
  def apply(text: String, matches: js.Array[js.Array[Double] | Double]): js.Array[Highlight] = js.native
}
