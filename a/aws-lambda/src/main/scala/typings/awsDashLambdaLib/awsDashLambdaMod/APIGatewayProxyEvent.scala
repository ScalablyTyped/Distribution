package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait APIGatewayProxyEvent extends js.Object {
  var body: java.lang.String | scala.Null
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var httpMethod: java.lang.String
  var isBase64Encoded: scala.Boolean
  var multiValueHeaders: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  var multiValueQueryStringParameters: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] | scala.Null
  var path: java.lang.String
  var pathParameters: org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null
  var queryStringParameters: org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null
  var requestContext: APIGatewayEventRequestContext
  var resource: java.lang.String
  var stageVariables: org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null
}

