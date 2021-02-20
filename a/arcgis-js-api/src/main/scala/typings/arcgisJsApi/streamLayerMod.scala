package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.StreamLayer
import typings.arcgisJsApi.esri.StreamLayerConstructor
import typings.arcgisJsApi.esri.StreamLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamLayerMod extends Shortcut {
  
  @JSImport("esri/layers/StreamLayer", JSImport.Namespace)
  @js.native
  val ^ : StreamLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/StreamLayer", JSImport.Namespace)
  @js.native
  /**
    * StreamLayer connects to a [stream service](https://enterprise.arcgis.com/en/geoevent/latest/process-event-data/stream-services.htm) or a [custom WebSocket service](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#streamlayer-from-websocket), displaying the observation streams associated with a set of [tracked objects](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#track-aware) in real-time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html)
    */
  class Class () extends StreamLayer {
    def this(properties: StreamLayerProperties) = this()
  }
  
  type _To = StreamLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `streamLayerMod.foo` */
  override def _to: StreamLayerConstructor = ^
}
