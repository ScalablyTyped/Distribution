package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`selection-change`
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionChangeEventInfo
  extends StObject
     with Object
     with UpdateToolEventInfo {
  
  /**
    * An array of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) representing the latest graphic selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#SelectionChangeEventInfo)
    */
  var added: js.Array[Graphic]
  
  /**
    * An array of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) representing the latest graphic deselected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#SelectionChangeEventInfo)
    */
  var removed: js.Array[Graphic]
  
  /**
    * Type is always `selection-change`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#SelectionChangeEventInfo)
    */
  var `type`: `selection-change`
}
object SelectionChangeEventInfo {
  
  inline def apply(
    added: js.Array[Graphic],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    removed: js.Array[Graphic]
  ): SelectionChangeEventInfo = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), removed = removed.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("selection-change")
    __obj.asInstanceOf[SelectionChangeEventInfo]
  }
  
  extension [Self <: SelectionChangeEventInfo](x: Self) {
    
    inline def setAdded(value: js.Array[Graphic]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setAddedVarargs(value: Graphic*): Self = StObject.set(x, "added", js.Array(value*))
    
    inline def setRemoved(value: js.Array[Graphic]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedVarargs(value: Graphic*): Self = StObject.set(x, "removed", js.Array(value*))
    
    inline def setType(value: `selection-change`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
