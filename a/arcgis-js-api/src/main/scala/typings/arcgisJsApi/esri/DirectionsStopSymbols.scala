package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsStopSymbols
  extends StObject
     with Object {
  
  /**
    * The first stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#stopSymbols)
    */
  var first: js.UndefOr[Symbol] = js.undefined
  
  /**
    * The last stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#stopSymbols)
    */
  var last: js.UndefOr[Symbol] = js.undefined
  
  /**
    * The middle stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#stopSymbols)
    */
  var middle: js.UndefOr[Symbol] = js.undefined
  
  /**
    * An unlocated stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#stopSymbols)
    */
  var unlocated: js.UndefOr[Symbol] = js.undefined
  
  /**
    * A waypoint stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#stopSymbols)
    */
  var waypoint: js.UndefOr[Symbol] = js.undefined
}
object DirectionsStopSymbols {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): DirectionsStopSymbols = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[DirectionsStopSymbols]
  }
  
  extension [Self <: DirectionsStopSymbols](x: Self) {
    
    inline def setFirst(value: Symbol): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    inline def setLast(value: Symbol): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    inline def setMiddle(value: Symbol): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
    
    inline def setMiddleUndefined: Self = StObject.set(x, "middle", js.undefined)
    
    inline def setUnlocated(value: Symbol): Self = StObject.set(x, "unlocated", value.asInstanceOf[js.Any])
    
    inline def setUnlocatedUndefined: Self = StObject.set(x, "unlocated", js.undefined)
    
    inline def setWaypoint(value: Symbol): Self = StObject.set(x, "waypoint", value.asInstanceOf[js.Any])
    
    inline def setWaypointUndefined: Self = StObject.set(x, "waypoint", js.undefined)
  }
}
