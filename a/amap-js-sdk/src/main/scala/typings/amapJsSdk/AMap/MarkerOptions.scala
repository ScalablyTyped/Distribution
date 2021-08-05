package typings.amapJsSdk.AMap

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerOptions extends StObject {
  
  var angle: js.UndefOr[Double] = js.undefined
  
  var animation: js.UndefOr[String] = js.undefined
  
  var autoRotation: js.UndefOr[Boolean] = js.undefined
  
  var clickable: js.UndefOr[Boolean] = js.undefined
  
  var content: js.UndefOr[String | HTMLElement] = js.undefined
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var extData: js.UndefOr[js.Any] = js.undefined
  
  var icon: js.UndefOr[String | Icon] = js.undefined
  
  var label: js.UndefOr[typings.amapJsSdk.anon.Content] = js.undefined
  
  var map: js.UndefOr[Map] = js.undefined
  
  var offset: js.UndefOr[Pixel] = js.undefined
  
  var position: js.UndefOr[LngLat] = js.undefined
  
  var raiseOnDrag: js.UndefOr[Boolean] = js.undefined
  
  var shadow: js.UndefOr[Icon] = js.undefined
  
  var shape: js.UndefOr[MarkerShape] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var topWhenClick: js.UndefOr[Boolean] = js.undefined
  
  var topWhenMouseOver: js.UndefOr[Boolean] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object MarkerOptions {
  
  inline def apply(): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerOptions]
  }
  
  extension [Self <: MarkerOptions](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAutoRotation(value: Boolean): Self = StObject.set(x, "autoRotation", value.asInstanceOf[js.Any])
    
    inline def setAutoRotationUndefined: Self = StObject.set(x, "autoRotation", js.undefined)
    
    inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    inline def setContent(value: String | HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setExtData(value: js.Any): Self = StObject.set(x, "extData", value.asInstanceOf[js.Any])
    
    inline def setExtDataUndefined: Self = StObject.set(x, "extData", js.undefined)
    
    inline def setIcon(value: String | Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: typings.amapJsSdk.anon.Content): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setOffset(value: Pixel): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPosition(value: LngLat): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRaiseOnDrag(value: Boolean): Self = StObject.set(x, "raiseOnDrag", value.asInstanceOf[js.Any])
    
    inline def setRaiseOnDragUndefined: Self = StObject.set(x, "raiseOnDrag", js.undefined)
    
    inline def setShadow(value: Icon): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setShape(value: MarkerShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTopWhenClick(value: Boolean): Self = StObject.set(x, "topWhenClick", value.asInstanceOf[js.Any])
    
    inline def setTopWhenClickUndefined: Self = StObject.set(x, "topWhenClick", js.undefined)
    
    inline def setTopWhenMouseOver(value: Boolean): Self = StObject.set(x, "topWhenMouseOver", value.asInstanceOf[js.Any])
    
    inline def setTopWhenMouseOverUndefined: Self = StObject.set(x, "topWhenMouseOver", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
