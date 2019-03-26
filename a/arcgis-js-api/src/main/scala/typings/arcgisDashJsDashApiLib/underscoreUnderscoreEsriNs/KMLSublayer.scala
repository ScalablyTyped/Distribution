package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMLSublayer
  extends Accessor
     with JSONSupport {
  /**
    * Description for the KML sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html#description)
    */
  var description: java.lang.String = js.native
  /**
    * The id for the KML sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html#id)
    */
  var id: scala.Double = js.native
  /**
    * The [KMLLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html) to which the sublayer belongs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html#layer)
    */
  var layer: KMLLayer = js.native
  /**
    * Network link info for the current layer. A link info object with properties that describe the network link.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html#networkLink)
    */
  var networkLink: js.Any = js.native
  /**
    * A collection of [KMLSublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html#sublayers)
    */
  var sublayers: Collection[KMLSublayer] = js.native
  /**
    * The title of the KML sublayer used to identify it in places such as the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) and [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widgets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html#title)
    */
  var title: java.lang.String = js.native
  /**
    * Indicates if the sublayer is visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html#visible)
    */
  var visible: scala.Boolean = js.native
}

@JSGlobal("__esri.KMLSublayer")
@js.native
class KMLSublayerCls () extends KMLSublayer {
  def this(properties: KMLSublayerProperties) = this()
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

