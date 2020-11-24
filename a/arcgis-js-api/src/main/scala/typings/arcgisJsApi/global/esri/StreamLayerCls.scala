package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.StreamLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.StreamLayer")
@js.native
/**
  * StreamLayer connects to a [stream service](https://enterprise.arcgis.com/en/geoevent/latest/process-event-data/stream-services.htm) or a [custom WebSocket service](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#streamlayer-from-websocket), displaying the observation streams associated with a set of [tracked objects](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#track-aware) in real-time.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html)
  */
class StreamLayerCls ()
  extends typings.arcgisJsApi.esri.StreamLayer {
  def this(properties: StreamLayerProperties) = this()
}
