package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookmarkOptionsScreenshotSettings extends StObject {
  
  /**
    * Used to take a screenshot of a subregion of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkOptions)
    */
  var area: js.UndefOr[BookmarkOptionsScreenshotSettingsArea] = js.undefined
  
  /**
    * The height (in pixels) of the screenshot.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkOptions)
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * An optional list of layers to be included in the screenshot.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkOptions)
    */
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
  
  /**
    * The width (in pixels) of the screenshot.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html#BookmarkOptions)
    */
  var width: js.UndefOr[Double] = js.undefined
}
object BookmarkOptionsScreenshotSettings {
  
  inline def apply(): BookmarkOptionsScreenshotSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookmarkOptionsScreenshotSettings]
  }
  
  extension [Self <: BookmarkOptionsScreenshotSettings](x: Self) {
    
    inline def setArea(value: BookmarkOptionsScreenshotSettingsArea): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLayers(value: js.Array[Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
