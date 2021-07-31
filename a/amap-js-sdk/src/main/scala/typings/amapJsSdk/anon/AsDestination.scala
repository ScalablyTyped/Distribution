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
  
  @scala.inline
  def apply(): AsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsDestination]
  }
  
  @scala.inline
  implicit class AsDestinationMutableBuilder[Self <: AsDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsDestination(value: Boolean): Self = StObject.set(x, "asDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsDestinationUndefined: Self = StObject.set(x, "asDestination", js.undefined)
    
    @scala.inline
    def setAsOrigin(value: Boolean): Self = StObject.set(x, "asOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsOriginUndefined: Self = StObject.set(x, "asOrigin", js.undefined)
    
    @scala.inline
    def setAutoMove(value: Boolean): Self = StObject.set(x, "autoMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoMoveUndefined: Self = StObject.set(x, "autoMove", js.undefined)
    
    @scala.inline
    def setCloseWhenClickMap(value: Boolean): Self = StObject.set(x, "closeWhenClickMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseWhenClickMapUndefined: Self = StObject.set(x, "closeWhenClickMap", js.undefined)
    
    @scala.inline
    def setContent(value: String | HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setDriving(value: Boolean): Self = StObject.set(x, "driving", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrivingUndefined: Self = StObject.set(x, "driving", js.undefined)
    
    @scala.inline
    def setOffset(value: Pixel): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPanel(value: String | HTMLElement): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
    
    @scala.inline
    def setPlaceSearch(value: Boolean): Self = StObject.set(x, "placeSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceSearchUndefined: Self = StObject.set(x, "placeSearch", js.undefined)
    
    @scala.inline
    def setPosition(value: LngLat): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSearchRadius(value: Double): Self = StObject.set(x, "searchRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchRadiusUndefined: Self = StObject.set(x, "searchRadius", js.undefined)
    
    @scala.inline
    def setTransit(value: Boolean): Self = StObject.set(x, "transit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitUndefined: Self = StObject.set(x, "transit", js.undefined)
    
    @scala.inline
    def setWalking(value: Boolean): Self = StObject.set(x, "walking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWalkingUndefined: Self = StObject.set(x, "walking", js.undefined)
  }
}
