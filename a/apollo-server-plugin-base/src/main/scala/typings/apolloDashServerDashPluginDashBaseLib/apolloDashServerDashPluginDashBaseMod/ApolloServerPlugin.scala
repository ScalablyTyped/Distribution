package typings
package apolloDashServerDashPluginDashBaseLib.apolloDashServerDashPluginDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ApolloServerPlugin extends js.Object {
  var requestDidStart: js.UndefOr[
    js.Function1[/* requestContext */ js.Any, GraphQLRequestListener[_] | scala.Unit]
  ] = js.undefined
  var serverWillStart: js.UndefOr[
    js.Function1[
      /* service */ js.Any, 
      apolloDashServerDashPluginDashBaseLib.ValueOrPromise[scala.Unit]
    ]
  ] = js.undefined
}

