package typings
package apolloDashCacheLib.libTypesCacheMod.CacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffOptions
  extends ReadOptions[js.Any] {
  var returnPartialData: js.UndefOr[scala.Boolean] = js.undefined
}

object DiffOptions {
  @scala.inline
  def apply(
    optimistic: scala.Boolean,
    query: graphqlLib.languageAstMod.DocumentNode,
    previousResult: js.Any = null,
    returnPartialData: js.UndefOr[scala.Boolean] = js.undefined,
    rootId: java.lang.String = null,
    variables: js.Any = null
  ): DiffOptions = {
    val __obj = js.Dynamic.literal(optimistic = optimistic, query = query)
    if (previousResult != null) __obj.updateDynamic("previousResult")(previousResult)
    if (!js.isUndefined(returnPartialData)) __obj.updateDynamic("returnPartialData")(returnPartialData)
    if (rootId != null) __obj.updateDynamic("rootId")(rootId)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[DiffOptions]
  }
}

