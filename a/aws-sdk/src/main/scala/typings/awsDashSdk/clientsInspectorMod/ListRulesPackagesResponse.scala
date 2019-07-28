package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRulesPackagesResponse extends js.Object {
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The list of ARNs that specifies the rules packages returned by the action.
    */
  var rulesPackageArns: ListReturnedArnList
}

object ListRulesPackagesResponse {
  @scala.inline
  def apply(rulesPackageArns: ListReturnedArnList, nextToken: PaginationToken = null): ListRulesPackagesResponse = {
    val __obj = js.Dynamic.literal(rulesPackageArns = rulesPackageArns)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListRulesPackagesResponse]
  }
}

