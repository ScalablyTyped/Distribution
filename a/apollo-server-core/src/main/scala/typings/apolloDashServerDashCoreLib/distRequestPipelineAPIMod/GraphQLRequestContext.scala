package typings
package apolloDashServerDashCoreLib.distRequestPipelineAPIMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequestContext[TContext] extends js.Object {
  val cache: apolloDashServerDashCachingLib.distKeyValueCacheMod.KeyValueCache[java.lang.String]
  val context: TContext
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  val document: js.UndefOr[graphqlLib.languageAstMod.DocumentNode] = js.undefined
  val operation: js.UndefOr[graphqlLib.languageAstMod.OperationDefinitionNode] = js.undefined
  val operationName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val queryHash: js.UndefOr[java.lang.String] = js.undefined
  val request: GraphQLRequest
  val response: js.UndefOr[GraphQLResponse] = js.undefined
}

