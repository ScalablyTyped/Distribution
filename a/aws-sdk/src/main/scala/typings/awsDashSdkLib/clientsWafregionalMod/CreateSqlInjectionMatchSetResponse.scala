package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSqlInjectionMatchSetResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateSqlInjectionMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  /**
    * A SqlInjectionMatchSet.
    */
  var SqlInjectionMatchSet: js.UndefOr[SqlInjectionMatchSet] = js.undefined
}

object CreateSqlInjectionMatchSetResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null, SqlInjectionMatchSet: SqlInjectionMatchSet = null): CreateSqlInjectionMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken)
    if (SqlInjectionMatchSet != null) __obj.updateDynamic("SqlInjectionMatchSet")(SqlInjectionMatchSet)
    __obj.asInstanceOf[CreateSqlInjectionMatchSetResponse]
  }
}

