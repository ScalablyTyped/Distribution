package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildingSublayer extends Accessor {
  /**
    * The sublayer's layer id as defined by the Scene Service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingSublayer.html#id)
    */
  val id: scala.Double = js.native
  /**
    * The modelName is a standard name for each sublayer. For example the sublayer containing the doors in a building has the modelName "Doors". Use this property to retrieve sublayers in a [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingSublayer.html#modelName)
    */
  val modelName: java.lang.String = js.native
  /**
    * Opacity of the sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingSublayer.html#opacity)
    *
    * @default 1
    */
  var opacity: scala.Double = js.native
  /**
    * The title of the sublayer used to identify it in places such as the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) and [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widgets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingSublayer.html#title)
    */
  var title: java.lang.String = js.native
  /**
    * Indicates if the sublayer is visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingSublayer.html#visible)
    *
    * @default true
    */
  var visible: scala.Boolean = js.native
}

@JSGlobal("__esri.BuildingSublayer")
@js.native
class BuildingSublayerCls () extends BuildingSublayer {
  def this(properties: BuildingSublayerProperties) = this()
}

