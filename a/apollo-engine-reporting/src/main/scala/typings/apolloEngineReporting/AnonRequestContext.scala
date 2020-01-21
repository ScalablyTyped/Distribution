package typings.apolloEngineReporting

import typings.apolloServerTypes.mod.GraphQLRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequestContext[TContext] extends js.Object {
  var requestContext: GraphQLRequestContext[TContext]
}

object AnonRequestContext {
  @scala.inline
  def apply[TContext](requestContext: GraphQLRequestContext[TContext]): AnonRequestContext[TContext] = {
    val __obj = js.Dynamic.literal(requestContext = requestContext.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRequestContext[TContext]]
  }
}

