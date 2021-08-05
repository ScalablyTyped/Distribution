package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureVisibleElements
  extends StObject
     with Object {
  
  /**
    * Indicates whether content for the Feature displays, can also indicate the specific types of content elements by setting it via [VisibleContentElements](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleContentElements).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleElements)
    */
  var content: js.UndefOr[Boolean | VisibleContentElements] = js.undefined
  
  /**
    * Indicates whether [lastEditInfo](esri-widgets-Feature-FeatureViewModel.html#lastEditInfo) is displayed within the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleElements)
    */
  var lastEditInfo: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the title associated with the feature displays.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html#VisibleElements)
    */
  var title: js.UndefOr[Boolean] = js.undefined
}
object FeatureVisibleElements {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): FeatureVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[FeatureVisibleElements]
  }
  
  extension [Self <: FeatureVisibleElements](x: Self) {
    
    inline def setContent(value: Boolean | VisibleContentElements): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setLastEditInfo(value: Boolean): Self = StObject.set(x, "lastEditInfo", value.asInstanceOf[js.Any])
    
    inline def setLastEditInfoUndefined: Self = StObject.set(x, "lastEditInfo", js.undefined)
    
    inline def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
