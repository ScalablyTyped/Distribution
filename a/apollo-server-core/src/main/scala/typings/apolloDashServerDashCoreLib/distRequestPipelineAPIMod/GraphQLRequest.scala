package typings
package apolloDashServerDashCoreLib.distRequestPipelineAPIMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequest extends js.Object {
  var extensions: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var http: js.UndefOr[
    stdLib.Pick[
      apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Request, 
      apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.url | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.method | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.headers
    ]
  ] = js.undefined
  var operationName: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
  var variables: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object GraphQLRequest {
  @scala.inline
  def apply(
    extensions: stdLib.Record[java.lang.String, _] = null,
    http: stdLib.Pick[
      apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Request, 
      apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.url | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.method | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.headers
    ] = null,
    operationName: java.lang.String = null,
    query: java.lang.String = null,
    variables: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): GraphQLRequest = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (http != null) __obj.updateDynamic("http")(http)
    if (operationName != null) __obj.updateDynamic("operationName")(operationName)
    if (query != null) __obj.updateDynamic("query")(query)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[GraphQLRequest]
  }
}

