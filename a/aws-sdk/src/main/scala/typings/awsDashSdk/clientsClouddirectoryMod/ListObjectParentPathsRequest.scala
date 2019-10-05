package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListObjectParentPathsRequest extends js.Object {
  /**
    * The ARN of the directory to which the parent path applies.
    */
  var DirectoryArn: Arn
  /**
    * The maximum number of items to be retrieved in a single call. This is an approximate number.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  /**
    * The reference that identifies the object whose parent paths are listed.
    */
  var ObjectReference: typings.awsDashSdk.clientsClouddirectoryMod.ObjectReference
}

object ListObjectParentPathsRequest {
  @scala.inline
  def apply(
    DirectoryArn: Arn,
    ObjectReference: ObjectReference,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): ListObjectParentPathsRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn, ObjectReference = ObjectReference)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListObjectParentPathsRequest]
  }
}

