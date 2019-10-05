package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAttachedIndicesRequest extends js.Object {
  /**
    * The consistency level to use for this operation.
    */
  var ConsistencyLevel: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.ConsistencyLevel] = js.undefined
  /**
    * The ARN of the directory.
    */
  var DirectoryArn: Arn
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  /**
    * A reference to the object that has indices attached.
    */
  var TargetReference: ObjectReference
}

object ListAttachedIndicesRequest {
  @scala.inline
  def apply(
    DirectoryArn: Arn,
    TargetReference: ObjectReference,
    ConsistencyLevel: ConsistencyLevel = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): ListAttachedIndicesRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn, TargetReference = TargetReference)
    if (ConsistencyLevel != null) __obj.updateDynamic("ConsistencyLevel")(ConsistencyLevel.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListAttachedIndicesRequest]
  }
}

