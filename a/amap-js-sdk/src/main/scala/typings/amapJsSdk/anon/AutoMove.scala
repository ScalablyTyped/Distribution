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
  
  @scala.inline
  def apply(): AutoMove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMove]
  }
  
  @scala.inline
  implicit class AutoMoveMutableBuilder[Self <: AutoMove] (val x: Self) extends AnyVal {
    
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
    def setIsCustom(value: Boolean): Self = StObject.set(x, "isCustom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCustomUndefined: Self = StObject.set(x, "isCustom", js.undefined)
    
    @scala.inline
    def setOffset(value: Pixel): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPosition(value: LngLat): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShowShadow(value: Boolean): Self = StObject.set(x, "showShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowShadowUndefined: Self = StObject.set(x, "showShadow", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
