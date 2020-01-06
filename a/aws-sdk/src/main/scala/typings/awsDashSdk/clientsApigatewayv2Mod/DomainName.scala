package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainName extends js.Object {
  /**
    * The API mapping selection expression.
    */
  var ApiMappingSelectionExpression: js.UndefOr[SelectionExpression] = js.native
  /**
    * The name of the DomainName resource.
    */
  var DomainName: StringWithLengthBetween1And512 = js.native
  /**
    * The domain name configurations.
    */
  var DomainNameConfigurations: js.UndefOr[typings.awsDashSdk.clientsApigatewayv2Mod.DomainNameConfigurations] = js.native
  /**
    * The collection of tags associated with a domain name.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsApigatewayv2Mod.Tags] = js.native
}

object DomainName {
  @scala.inline
  def apply(
    DomainName: StringWithLengthBetween1And512,
    ApiMappingSelectionExpression: SelectionExpression = null,
    DomainNameConfigurations: DomainNameConfigurations = null,
    Tags: Tags = null
  ): DomainName = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    if (ApiMappingSelectionExpression != null) __obj.updateDynamic("ApiMappingSelectionExpression")(ApiMappingSelectionExpression.asInstanceOf[js.Any])
    if (DomainNameConfigurations != null) __obj.updateDynamic("DomainNameConfigurations")(DomainNameConfigurations.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainName]
  }
}

