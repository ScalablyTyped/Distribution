package typings
package awsDashSdkLib.clientsApigatewayv2Mod

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
  var DomainNameConfigurations: js.UndefOr[DomainNameConfigurations] = js.undefined
}

object DomainName {
  @scala.inline
  def apply(
    DomainName: StringWithLengthBetween1And512,
    ApiMappingSelectionExpression: SelectionExpression = null,
    DomainNameConfigurations: DomainNameConfigurations = null
  ): DomainName = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
    if (ApiMappingSelectionExpression != null) __obj.updateDynamic("ApiMappingSelectionExpression")(ApiMappingSelectionExpression)
    if (DomainNameConfigurations != null) __obj.updateDynamic("DomainNameConfigurations")(DomainNameConfigurations)
    __obj.asInstanceOf[DomainName]
  }
}

