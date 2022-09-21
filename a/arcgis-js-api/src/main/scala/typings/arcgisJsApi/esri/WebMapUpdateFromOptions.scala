package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebMapUpdateFromOptions
  extends StObject
     with Object {
  
  /**
    * When `true`, the view's background will not be updated for the webmap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var backgroundExcluded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, the view's scale will be updated for the webmap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var scalePreserved: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, the thumbnail will not be updated for the webmap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var thumbnailExcluded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The size of the thumbnail.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var thumbnailSize: js.UndefOr[WebMapUpdateFromOptionsThumbnailSize] = js.undefined
  
  /**
    * When `true`, the initial [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#viewpoint) of the view will not be updated for the webmap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var viewpointExcluded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, the webmap's [widgets](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#widgets) property will not be updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var widgetsExcluded: js.UndefOr[Boolean] = js.undefined
}
object WebMapUpdateFromOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): WebMapUpdateFromOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[WebMapUpdateFromOptions]
  }
  
  extension [Self <: WebMapUpdateFromOptions](x: Self) {
    
    inline def setBackgroundExcluded(value: Boolean): Self = StObject.set(x, "backgroundExcluded", value.asInstanceOf[js.Any])
    
    inline def setBackgroundExcludedUndefined: Self = StObject.set(x, "backgroundExcluded", js.undefined)
    
    inline def setScalePreserved(value: Boolean): Self = StObject.set(x, "scalePreserved", value.asInstanceOf[js.Any])
    
    inline def setScalePreservedUndefined: Self = StObject.set(x, "scalePreserved", js.undefined)
    
    inline def setThumbnailExcluded(value: Boolean): Self = StObject.set(x, "thumbnailExcluded", value.asInstanceOf[js.Any])
    
    inline def setThumbnailExcludedUndefined: Self = StObject.set(x, "thumbnailExcluded", js.undefined)
    
    inline def setThumbnailSize(value: WebMapUpdateFromOptionsThumbnailSize): Self = StObject.set(x, "thumbnailSize", value.asInstanceOf[js.Any])
    
    inline def setThumbnailSizeUndefined: Self = StObject.set(x, "thumbnailSize", js.undefined)
    
    inline def setViewpointExcluded(value: Boolean): Self = StObject.set(x, "viewpointExcluded", value.asInstanceOf[js.Any])
    
    inline def setViewpointExcludedUndefined: Self = StObject.set(x, "viewpointExcluded", js.undefined)
    
    inline def setWidgetsExcluded(value: Boolean): Self = StObject.set(x, "widgetsExcluded", value.asInstanceOf[js.Any])
    
    inline def setWidgetsExcludedUndefined: Self = StObject.set(x, "widgetsExcluded", js.undefined)
  }
}
