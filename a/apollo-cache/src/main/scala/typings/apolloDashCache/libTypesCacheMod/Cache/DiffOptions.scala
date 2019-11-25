package typings.apolloDashCache.libTypesCacheMod.Cache

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
    val __obj = js.Dynamic.literal(optimistic = optimistic.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (previousResult != null) __obj.updateDynamic("previousResult")(previousResult.asInstanceOf[js.Any])
    if (!js.isUndefined(returnPartialData)) __obj.updateDynamic("returnPartialData")(returnPartialData.asInstanceOf[js.Any])
    if (rootId != null) __obj.updateDynamic("rootId")(rootId.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffOptions]
  }
}

