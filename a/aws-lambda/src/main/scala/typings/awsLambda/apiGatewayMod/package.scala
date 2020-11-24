package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object apiGatewayMod {
  
  type APIGatewayAuthorizerResultContext = org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null]]
  
  type APIGatewayEventDefaultAuthorizerContext = js.UndefOr[scala.Null | org.scalablytyped.runtime.StringDictionary[js.Any]]
  
  type APIGatewayEventRequestContext = typings.awsLambda.apiGatewayMod.APIGatewayEventRequestContextWithAuthorizer[typings.awsLambda.apiGatewayMod.APIGatewayEventDefaultAuthorizerContext]
}
