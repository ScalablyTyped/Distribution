package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.LngLat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destination extends StObject {
  
  var destination: js.UndefOr[LngLat] = js.undefined
  
  var destinationName: js.UndefOr[String] = js.undefined
  
  var origin: js.UndefOr[LngLat] = js.undefined
  
  var originName: js.UndefOr[String] = js.undefined
}
object Destination {
  
  inline def apply(): Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Destination]
  }
  
  extension [Self <: Destination](x: Self) {
    
    inline def setDestination(value: LngLat): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationName(value: String): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
    
    inline def setDestinationNameUndefined: Self = StObject.set(x, "destinationName", js.undefined)
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setOrigin(value: LngLat): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginName(value: String): Self = StObject.set(x, "originName", value.asInstanceOf[js.Any])
    
    inline def setOriginNameUndefined: Self = StObject.set(x, "originName", js.undefined)
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
