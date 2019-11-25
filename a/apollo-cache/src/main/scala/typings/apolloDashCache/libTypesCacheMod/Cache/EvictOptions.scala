package typings.apolloDashCache.libTypesCacheMod.Cache

import typings.apolloDashCache.libTypesDataProxyMod.DataProxy.Query
import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvictOptions[TVariables] extends Query[TVariables] {
  var rootId: js.UndefOr[String] = js.undefined
}

object EvictOptions {
  @scala.inline
  def apply[TVariables](query: DocumentNode, rootId: String = null, variables: TVariables = null): EvictOptions[TVariables] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (rootId != null) __obj.updateDynamic("rootId")(rootId.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvictOptions[TVariables]]
  }
}

