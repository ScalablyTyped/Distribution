package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.create
import typings.arcgisJsApi.arcgisJsApiStrings.edit
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureViewModelLastEditInfo
  extends StObject
     with Object {
  
  /**
    * Date that the edit was performed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#lastEditInfo)
    */
  var date: String
  
  /**
    * The type of edit that was performed on the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#lastEditInfo)
    */
  var `type`: edit | create
  
  /**
    * User who performed the last edit on a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#lastEditInfo)
    */
  var user: String
}
object FeatureViewModelLastEditInfo {
  
  inline def apply(
    constructor: js.Function,
    date: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: edit | create,
    user: String
  ): FeatureViewModelLastEditInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureViewModelLastEditInfo]
  }
  
  extension [Self <: FeatureViewModelLastEditInfo](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setType(value: edit | create): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
