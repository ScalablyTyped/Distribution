package typings
package apolloDashCacheLib.libTypesCacheMod.CacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteOptions[TResult, TVariables]
  extends apolloDashCacheLib.libTypesDataProxyMod.DataProxyNs.Query[TVariables] {
  var dataId: java.lang.String
  var result: TResult
}

object WriteOptions {
  @scala.inline
  def apply[TResult, TVariables](
    dataId: java.lang.String,
    query: graphqlLib.languageAstMod.DocumentNode,
    result: TResult,
    variables: TVariables = null
  ): WriteOptions[TResult, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataId")(dataId)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteOptions[TResult, TVariables]]
  }
}

