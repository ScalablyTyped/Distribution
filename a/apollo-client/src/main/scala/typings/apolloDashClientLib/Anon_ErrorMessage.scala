package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorMessage extends js.Object {
  var errorMessage: js.UndefOr[java.lang.String] = js.undefined
  var extraInfo: js.UndefOr[js.Any] = js.undefined
  var graphQLErrors: js.UndefOr[js.Array[graphqlLib.graphqlMod.GraphQLError]] = js.undefined
  var networkError: js.UndefOr[stdLib.Error | scala.Null] = js.undefined
}

object Anon_ErrorMessage {
  @scala.inline
  def apply(
    errorMessage: java.lang.String = null,
    extraInfo: js.Any = null,
    graphQLErrors: js.Array[graphqlLib.graphqlMod.GraphQLError] = null,
    networkError: stdLib.Error = null
  ): Anon_ErrorMessage = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (extraInfo != null) __obj.updateDynamic("extraInfo")(extraInfo)
    if (graphQLErrors != null) __obj.updateDynamic("graphQLErrors")(graphQLErrors)
    if (networkError != null) __obj.updateDynamic("networkError")(networkError)
    __obj.asInstanceOf[Anon_ErrorMessage]
  }
}

