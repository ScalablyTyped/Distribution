package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response from a geocoder lookup or reverse lookup.
  */
@js.native
trait GeocoderResponse extends StObject {
  
  var results: js.Array[Place] = js.native
}
object GeocoderResponse {
  
  @scala.inline
  def apply(results: js.Array[Place]): GeocoderResponse = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderResponse]
  }
  
  @scala.inline
  implicit class GeocoderResponseMutableBuilder[Self <: GeocoderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResults(value: js.Array[Place]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: Place*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
