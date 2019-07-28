package typings.apolloDashClient

import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocumentFetchMoreForQueryId extends js.Object {
  var document: DocumentNode
  var fetchMoreForQueryId: js.UndefOr[String] = js.undefined
  var isPoll: Boolean
  var isRefetch: Boolean
  var metadata: js.Any
  var queryId: String
  var storePreviousVariables: Boolean
  var variables: js.Object
}

object Anon_DocumentFetchMoreForQueryId {
  @scala.inline
  def apply(
    document: DocumentNode,
    isPoll: Boolean,
    isRefetch: Boolean,
    metadata: js.Any,
    queryId: String,
    storePreviousVariables: Boolean,
    variables: js.Object,
    fetchMoreForQueryId: String = null
  ): Anon_DocumentFetchMoreForQueryId = {
    val __obj = js.Dynamic.literal(document = document, isPoll = isPoll, isRefetch = isRefetch, metadata = metadata, queryId = queryId, storePreviousVariables = storePreviousVariables, variables = variables)
    if (fetchMoreForQueryId != null) __obj.updateDynamic("fetchMoreForQueryId")(fetchMoreForQueryId)
    __obj.asInstanceOf[Anon_DocumentFetchMoreForQueryId]
  }
}

