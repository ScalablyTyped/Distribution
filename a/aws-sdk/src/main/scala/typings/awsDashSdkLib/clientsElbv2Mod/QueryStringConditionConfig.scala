package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryStringConditionConfig extends js.Object {
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

