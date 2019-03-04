package typings
package apolloDashServerDashCoreLib.distRunHttpQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpQueryResponse extends js.Object {
  var graphqlResponse: java.lang.String
  var responseInit: ApolloServerHttpResponse
}

object HttpQueryResponse {
  @scala.inline
  def apply(graphqlResponse: java.lang.String, responseInit: ApolloServerHttpResponse): HttpQueryResponse = {
    val __obj = js.Dynamic.literal(graphqlResponse = graphqlResponse, responseInit = responseInit)
  
    __obj.asInstanceOf[HttpQueryResponse]
  }
}

