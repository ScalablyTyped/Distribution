package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentifyResult
  extends Accessor
     with JSONSupport {
  /**
    * The name of the layer's primary display field. The value of this property matches the name of one of the fields of the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyResult.html#displayFieldName)
    */
  var displayFieldName: String = js.native
  /**
    * An identified feature from the map service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyResult.html#feature)
    */
  var feature: Graphic = js.native
  /**
    * Unique ID of the layer that contains the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyResult.html#layerId)
    */
  var layerId: Double = js.native
  /**
    * The layer name that contains the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyResult.html#layerName)
    */
  var layerName: String = js.native
}

@JSGlobal("__esri.IdentifyResult")
@js.native
object IdentifyResult extends TopLevel[IdentifyResultConstructor]

