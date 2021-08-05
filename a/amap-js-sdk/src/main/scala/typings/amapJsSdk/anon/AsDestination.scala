package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.LngLat
import typings.amapJsSdk.AMap.Pixel
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsDestination extends StObject {
  
  var asDestination: js.UndefOr[Boolean] = js.undefined
  
  var asOrigin: js.UndefOr[Boolean] = js.undefined
  
  var autoMove: js.UndefOr[Boolean] = js.undefined
  
  var closeWhenClickMap: js.UndefOr[Boolean] = js.undefined
  
  var content: js.UndefOr[String | HTMLElement] = js.undefined
  
  var driving: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[Pixel] = js.undefined
  
  var panel: js.UndefOr[String | HTMLElement] = js.undefined
  
  var placeSearch: js.UndefOr[Boolean] = js.undefined
  
  var position: js.UndefOr[LngLat] = js.undefined
  
  var searchRadius: js.UndefOr[Double] = js.undefined
  
  var transit: js.UndefOr[Boolean] = js.undefined
  
  var walking: js.UndefOr[Boolean] = js.undefined
}
object AsDestination {
  
  inline def apply(): AsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsDestination]
  }
  
  extension [Self <: AsDestination](x: Self) {
    
    inline def setAsDestination(value: Boolean): Self = StObject.set(x, "asDestination", value.asInstanceOf[js.Any])
    
    inline def setAsDestinationUndefined: Self = StObject.set(x, "asDestination", js.undefined)
    
    inline def setAsOrigin(value: Boolean): Self = StObject.set(x, "asOrigin", value.asInstanceOf[js.Any])
    
    inline def setAsOriginUndefined: Self = StObject.set(x, "asOrigin", js.undefined)
    
    inline def setAutoMove(value: Boolean): Self = StObject.set(x, "autoMove", value.asInstanceOf[js.Any])
    
    inline def setAutoMoveUndefined: Self = StObject.set(x, "autoMove", js.undefined)
    
    inline def setCloseWhenClickMap(value: Boolean): Self = StObject.set(x, "closeWhenClickMap", value.asInstanceOf[js.Any])
    
    inline def setCloseWhenClickMapUndefined: Self = StObject.set(x, "closeWhenClickMap", js.undefined)
    
    inline def setContent(value: String | HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDriving(value: Boolean): Self = StObject.set(x, "driving", value.asInstanceOf[js.Any])
    
    inline def setDrivingUndefined: Self = StObject.set(x, "driving", js.undefined)
    
    inline def setOffset(value: Pixel): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPanel(value: String | HTMLElement): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    inline def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
    
    inline def setPlaceSearch(value: Boolean): Self = StObject.set(x, "placeSearch", value.asInstanceOf[js.Any])
    
    inline def setPlaceSearchUndefined: Self = StObject.set(x, "placeSearch", js.undefined)
    
    inline def setPosition(value: LngLat): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSearchRadius(value: Double): Self = StObject.set(x, "searchRadius", value.asInstanceOf[js.Any])
    
    inline def setSearchRadiusUndefined: Self = StObject.set(x, "searchRadius", js.undefined)
    
    inline def setTransit(value: Boolean): Self = StObject.set(x, "transit", value.asInstanceOf[js.Any])
    
    inline def setTransitUndefined: Self = StObject.set(x, "transit", js.undefined)
    
    inline def setWalking(value: Boolean): Self = StObject.set(x, "walking", value.asInstanceOf[js.Any])
    
    inline def setWalkingUndefined: Self = StObject.set(x, "walking", js.undefined)
  }
}
