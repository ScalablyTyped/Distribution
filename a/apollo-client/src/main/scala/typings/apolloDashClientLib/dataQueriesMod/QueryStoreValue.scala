package typings
package apolloDashClientLib.dataQueriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryStoreValue extends js.Object {
  var document: graphqlLib.languageAstMod.DocumentNode
  var graphQLErrors: js.UndefOr[js.Array[graphqlLib.graphqlMod.GraphQLError]] = js.undefined
  var metadata: js.Any
  var networkError: js.UndefOr[stdLib.Error | scala.Null] = js.undefined
  var networkStatus: apolloDashClientLib.coreNetworkStatusMod.NetworkStatus
  var previousVariables: js.UndefOr[js.Object | scala.Null] = js.undefined
  var variables: js.Object
}

