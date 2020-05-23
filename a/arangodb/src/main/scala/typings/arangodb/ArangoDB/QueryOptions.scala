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
    intermediateCommitCount: js.UndefOr[Double] = js.undefined,
    intermediateCommitSize: js.UndefOr[Double] = js.undefined,
    maxNumberOfPlans: js.UndefOr[Double] = js.undefined,
    maxTransactionsSize: js.UndefOr[Double] = js.undefined,
    maxWarningCount: js.UndefOr[Double] = js.undefined,
    memoryLimit: js.UndefOr[Double] = js.undefined,
    profile: js.UndefOr[Boolean] = js.undefined,
    skipInaccessibleCollections: js.UndefOr[Boolean] = js.undefined,
    stream: js.UndefOr[Boolean] = js.undefined
  ): QueryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failOnWarning)) __obj.updateDynamic("failOnWarning")(failOnWarning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fullCount)) __obj.updateDynamic("fullCount")(fullCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(intermediateCommitCount)) __obj.updateDynamic("intermediateCommitCount")(intermediateCommitCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(intermediateCommitSize)) __obj.updateDynamic("intermediateCommitSize")(intermediateCommitSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxNumberOfPlans)) __obj.updateDynamic("maxNumberOfPlans")(maxNumberOfPlans.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTransactionsSize)) __obj.updateDynamic("maxTransactionsSize")(maxTransactionsSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWarningCount)) __obj.updateDynamic("maxWarningCount")(maxWarningCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(memoryLimit)) __obj.updateDynamic("memoryLimit")(memoryLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(profile)) __obj.updateDynamic("profile")(profile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipInaccessibleCollections)) __obj.updateDynamic("skipInaccessibleCollections")(skipInaccessibleCollections.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
}

