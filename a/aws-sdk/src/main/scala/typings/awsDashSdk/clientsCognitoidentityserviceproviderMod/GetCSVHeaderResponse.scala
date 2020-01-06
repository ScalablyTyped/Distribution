package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCSVHeaderResponse extends js.Object {
  /**
    * The header information for the .csv file for the user import job.
    */
  var CSVHeader: js.UndefOr[ListOfStringTypes] = js.native
  /**
    * The user pool ID for the user pool that the users are to be imported into.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.native
}

object GetCSVHeaderResponse {
  @scala.inline
  def apply(CSVHeader: ListOfStringTypes = null, UserPoolId: UserPoolIdType = null): GetCSVHeaderResponse = {
    val __obj = js.Dynamic.literal()
    if (CSVHeader != null) __obj.updateDynamic("CSVHeader")(CSVHeader.asInstanceOf[js.Any])
    if (UserPoolId != null) __obj.updateDynamic("UserPoolId")(UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCSVHeaderResponse]
  }
}

