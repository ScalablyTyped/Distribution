package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`move-start`
import typings.arcgisJsApi.arcgisJsApiStrings.`move-stop`
import typings.arcgisJsApi.arcgisJsApiStrings.`reshape-start`
import typings.arcgisJsApi.arcgisJsApiStrings.`reshape-stop`
import typings.arcgisJsApi.arcgisJsApiStrings.`rotate-start`
import typings.arcgisJsApi.arcgisJsApiStrings.`rotate-stop`
import typings.arcgisJsApi.arcgisJsApiStrings.`scale-start`
import typings.arcgisJsApi.arcgisJsApiStrings.`scale-stop`
import typings.arcgisJsApi.arcgisJsApiStrings.move
import typings.arcgisJsApi.arcgisJsApiStrings.reshape
import typings.arcgisJsApi.arcgisJsApiStrings.rotate
import typings.arcgisJsApi.arcgisJsApiStrings.scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.MoveEventInfo
  - typings.arcgisJsApi.esri.ReshapeEventInfo
  - typings.arcgisJsApi.esri.RotateEventInfo
  - typings.arcgisJsApi.esri.ScaleEventInfo
  - typings.arcgisJsApi.esri.SelectionChangeEventInfo
  - typings.arcgisJsApi.esri.VertexAddEventInfo
  - typings.arcgisJsApi.esri.VertexRemoveEventInfo
*/
trait UpdateToolEventInfo extends StObject
object UpdateToolEventInfo {
  
  inline def MoveEventInfo(dx: Double, dy: Double, mover: Graphic, `type`: `move-start` | move | `move-stop`): typings.arcgisJsApi.esri.MoveEventInfo = {
    val __obj = js.Dynamic.literal(dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], mover = mover.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.MoveEventInfo]
  }
  
  inline def ReshapeEventInfo(`type`: `reshape-start` | reshape | `reshape-stop`): typings.arcgisJsApi.esri.ReshapeEventInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.ReshapeEventInfo]
  }
  
  inline def RotateEventInfo(angle: Double, `type`: `rotate-start` | rotate | `rotate-stop`): typings.arcgisJsApi.esri.RotateEventInfo = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.RotateEventInfo]
  }
  
  inline def ScaleEventInfo(`type`: `scale-start` | scale | `scale-stop`, xScale: Double, yScale: Double): typings.arcgisJsApi.esri.ScaleEventInfo = {
    val __obj = js.Dynamic.literal(xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.ScaleEventInfo]
  }
  
  inline def SelectionChangeEventInfo(added: js.Array[Graphic], removed: js.Array[Graphic]): typings.arcgisJsApi.esri.SelectionChangeEventInfo = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("selection-change")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.SelectionChangeEventInfo]
  }
  
  inline def VertexAddEventInfo(added: js.Array[Double], vertices: js.Array[VertexAddEventInfoVertices]): typings.arcgisJsApi.esri.VertexAddEventInfo = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("vertex-add")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.VertexAddEventInfo]
  }
  
  inline def VertexRemoveEventInfo(removed: js.Array[Double], vertices: js.Array[VertexRemoveEventInfoVertices]): typings.arcgisJsApi.esri.VertexRemoveEventInfo = {
    val __obj = js.Dynamic.literal(removed = removed.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("vertex-remove")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.VertexRemoveEventInfo]
  }
}
