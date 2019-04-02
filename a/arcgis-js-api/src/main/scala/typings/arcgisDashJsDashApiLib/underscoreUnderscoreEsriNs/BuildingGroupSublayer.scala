package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildingGroupSublayer extends BuildingSublayer {
  /**
    * Indicates how the layer should display in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget. The possible values are listed below.
    *
    * Value | Description
    * ------|------------
    *  show | The layer is visible in the table of contents.
    *  hide | The layer is hidden in the table of contents.
    *  hide-children | Hide the children layers from the table of contents.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingGroupSublayer.html#listMode)
    *
    * @default show
    */
  var listMode: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.show | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.hide | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`hide-children` = js.native
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of sublayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingGroupSublayer.html#sublayers)
    */
  val sublayers: Collection[BuildingGroupSublayer | BuildingComponentSublayer] = js.native
  /**
    * The type for this sublayer is always `building-group`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingGroupSublayer.html#type)
    */
  val `type`: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`building-group` = js.native
  /**
    * Loads all contained sublayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingGroupSublayer.html#loadAll)
    *
    *
    */
  def loadAll(): arcgisDashJsDashApiLib.IPromise[BuildingSceneLayer] = js.native
}

@JSGlobal("__esri.BuildingGroupSublayer")
@js.native
class BuildingGroupSublayerCls () extends BuildingGroupSublayer {
  def this(properties: BuildingGroupSublayerProperties) = this()
}

