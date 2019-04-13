package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAttachedIndicesRequest extends js.Object {
  /**
    * The consistency level to use for this operation.
    */
  var ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
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
  var NextToken: js.UndefOr[NextToken] = js.undefined
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
    MaxResults: js.UndefOr[NumberResults] = js.undefined,
    NextToken: NextToken = null
  ): ListAttachedIndicesRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn, TargetReference = TargetReference)
    if (ConsistencyLevel != null) __obj.updateDynamic("ConsistencyLevel")(ConsistencyLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListAttachedIndicesRequest]
  }
}

