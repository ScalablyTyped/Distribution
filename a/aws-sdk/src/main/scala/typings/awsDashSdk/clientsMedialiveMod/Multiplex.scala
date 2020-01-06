package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Multiplex extends js.Object {
  /**
    * The unique arn of the multiplex.
    */
  var Arn: js.UndefOr[__string] = js.native
  /**
    * A list of availability zones for the multiplex.
    */
  var AvailabilityZones: js.UndefOr[__listOf__string] = js.native
  /**
    * A list of the multiplex output destinations.
    */
  var Destinations: js.UndefOr[__listOfMultiplexOutputDestination] = js.native
  /**
    * The unique id of the multiplex.
    */
  var Id: js.UndefOr[__string] = js.native
  /**
    * Configuration for a multiplex event.
    */
  var MultiplexSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.MultiplexSettings] = js.native
  /**
    * The name of the multiplex.
    */
  var Name: js.UndefOr[__string] = js.native
  /**
    * The number of currently healthy pipelines.
    */
  var PipelinesRunningCount: js.UndefOr[__integer] = js.native
  /**
    * The number of programs in the multiplex.
    */
  var ProgramCount: js.UndefOr[__integer] = js.native
  /**
    * The current state of the multiplex.
    */
  var State: js.UndefOr[MultiplexState] = js.native
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Tags] = js.native
}

object Multiplex {
  @scala.inline
  def apply(
    Arn: __string = null,
    AvailabilityZones: __listOf__string = null,
    Destinations: __listOfMultiplexOutputDestination = null,
    Id: __string = null,
    MultiplexSettings: MultiplexSettings = null,
    Name: __string = null,
    PipelinesRunningCount: Int | Double = null,
    ProgramCount: Int | Double = null,
    State: MultiplexState = null,
    Tags: Tags = null
  ): Multiplex = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (Destinations != null) __obj.updateDynamic("Destinations")(Destinations.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (MultiplexSettings != null) __obj.updateDynamic("MultiplexSettings")(MultiplexSettings.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (PipelinesRunningCount != null) __obj.updateDynamic("PipelinesRunningCount")(PipelinesRunningCount.asInstanceOf[js.Any])
    if (ProgramCount != null) __obj.updateDynamic("ProgramCount")(ProgramCount.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Multiplex]
  }
}

