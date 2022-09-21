package typings.arcgisJsApi.esri

import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.VertexAddEventInfo
  - typings.arcgisJsApi.esri.CursorUpdateEventInfo
*/
trait CreateToolEventInfo extends StObject
object CreateToolEventInfo {
  
  inline def CursorUpdateEventInfo(
    constructor: js.Function,
    coordinates: js.Array[Double],
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typings.arcgisJsApi.esri.CursorUpdateEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("cursor-update")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CursorUpdateEventInfo]
  }
  
  inline def VertexAddEventInfo(
    added: js.Array[Double],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    vertices: js.Array[VertexAddEventInfoVertices]
  ): typings.arcgisJsApi.esri.VertexAddEventInfo = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("vertex-add")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.VertexAddEventInfo]
  }
}
