package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneViewConstraints extends AnonymousAccessor {
  /**
    * Specifies a constraint on the minimum and maximum allowed camera altitude.
    * > **Known Limitations**  The `altitude` constraint is only supported in scenes with `global` [viewingMode](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewingMode).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var altitude: js.UndefOr[SceneViewConstraintsAltitude] = js.native
  /**
    * Specifies the near and far webgl clip distances.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var clipDistance: js.UndefOr[SceneViewConstraintsClipDistance] = js.native
  /**
    * When enabled, prevents the user from navigating below the surface in a local SceneView.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var collision: js.UndefOr[SceneViewConstraintsCollision] = js.native
  /**
    * Specifies a constraint on the amount of allowed tilting of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var tilt: js.UndefOr[SceneViewConstraintsTilt] = js.native
}

object SceneViewConstraints {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[
      js.Function2[/* propertyName */ String, /* value */ js.Any, SceneViewConstraints]
    ]) with (js.UndefOr[js.Function1[/* props */ HashMap[_], SceneViewConstraints]])
  ): SceneViewConstraints = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewConstraints]
  }
  @scala.inline
  implicit class SceneViewConstraintsOps[Self <: SceneViewConstraints] (val x: Self) extends AnyVal {
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
    def setAltitude(value: SceneViewConstraintsAltitude): Self = this.set("altitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltitude: Self = this.set("altitude", js.undefined)
    @scala.inline
    def setClipDistance(value: SceneViewConstraintsClipDistance): Self = this.set("clipDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipDistance: Self = this.set("clipDistance", js.undefined)
    @scala.inline
    def setCollision(value: SceneViewConstraintsCollision): Self = this.set("collision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollision: Self = this.set("collision", js.undefined)
    @scala.inline
    def setTilt(value: SceneViewConstraintsTilt): Self = this.set("tilt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTilt: Self = this.set("tilt", js.undefined)
  }
  
}

