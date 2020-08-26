package typings.apolloClient.anon

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchMoreForQueryId extends js.Object {
  var document: DocumentNode = js.native
  var fetchMoreForQueryId: js.UndefOr[String] = js.native
  var isPoll: Boolean = js.native
  var isRefetch: Boolean = js.native
  var metadata: js.Any = js.native
  var queryId: String = js.native
  var storePreviousVariables: Boolean = js.native
  var variables: js.Object = js.native
}

object FetchMoreForQueryId {
  @scala.inline
  def apply(
    document: DocumentNode,
    isPoll: Boolean,
    isRefetch: Boolean,
    metadata: js.Any,
    queryId: String,
    storePreviousVariables: Boolean,
    variables: js.Object
  ): FetchMoreForQueryId = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], isPoll = isPoll.asInstanceOf[js.Any], isRefetch = isRefetch.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], queryId = queryId.asInstanceOf[js.Any], storePreviousVariables = storePreviousVariables.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchMoreForQueryId]
  }
  @scala.inline
  implicit class FetchMoreForQueryIdOps[Self <: FetchMoreForQueryId] (val x: Self) extends AnyVal {
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
    def setDocument(value: DocumentNode): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPoll(value: Boolean): Self = this.set("isPoll", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRefetch(value: Boolean): Self = this.set("isRefetch", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryId(value: String): Self = this.set("queryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorePreviousVariables(value: Boolean): Self = this.set("storePreviousVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: js.Object): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def setFetchMoreForQueryId(value: String): Self = this.set("fetchMoreForQueryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchMoreForQueryId: Self = this.set("fetchMoreForQueryId", js.undefined)
  }
  
}

