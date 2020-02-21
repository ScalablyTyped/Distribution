package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apiGatewayAuthorizerMod {
  type AuthResponse = typings.awsLambda.apiGatewayAuthorizerMod.CustomAuthorizerResult
  type Condition = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type ConditionBlock = org.scalablytyped.runtime.StringDictionary[
    typings.awsLambda.apiGatewayAuthorizerMod.Condition | js.Array[typings.awsLambda.apiGatewayAuthorizerMod.Condition]
  ]
  type CustomAuthorizerCallback = typings.awsLambda.handerMod.Callback[typings.awsLambda.apiGatewayAuthorizerMod.CustomAuthorizerResult]
  type CustomAuthorizerHandler = typings.awsLambda.handerMod.Handler[
    typings.awsLambda.apiGatewayAuthorizerMod.CustomAuthorizerEvent, 
    typings.awsLambda.apiGatewayAuthorizerMod.CustomAuthorizerResult
  ]
  type PrincipalValue = (org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]) | java.lang.String | js.Array[java.lang.String]
  type Statement = typings.awsLambda.apiGatewayAuthorizerMod.BaseStatement with typings.awsLambda.apiGatewayAuthorizerMod.StatementAction with (typings.awsLambda.apiGatewayAuthorizerMod.StatementResource | typings.awsLambda.apiGatewayAuthorizerMod.StatementPrincipal)
  type StatementPrincipal = typings.awsLambda.apiGatewayAuthorizerMod.MaybeStatementResource with (typings.awsLambda.AnonPrincipal | typings.awsLambda.AnonNotPrincipal)
  type StatementResource = typings.awsLambda.apiGatewayAuthorizerMod.MaybeStatementPrincipal with (typings.awsLambda.AnonResource | typings.awsLambda.AnonNotResource)
}
