package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.VertexAddEventInfo
  - typings.arcgisJsApi.esri.CursorUpdateEventInfo
*/
trait CreateToolEventInfo extends StObject
object CreateToolEventInfo {
  
  inline def CursorUpdateEventInfo(coordinates: js.Array[Double]): typings.arcgisJsApi.esri.CursorUpdateEventInfo = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("cursor-update")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.CursorUpdateEventInfo]
  }
  
  inline def VertexAddEventInfo(added: js.Array[Double], vertices: js.Array[VertexAddEventInfoVertices]): typings.arcgisJsApi.esri.VertexAddEventInfo = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("vertex-add")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.VertexAddEventInfo]
  }
}
