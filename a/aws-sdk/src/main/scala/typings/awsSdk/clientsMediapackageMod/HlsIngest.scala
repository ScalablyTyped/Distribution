package typings.awsSdk.clientsMediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsIngest extends StObject {
  
  /**
    * A list of endpoints to which the source stream should be sent.
    */
  var IngestEndpoints: js.UndefOr[listOfIngestEndpoint] = js.undefined
}
object HlsIngest {
  
  inline def apply(): HlsIngest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsIngest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HlsIngest] (val x: Self) extends AnyVal {
    
    inline def setIngestEndpoints(value: listOfIngestEndpoint): Self = StObject.set(x, "IngestEndpoints", value.asInstanceOf[js.Any])
    
    inline def setIngestEndpointsUndefined: Self = StObject.set(x, "IngestEndpoints", js.undefined)
    
    inline def setIngestEndpointsVarargs(value: IngestEndpoint*): Self = StObject.set(x, "IngestEndpoints", js.Array(value*))
  }
}
