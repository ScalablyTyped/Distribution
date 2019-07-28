package typings.awsDashSdk.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutEventSelectorsResponse extends js.Object {
  /**
    * Specifies the event selectors configured for your trail.
    */
  var EventSelectors: js.UndefOr[typings.awsDashSdk.clientsCloudtrailMod.EventSelectors] = js.undefined
  /**
    * Specifies the ARN of the trail that was updated with event selectors. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var TrailARN: js.UndefOr[String] = js.undefined
}

object PutEventSelectorsResponse {
  @scala.inline
  def apply(EventSelectors: EventSelectors = null, TrailARN: String = null): PutEventSelectorsResponse = {
    val __obj = js.Dynamic.literal()
    if (EventSelectors != null) __obj.updateDynamic("EventSelectors")(EventSelectors)
    if (TrailARN != null) __obj.updateDynamic("TrailARN")(TrailARN)
    __obj.asInstanceOf[PutEventSelectorsResponse]
  }
}

