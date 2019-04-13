package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineActivity extends js.Object {
  /**
    * Adds other attributes based on existing attributes in the message.
    */
  var addAttributes: js.UndefOr[AddAttributesActivity] = js.undefined
  /**
    * Determines the source of the messages to be processed.
    */
  var channel: js.UndefOr[ChannelActivity] = js.undefined
  /**
    * Specifies where to store the processed message data.
    */
  var datastore: js.UndefOr[DatastoreActivity] = js.undefined
  /**
    * Adds data from the AWS IoT device registry to your message.
    */
  var deviceRegistryEnrich: js.UndefOr[DeviceRegistryEnrichActivity] = js.undefined
  /**
    * Adds information from the AWS IoT Device Shadows service to a message.
    */
  var deviceShadowEnrich: js.UndefOr[DeviceShadowEnrichActivity] = js.undefined
  /**
    * Filters a message based on its attributes.
    */
  var filter: js.UndefOr[FilterActivity] = js.undefined
  /**
    * Runs a Lambda function to modify the message.
    */
  var lambda: js.UndefOr[LambdaActivity] = js.undefined
  /**
    * Computes an arithmetic expression using the message's attributes and adds it to the message.
    */
  var math: js.UndefOr[MathActivity] = js.undefined
  /**
    * Removes attributes from a message.
    */
  var removeAttributes: js.UndefOr[RemoveAttributesActivity] = js.undefined
  /**
    * Creates a new message using only the specified attributes from the original message. 
    */
  var selectAttributes: js.UndefOr[SelectAttributesActivity] = js.undefined
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
    if (addAttributes != null) __obj.updateDynamic("addAttributes")(addAttributes)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (datastore != null) __obj.updateDynamic("datastore")(datastore)
    if (deviceRegistryEnrich != null) __obj.updateDynamic("deviceRegistryEnrich")(deviceRegistryEnrich)
    if (deviceShadowEnrich != null) __obj.updateDynamic("deviceShadowEnrich")(deviceShadowEnrich)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (lambda != null) __obj.updateDynamic("lambda")(lambda)
    if (math != null) __obj.updateDynamic("math")(math)
    if (removeAttributes != null) __obj.updateDynamic("removeAttributes")(removeAttributes)
    if (selectAttributes != null) __obj.updateDynamic("selectAttributes")(selectAttributes)
    __obj.asInstanceOf[PipelineActivity]
  }
}

