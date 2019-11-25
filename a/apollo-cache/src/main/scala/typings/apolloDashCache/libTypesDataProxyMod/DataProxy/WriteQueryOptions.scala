package typings.apolloDashCache.libTypesDataProxyMod.DataProxy

import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteQueryOptions[TData, TVariables] extends Query[TVariables] {
  var data: TData
}

object WriteQueryOptions {
  @scala.inline
  def apply[TData, TVariables](data: TData, query: DocumentNode, variables: TVariables = null): WriteQueryOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteQueryOptions[TData, TVariables]]
  }
}

