package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMultiplexRequest extends js.Object {
  /**
    * A list of availability zones for the multiplex. You must specify exactly two.
    */
  var AvailabilityZones: __listOf__string = js.native
  /**
    * Configuration for a multiplex event.
    */
  var MultiplexSettings: typings.awsDashSdk.clientsMedialiveMod.MultiplexSettings = js.native
  /**
    * Name of multiplex.
    */
  var Name: __string = js.native
  /**
    * Unique request ID. This prevents retries from creating multiple
  resources.
    */
  var RequestId: __string = js.native
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Tags] = js.native
}

object CreateMultiplexRequest {
  @scala.inline
  def apply(
    AvailabilityZones: __listOf__string,
    MultiplexSettings: MultiplexSettings,
    Name: __string,
    RequestId: __string,
    Tags: Tags = null
  ): CreateMultiplexRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZones = AvailabilityZones.asInstanceOf[js.Any], MultiplexSettings = MultiplexSettings.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMultiplexRequest]
  }
}

