package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Symbol3DLayer
  extends Accessor
     with JSONSupport {
  /**
    * The material used to shade the geometry. For `material` properties, see the documentation of the individual symbol layer classes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html#material)
    */
  var material: js.Any = js.native
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
    * extrusion | ![s3d-extrusion](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-extrude-solid.png)
    * text | ![s3d-text](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-label-text.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html#type)
    */
  val `type`: java.lang.String = js.native
}

