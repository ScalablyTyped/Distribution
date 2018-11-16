package typings
package apolloDashLinkDashErrorLib.apolloDashLinkDashErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ErrorResponse extends js.Object {
  var graphQLErrors: js.UndefOr[js.Array[graphqlLib.graphqlMod.GraphQLError]] = js.undefined
  var networkError: js.UndefOr[stdLib.Error] = js.undefined
  var operation: apolloDashLinkLib.libTypesMod.Operation
  var response: js.UndefOr[
    graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault]
  ] = js.undefined
}

