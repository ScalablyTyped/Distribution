package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`reshape-start`
import typings.arcgisJsApi.arcgisJsApiStrings.`reshape-stop`
import typings.arcgisJsApi.arcgisJsApiStrings.reshape
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReshapeEventInfo
  extends Object
     with UpdateToolEventInfo {
  
  /**
    * Returns information indicating the stage of the reshape operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#ReshapeEventInfo)
    */
  var `type`: `reshape-start` | reshape | `reshape-stop` = js.native
}
object ReshapeEventInfo {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `reshape-start` | reshape | `reshape-stop`
  ): ReshapeEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReshapeEventInfo]
  }
  
  @scala.inline
  implicit class ReshapeEventInfoMutableBuilder[Self <: ReshapeEventInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: `reshape-start` | reshape | `reshape-stop`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
