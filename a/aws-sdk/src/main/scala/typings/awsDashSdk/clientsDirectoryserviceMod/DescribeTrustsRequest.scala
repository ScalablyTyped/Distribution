package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTrustsRequest extends js.Object {
  /**
    * The Directory ID of the AWS directory that is a part of the requested trust relationship.
    */
  var DirectoryId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId] = js.undefined
  /**
    * The maximum number of objects to return.
    */
  var Limit: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.Limit] = js.undefined
  /**
    * The DescribeTrustsResult.NextToken value from a previous call to DescribeTrusts. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
  /**
    * A list of identifiers of the trust relationships for which to obtain the information. If this member is null, all trust relationships that belong to the current account are returned. An empty list results in an InvalidParameterException being thrown.
    */
  var TrustIds: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.TrustIds] = js.undefined
}

object DescribeTrustsRequest {
  @scala.inline
  def apply(
    DirectoryId: DirectoryId = null,
    Limit: Int | Double = null,
    NextToken: NextToken = null,
    TrustIds: TrustIds = null
  ): DescribeTrustsRequest = {
    val __obj = js.Dynamic.literal()
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId)
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (TrustIds != null) __obj.updateDynamic("TrustIds")(TrustIds)
    __obj.asInstanceOf[DescribeTrustsRequest]
  }
}

