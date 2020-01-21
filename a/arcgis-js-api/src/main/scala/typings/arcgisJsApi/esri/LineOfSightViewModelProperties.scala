package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineOfSightViewModelProperties extends js.Object {
  /**
    * The observer's viewpoint from which lines of sight will be drawn towards the targets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#observer)
    */
  var observer: js.UndefOr[PointProperties] = js.undefined
  /**
    * A collection of [LineOfSightTarget](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightTarget.html) containing the target location and the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#targets)
    */
  var targets: js.UndefOr[CollectionProperties[LineOfSightTargetProperties]] = js.undefined
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightViewModel.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.undefined
}

object LineOfSightViewModelProperties {
  @scala.inline
  def apply(
    observer: PointProperties = null,
    targets: CollectionProperties[LineOfSightTargetProperties] = null,
    view: SceneViewProperties = null
  ): LineOfSightViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (observer != null) __obj.updateDynamic("observer")(observer.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineOfSightViewModelProperties]
  }
}

