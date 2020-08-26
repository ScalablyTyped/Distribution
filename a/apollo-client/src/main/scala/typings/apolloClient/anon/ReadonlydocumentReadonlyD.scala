package typings.apolloClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  document :std.Readonly<graphql.graphql.DocumentNode>,   hasClientExports :boolean,   hasForcedResolvers :boolean,   clientQuery :std.Readonly<graphql.graphql.DocumentNode> | null,   serverQuery :std.Readonly<graphql.graphql.DocumentNode> | null,   defaultVars :std.Readonly<apollo-client.apollo-client/core/types.OperationVariables>}> */
@js.native
trait ReadonlydocumentReadonlyD extends js.Object {
  val clientQuery: js.UndefOr[ReadonlyDocumentNode | Null] = js.native
  val document: ReadonlyDocumentNode = js.native
  val hasClientExports: Boolean = js.native
  val hasForcedResolvers: Boolean = js.native
  val serverQuery: js.UndefOr[ReadonlyDocumentNode | Null] = js.native
}

object ReadonlydocumentReadonlyD {
  @scala.inline
  def apply(document: ReadonlyDocumentNode, hasClientExports: Boolean, hasForcedResolvers: Boolean): ReadonlydocumentReadonlyD = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], hasClientExports = hasClientExports.asInstanceOf[js.Any], hasForcedResolvers = hasForcedResolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlydocumentReadonlyD]
  }
  @scala.inline
  implicit class ReadonlydocumentReadonlyDOps[Self <: ReadonlydocumentReadonlyD] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDocument(value: ReadonlyDocumentNode): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasClientExports(value: Boolean): Self = this.set("hasClientExports", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasForcedResolvers(value: Boolean): Self = this.set("hasForcedResolvers", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientQuery(value: ReadonlyDocumentNode): Self = this.set("clientQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientQuery: Self = this.set("clientQuery", js.undefined)
    @scala.inline
    def setClientQueryNull: Self = this.set("clientQuery", null)
    @scala.inline
    def setServerQuery(value: ReadonlyDocumentNode): Self = this.set("serverQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerQuery: Self = this.set("serverQuery", js.undefined)
    @scala.inline
    def setServerQueryNull: Self = this.set("serverQuery", null)
  }
  
}

