package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response from a geocoder lookup or reverse lookup.
  */
trait GeocoderResponse extends StObject {
  
  var results: js.Array[Place]
}
object GeocoderResponse {
  
  inline def apply(results: js.Array[Place]): GeocoderResponse = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeocoderResponse] (val x: Self) extends AnyVal {
    
    inline def setResults(value: js.Array[Place]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: Place*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
