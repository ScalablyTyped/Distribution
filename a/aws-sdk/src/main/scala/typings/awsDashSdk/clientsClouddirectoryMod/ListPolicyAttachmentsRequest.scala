package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPolicyAttachmentsRequest extends js.Object {
  /**
    * Represents the manner and timing in which the successful write or update of an object is reflected in a subsequent read operation of that same object.
    */
  var ConsistencyLevel: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.ConsistencyLevel] = js.undefined
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where objects reside. For more information, see arns.
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
    * The reference that identifies the policy object.
    */
  var PolicyReference: ObjectReference
}

object ListPolicyAttachmentsRequest {
  @scala.inline
  def apply(
    DirectoryArn: Arn,
    PolicyReference: ObjectReference,
    ConsistencyLevel: ConsistencyLevel = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): ListPolicyAttachmentsRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn, PolicyReference = PolicyReference)
    if (ConsistencyLevel != null) __obj.updateDynamic("ConsistencyLevel")(ConsistencyLevel.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListPolicyAttachmentsRequest]
  }
}

