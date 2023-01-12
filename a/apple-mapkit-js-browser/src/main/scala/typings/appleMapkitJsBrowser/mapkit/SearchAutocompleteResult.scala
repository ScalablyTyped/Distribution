package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of an autocomplete query, including display lines and a coordinate.
  */
trait SearchAutocompleteResult extends StObject {
  
  /**
    * The coordinate of the result, provided when it corresponds to a single place.
    */
  var coordinate: Coordinate
  
  /**
    * Lines of text to display to the user in an autocomplete menu.
    */
  var displayLines: js.Array[String]
}
object SearchAutocompleteResult {
  
  inline def apply(coordinate: Coordinate, displayLines: js.Array[String]): SearchAutocompleteResult = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], displayLines = displayLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchAutocompleteResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchAutocompleteResult] (val x: Self) extends AnyVal {
    
    inline def setCoordinate(value: Coordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setDisplayLines(value: js.Array[String]): Self = StObject.set(x, "displayLines", value.asInstanceOf[js.Any])
    
    inline def setDisplayLinesVarargs(value: String*): Self = StObject.set(x, "displayLines", js.Array(value*))
  }
}
