package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of an autocomplete query, including display lines and a coordinate.
  */
@js.native
trait SearchAutocompleteResult extends StObject {
  
  /**
    * The coordinate of the result, provided when it corresponds to a single place.
    */
  var coordinate: Coordinate = js.native
  
  /**
    * Lines of text to display to the user in an autocomplete menu.
    */
  var displayLines: js.Array[String] = js.native
}
object SearchAutocompleteResult {
  
  @scala.inline
  def apply(coordinate: Coordinate, displayLines: js.Array[String]): SearchAutocompleteResult = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], displayLines = displayLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchAutocompleteResult]
  }
  
  @scala.inline
  implicit class SearchAutocompleteResultMutableBuilder[Self <: SearchAutocompleteResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinate(value: Coordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayLines(value: js.Array[String]): Self = StObject.set(x, "displayLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayLinesVarargs(value: String*): Self = StObject.set(x, "displayLines", js.Array(value :_*))
  }
}
