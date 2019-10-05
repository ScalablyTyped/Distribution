package typings.apolloDashCache.libTypesCacheMod.Cache

import typings.apolloDashCache.libTypesDataProxyMod.DataProxy.Query
import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteOptions[TResult, TVariables] extends Query[TVariables] {
  var dataId: String
  var result: TResult
}

object WriteOptions {
  @scala.inline
  def apply[TResult, TVariables](dataId: String, query: DocumentNode, result: TResult, variables: TVariables = null): WriteOptions[TResult, TVariables] = {
    val __obj = js.Dynamic.literal(dataId = dataId, query = query, result = result.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteOptions[TResult, TVariables]]
  }
}

