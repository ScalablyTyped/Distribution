package typings
package apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloServerPlugin extends js.Object {
  var requestDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLRequestContext[_], 
      GraphQLRequestListener[_] | scala.Unit
    ]
  ] = js.undefined
  var serverWillStart: js.UndefOr[
    js.Function1[
      /* service */ apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLServiceContext, 
      apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.ValueOrPromise[scala.Unit]
    ]
  ] = js.undefined
}

object ApolloServerPlugin {
  @scala.inline
  def apply(
    requestDidStart: /* requestContext */ apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLRequestContext[_] => GraphQLRequestListener[_] | scala.Unit = null,
    serverWillStart: /* service */ apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLServiceContext => apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.ValueOrPromise[scala.Unit] = null
  ): ApolloServerPlugin = {
    val __obj = js.Dynamic.literal()
    if (requestDidStart != null) __obj.updateDynamic("requestDidStart")(js.Any.fromFunction1(requestDidStart))
    if (serverWillStart != null) __obj.updateDynamic("serverWillStart")(js.Any.fromFunction1(serverWillStart))
    __obj.asInstanceOf[ApolloServerPlugin]
  }
}

