package typings.apolloClient

import typings.graphql.astMod.DocumentNode
import typings.graphql.executeMod.ExecutionResult
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext[TData] extends js.Object {
  var context: js.UndefOr[Record[String, _]] = js.undefined
  var document: DocumentNode | Null
  var onlyRunForcedResolvers: js.UndefOr[Boolean] = js.undefined
  var remoteResult: ExecutionResult[TData]
  var variables: js.UndefOr[Record[String, _]] = js.undefined
}

object AnonContext {
  @scala.inline
  def apply[TData](
    remoteResult: ExecutionResult[TData],
    context: Record[String, _] = null,
    document: DocumentNode = null,
    onlyRunForcedResolvers: js.UndefOr[Boolean] = js.undefined,
    variables: Record[String, _] = null
  ): AnonContext[TData] = {
    val __obj = js.Dynamic.literal(remoteResult = remoteResult.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyRunForcedResolvers)) __obj.updateDynamic("onlyRunForcedResolvers")(onlyRunForcedResolvers.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext[TData]]
  }
}

