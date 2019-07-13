package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDomainNameResponse extends js.Object {
  /**
    * The API mapping selection expression.
    */
  var ApiMappingSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
  /**
    * The name of the DomainName resource.
    */
  var DomainName: js.UndefOr[StringWithLengthBetween1And512] = js.undefined
  /**
    * The domain name configurations.
    */
  var DomainNameConfigurations: js.UndefOr[DomainNameConfigurations] = js.undefined
  /**
    * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters..
    */
  var Tags: js.UndefOr[Tags] = js.undefined
}

object UpdateDomainNameResponse {
  @scala.inline
  def apply(
    ApiMappingSelectionExpression: SelectionExpression = null,
    DomainName: StringWithLengthBetween1And512 = null,
    DomainNameConfigurations: DomainNameConfigurations = null,
    Tags: Tags = null
  ): UpdateDomainNameResponse = {
    val __obj = js.Dynamic.literal()
    if (ApiMappingSelectionExpression != null) __obj.updateDynamic("ApiMappingSelectionExpression")(ApiMappingSelectionExpression)
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName)
    if (DomainNameConfigurations != null) __obj.updateDynamic("DomainNameConfigurations")(DomainNameConfigurations)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[UpdateDomainNameResponse]
  }
}

