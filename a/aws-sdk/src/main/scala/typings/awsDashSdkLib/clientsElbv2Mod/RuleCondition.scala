package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleCondition extends js.Object {
  /**
    * The name of the field. The possible values are host-header and path-pattern.
    */
  var Field: js.UndefOr[ConditionFieldName] = js.undefined
  var HostHeaderConfig: js.UndefOr[HostHeaderConditionConfig] = js.undefined
  var HttpHeaderConfig: js.UndefOr[HttpHeaderConditionConfig] = js.undefined
  var HttpRequestMethodConfig: js.UndefOr[HttpRequestMethodConditionConfig] = js.undefined
  var PathPatternConfig: js.UndefOr[PathPatternConditionConfig] = js.undefined
  var QueryStringConfig: js.UndefOr[QueryStringConditionConfig] = js.undefined
  var SourceIpConfig: js.UndefOr[SourceIpConditionConfig] = js.undefined
  /**
    * The condition value. If the field name is host-header, you can specify a single host name (for example, my.example.com). A host name is case insensitive, can be up to 128 characters in length, and can contain any of the following characters. You can include up to three wildcard characters.   A-Z, a-z, 0-9   - .   * (matches 0 or more characters)   ? (matches exactly 1 character)   If the field name is path-pattern, you can specify a single path pattern (for example, /img/ *). A path pattern is case-sensitive, can be up to 128 characters in length, and can contain any of the following characters. You can include up to three wildcard characters.   A-Z, a-z, 0-9   _ - . $ / ~ " ' @ : +   &amp; (using &amp;amp;)   * (matches 0 or more characters)   ? (matches exactly 1 character)  
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

