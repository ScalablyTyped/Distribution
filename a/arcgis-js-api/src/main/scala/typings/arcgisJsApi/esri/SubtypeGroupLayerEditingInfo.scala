package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtypeGroupLayerEditingInfo
  extends StObject
     with Object {
  
  /**
    * Indicates the last time the layer was edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#EditingInfo)
    */
  var lastEditDate: js.Date
}
object SubtypeGroupLayerEditingInfo {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    lastEditDate: js.Date,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SubtypeGroupLayerEditingInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), lastEditDate = lastEditDate.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SubtypeGroupLayerEditingInfo]
  }
  
  extension [Self <: SubtypeGroupLayerEditingInfo](x: Self) {
    
    inline def setLastEditDate(value: js.Date): Self = StObject.set(x, "lastEditDate", value.asInstanceOf[js.Any])
  }
}
