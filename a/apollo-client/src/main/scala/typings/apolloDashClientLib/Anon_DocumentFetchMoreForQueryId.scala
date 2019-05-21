package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocumentFetchMoreForQueryId extends js.Object {
  var document: graphqlLib.languageAstMod.DocumentNode
  var fetchMoreForQueryId: js.UndefOr[java.lang.String] = js.undefined
  var isPoll: scala.Boolean
  var isRefetch: scala.Boolean
  var metadata: js.Any
  var queryId: java.lang.String
  var storePreviousVariables: scala.Boolean
  var variables: js.Object
}

object Anon_DocumentFetchMoreForQueryId {
  @scala.inline
  def apply(
    document: graphqlLib.languageAstMod.DocumentNode,
    isPoll: scala.Boolean,
    isRefetch: scala.Boolean,
    metadata: js.Any,
    queryId: java.lang.String,
    storePreviousVariables: scala.Boolean,
    variables: js.Object,
    fetchMoreForQueryId: java.lang.String = null
  ): Anon_DocumentFetchMoreForQueryId = {
    val __obj = js.Dynamic.literal(document = document, isPoll = isPoll, isRefetch = isRefetch, metadata = metadata, queryId = queryId, storePreviousVariables = storePreviousVariables, variables = variables)
    if (fetchMoreForQueryId != null) __obj.updateDynamic("fetchMoreForQueryId")(fetchMoreForQueryId)
    __obj.asInstanceOf[Anon_DocumentFetchMoreForQueryId]
  }
}

