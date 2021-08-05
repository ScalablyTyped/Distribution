package typings.amapJsSdk.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoFitView extends StObject {
  
  var autoFitView: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[Double] = js.undefined
  
  var city: js.UndefOr[String] = js.undefined
  
  var citylimit: js.UndefOr[Boolean] = js.undefined
  
  var extensions: js.UndefOr[String] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var map: js.UndefOr[typings.amapJsSdk.AMap.Map] = js.undefined
  
  var pageIndex: js.UndefOr[Double] = js.undefined
  
  var pageSize: js.UndefOr[Double] = js.undefined
  
  var panel: js.UndefOr[String | HTMLElement] = js.undefined
  
  var renderStyle: js.UndefOr[String] = js.undefined
  
  var showCover: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object AutoFitView {
  
  inline def apply(): AutoFitView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFitView]
  }
  
  extension [Self <: AutoFitView](x: Self) {
    
    inline def setAutoFitView(value: Boolean): Self = StObject.set(x, "autoFitView", value.asInstanceOf[js.Any])
    
    inline def setAutoFitViewUndefined: Self = StObject.set(x, "autoFitView", js.undefined)
    
    inline def setChildren(value: Double): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setCitylimit(value: Boolean): Self = StObject.set(x, "citylimit", value.asInstanceOf[js.Any])
    
    inline def setCitylimitUndefined: Self = StObject.set(x, "citylimit", js.undefined)
    
    inline def setExtensions(value: String): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setMap(value: typings.amapJsSdk.AMap.Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
    
    inline def setPageIndexUndefined: Self = StObject.set(x, "pageIndex", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPanel(value: String | HTMLElement): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    inline def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
    
    inline def setRenderStyle(value: String): Self = StObject.set(x, "renderStyle", value.asInstanceOf[js.Any])
    
    inline def setRenderStyleUndefined: Self = StObject.set(x, "renderStyle", js.undefined)
    
    inline def setShowCover(value: Boolean): Self = StObject.set(x, "showCover", value.asInstanceOf[js.Any])
    
    inline def setShowCoverUndefined: Self = StObject.set(x, "showCover", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
