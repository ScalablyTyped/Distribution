package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListQualificationTypesRequest extends js.Object {
  /**
    *  The maximum number of results to return in a single call. 
    */
  var MaxResults: js.UndefOr[ResultSize] = js.native
  /**
    *  Specifies that only Qualification types that the Requester created are returned. If false, the operation returns all Qualification types. 
    */
  var MustBeOwnedByCaller: js.UndefOr[Boolean] = js.native
  /**
    * Specifies that only Qualification types that a user can request through the Amazon Mechanical Turk web site, such as by taking a Qualification test, are returned as results of the search. Some Qualification types, such as those assigned automatically by the system, cannot be requested directly by users. If false, all Qualification types, including those managed by the system, are considered. Valid values are True | False. 
    */
  var MustBeRequestable: Boolean = js.native
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  A text query against all of the searchable attributes of Qualification types. 
    */
  var Query: js.UndefOr[String] = js.native
}

object ListQualificationTypesRequest {
  @scala.inline
  def apply(
    MustBeRequestable: Boolean,
    MaxResults: Int | Double = null,
    MustBeOwnedByCaller: js.UndefOr[scala.Boolean] = js.undefined,
    NextToken: PaginationToken = null,
    Query: String = null
  ): ListQualificationTypesRequest = {
    val __obj = js.Dynamic.literal(MustBeRequestable = MustBeRequestable.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (!js.isUndefined(MustBeOwnedByCaller)) __obj.updateDynamic("MustBeOwnedByCaller")(MustBeOwnedByCaller.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Query != null) __obj.updateDynamic("Query")(Query.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQualificationTypesRequest]
  }
}

