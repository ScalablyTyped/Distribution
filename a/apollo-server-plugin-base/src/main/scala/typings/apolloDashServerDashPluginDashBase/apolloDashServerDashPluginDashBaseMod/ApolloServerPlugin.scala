package typings.apolloDashServerDashPluginDashBase.apolloDashServerDashPluginDashBaseMod

import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.GraphQLRequestContext
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.GraphQLServiceContext
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.ValueOrPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloServerPlugin extends js.Object {
  var requestDidStart: js.UndefOr[
    js.Function1[/* requestContext */ GraphQLRequestContext[_], GraphQLRequestListener[_] | Unit]
  ] = js.undefined
  var serverWillStart: js.UndefOr[js.Function1[/* service */ GraphQLServiceContext, ValueOrPromise[Unit]]] = js.undefined
}

object ApolloServerPlugin {
  @scala.inline
  def apply(
    requestDidStart: /* requestContext */ GraphQLRequestContext[_] => GraphQLRequestListener[_] | Unit = null,
    serverWillStart: /* service */ GraphQLServiceContext => ValueOrPromise[Unit] = null
  ): ApolloServerPlugin = {
    val __obj = js.Dynamic.literal()
    if (requestDidStart != null) __obj.updateDynamic("requestDidStart")(js.Any.fromFunction1(requestDidStart))
    if (serverWillStart != null) __obj.updateDynamic("serverWillStart")(js.Any.fromFunction1(serverWillStart))
    __obj.asInstanceOf[ApolloServerPlugin]
  }
}

