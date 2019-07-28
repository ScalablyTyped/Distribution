package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCommentsResponse extends js.Object {
  /**
    * The list of comments for the specified document version.
    */
  var Comments: js.UndefOr[CommentList] = js.undefined
  /**
    * The marker for the next set of results. This marker was received from a previous call.
    */
  var Marker: js.UndefOr[MarkerType] = js.undefined
}

object DescribeCommentsResponse {
  @scala.inline
  def apply(Comments: CommentList = null, Marker: MarkerType = null): DescribeCommentsResponse = {
    val __obj = js.Dynamic.literal()
    if (Comments != null) __obj.updateDynamic("Comments")(Comments)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[DescribeCommentsResponse]
  }
}

