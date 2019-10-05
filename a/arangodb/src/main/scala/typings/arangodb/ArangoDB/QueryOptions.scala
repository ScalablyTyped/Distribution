package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var cache: js.UndefOr[Boolean] = js.undefined
  var count: js.UndefOr[Boolean] = js.undefined
  var failOnWarning: js.UndefOr[Boolean] = js.undefined
  var fullCount: js.UndefOr[Boolean] = js.undefined
  var intermediateCommitCount: js.UndefOr[Double] = js.undefined
  var intermediateCommitSize: js.UndefOr[Double] = js.undefined
  var maxNumberOfPlans: js.UndefOr[Double] = js.undefined
  // RocksDB
  var maxTransactionsSize: js.UndefOr[Double] = js.undefined
  var maxWarningCount: js.UndefOr[Double] = js.undefined
  var memoryLimit: js.UndefOr[Double] = js.undefined
  var profile: js.UndefOr[Boolean] = js.undefined
  // enterprise
  var skipInaccessibleCollections: js.UndefOr[Boolean] = js.undefined
  var stream: js.UndefOr[Boolean] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply(
    cache: js.UndefOr[Boolean] = js.undefined,
    count: js.UndefOr[Boolean] = js.undefined,
    failOnWarning: js.UndefOr[Boolean] = js.undefined,
    fullCount: js.UndefOr[Boolean] = js.undefined,
    intermediateCommitCount: Int | Double = null,
    intermediateCommitSize: Int | Double = null,
    maxNumberOfPlans: Int | Double = null,
    maxTransactionsSize: Int | Double = null,
    maxWarningCount: Int | Double = null,
    memoryLimit: Int | Double = null,
    profile: js.UndefOr[Boolean] = js.undefined,
    skipInaccessibleCollections: js.UndefOr[Boolean] = js.undefined,
    stream: js.UndefOr[Boolean] = js.undefined
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

