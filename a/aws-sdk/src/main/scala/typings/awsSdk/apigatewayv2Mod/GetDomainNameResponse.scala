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
  def apply(): GetDomainNameResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDomainNameResponse]
  }
  @scala.inline
  implicit class GetDomainNameResponseOps[Self <: GetDomainNameResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiMappingSelectionExpression(value: SelectionExpression): Self = this.set("ApiMappingSelectionExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiMappingSelectionExpression: Self = this.set("ApiMappingSelectionExpression", js.undefined)
    @scala.inline
    def setDomainName(value: StringWithLengthBetween1And512): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("DomainName", js.undefined)
    @scala.inline
    def setDomainNameConfigurationsVarargs(value: DomainNameConfiguration*): Self = this.set("DomainNameConfigurations", js.Array(value :_*))
    @scala.inline
    def setDomainNameConfigurations(value: DomainNameConfigurations): Self = this.set("DomainNameConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainNameConfigurations: Self = this.set("DomainNameConfigurations", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

