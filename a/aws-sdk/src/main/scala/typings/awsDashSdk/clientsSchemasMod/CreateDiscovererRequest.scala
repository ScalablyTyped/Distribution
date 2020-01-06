package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDiscovererRequest extends js.Object {
  /**
    * A description for the discoverer.
    */
  var Description: js.UndefOr[__stringMin0Max256] = js.native
  /**
    * The ARN of the event bus.
    */
  var SourceArn: __stringMin20Max1600 = js.native
  /**
    * Tags associated with the resource.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsSchemasMod.Tags] = js.native
}

object CreateDiscovererRequest {
  @scala.inline
  def apply(SourceArn: __stringMin20Max1600, Description: __stringMin0Max256 = null, Tags: Tags = null): CreateDiscovererRequest = {
    val __obj = js.Dynamic.literal(SourceArn = SourceArn.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDiscovererRequest]
  }
}

