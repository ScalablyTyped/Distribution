package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait APIGatewayProxyEvent extends js.Object {
  var body: java.lang.String | scala.Null
  var headers: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  var httpMethod: java.lang.String
  var isBase64Encoded: scala.Boolean
  var multiValueHeaders: ScalablyTyped.runtime.StringDictionary[js.Array[java.lang.String]]
  var multiValueQueryStringParameters: ScalablyTyped.runtime.StringDictionary[js.Array[java.lang.String]] | scala.Null
  var path: java.lang.String
  var pathParameters: ScalablyTyped.runtime.StringDictionary[java.lang.String] | scala.Null
  var queryStringParameters: ScalablyTyped.runtime.StringDictionary[java.lang.String] | scala.Null
  var requestContext: APIGatewayEventRequestContext
  var resource: java.lang.String
  var stageVariables: ScalablyTyped.runtime.StringDictionary[java.lang.String] | scala.Null
}

