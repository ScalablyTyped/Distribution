package typings
package apolloDashCacheLib.libTypesDataProxyMod.DataProxyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteFragmentOptions[TData, TVariables] extends Fragment[TVariables] {
  var data: TData
}

object WriteFragmentOptions {
  @scala.inline
  def apply[TData, TVariables](
    data: TData,
    fragment: graphqlLib.languageAstMod.DocumentNode,
    id: java.lang.String,
    fragmentName: java.lang.String = null,
    variables: TVariables = null
  ): WriteFragmentOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fragment = fragment, id = id)
    if (fragmentName != null) __obj.updateDynamic("fragmentName")(fragmentName)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteFragmentOptions[TData, TVariables]]
  }
}

