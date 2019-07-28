package typings.apolloDashClient

import typings.graphql.executionExecuteMod.ExecutionResult
import typings.graphql.languageAstMod.DocumentNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context[TData] extends js.Object {
  var context: js.UndefOr[Record[String, _]] = js.undefined
  var document: DocumentNode | Null
  var onlyRunForcedResolvers: js.UndefOr[Boolean] = js.undefined
  var remoteResult: ExecutionResult[TData]
  var variables: js.UndefOr[Record[String, _]] = js.undefined
}

object Anon_Context {
  @scala.inline
  def apply[TData](
    remoteResult: ExecutionResult[TData],
    context: Record[String, _] = null,
    document: DocumentNode = null,
    onlyRunForcedResolvers: js.UndefOr[Boolean] = js.undefined,
    variables: Record[String, _] = null
  ): Anon_Context[TData] = {
    val __obj = js.Dynamic.literal(remoteResult = remoteResult)
    if (context != null) __obj.updateDynamic("context")(context)
    if (document != null) __obj.updateDynamic("document")(document)
    if (!js.isUndefined(onlyRunForcedResolvers)) __obj.updateDynamic("onlyRunForcedResolvers")(onlyRunForcedResolvers)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[Anon_Context[TData]]
  }
}

