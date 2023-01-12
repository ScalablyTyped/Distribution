package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.LngLat
import typings.amapJsSdk.AMap.Pixel
import typings.amapJsSdk.AMap.Size
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMove extends StObject {
  
  var autoMove: js.UndefOr[Boolean] = js.undefined
  
  var closeWhenClickMap: js.UndefOr[Boolean] = js.undefined
  
  var content: js.UndefOr[String | HTMLElement] = js.undefined
  
  var isCustom: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[Pixel] = js.undefined
  
  var position: js.UndefOr[LngLat] = js.undefined
  
  var showShadow: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[Size] = js.undefined
}
object AutoMove {
  
  inline def apply(): AutoMove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMove]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoMove] (val x: Self) extends AnyVal {
    
    inline def setAutoMove(value: Boolean): Self = StObject.set(x, "autoMove", value.asInstanceOf[js.Any])
    
    inline def setAutoMoveUndefined: Self = StObject.set(x, "autoMove", js.undefined)
    
    inline def setCloseWhenClickMap(value: Boolean): Self = StObject.set(x, "closeWhenClickMap", value.asInstanceOf[js.Any])
    
    inline def setCloseWhenClickMapUndefined: Self = StObject.set(x, "closeWhenClickMap", js.undefined)
    
    inline def setContent(value: String | HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setIsCustom(value: Boolean): Self = StObject.set(x, "isCustom", value.asInstanceOf[js.Any])
    
    inline def setIsCustomUndefined: Self = StObject.set(x, "isCustom", js.undefined)
    
    inline def setOffset(value: Pixel): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPosition(value: LngLat): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShowShadow(value: Boolean): Self = StObject.set(x, "showShadow", value.asInstanceOf[js.Any])
    
    inline def setShowShadowUndefined: Self = StObject.set(x, "showShadow", js.undefined)
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
