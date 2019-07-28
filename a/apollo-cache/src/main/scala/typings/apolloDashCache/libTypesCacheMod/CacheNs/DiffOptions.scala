package typings.apolloDashCache.libTypesCacheMod.CacheNs

import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffOptions
  extends ReadOptions[js.Any] {
  var returnPartialData: js.UndefOr[Boolean] = js.undefined
}

object DiffOptions {
  @scala.inline
  def apply(
    optimistic: Boolean,
    query: DocumentNode,
    previousResult: js.Any = null,
    returnPartialData: js.UndefOr[Boolean] = js.undefined,
    rootId: String = null,
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

