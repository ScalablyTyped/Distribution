package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

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
    * extrusion | ![s3d-extrusion](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-extrude-solid.png)
    * text | ![s3d-text](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-label-text.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html#type)
    */
  val `type`: String = js.native
}

@JSGlobal("__esri.Symbol3DLayer")
@js.native
/**
  * Symbol layers are used to define the visualization of [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html), [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html), [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html), and mesh geometries rendered with [3D symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html). [3D symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html) may only be used to render features in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html), or standalone [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). There is no support for 3D symbols in 2D [MapViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html)
  */
class Symbol3DLayerCls () extends Symbol3DLayer {
  def this(properties: Symbol3DLayerProperties) = this()
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

