package typings
package apolloDashCacheLib.libTypesCacheMod.CacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadOptions[TVariables]
  extends apolloDashCacheLib.libTypesDataProxyMod.DataProxyNs.Query[TVariables] {
  var optimistic: scala.Boolean
  var previousResult: js.UndefOr[js.Any] = js.undefined
  var rootId: js.UndefOr[java.lang.String] = js.undefined
}

object ReadOptions {
  @scala.inline
  def apply[TVariables](
    optimistic: scala.Boolean,
    query: graphqlLib.languageAstMod.DocumentNode,
    previousResult: js.Any = null,
    rootId: java.lang.String = null,
    variables: TVariables = null
  ): ReadOptions[TVariables] = {
    val __obj = js.Dynamic.literal(optimistic = optimistic, query = query)
    if (previousResult != null) __obj.updateDynamic("previousResult")(previousResult)
    if (rootId != null) __obj.updateDynamic("rootId")(rootId)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadOptions[TVariables]]
  }
}

