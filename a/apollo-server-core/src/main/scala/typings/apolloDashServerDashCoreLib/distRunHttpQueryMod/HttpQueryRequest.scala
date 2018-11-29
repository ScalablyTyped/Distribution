package typings
package apolloDashServerDashCoreLib.distRunHttpQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HttpQueryRequest extends js.Object {
  var method: java.lang.String
  var options: (apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[stdLib.Record[java.lang.String, _], _]) | (js.Function1[
    /* repeated */js.Any, 
    (stdLib.Promise[
      apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[stdLib.Record[java.lang.String, _], _]
    ]) | (apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[stdLib.Record[java.lang.String, _], _])
  ])
  var query: (stdLib.Record[java.lang.String, _]) | (apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[stdLib.Record[java.lang.String, _]])
  var request: stdLib.Pick[
    apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Request, 
    apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.url | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.method | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.headers
  ]
}

