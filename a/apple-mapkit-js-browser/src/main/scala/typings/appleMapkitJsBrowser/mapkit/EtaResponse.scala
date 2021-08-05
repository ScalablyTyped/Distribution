package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The estimated arrival times for a set of destinations.
  */
trait EtaResponse extends StObject {
  
  /**
    * An array of estimated arrival times.
    */
  var etas: js.Array[EtaResult]
  
  /**
    * The request object associated with the estimated time of arrival response.
    */
  var request: EtaRequestOptions
}
object EtaResponse {
  
  inline def apply(etas: js.Array[EtaResult], request: EtaRequestOptions): EtaResponse = {
    val __obj = js.Dynamic.literal(etas = etas.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[EtaResponse]
  }
  
  extension [Self <: EtaResponse](x: Self) {
    
    inline def setEtas(value: js.Array[EtaResult]): Self = StObject.set(x, "etas", value.asInstanceOf[js.Any])
    
    inline def setEtasVarargs(value: EtaResult*): Self = StObject.set(x, "etas", js.Array(value :_*))
    
    inline def setRequest(value: EtaRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
