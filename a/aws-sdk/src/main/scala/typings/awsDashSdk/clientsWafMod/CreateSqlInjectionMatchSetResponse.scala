package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSqlInjectionMatchSetResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateSqlInjectionMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsDashSdk.clientsWafMod.ChangeToken] = js.native
  /**
    * A SqlInjectionMatchSet.
    */
  var SqlInjectionMatchSet: js.UndefOr[typings.awsDashSdk.clientsWafMod.SqlInjectionMatchSet] = js.native
}

object CreateSqlInjectionMatchSetResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null, SqlInjectionMatchSet: SqlInjectionMatchSet = null): CreateSqlInjectionMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken.asInstanceOf[js.Any])
    if (SqlInjectionMatchSet != null) __obj.updateDynamic("SqlInjectionMatchSet")(SqlInjectionMatchSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSqlInjectionMatchSetResponse]
  }
}

