package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.all
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.bevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.bottom
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.butt
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.center
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.circle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.heading
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.miter
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.none
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.quad
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.round
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.square
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathSymbol3DLayerProperties extends Symbol3DLayerProperties {
  /**
    * Defines offset of the path cross section relative to the [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry.
    *
    * Possible Value | Example
    * ---------------|---------
    * center | ![anchor-center](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/anchor-center.png)
    * bottom | ![anchor-bottom](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/anchor-bottom.png)
    * top | ![anchor-top](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/anchor-top.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#anchor)
    *
    * @default "center"
    */
  var anchor: js.UndefOr[center | bottom | top] = js.undefined
  /**
    * Controls the shape at the start and end point of the path. `none` will not render the faces that close the path. See the table below for possible values.
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
  var cap: js.UndefOr[none | butt | square | round] = js.undefined
  /**
    * Indicates whether the symbol layer geometry casts shadows in the scene. Setting this property to `false` will disable shadows for the symbol layer even if direct shadows are enabled in [SceneView.environment](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#castShadows)
    *
    * @default true
    */
  var castShadows: js.UndefOr[Boolean] = js.undefined
  /**
    * The vertical dimension of the cross-section of the path in meters. If only the [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#width) is set, then the height is set to the same value as the width. If neither width nor height are set, then the path is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#height)
    */
  var height: js.UndefOr[Double] = js.undefined
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
  var join: js.UndefOr[miter | bevel | round] = js.undefined
  /**
    * The material used to shade the path. This property defines the paths's color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#material)
    */
  var material: js.UndefOr[PathSymbol3DLayerMaterialProperties] = js.undefined
  /**
    * Cross-section profile of the path geometry. Setting it to `circle` creates a path with a pipe shape and setting it to `quad` gives the path a rectangular shape.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#profile)
    *
    * @default "circle"
    */
  var profile: js.UndefOr[circle | quad] = js.undefined
  /**
    * Defines how the [profile](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#profile) is rotated as it is extruded along the [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry. The rotation axes (heading, tilt, roll) can be limited to constrain the orientation of the profile in the scene. Setting `profileOrientation` to `all` minimizes the twist along the line and ensures that the diameter of the resulting visualization corresponds to [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#width) and [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#height). Setting `profileOrientation` to `"heading"` ensures that the profile stays upright (no tilt or twist).  Typically, `all` is used for `circle` profiles and `heading` is used for `quad` profiles.  As an example, when setting `heading` on a path with a `quad` profile the path is oriented upright:  ![profileRotation-heading](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/profileRotation-heading.png)  The same path with `profileRotation` set to `all` will rotate in all three degrees of freedom:  ![profileRotation-all](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/profileRotation-all.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#profileRotation)
    *
    * @default "all"
    */
  var profileRotation: js.UndefOr[heading | all] = js.undefined
  /**
    * Sets the width and height of the path in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#size)
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    * The horizontal dimension of the cross-section of the path in meters. If only the [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#height) is set, then the width is set to the same value as the height. If neither width nor height are set, then the path is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#width)
    */
  var width: js.UndefOr[Double] = js.undefined
}

object PathSymbol3DLayerProperties {
  @scala.inline
  def apply(
    anchor: center | bottom | top = null,
    cap: none | butt | square | round = null,
    castShadows: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    join: miter | bevel | round = null,
    material: PathSymbol3DLayerMaterialProperties = null,
    profile: circle | quad = null,
    profileRotation: heading | all = null,
    size: Int | Double = null,
    width: Int | Double = null
  ): PathSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (cap != null) __obj.updateDynamic("cap")(cap.asInstanceOf[js.Any])
    if (!js.isUndefined(castShadows)) __obj.updateDynamic("castShadows")(castShadows.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (join != null) __obj.updateDynamic("join")(join.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (profileRotation != null) __obj.updateDynamic("profileRotation")(profileRotation.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathSymbol3DLayerProperties]
  }
}

