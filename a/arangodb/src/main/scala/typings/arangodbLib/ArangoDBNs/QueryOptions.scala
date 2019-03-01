package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  var count: js.UndefOr[scala.Boolean] = js.undefined
  var failOnWarning: js.UndefOr[scala.Boolean] = js.undefined
  var fullCount: js.UndefOr[scala.Boolean] = js.undefined
  var intermediateCommitCount: js.UndefOr[scala.Double] = js.undefined
  var intermediateCommitSize: js.UndefOr[scala.Double] = js.undefined
  var maxNumberOfPlans: js.UndefOr[scala.Double] = js.undefined
  // RocksDB
  var maxTransactionsSize: js.UndefOr[scala.Double] = js.undefined
  var maxWarningCount: js.UndefOr[scala.Double] = js.undefined
  var memoryLimit: js.UndefOr[scala.Double] = js.undefined
  var profile: js.UndefOr[scala.Boolean] = js.undefined
  // enterprise
  var skipInaccessibleCollections: js.UndefOr[scala.Boolean] = js.undefined
  var stream: js.UndefOr[scala.Boolean] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply(
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    count: js.UndefOr[scala.Boolean] = js.undefined,
    failOnWarning: js.UndefOr[scala.Boolean] = js.undefined,
    fullCount: js.UndefOr[scala.Boolean] = js.undefined,
    intermediateCommitCount: scala.Int | scala.Double = null,
    intermediateCommitSize: scala.Int | scala.Double = null,
    maxNumberOfPlans: scala.Int | scala.Double = null,
    maxTransactionsSize: scala.Int | scala.Double = null,
    maxWarningCount: scala.Int | scala.Double = null,
    memoryLimit: scala.Int | scala.Double = null,
    profile: js.UndefOr[scala.Boolean] = js.undefined,
    skipInaccessibleCollections: js.UndefOr[scala.Boolean] = js.undefined,
    stream: js.UndefOr[scala.Boolean] = js.undefined
  ): QueryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count)
    if (!js.isUndefined(failOnWarning)) __obj.updateDynamic("failOnWarning")(failOnWarning)
    if (!js.isUndefined(fullCount)) __obj.updateDynamic("fullCount")(fullCount)
    if (intermediateCommitCount != null) __obj.updateDynamic("intermediateCommitCount")(intermediateCommitCount.asInstanceOf[js.Any])
    if (intermediateCommitSize != null) __obj.updateDynamic("intermediateCommitSize")(intermediateCommitSize.asInstanceOf[js.Any])
    if (maxNumberOfPlans != null) __obj.updateDynamic("maxNumberOfPlans")(maxNumberOfPlans.asInstanceOf[js.Any])
    if (maxTransactionsSize != null) __obj.updateDynamic("maxTransactionsSize")(maxTransactionsSize.asInstanceOf[js.Any])
    if (maxWarningCount != null) __obj.updateDynamic("maxWarningCount")(maxWarningCount.asInstanceOf[js.Any])
    if (memoryLimit != null) __obj.updateDynamic("memoryLimit")(memoryLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(profile)) __obj.updateDynamic("profile")(profile)
    if (!js.isUndefined(skipInaccessibleCollections)) __obj.updateDynamic("skipInaccessibleCollections")(skipInaccessibleCollections)
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[QueryOptions]
  }
}

