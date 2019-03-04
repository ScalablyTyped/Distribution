package typings
package apolloDashCacheLib.libTypesDataProxyMod.DataProxyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fragment[TVariables] extends js.Object {
  var fragment: graphqlLib.languageAstMod.DocumentNode
  var fragmentName: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var variables: js.UndefOr[TVariables] = js.undefined
}

object Fragment {
  @scala.inline
  def apply[TVariables](
    fragment: graphqlLib.languageAstMod.DocumentNode,
    id: java.lang.String,
    fragmentName: java.lang.String = null,
    variables: TVariables = null
  ): Fragment[TVariables] = {
    val __obj = js.Dynamic.literal(fragment = fragment, id = id)
    if (fragmentName != null) __obj.updateDynamic("fragmentName")(fragmentName)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fragment[TVariables]]
  }
}

