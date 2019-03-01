package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewAnimationProperties extends js.Object {
  /**
    * The target of the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ViewAnimation.html#target)
    */
  var target: js.UndefOr[ViewpointProperties] = js.undefined
}

object ViewAnimationProperties {
  @scala.inline
  def apply(target: ViewpointProperties = null): ViewAnimationProperties = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ViewAnimationProperties]
  }
}

