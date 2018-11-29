package typings
package apolloDashServerDashCoreLib.distRequestPipelineAPIMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GraphQLResponse extends js.Object {
  var data: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var errors: js.UndefOr[
    apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[graphqlLib.graphqlMod.GraphQLError]
  ] = js.undefined
  var extensions: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var http: js.UndefOr[
    stdLib.Pick[
      apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Response, 
      apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.headers
    ]
  ] = js.undefined
}

