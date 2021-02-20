package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhaseEvent extends Object {
  
  /**
    * The elapsed time since the last animation frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#PhaseEvent)
    */
  var deltaTime: Double = js.native
  
  /**
    * The amount of time spent within the current animation frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#PhaseEvent)
    */
  var elapsedFrameTime: Double = js.native
  
  /**
    * The absolute time at the start of the current animation frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#PhaseEvent)
    */
  var time: Double = js.native
}
object PhaseEvent {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    deltaTime: Double,
    elapsedFrameTime: Double,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    time: Double
  ): PhaseEvent = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], deltaTime = deltaTime.asInstanceOf[js.Any], elapsedFrameTime = elapsedFrameTime.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhaseEvent]
  }
  
  @scala.inline
  implicit class PhaseEventMutableBuilder[Self <: PhaseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeltaTime(value: Double): Self = StObject.set(x, "deltaTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElapsedFrameTime(value: Double): Self = StObject.set(x, "elapsedFrameTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
