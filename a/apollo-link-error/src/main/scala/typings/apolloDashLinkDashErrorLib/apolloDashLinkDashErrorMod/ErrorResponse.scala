package typings
package apolloDashLinkDashErrorLib.apolloDashLinkDashErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorResponse extends js.Object {
  @JSName("forward")
  var forward_Original: apolloDashLinkLib.libTypesMod.NextLink = js.native
  var graphQLErrors: js.UndefOr[js.Array[graphqlLib.graphqlMod.GraphQLError]] = js.native
  var networkError: js.UndefOr[
    stdLib.Error | apolloDashLinkDashHttpDashCommonLib.apolloDashLinkDashHttpDashCommonMod.ServerError | apolloDashLinkDashHttpDashCommonLib.apolloDashLinkDashHttpDashCommonMod.ServerParseError
  ] = js.native
  var operation: apolloDashLinkLib.libTypesMod.Operation = js.native
  var response: js.UndefOr[
    graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault]
  ] = js.native
  def forward(operation: apolloDashLinkLib.libTypesMod.Operation): zenDashObservableDashTsLib.libZenObservableMod.Observable[
    apolloDashLinkLib.libTypesMod.FetchResult[
      org.scalablytyped.runtime.StringDictionary[_], 
      stdLib.Record[java.lang.String, _], 
      stdLib.Record[java.lang.String, _]
    ]
  ] = js.native
}

