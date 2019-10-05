package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerView
  extends Accessor
     with corePromise {
  /**
    * The layer being viewed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html#layer)
    */
  val layer: Layer = js.native
  /**
    * Value is `true` if the layer is suspended (i.e., layer will not redraw or update itself when the extent changes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html#suspended)
    */
  val suspended: Boolean = js.native
  /**
    * Value is `true` when the layer is updating; for example, if it is in the process of fetching data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html#updating)
    *
    * @default false
    */
  val updating: Boolean = js.native
  /**
    * When `true`, the layer is visible in the view. Set this property to `false` to hide the layer from the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html#visible)
    *
    * @default true
    */
  var visible: Boolean = js.native
}

@JSGlobal("__esri.LayerView")
@js.native
object LayerView extends TopLevel[LayerViewConstructor]

