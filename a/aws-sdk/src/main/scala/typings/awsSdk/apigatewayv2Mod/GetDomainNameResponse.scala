package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainNameResponse extends js.Object {
  /**
    * The API mapping selection expression.
    */
  var ApiMappingSelectionExpression: js.UndefOr[SelectionExpression] = js.native
  /**
    * The name of the DomainName resource.
    */
  var DomainName: js.UndefOr[StringWithLengthBetween1And512] = js.native
  /**
    * The domain name configurations.
    */
  var DomainNameConfigurations: js.UndefOr[typings.awsSdk.apigatewayv2Mod.DomainNameConfigurations] = js.native
  /**
    * The collection of tags associated with a domain name.
    */
  var Tags: js.UndefOr[typings.awsSdk.apigatewayv2Mod.Tags] = js.native
}

object GetDomainNameResponse {
  @scala.inline
  def apply(
    ApiMappingSelectionExpression: SelectionExpression = null,
    DomainName: StringWithLengthBetween1And512 = null,
    DomainNameConfigurations: DomainNameConfigurations = null,
    Tags: Tags = null
  ): GetDomainNameResponse = {
    val __obj = js.Dynamic.literal()
    if (ApiMappingSelectionExpression != null) __obj.updateDynamic("ApiMappingSelectionExpression")(ApiMappingSelectionExpression.asInstanceOf[js.Any])
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName.asInstanceOf[js.Any])
    if (DomainNameConfigurations != null) __obj.updateDynamic("DomainNameConfigurations")(DomainNameConfigurations.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainNameResponse]
  }
}

