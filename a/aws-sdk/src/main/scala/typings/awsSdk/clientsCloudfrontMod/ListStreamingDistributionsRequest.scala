package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamingDistributionsRequest extends StObject {
  
  /**
    * The value that you provided for the Marker request parameter.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The value that you provided for the MaxItems request parameter.
    */
  var MaxItems: js.UndefOr[String] = js.undefined
}
object ListStreamingDistributionsRequest {
  
  inline def apply(): ListStreamingDistributionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamingDistributionsRequest]
  }
  
  extension [Self <: ListStreamingDistributionsRequest](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: String): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
