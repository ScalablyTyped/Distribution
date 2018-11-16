package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait APIGatewayProxyResult extends js.Object {
  var body: java.lang.String
  var headers: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[scala.Boolean | scala.Double | java.lang.String]
  ] = js.undefined
  var isBase64Encoded: js.UndefOr[scala.Boolean] = js.undefined
  var multiValueHeaders: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[js.Array[scala.Boolean | scala.Double | java.lang.String]]
  ] = js.undefined
  var statusCode: scala.Double
}

