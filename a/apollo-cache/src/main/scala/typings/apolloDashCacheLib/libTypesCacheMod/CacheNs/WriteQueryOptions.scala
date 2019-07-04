package typings
package apolloDashCacheLib.libTypesCacheMod.CacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteQueryOptions[TData, TVariables]
  extends apolloDashCacheLib.libTypesDataProxyMod.DataProxyNs.Query[TVariables] {
  var data: TData
}

object WriteQueryOptions {
  @scala.inline
  def apply[TData, TVariables](data: TData, query: graphqlLib.languageAstMod.DocumentNode, variables: TVariables = null): WriteQueryOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], query = query)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteQueryOptions[TData, TVariables]]
  }
}

