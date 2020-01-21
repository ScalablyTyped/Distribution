package typings.apolloServerPluginBase.mod

import typings.apolloServerTypes.mod.GraphQLRequestContext
import typings.apolloServerTypes.mod.GraphQLServiceContext
import typings.apolloServerTypes.mod.ValueOrPromise
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloServerPlugin[TContext /* <: Record[String, _] */] extends js.Object {
  var requestDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ GraphQLRequestContext[TContext], 
      GraphQLRequestListener[TContext] | Unit
    ]
  ] = js.undefined
  var serverWillStart: js.UndefOr[js.Function1[/* service */ GraphQLServiceContext, ValueOrPromise[Unit]]] = js.undefined
}

object ApolloServerPlugin {
  @scala.inline
  def apply[TContext /* <: Record[String, _] */](
    requestDidStart: /* requestContext */ GraphQLRequestContext[TContext] => GraphQLRequestListener[TContext] | Unit = null,
    serverWillStart: /* service */ GraphQLServiceContext => ValueOrPromise[Unit] = null
  ): ApolloServerPlugin[TContext] = {
    val __obj = js.Dynamic.literal()
    if (requestDidStart != null) __obj.updateDynamic("requestDidStart")(js.Any.fromFunction1(requestDidStart))
    if (serverWillStart != null) __obj.updateDynamic("serverWillStart")(js.Any.fromFunction1(serverWillStart))
    __obj.asInstanceOf[ApolloServerPlugin[TContext]]
  }
}

