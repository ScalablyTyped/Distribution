package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentDimensions extends js.Object {
  /**
    * One or more custom attributes to use as criteria for the segment.
    */
  var Attributes: js.UndefOr[MapOfAttributeDimension] = js.undefined
  /**
    * The behavior-based criteria, such as how recently users have used your app, for the segment.
    */
  var Behavior: js.UndefOr[SegmentBehaviors] = js.undefined
  /**
    * The demographic-based criteria, such as device platform, for the segment.
    */
  var Demographic: js.UndefOr[SegmentDemographics] = js.undefined
  /**
    * The location-based criteria, such as region or GPS coordinates, for the segment.
    */
  var Location: js.UndefOr[SegmentLocation] = js.undefined
  /**
    * One or more custom metrics to use as criteria for the segment.
    */
  var Metrics: js.UndefOr[MapOfMetricDimension] = js.undefined
  /**
    * One or more custom user attributes to use as criteria for the segment.
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

