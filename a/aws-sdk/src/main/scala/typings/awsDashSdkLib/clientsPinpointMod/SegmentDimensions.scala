package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentDimensions extends js.Object {
  /**
    * Custom segment attributes.
    */
  var Attributes: js.UndefOr[MapOfAttributeDimension] = js.undefined
  /**
    * The segment behaviors attributes.
    */
  var Behavior: js.UndefOr[SegmentBehaviors] = js.undefined
  /**
    * The segment demographics attributes.
    */
  var Demographic: js.UndefOr[SegmentDemographics] = js.undefined
  /**
    * The segment location attributes.
    */
  var Location: js.UndefOr[SegmentLocation] = js.undefined
  /**
    * Custom segment metrics.
    */
  var Metrics: js.UndefOr[MapOfMetricDimension] = js.undefined
  /**
    * Custom segment user attributes.
    */
  var UserAttributes: js.UndefOr[MapOfAttributeDimension] = js.undefined
}

object SegmentDimensions {
  @scala.inline
  def apply(
    Attributes: MapOfAttributeDimension = null,
    Behavior: SegmentBehaviors = null,
    Demographic: SegmentDemographics = null,
    Location: SegmentLocation = null,
    Metrics: MapOfMetricDimension = null,
    UserAttributes: MapOfAttributeDimension = null
  ): SegmentDimensions = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (Behavior != null) __obj.updateDynamic("Behavior")(Behavior)
    if (Demographic != null) __obj.updateDynamic("Demographic")(Demographic)
    if (Location != null) __obj.updateDynamic("Location")(Location)
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics)
    if (UserAttributes != null) __obj.updateDynamic("UserAttributes")(UserAttributes)
    __obj.asInstanceOf[SegmentDimensions]
  }
}

