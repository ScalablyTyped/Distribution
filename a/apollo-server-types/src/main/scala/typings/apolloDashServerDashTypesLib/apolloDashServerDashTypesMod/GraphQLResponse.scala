package typings
package apolloDashServerDashTypesLib.apolloDashServerDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLResponse extends js.Object {
  var data: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var errors: js.UndefOr[
    js.Array[
      graphqlLib.errorFormatErrorMod.GraphQLFormattedError[stdLib.Record[java.lang.String, _]]
    ]
  ] = js.undefined
  var extensions: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var http: js.UndefOr[
    (stdLib.Pick[
      apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Response, 
      apolloDashServerDashTypesLib.apolloDashServerDashTypesLibStrings.headers
    ]) with (stdLib.Partial[
      stdLib.Pick[
        Mutable[apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Response], 
        apolloDashServerDashTypesLib.apolloDashServerDashTypesLibStrings.status
      ]
    ])
  ] = js.undefined
}

object GraphQLResponse {
  @scala.inline
  def apply(
    data: stdLib.Record[java.lang.String, _] = null,
    errors: js.Array[
      graphqlLib.errorFormatErrorMod.GraphQLFormattedError[stdLib.Record[java.lang.String, _]]
    ] = null,
    extensions: stdLib.Record[java.lang.String, _] = null,
    http: (stdLib.Pick[
      apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Response, 
      apolloDashServerDashTypesLib.apolloDashServerDashTypesLibStrings.headers
    ]) with (stdLib.Partial[
      stdLib.Pick[
        Mutable[apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Response], 
        apolloDashServerDashTypesLib.apolloDashServerDashTypesLibStrings.status
      ]
    ]) = null
  ): GraphQLResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (http != null) __obj.updateDynamic("http")(http)
    __obj.asInstanceOf[GraphQLResponse]
  }
}

