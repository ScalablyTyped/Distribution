package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSceneUpdateFromOptions
  extends StObject
     with Object {
  
  /**
    * Do not update the initial environment from the view, defaults to false.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#updateFrom)
    */
  var environmentExcluded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Do not update the thumbnail from the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#updateFrom)
    */
  var thumbnailExcluded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The size of the thumbnail.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#updateFrom)
    */
  var thumbnailSize: js.UndefOr[WebSceneUpdateFromOptionsThumbnailSize] = js.undefined
  
  /**
    * Do not update the initial viewpoint from the view, defaults to false.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#updateFrom)
    */
  var viewpointExcluded: js.UndefOr[Boolean] = js.undefined
}
object WebSceneUpdateFromOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): WebSceneUpdateFromOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[WebSceneUpdateFromOptions]
  }
  
  extension [Self <: WebSceneUpdateFromOptions](x: Self) {
    
    inline def setEnvironmentExcluded(value: Boolean): Self = StObject.set(x, "environmentExcluded", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentExcludedUndefined: Self = StObject.set(x, "environmentExcluded", js.undefined)
    
    inline def setThumbnailExcluded(value: Boolean): Self = StObject.set(x, "thumbnailExcluded", value.asInstanceOf[js.Any])
    
    inline def setThumbnailExcludedUndefined: Self = StObject.set(x, "thumbnailExcluded", js.undefined)
    
    inline def setThumbnailSize(value: WebSceneUpdateFromOptionsThumbnailSize): Self = StObject.set(x, "thumbnailSize", value.asInstanceOf[js.Any])
    
    inline def setThumbnailSizeUndefined: Self = StObject.set(x, "thumbnailSize", js.undefined)
    
    inline def setViewpointExcluded(value: Boolean): Self = StObject.set(x, "viewpointExcluded", value.asInstanceOf[js.Any])
    
    inline def setViewpointExcludedUndefined: Self = StObject.set(x, "viewpointExcluded", js.undefined)
  }
}
