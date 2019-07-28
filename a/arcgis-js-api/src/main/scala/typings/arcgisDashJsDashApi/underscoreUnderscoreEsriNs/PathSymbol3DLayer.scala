package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.all
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.bevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.bottom
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.butt
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.center
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.circle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.heading
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.miter
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.none
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.path
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.quad
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.round
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathSymbol3DLayer
  extends Symbol3DLayer
     with typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.symbolsNs.Symbol3DLayer
     with symbolsSymbol3DLayer {
  /**
    * Defines offset of the path cross section relative to the [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry.
    *
    * Possible Value | Example
    * ---------------|---------
    * center | ![anchor-center](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/anchor-center.png)
    * bottom | ![anchor-bottom](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/anchor-bottom.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#anchor)
    *
    * @default "center"
    */
  var anchor: center | bottom = js.native
  /**
    * Controls the shape at the start and end point of the path. See the table below for possible values.
    *
    * Possible Value | Example
    * ---------------|---------
    * butt | ![line3d-cap-butt](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/line3d-cap-butt.png)
    * round | ![line3d-cap-round](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/line3d-cap-round.png)
    * square | ![line3d-cap-square](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/line3d-cap-square.png)
    * none | ![line3d-cap-square](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/line3d-cap-none.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#cap)
    *
    * @default "butt"
    */
  var cap: none | butt | square | round = js.native
  /**
    * Indicates whether the symbol layer geometry casts shadows in the scene. Setting this property to `false` will disable shadows for the symbol layer even if direct shadows are enabled in [SceneView.environment](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#castShadows)
    *
    * @default true
    */
  var castShadows: Boolean = js.native
  /**
    * The vertical dimension of the cross-section of the path in meters. If only the [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#width) is set, then the height is set to the same value as the width. If neither width nor height are set, then the path is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#height)
    */
  var height: Double = js.native
  /**
    * Controls the shape of the connection between two segments of the path. See the table below for possible values.
    *
    * Possible Value | Example
    * ---------------|---------
    * bevel | ![line3d-join-bevel](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/line3d-join-bevel.png)
    * miter | ![line3d-join-miter](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/line3d-join-miter.png)
    * round | ![line3d-join-round](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/line3d-join-round.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#join)
    *
    * @default "miter"
    */
  var join: miter | bevel | round = js.native
  /**
    * The material used to shade the path. This property defines the paths's color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#material)
    */
  var material: PathSymbol3DLayerMaterial = js.native
  /**
    * Cross-section profile of the path geometry. Setting it to `circle` creates a path with a pipe shape and setting it to `quad` gives the path a rectangular shape.  **Possible values:** circle | quad
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#profile)
    *
    * @default "circle"
    */
  var profile: circle | quad = js.native
  /**
    * Defines how the [profile](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#profile) is rotated as it is extruded along the [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry. The rotation axes (heading, tilt, roll) can be limited to constrain the orientation of the profile in the scene. Setting `profileOrientation` to `all` minimizes the twist along the line and ensures that the diameter of the resulting visualization corresponds to [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#width) and [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#height). Setting `profileOrientation` to `"heading"` ensures that the profile stays upright (no tilt or twist).  Typically, `all` is used for `circle` profiles and `heading` is used for `quad` profiles.  As an example, when setting `heading` on a path with a `quad` profile the path is oriented upright:  ![profileRotation-heading](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/profileRotation-heading.png)  The same path with `profileRotation` set to `all` will rotate in all three degrees of freedom:  ![profileRotation-all](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/profileRotation-all.png)  **Possible values:** heading | all
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#profileRotation)
    *
    * @default "all"
    */
  var profileRotation: heading | all = js.native
  /**
    * Sets the width and height of the path in meters. Since this property is deprecated use [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#width) or [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#height) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#size)
    */
  var size: Double = js.native
  /**
    * For PathSymbol3DLayer, the type is always `path`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#type)
    */
  @JSName("type")
  val type_PathSymbol3DLayer: path = js.native
  /**
    * The horizontal dimension of the cross-section of the path in meters. If only the [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#height) is set, then the width is set to the same value as the height. If neither width nor height are set, then the path is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#width)
    */
  var width: Double = js.native
}

@JSGlobal("__esri.PathSymbol3DLayer")
@js.native
/**
  * PathSymbol3DLayer renders [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometries by extruding a 2D profile along the line. A PathSymbol3DLayer must be added to the `symbolLayers` property of a [LineSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3D.html). This is a 3D symbol, therefore it is only supported in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html)
  */
class PathSymbol3DLayerCls () extends PathSymbol3DLayer {
  def this(properties: PathSymbol3DLayerProperties) = this()
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

