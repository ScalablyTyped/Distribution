package typings.apolloCacheControl.anon

import typings.apolloServerTypes.mod.GraphQLResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphqlResponse extends js.Object {
  var graphqlResponse: GraphQLResponse
}

object GraphqlResponse {
  @scala.inline
  def apply(graphqlResponse: GraphQLResponse): GraphqlResponse = {
    val __obj = js.Dynamic.literal(graphqlResponse = graphqlResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphqlResponse]
  }
}

