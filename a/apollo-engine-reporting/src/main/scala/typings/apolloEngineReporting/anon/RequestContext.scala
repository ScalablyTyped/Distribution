package typings.apolloEngineReporting.anon

import typings.apolloServerTypes.mod.GraphQLRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestContext[TContext] extends js.Object {
  var requestContext: GraphQLRequestContext[TContext]
}

object RequestContext {
  @scala.inline
  def apply[TContext](requestContext: GraphQLRequestContext[TContext]): RequestContext[TContext] = {
    val __obj = js.Dynamic.literal(requestContext = requestContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestContext[TContext]]
  }
}

