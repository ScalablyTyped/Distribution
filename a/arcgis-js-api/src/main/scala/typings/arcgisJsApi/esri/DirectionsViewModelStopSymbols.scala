package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsViewModelStopSymbols extends Object {
  
  /**
    * The first stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stopSymbols)
    */
  var first: js.UndefOr[Symbol] = js.native
  
  /**
    * The last stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stopSymbols)
    */
  var last: js.UndefOr[Symbol] = js.native
  
  /**
    * The middle stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stopSymbols)
    */
  var middle: js.UndefOr[Symbol] = js.native
  
  /**
    * An unlocated stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stopSymbols)
    */
  var unlocated: js.UndefOr[Symbol] = js.native
  
  /**
    * A waypoint stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stopSymbols)
    */
  var waypoint: js.UndefOr[Symbol] = js.native
}
object DirectionsViewModelStopSymbols {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): DirectionsViewModelStopSymbols = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[DirectionsViewModelStopSymbols]
  }
  
  @scala.inline
  implicit class DirectionsViewModelStopSymbolsMutableBuilder[Self <: DirectionsViewModelStopSymbols] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst(value: Symbol): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    @scala.inline
    def setLast(value: Symbol): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    @scala.inline
    def setMiddle(value: Symbol): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddleUndefined: Self = StObject.set(x, "middle", js.undefined)
    
    @scala.inline
    def setUnlocated(value: Symbol): Self = StObject.set(x, "unlocated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlocatedUndefined: Self = StObject.set(x, "unlocated", js.undefined)
    
    @scala.inline
    def setWaypoint(value: Symbol): Self = StObject.set(x, "waypoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypointUndefined: Self = StObject.set(x, "waypoint", js.undefined)
  }
}
