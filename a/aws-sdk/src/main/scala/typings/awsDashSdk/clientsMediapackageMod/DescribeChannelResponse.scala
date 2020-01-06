package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeChannelResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) assigned to the Channel.
    */
  var Arn: js.UndefOr[__string] = js.native
  /**
    * A short text description of the Channel.
    */
  var Description: js.UndefOr[__string] = js.native
  var HlsIngest: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.HlsIngest] = js.native
  /**
    * The ID of the Channel.
    */
  var Id: js.UndefOr[__string] = js.native
  var Tags: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.Tags] = js.native
}

object DescribeChannelResponse {
  @scala.inline
  def apply(
    Arn: __string = null,
    Description: __string = null,
    HlsIngest: HlsIngest = null,
    Id: __string = null,
    Tags: Tags = null
  ): DescribeChannelResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (HlsIngest != null) __obj.updateDynamic("HlsIngest")(HlsIngest.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChannelResponse]
  }
}

