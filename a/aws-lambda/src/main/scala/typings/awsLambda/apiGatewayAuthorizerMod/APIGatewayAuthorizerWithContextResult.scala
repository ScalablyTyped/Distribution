package typings.awsLambda.apiGatewayAuthorizerMod

import typings.awsLambda.apiGatewayMod.APIGatewayAuthorizerResultContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APIGatewayAuthorizerWithContextResult[TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */] extends js.Object {
  
  var context: TAuthorizerContext = js.native
  
  var policyDocument: PolicyDocument = js.native
  
  var principalId: String = js.native
  
  var usageIdentifierKey: js.UndefOr[String | Null] = js.native
}
object APIGatewayAuthorizerWithContextResult {
  
  @scala.inline
  def apply[TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */](context: TAuthorizerContext, policyDocument: PolicyDocument, principalId: String): APIGatewayAuthorizerWithContextResult[TAuthorizerContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], policyDocument = policyDocument.asInstanceOf[js.Any], principalId = principalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayAuthorizerWithContextResult[TAuthorizerContext]]
  }
  
  @scala.inline
  implicit class APIGatewayAuthorizerWithContextResultOps[Self <: APIGatewayAuthorizerWithContextResult[_], TAuthorizerContext /* <: APIGatewayAuthorizerResultContext */] (val x: Self with APIGatewayAuthorizerWithContextResult[TAuthorizerContext]) extends AnyVal {
    
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
    def setContext(value: TAuthorizerContext): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyDocument(value: PolicyDocument): Self = this.set("policyDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalId(value: String): Self = this.set("principalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageIdentifierKey(value: String): Self = this.set("usageIdentifierKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsageIdentifierKey: Self = this.set("usageIdentifierKey", js.undefined)
    
    @scala.inline
    def setUsageIdentifierKeyNull: Self = this.set("usageIdentifierKey", null)
  }
}
