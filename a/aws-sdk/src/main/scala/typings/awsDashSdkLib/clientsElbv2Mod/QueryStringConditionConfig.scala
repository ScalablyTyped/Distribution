package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryStringConditionConfig extends js.Object {
  /**
    * One or more key/value pairs or values to find in the query string. The maximum size of each string is 128 characters. The comparison is case insensitive. The following wildcard characters are supported: * (matches 0 or more characters) and ? (matches exactly 1 character). To search for a literal '*' or '?' character in a query string, you must escape these characters in Values using a '\' character. If you specify multiple key/value pairs or values, the condition is satisfied if one of them is found in the query string.
    */
  var Values: js.UndefOr[QueryStringKeyValuePairList] = js.undefined
}

object QueryStringConditionConfig {
  @scala.inline
  def apply(Values: QueryStringKeyValuePairList = null): QueryStringConditionConfig = {
    val __obj = js.Dynamic.literal()
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[QueryStringConditionConfig]
  }
}

