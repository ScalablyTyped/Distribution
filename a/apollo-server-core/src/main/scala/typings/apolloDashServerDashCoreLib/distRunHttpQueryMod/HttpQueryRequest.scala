package typings
package apolloDashServerDashCoreLib.distRunHttpQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpQueryRequest extends js.Object {
  var method: java.lang.String
  var options: (apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[stdLib.Record[java.lang.String, _], _]) | (js.Function1[
    /* repeated */ js.Any, 
    (js.Promise[
      apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[stdLib.Record[java.lang.String, _], _]
    ]) | (apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[stdLib.Record[java.lang.String, _], _])
  ])
  var query: (stdLib.Record[java.lang.String, _]) | (apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[stdLib.Record[java.lang.String, _]])
  var request: stdLib.Pick[
    apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Request, 
    apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.url | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.method | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.headers
  ]
}

object HttpQueryRequest {
  @scala.inline
  def apply(
    method: java.lang.String,
    options: (apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[stdLib.Record[java.lang.String, _], _]) | (js.Function1[
      /* repeated */ js.Any, 
      (js.Promise[
        apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[stdLib.Record[java.lang.String, _], _]
      ]) | (apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[stdLib.Record[java.lang.String, _], _])
    ]),
    query: (stdLib.Record[java.lang.String, _]) | (apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[stdLib.Record[java.lang.String, _]]),
    request: stdLib.Pick[
      apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Request, 
      apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.url | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.method | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.headers
    ]
  ): HttpQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[HttpQueryRequest]
  }
}

