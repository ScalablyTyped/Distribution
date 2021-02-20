package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebMapUpdateFromOptions extends Object {
  
  /**
    * When `true`, the view's background will not be updated for the webmap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var backgroundExcluded: js.UndefOr[Boolean] = js.native
  
  /**
    * When `true`, the view's scale will be updated for the webmap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var scalePreserved: js.UndefOr[Boolean] = js.native
  
  /**
    * When `true`, the thumbnail will not be updated for the webmap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var thumbnailExcluded: js.UndefOr[Boolean] = js.native
  
  /**
    * The size of the thumbnail.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var thumbnailSize: js.UndefOr[WebMapUpdateFromOptionsThumbnailSize] = js.native
  
  /**
    * When `true`, the initial [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#viewpoint) of the view will not be updated for the webmap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#updateFrom)
    */
  var viewpointExcluded: js.UndefOr[Boolean] = js.native
}
object WebMapUpdateFromOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): WebMapUpdateFromOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[WebMapUpdateFromOptions]
  }
  
  @scala.inline
  implicit class WebMapUpdateFromOptionsMutableBuilder[Self <: WebMapUpdateFromOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundExcluded(value: Boolean): Self = StObject.set(x, "backgroundExcluded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundExcludedUndefined: Self = StObject.set(x, "backgroundExcluded", js.undefined)
    
    @scala.inline
    def setScalePreserved(value: Boolean): Self = StObject.set(x, "scalePreserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalePreservedUndefined: Self = StObject.set(x, "scalePreserved", js.undefined)
    
    @scala.inline
    def setThumbnailExcluded(value: Boolean): Self = StObject.set(x, "thumbnailExcluded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailExcludedUndefined: Self = StObject.set(x, "thumbnailExcluded", js.undefined)
    
    @scala.inline
    def setThumbnailSize(value: WebMapUpdateFromOptionsThumbnailSize): Self = StObject.set(x, "thumbnailSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailSizeUndefined: Self = StObject.set(x, "thumbnailSize", js.undefined)
    
    @scala.inline
    def setViewpointExcluded(value: Boolean): Self = StObject.set(x, "viewpointExcluded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewpointExcludedUndefined: Self = StObject.set(x, "viewpointExcluded", js.undefined)
  }
}
