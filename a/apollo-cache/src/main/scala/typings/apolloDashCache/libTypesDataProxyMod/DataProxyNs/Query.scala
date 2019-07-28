package typings.apolloDashCache.libTypesDataProxyMod.DataProxyNs

import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query[TVariables] extends js.Object {
  var query: DocumentNode
  var variables: js.UndefOr[TVariables] = js.undefined
}

object Query {
  @scala.inline
  def apply[TVariables](query: DocumentNode, variables: TVariables = null): Query[TVariables] = {
    val __obj = js.Dynamic.literal(query = query)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query[TVariables]]
  }
}

