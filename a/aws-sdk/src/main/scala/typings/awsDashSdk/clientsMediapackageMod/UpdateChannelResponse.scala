package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateChannelResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) assigned to the Channel.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * A short text description of the Channel.
    */
  var Description: js.UndefOr[__string] = js.undefined
  var HlsIngest: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.HlsIngest] = js.undefined
  /**
    * The ID of the Channel.
    */
  var Id: js.UndefOr[__string] = js.undefined
  var Tags: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.Tags] = js.undefined
}

object UpdateChannelResponse {
  @scala.inline
  def apply(
    Arn: __string = null,
    Description: __string = null,
    HlsIngest: HlsIngest = null,
    Id: __string = null,
    Tags: Tags = null
  ): UpdateChannelResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (HlsIngest != null) __obj.updateDynamic("HlsIngest")(HlsIngest)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[UpdateChannelResponse]
  }
}

