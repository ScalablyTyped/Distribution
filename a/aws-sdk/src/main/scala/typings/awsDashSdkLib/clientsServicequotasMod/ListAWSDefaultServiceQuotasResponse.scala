package typings
package awsDashSdkLib.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAWSDefaultServiceQuotasResponse extends js.Object {
  /**
    * (Optional) Use this parameter in a request if you receive a NextToken response in a previous request that indicates that there's more output available. In a subsequent call, set it to the value of the previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of the quotas in the account with the AWS default values. 
    */
  var Quotas: js.UndefOr[ServiceQuotaListDefinition] = js.undefined
}

object ListAWSDefaultServiceQuotasResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Quotas: ServiceQuotaListDefinition = null): ListAWSDefaultServiceQuotasResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Quotas != null) __obj.updateDynamic("Quotas")(Quotas)
    __obj.asInstanceOf[ListAWSDefaultServiceQuotasResponse]
  }
}

