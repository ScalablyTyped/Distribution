package typings.apolloClient.anon

import typings.apolloLink.typesMod.FetchResult
import typings.graphql.astMod.DocumentNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context[TData] extends js.Object {
  var context: js.UndefOr[Record[String, _]] = js.undefined
  var document: DocumentNode | Null
  var onlyRunForcedResolvers: js.UndefOr[Boolean] = js.undefined
  var remoteResult: FetchResult[TData, Record[String, _], Record[String, _]]
  var variables: js.UndefOr[Record[String, _]] = js.undefined
}

object Context {
  @scala.inline
  def apply[TData](
    remoteResult: FetchResult[TData, Record[String, _], Record[String, _]],
    context: Record[String, _] = null,
    document: DocumentNode = null,
    onlyRunForcedResolvers: js.UndefOr[Boolean] = js.undefined,
    variables: Record[String, _] = null
  ): Context[TData] = {
    val __obj = js.Dynamic.literal(remoteResult = remoteResult.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyRunForcedResolvers)) __obj.updateDynamic("onlyRunForcedResolvers")(onlyRunForcedResolvers.get.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[TData]]
  }
}

