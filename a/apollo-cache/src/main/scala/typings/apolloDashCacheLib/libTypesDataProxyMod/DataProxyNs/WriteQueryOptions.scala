package typings
package apolloDashCacheLib.libTypesDataProxyMod.DataProxyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteQueryOptions[TData, TVariables] extends Query[TVariables] {
  var data: TData
}

object WriteQueryOptions {
  @scala.inline
  def apply[TData, TVariables](data: TData, query: graphqlLib.languageAstMod.DocumentNode, variables: TVariables = null): WriteQueryOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("query")(query)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteQueryOptions[TData, TVariables]]
  }
}

