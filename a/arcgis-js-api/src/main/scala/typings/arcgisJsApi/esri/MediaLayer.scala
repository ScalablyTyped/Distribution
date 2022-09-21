package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.media
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaLayer
  extends StObject
     with Layer
     with ScaleRangeLayer
     with BlendLayer {
  
  /**
    * Copyright information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html#copyright)
    */
  var copyright: String = js.native
  
  /**
    * The source for the MediaLayer that will be displayed on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html#source)
    */
  var source: LocalMediaElementSource = js.native
  
  /**
    * The spatial reference of the layer and defines the spatial reference of the layer's [fullExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html#fullExtent).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  
  @JSName("type")
  val type_MediaLayer: media = js.native
}
