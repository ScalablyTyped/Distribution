package typings.apolloClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  document  :std.Readonly<graphql.graphql.DocumentNode>,   hasClientExports  :boolean,   hasForcedResolvers  :boolean,   clientQuery  :std.Readonly<graphql.graphql.DocumentNode> | null,   serverQuery  :std.Readonly<graphql.graphql.DocumentNode> | null,   defaultVars  :std.Readonly<apollo-client.apollo-client/core/types.OperationVariables>}> */
trait ReadonlydocumentReadonlyD extends js.Object {
  val clientQuery: js.UndefOr[ReadonlyDocumentNode] = js.undefined
  val document: ReadonlyDocumentNode
  val hasClientExports: Boolean
  val hasForcedResolvers: Boolean
  val serverQuery: js.UndefOr[ReadonlyDocumentNode] = js.undefined
}

object ReadonlydocumentReadonlyD {
  @scala.inline
  def apply(
    document: ReadonlyDocumentNode,
    hasClientExports: Boolean,
    hasForcedResolvers: Boolean,
    clientQuery: ReadonlyDocumentNode = null,
    serverQuery: ReadonlyDocumentNode = null
  ): ReadonlydocumentReadonlyD = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], hasClientExports = hasClientExports.asInstanceOf[js.Any], hasForcedResolvers = hasForcedResolvers.asInstanceOf[js.Any])
    if (clientQuery != null) __obj.updateDynamic("clientQuery")(clientQuery.asInstanceOf[js.Any])
    if (serverQuery != null) __obj.updateDynamic("serverQuery")(serverQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlydocumentReadonlyD]
  }
}

