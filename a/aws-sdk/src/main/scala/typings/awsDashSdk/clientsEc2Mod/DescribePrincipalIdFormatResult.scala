package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePrincipalIdFormatResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the ID format settings for the ARN.
    */
  var Principals: js.UndefOr[PrincipalIdFormatList] = js.native
}

object DescribePrincipalIdFormatResult {
  @scala.inline
  def apply(NextToken: String = null, Principals: PrincipalIdFormatList = null): DescribePrincipalIdFormatResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Principals != null) __obj.updateDynamic("Principals")(Principals.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePrincipalIdFormatResult]
  }
}

