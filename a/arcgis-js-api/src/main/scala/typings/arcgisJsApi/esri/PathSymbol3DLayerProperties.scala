package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.all
import typings.arcgisJsApi.arcgisJsApiStrings.bevel
import typings.arcgisJsApi.arcgisJsApiStrings.bottom
import typings.arcgisJsApi.arcgisJsApiStrings.butt
import typings.arcgisJsApi.arcgisJsApiStrings.center
import typings.arcgisJsApi.arcgisJsApiStrings.circle
import typings.arcgisJsApi.arcgisJsApiStrings.heading
import typings.arcgisJsApi.arcgisJsApiStrings.miter
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.quad
import typings.arcgisJsApi.arcgisJsApiStrings.round
import typings.arcgisJsApi.arcgisJsApiStrings.square
import typings.arcgisJsApi.arcgisJsApiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var anchor: js.UndefOr[center | bottom | top] = js.native
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
  var cap: js.UndefOr[none | butt | square | round] = js.native
  /**
    * Indicates whether the symbol layer geometry casts shadows in the scene. Setting this property to `false` will disable shadows for the symbol layer even if direct shadows are enabled in [SceneView.environment](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#castShadows)
    *
    * @default true
    */
  var castShadows: js.UndefOr[Boolean] = js.native
  /**
    * The vertical dimension of the cross-section of the path in meters. If only the [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#width) is set, then the height is set to the same value as the width. If neither width nor height are set, then the path is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#height)
    */
  var height: js.UndefOr[Double] = js.native
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
  var join: js.UndefOr[miter | bevel | round] = js.native
  /**
    * The material used to shade the path. This property defines the paths's color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#material)
    */
  var material: js.UndefOr[PathSymbol3DLayerMaterialProperties] = js.native
  /**
    * Cross-section profile of the path geometry. Setting it to `circle` creates a path with a pipe shape and setting it to `quad` gives the path a rectangular shape.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#profile)
    *
    * @default "circle"
    */
  var profile: js.UndefOr[circle | quad] = js.native
  /**
    * Defines how the [profile](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#profile) is rotated as it is extruded along the [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry. The rotation axes (heading, tilt, roll) can be limited to constrain the orientation of the profile in the scene. Setting `profileRotation` to `all` minimizes the twist along the line and ensures that the diameter of the resulting visualization corresponds to [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#width) and [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#height). Setting `profileRotation` to `"heading"` ensures that the profile stays upright (no tilt or twist).  Typically, `all` is used for `circle` profiles and `heading` is used for `quad` profiles.  As an example, when setting `heading` on a path with a `quad` profile the path is oriented upright:  ![profileRotation-heading](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/profileRotation-heading.png)  The same path with `profileRotation` set to `all` will rotate in all three degrees of freedom:  ![profileRotation-all](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/profileRotation-all.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#profileRotation)
    *
    * @default "all"
    */
  var profileRotation: js.UndefOr[heading | all] = js.native
  /**
    * Sets the width and height of the path in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#size)
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * The horizontal dimension of the cross-section of the path in meters. If only the [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#height) is set, then the width is set to the same value as the height. If neither width nor height are set, then the path is not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#width)
    */
  var width: js.UndefOr[Double] = js.native
}

object PathSymbol3DLayerProperties {
  @scala.inline
  def apply(): PathSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathSymbol3DLayerProperties]
  }
  @scala.inline
  implicit class PathSymbol3DLayerPropertiesOps[Self <: PathSymbol3DLayerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnchor(value: center | bottom | top): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setCap(value: none | butt | square | round): Self = this.set("cap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCap: Self = this.set("cap", js.undefined)
    @scala.inline
    def setCastShadows(value: Boolean): Self = this.set("castShadows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCastShadows: Self = this.set("castShadows", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setJoin(value: miter | bevel | round): Self = this.set("join", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJoin: Self = this.set("join", js.undefined)
    @scala.inline
    def setMaterial(value: PathSymbol3DLayerMaterialProperties): Self = this.set("material", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaterial: Self = this.set("material", js.undefined)
    @scala.inline
    def setProfile(value: circle | quad): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    @scala.inline
    def setProfileRotation(value: heading | all): Self = this.set("profileRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileRotation: Self = this.set("profileRotation", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

