package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CustomAuthorizerEvent extends js.Object {
  var authorizationToken: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var methodArn: java.lang.String
  var multiValueHeaders: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Array[java.lang.String]]] = js.undefined
  var multiValueQueryStringParameters: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Array[java.lang.String]] | scala.Null] = js.undefined
  var pathParameters: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String] | scala.Null] = js.undefined
  var queryStringParameters: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String] | scala.Null] = js.undefined
  var requestContext: js.UndefOr[APIGatewayEventRequestContext] = js.undefined
  var `type`: java.lang.String
}

