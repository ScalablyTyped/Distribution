package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineActivity extends js.Object {
  /**
    * Adds other attributes based on existing attributes in the message.
    */
  var addAttributes: js.UndefOr[AddAttributesActivity] = js.native
  /**
    * Determines the source of the messages to be processed.
    */
  var channel: js.UndefOr[ChannelActivity] = js.native
  /**
    * Specifies where to store the processed message data.
    */
  var datastore: js.UndefOr[DatastoreActivity] = js.native
  /**
    * Adds data from the AWS IoT device registry to your message.
    */
  var deviceRegistryEnrich: js.UndefOr[DeviceRegistryEnrichActivity] = js.native
  /**
    * Adds information from the AWS IoT Device Shadows service to a message.
    */
  var deviceShadowEnrich: js.UndefOr[DeviceShadowEnrichActivity] = js.native
  /**
    * Filters a message based on its attributes.
    */
  var filter: js.UndefOr[FilterActivity] = js.native
  /**
    * Runs a Lambda function to modify the message.
    */
  var lambda: js.UndefOr[LambdaActivity] = js.native
  /**
    * Computes an arithmetic expression using the message's attributes and adds it to the message.
    */
  var math: js.UndefOr[MathActivity] = js.native
  /**
    * Removes attributes from a message.
    */
  var removeAttributes: js.UndefOr[RemoveAttributesActivity] = js.native
  /**
    * Creates a new message using only the specified attributes from the original message. 
    */
  var selectAttributes: js.UndefOr[SelectAttributesActivity] = js.native
}

object PipelineActivity {
  @scala.inline
  def apply(
    addAttributes: AddAttributesActivity = null,
    channel: ChannelActivity = null,
    datastore: DatastoreActivity = null,
    deviceRegistryEnrich: DeviceRegistryEnrichActivity = null,
    deviceShadowEnrich: DeviceShadowEnrichActivity = null,
    filter: FilterActivity = null,
    lambda: LambdaActivity = null,
    math: MathActivity = null,
    removeAttributes: RemoveAttributesActivity = null,
    selectAttributes: SelectAttributesActivity = null
  ): PipelineActivity = {
    val __obj = js.Dynamic.literal()
    if (addAttributes != null) __obj.updateDynamic("addAttributes")(addAttributes.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (datastore != null) __obj.updateDynamic("datastore")(datastore.asInstanceOf[js.Any])
    if (deviceRegistryEnrich != null) __obj.updateDynamic("deviceRegistryEnrich")(deviceRegistryEnrich.asInstanceOf[js.Any])
    if (deviceShadowEnrich != null) __obj.updateDynamic("deviceShadowEnrich")(deviceShadowEnrich.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (lambda != null) __obj.updateDynamic("lambda")(lambda.asInstanceOf[js.Any])
    if (math != null) __obj.updateDynamic("math")(math.asInstanceOf[js.Any])
    if (removeAttributes != null) __obj.updateDynamic("removeAttributes")(removeAttributes.asInstanceOf[js.Any])
    if (selectAttributes != null) __obj.updateDynamic("selectAttributes")(selectAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineActivity]
  }
}

