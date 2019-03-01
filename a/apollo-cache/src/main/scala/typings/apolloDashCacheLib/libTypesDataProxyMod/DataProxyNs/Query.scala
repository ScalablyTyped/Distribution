package typings
package apolloDashCacheLib.libTypesDataProxyMod.DataProxyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query[TVariables] extends js.Object {
  var query: graphqlLib.languageAstMod.DocumentNode
  var variables: js.UndefOr[TVariables] = js.undefined
}

object Query {
  @scala.inline
  def apply[TVariables](query: graphqlLib.languageAstMod.DocumentNode, variables: TVariables = null): Query[TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(query)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query[TVariables]]
  }
}

