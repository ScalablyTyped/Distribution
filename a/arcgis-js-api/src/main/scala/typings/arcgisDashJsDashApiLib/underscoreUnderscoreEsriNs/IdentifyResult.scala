package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
  var displayFieldName: java.lang.String = js.native
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
  var layerId: scala.Double = js.native
  /**
    * The layer name that contains the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyResult.html#layerName)
    */
  var layerName: java.lang.String = js.native
}

@JSGlobal("__esri.IdentifyResult")
@js.native
class IdentifyResultCls () extends IdentifyResult {
  def this(properties: IdentifyResultProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

