package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpHeaderConditionConfig extends js.Object {
  /**
    * The name of the HTTP header field. The maximum size is 40 characters. The header name is case insensitive. The allowed characters are specified by RFC 7230. Wildcards are not supported. You can't use an HTTP header condition to specify the host header. Use HostHeaderConditionConfig to specify a host header condition.
    */
  var HttpHeaderName: js.UndefOr[HttpHeaderConditionName] = js.undefined
  /**
    * One or more strings to compare against the value of the HTTP header. The maximum size of each string is 128 characters. The comparison strings are case insensitive. The following wildcard characters are supported: * (matches 0 or more characters) and ? (matches exactly 1 character). If the same header appears multiple times in the request, we search them in order until a match is found. If you specify multiple strings, the condition is satisfied if one of the strings matches the value of the HTTP header. To require that all of the strings are a match, create one condition per string.
    */
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

