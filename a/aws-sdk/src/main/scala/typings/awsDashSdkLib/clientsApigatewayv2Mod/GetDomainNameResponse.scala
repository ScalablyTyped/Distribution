package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainNameResponse extends js.Object {
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
}

object GetDomainNameResponse {
  @scala.inline
  def apply(
    ApiMappingSelectionExpression: SelectionExpression = null,
    DomainName: StringWithLengthBetween1And512 = null,
    DomainNameConfigurations: DomainNameConfigurations = null
  ): GetDomainNameResponse = {
    val __obj = js.Dynamic.literal()
    if (ApiMappingSelectionExpression != null) __obj.updateDynamic("ApiMappingSelectionExpression")(ApiMappingSelectionExpression)
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName)
    if (DomainNameConfigurations != null) __obj.updateDynamic("DomainNameConfigurations")(DomainNameConfigurations)
    __obj.asInstanceOf[GetDomainNameResponse]
  }
}

