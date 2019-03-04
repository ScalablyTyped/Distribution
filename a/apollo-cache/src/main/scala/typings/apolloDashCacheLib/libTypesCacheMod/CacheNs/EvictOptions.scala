package typings
package apolloDashCacheLib.libTypesCacheMod.CacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvictOptions[TVariables]
  extends apolloDashCacheLib.libTypesDataProxyMod.DataProxyNs.Query[TVariables] {
  var rootId: js.UndefOr[java.lang.String] = js.undefined
}

object EvictOptions {
  @scala.inline
  def apply[TVariables](
    query: graphqlLib.languageAstMod.DocumentNode,
    rootId: java.lang.String = null,
    variables: TVariables = null
  ): EvictOptions[TVariables] = {
    val __obj = js.Dynamic.literal(query = query)
    if (rootId != null) __obj.updateDynamic("rootId")(rootId)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvictOptions[TVariables]]
  }
}

