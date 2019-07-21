package typings
package apolloDashEngineDashReportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RequestContext[TContext] extends js.Object {
  var requestContext: apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLRequestContext[TContext]
}

object Anon_RequestContext {
  @scala.inline
  def apply[TContext](
    requestContext: apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLRequestContext[TContext]
  ): Anon_RequestContext[TContext] = {
    val __obj = js.Dynamic.literal(requestContext = requestContext)
  
    __obj.asInstanceOf[Anon_RequestContext[TContext]]
  }
}

