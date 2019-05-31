package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectorModel extends js.Object {
  /**
    * Information about how the detector is configured.
    */
  var detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration] = js.undefined
  /**
    * Information that defines how a detector operates.
    */
  var detectorModelDefinition: js.UndefOr[DetectorModelDefinition] = js.undefined
}

object DetectorModel {
  @scala.inline
  def apply(
    detectorModelConfiguration: DetectorModelConfiguration = null,
    detectorModelDefinition: DetectorModelDefinition = null
  ): DetectorModel = {
    val __obj = js.Dynamic.literal()
    if (detectorModelConfiguration != null) __obj.updateDynamic("detectorModelConfiguration")(detectorModelConfiguration)
    if (detectorModelDefinition != null) __obj.updateDynamic("detectorModelDefinition")(detectorModelDefinition)
    __obj.asInstanceOf[DetectorModel]
  }
}

