package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoToProperties extends js.Object {
  /**
    * This function provides the ability to override either the [MapView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo) or [SceneView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo) methods.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GoTo.html#goToOverride)
    */
  var goToOverride: js.UndefOr[GoToOverride] = js.undefined
}

object GoToProperties {
  @scala.inline
  def apply(goToOverride: (/* view */ MapView | SceneView, /* goToParameters */ GoToParameters) => Unit = null): GoToProperties = {
    val __obj = js.Dynamic.literal()
    if (goToOverride != null) __obj.updateDynamic("goToOverride")(js.Any.fromFunction2(goToOverride))
    __obj.asInstanceOf[GoToProperties]
  }
}

