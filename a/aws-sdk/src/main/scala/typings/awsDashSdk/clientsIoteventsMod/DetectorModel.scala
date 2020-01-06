package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectorModel extends js.Object {
  /**
    * Information about how the detector is configured.
    */
  var detectorModelConfiguration: js.UndefOr[DetectorModelConfiguration] = js.native
  /**
    * Information that defines how a detector operates.
    */
  var detectorModelDefinition: js.UndefOr[DetectorModelDefinition] = js.native
}

object DetectorModel {
  @scala.inline
  def apply(
    detectorModelConfiguration: DetectorModelConfiguration = null,
    detectorModelDefinition: DetectorModelDefinition = null
  ): DetectorModel = {
    val __obj = js.Dynamic.literal()
    if (detectorModelConfiguration != null) __obj.updateDynamic("detectorModelConfiguration")(detectorModelConfiguration.asInstanceOf[js.Any])
    if (detectorModelDefinition != null) __obj.updateDynamic("detectorModelDefinition")(detectorModelDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorModel]
  }
}

