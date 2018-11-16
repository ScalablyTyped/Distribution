package typings
package apolloDashServerDashCoreLib.distRunHttpQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HttpQueryRequest extends js.Object {
  var method: java.lang.String
  var options: (apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[
    (js.Function0[
      (stdLib.Promise[stdLib.Record[java.lang.String, _]]) | (stdLib.Record[java.lang.String, _])
    ]) | (stdLib.Record[java.lang.String, _])
  ]) | (js.Function1[
    /* repeated */js.Any, 
    (stdLib.Promise[
      apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[
        (js.Function0[
          (stdLib.Promise[stdLib.Record[java.lang.String, _]]) | (stdLib.Record[java.lang.String, _])
        ]) | (stdLib.Record[java.lang.String, _])
      ]
    ]) | (apolloDashServerDashCoreLib.distGraphqlOptionsMod.GraphQLServerOptions[
      (js.Function0[
        (stdLib.Promise[stdLib.Record[java.lang.String, _]]) | (stdLib.Record[java.lang.String, _])
      ]) | (stdLib.Record[java.lang.String, _])
    ])
  ])
  var query: (stdLib.Record[java.lang.String, _]) | (js.Array[stdLib.Record[java.lang.String, _]])
  var request: stdLib.Pick[
    apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Request, 
    apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.url | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.method | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.headers
  ]
}

