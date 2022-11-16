package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResult extends StObject {
  
  /**
    * The extent, or bounding box, of the returned feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SearchResult)
    */
  var extent: Extent
  
  /**
    * The resulting feature or location obtained from the search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SearchResult)
    */
  var feature: Graphic
  
  /**
    * The name of the result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SearchResult)
    */
  var name: String
  
  /**
    * The target of the result, which is a [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) used for either [MapView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo) or [SceneView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo) navigation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SearchResult)
    */
  var target: Graphic
}
object SearchResult {
  
  inline def apply(extent: Extent, feature: Graphic, name: String, target: Graphic): SearchResult = {
    val __obj = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  
  extension [Self <: SearchResult](x: Self) {
    
    inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setFeature(value: Graphic): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Graphic): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
