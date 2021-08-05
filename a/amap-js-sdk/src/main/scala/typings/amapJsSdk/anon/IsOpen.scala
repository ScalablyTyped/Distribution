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
  
  inline def apply(): IsOpen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsOpen]
  }
  
  extension [Self <: IsOpen](x: Self) {
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    inline def setTileLayer(value: js.Array[TileLayer]): Self = StObject.set(x, "tileLayer", value.asInstanceOf[js.Any])
    
    inline def setTileLayerUndefined: Self = StObject.set(x, "tileLayer", js.undefined)
    
    inline def setTileLayerVarargs(value: TileLayer*): Self = StObject.set(x, "tileLayer", js.Array(value :_*))
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
