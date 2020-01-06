package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelSpecification extends js.Object {
  /**
    * A brief description of the channel.
    */
  var Description: js.UndefOr[EntityDescription] = js.native
  /**
    * Indicates whether the channel is required by the algorithm.
    */
  var IsRequired: js.UndefOr[Boolean] = js.native
  /**
    * The name of the channel.
    */
  var Name: ChannelName = js.native
  /**
    * The allowed compression types, if data compression is used.
    */
  var SupportedCompressionTypes: js.UndefOr[CompressionTypes] = js.native
  /**
    * The supported MIME types for the data.
    */
  var SupportedContentTypes: ContentTypes = js.native
  /**
    * The allowed input mode, either FILE or PIPE. In FILE mode, Amazon SageMaker copies the data from the input source onto the local Amazon Elastic Block Store (Amazon EBS) volumes before starting your training algorithm. This is the most commonly used input mode. In PIPE mode, Amazon SageMaker streams input data from the source directly to your algorithm without using the EBS volume.
    */
  var SupportedInputModes: InputModes = js.native
}

object ChannelSpecification {
  @scala.inline
  def apply(
    Name: ChannelName,
    SupportedContentTypes: ContentTypes,
    SupportedInputModes: InputModes,
    Description: EntityDescription = null,
    IsRequired: js.UndefOr[scala.Boolean] = js.undefined,
    SupportedCompressionTypes: CompressionTypes = null
  ): ChannelSpecification = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SupportedContentTypes = SupportedContentTypes.asInstanceOf[js.Any], SupportedInputModes = SupportedInputModes.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(IsRequired)) __obj.updateDynamic("IsRequired")(IsRequired.asInstanceOf[js.Any])
    if (SupportedCompressionTypes != null) __obj.updateDynamic("SupportedCompressionTypes")(SupportedCompressionTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSpecification]
  }
}

