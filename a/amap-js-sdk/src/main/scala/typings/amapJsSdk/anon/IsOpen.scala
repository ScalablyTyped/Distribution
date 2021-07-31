package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.TileLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsOpen extends StObject {
  
  var isOpen: js.UndefOr[Boolean] = js.undefined
  
  var tileLayer: js.UndefOr[js.Array[TileLayer]] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object IsOpen {
  
  @scala.inline
  def apply(): IsOpen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsOpen]
  }
  
  @scala.inline
  implicit class IsOpenMutableBuilder[Self <: IsOpen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    @scala.inline
    def setTileLayer(value: js.Array[TileLayer]): Self = StObject.set(x, "tileLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileLayerUndefined: Self = StObject.set(x, "tileLayer", js.undefined)
    
    @scala.inline
    def setTileLayerVarargs(value: TileLayer*): Self = StObject.set(x, "tileLayer", js.Array(value :_*))
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
