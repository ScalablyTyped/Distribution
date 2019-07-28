package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainName extends js.Object {
  /**
    * The API mapping selection expression.
    */
  var ApiMappingSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
  /**
    * The name of the DomainName resource.
    */
  var DomainName: StringWithLengthBetween1And512
  /**
    * The domain name configurations.
    */
  var DomainNameConfigurations: js.UndefOr[typings.awsDashSdk.clientsApigatewayv2Mod.DomainNameConfigurations] = js.undefined
  /**
    * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters..
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsApigatewayv2Mod.Tags] = js.undefined
}

object DomainName {
  @scala.inline
  def apply(
    DomainName: StringWithLengthBetween1And512,
    ApiMappingSelectionExpression: SelectionExpression = null,
    DomainNameConfigurations: DomainNameConfigurations = null,
    Tags: Tags = null
  ): DomainName = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
    if (ApiMappingSelectionExpression != null) __obj.updateDynamic("ApiMappingSelectionExpression")(ApiMappingSelectionExpression)
    if (DomainNameConfigurations != null) __obj.updateDynamic("DomainNameConfigurations")(DomainNameConfigurations)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[DomainName]
  }
}

