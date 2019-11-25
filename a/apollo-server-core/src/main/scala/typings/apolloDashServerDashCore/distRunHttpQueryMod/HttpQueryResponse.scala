package typings.apolloDashServerDashCore.distRunHttpQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpQueryResponse extends js.Object {
  var graphqlResponse: String
  var responseInit: ApolloServerHttpResponse
}

object HttpQueryResponse {
  @scala.inline
  def apply(graphqlResponse: String, responseInit: ApolloServerHttpResponse): HttpQueryResponse = {
    val __obj = js.Dynamic.literal(graphqlResponse = graphqlResponse.asInstanceOf[js.Any], responseInit = responseInit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HttpQueryResponse]
  }
}

