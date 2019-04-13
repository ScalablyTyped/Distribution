package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpHeaderConditionConfig extends js.Object {
  var HttpHeaderName: js.UndefOr[HttpHeaderConditionName] = js.undefined
  var Values: js.UndefOr[ListOfString] = js.undefined
}

object HttpHeaderConditionConfig {
  @scala.inline
  def apply(HttpHeaderName: HttpHeaderConditionName = null, Values: ListOfString = null): HttpHeaderConditionConfig = {
    val __obj = js.Dynamic.literal()
    if (HttpHeaderName != null) __obj.updateDynamic("HttpHeaderName")(HttpHeaderName)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[HttpHeaderConditionConfig]
  }
}

