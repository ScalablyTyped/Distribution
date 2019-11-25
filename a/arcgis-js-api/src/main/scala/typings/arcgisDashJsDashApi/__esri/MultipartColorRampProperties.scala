package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipartColorRampProperties extends ColorRampProperties {
  /**
    * Define an array of algorithmic color ramps used to generate the multi part ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-MultipartColorRamp.html#colorRamps)
    */
  var colorRamps: js.UndefOr[js.Array[AlgorithmicColorRampProperties]] = js.undefined
}

object MultipartColorRampProperties {
  @scala.inline
  def apply(colorRamps: js.Array[AlgorithmicColorRampProperties] = null): MultipartColorRampProperties = {
    val __obj = js.Dynamic.literal()
    if (colorRamps != null) __obj.updateDynamic("colorRamps")(colorRamps.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipartColorRampProperties]
  }
}

