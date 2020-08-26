package typings.apolloClient.anon

import typings.apolloLink.typesMod.FetchResult
import typings.graphql.astMod.DocumentNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context[TData] extends js.Object {
  var context: js.UndefOr[Record[String, _]] = js.native
  var document: DocumentNode | Null = js.native
  var onlyRunForcedResolvers: js.UndefOr[Boolean] = js.native
  var remoteResult: FetchResult[TData, Record[String, _], Record[String, _]] = js.native
  var variables: js.UndefOr[Record[String, _]] = js.native
}

object Context {
  @scala.inline
  def apply[TData](remoteResult: FetchResult[TData, Record[String, _], Record[String, _]]): Context[TData] = {
    val __obj = js.Dynamic.literal(remoteResult = remoteResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[TData]]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context[_], TData] (val x: Self with Context[TData]) extends AnyVal {
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
    def setRemoteResult(value: FetchResult[TData, Record[String, _], Record[String, _]]): Self = this.set("remoteResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: Record[String, _]): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setDocument(value: DocumentNode): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocumentNull: Self = this.set("document", null)
    @scala.inline
    def setOnlyRunForcedResolvers(value: Boolean): Self = this.set("onlyRunForcedResolvers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyRunForcedResolvers: Self = this.set("onlyRunForcedResolvers", js.undefined)
    @scala.inline
    def setVariables(value: Record[String, _]): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

