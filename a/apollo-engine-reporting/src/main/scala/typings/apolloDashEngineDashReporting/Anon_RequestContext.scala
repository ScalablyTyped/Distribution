package typings.apolloDashEngineDashReporting

import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.GraphQLRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RequestContext[TContext] extends js.Object {
  var requestContext: GraphQLRequestContext[TContext]
}

object Anon_RequestContext {
  @scala.inline
  def apply[TContext](requestContext: GraphQLRequestContext[TContext]): Anon_RequestContext[TContext] = {
    val __obj = js.Dynamic.literal(requestContext = requestContext.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_RequestContext[TContext]]
  }
}

