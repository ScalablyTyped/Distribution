package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceOutput extends js.Object {
  /**
    * An opaque string that indicates the position at which to stop returning the list of tags.
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Marker] = js.undefined
  /**
    * he Amazon Resource Name (ARN) of the resource for which you want to list tags.
    */
  var ResourceARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.ResourceARN] = js.undefined
  /**
    * An array that contains the tags for the specified resource.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Tags] = js.undefined
}

object ListTagsForResourceOutput {
  @scala.inline
  def apply(Marker: Marker = null, ResourceARN: ResourceARN = null, Tags: Tags = null): ListTagsForResourceOutput = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (ResourceARN != null) __obj.updateDynamic("ResourceARN")(ResourceARN)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ListTagsForResourceOutput]
  }
}

