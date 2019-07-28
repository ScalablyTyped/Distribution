package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleCondition extends js.Object {
  /**
    * The field in the HTTP request. The following are the possible values:    http-header     http-request-method     host-header     path-pattern     query-string     source-ip   
    */
  var Field: js.UndefOr[ConditionFieldName] = js.undefined
  /**
    * Information for a host header condition. Specify only when Field is host-header.
    */
  var HostHeaderConfig: js.UndefOr[HostHeaderConditionConfig] = js.undefined
  /**
    * Information for an HTTP header condition. Specify only when Field is http-header.
    */
  var HttpHeaderConfig: js.UndefOr[HttpHeaderConditionConfig] = js.undefined
  /**
    * Information for an HTTP method condition. Specify only when Field is http-request-method.
    */
  var HttpRequestMethodConfig: js.UndefOr[HttpRequestMethodConditionConfig] = js.undefined
  /**
    * Information for a path pattern condition. Specify only when Field is path-pattern.
    */
  var PathPatternConfig: js.UndefOr[PathPatternConditionConfig] = js.undefined
  /**
    * Information for a query string condition. Specify only when Field is query-string.
    */
  var QueryStringConfig: js.UndefOr[QueryStringConditionConfig] = js.undefined
  /**
    * Information for a source IP condition. Specify only when Field is source-ip.
    */
  var SourceIpConfig: js.UndefOr[SourceIpConditionConfig] = js.undefined
  /**
    * The condition value. You can use Values if the rule contains only host-header and path-pattern conditions. Otherwise, you can use HostHeaderConfig for host-header conditions and PathPatternConfig for path-pattern conditions. If Field is host-header, you can specify a single host name (for example, my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain any of the following characters.   A-Z, a-z, 0-9   - .   * (matches 0 or more characters)   ? (matches exactly 1 character)   If Field is path-pattern, you can specify a single path pattern (for example, /img/ *). A path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of the following characters.   A-Z, a-z, 0-9   _ - . $ / ~ " ' @ : +   &amp; (using &amp;amp;)   * (matches 0 or more characters)   ? (matches exactly 1 character)  
    */
  var Values: js.UndefOr[ListOfString] = js.undefined
}

object RuleCondition {
  @scala.inline
  def apply(
    Field: ConditionFieldName = null,
    HostHeaderConfig: HostHeaderConditionConfig = null,
    HttpHeaderConfig: HttpHeaderConditionConfig = null,
    HttpRequestMethodConfig: HttpRequestMethodConditionConfig = null,
    PathPatternConfig: PathPatternConditionConfig = null,
    QueryStringConfig: QueryStringConditionConfig = null,
    SourceIpConfig: SourceIpConditionConfig = null,
    Values: ListOfString = null
  ): RuleCondition = {
    val __obj = js.Dynamic.literal()
    if (Field != null) __obj.updateDynamic("Field")(Field)
    if (HostHeaderConfig != null) __obj.updateDynamic("HostHeaderConfig")(HostHeaderConfig)
    if (HttpHeaderConfig != null) __obj.updateDynamic("HttpHeaderConfig")(HttpHeaderConfig)
    if (HttpRequestMethodConfig != null) __obj.updateDynamic("HttpRequestMethodConfig")(HttpRequestMethodConfig)
    if (PathPatternConfig != null) __obj.updateDynamic("PathPatternConfig")(PathPatternConfig)
    if (QueryStringConfig != null) __obj.updateDynamic("QueryStringConfig")(QueryStringConfig)
    if (SourceIpConfig != null) __obj.updateDynamic("SourceIpConfig")(SourceIpConfig)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[RuleCondition]
  }
}

