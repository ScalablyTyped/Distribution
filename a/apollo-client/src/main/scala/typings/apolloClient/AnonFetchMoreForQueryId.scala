package typings.apolloClient

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFetchMoreForQueryId extends js.Object {
  var document: DocumentNode
  var fetchMoreForQueryId: js.UndefOr[String] = js.undefined
  var isPoll: Boolean
  var isRefetch: Boolean
  var metadata: js.Any
  var queryId: String
  var storePreviousVariables: Boolean
  var variables: js.Object
}

object AnonFetchMoreForQueryId {
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
  ): AnonFetchMoreForQueryId = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], isPoll = isPoll.asInstanceOf[js.Any], isRefetch = isRefetch.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], queryId = queryId.asInstanceOf[js.Any], storePreviousVariables = storePreviousVariables.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    if (fetchMoreForQueryId != null) __obj.updateDynamic("fetchMoreForQueryId")(fetchMoreForQueryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFetchMoreForQueryId]
  }
}

