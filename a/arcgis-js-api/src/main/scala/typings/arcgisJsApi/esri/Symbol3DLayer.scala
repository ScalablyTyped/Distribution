package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.arcgisJsApiStrings.`object`
import typings.arcgisJsApi.arcgisJsApiStrings.extrude
import typings.arcgisJsApi.arcgisJsApiStrings.fill
import typings.arcgisJsApi.arcgisJsApiStrings.icon
import typings.arcgisJsApi.arcgisJsApiStrings.line
import typings.arcgisJsApi.arcgisJsApiStrings.path
import typings.arcgisJsApi.arcgisJsApiStrings.text
import typings.arcgisJsApi.arcgisJsApiStrings.water
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Symbol3DLayer
  extends Accessor
     with JSONSupport {
  /**
    * The 3D symbol layer type. See the table below for a list of possible values.
    *
    * Value | Description
    * ------|------------
    * icon | ![s3d-icon](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-icon-circle.png)
    * object | ![s3d-object](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-object-sphere.png)
    * line | ![s3d-line](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-line-line.png)
    * path | ![s3d-path](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-path-tube.png)
    * fill | ![s3d-fill](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-fill-solid.png)
    * water | ![s3d-water](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-water-solid.png)
    * extrude | ![s3d-extrusion](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-extrude-solid.png)
    * text | ![s3d-text](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-label-text.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html#type)
    */
  val `type`: icon | `object` | line | path | fill | water | extrude | text = js.native
}

@JSGlobal("__esri.Symbol3DLayer")
@js.native
object Symbol3DLayer extends TopLevel[Symbol3DLayerConstructor]

