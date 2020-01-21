package typings.apolloCacheControl

import typings.apolloServerTypes.mod.GraphQLResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGraphqlResponse extends js.Object {
  var graphqlResponse: GraphQLResponse
}

object AnonGraphqlResponse {
  @scala.inline
  def apply(graphqlResponse: GraphQLResponse): AnonGraphqlResponse = {
    val __obj = js.Dynamic.literal(graphqlResponse = graphqlResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGraphqlResponse]
  }
}

