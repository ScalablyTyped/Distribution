package typings.awsDashSdk.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTagsResponse extends js.Object {
  /**
    * If the request included a Marker, the response returns that value in this field.
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsEfsMod.Marker] = js.undefined
  /**
    * If a value is present, there are more tags to return. In a subsequent request, you can provide the value of NextMarker as the value of the Marker parameter in your next request to retrieve the next set of tags.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
  /**
    * Returns tags associated with the file system as an array of Tag objects. 
    */
  var Tags: typings.awsDashSdk.clientsEfsMod.Tags
}

object DescribeTagsResponse {
  @scala.inline
  def apply(Tags: Tags, Marker: Marker = null, NextMarker: Marker = null): DescribeTagsResponse = {
    val __obj = js.Dynamic.literal(Tags = Tags)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[DescribeTagsResponse]
  }
}

