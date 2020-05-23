package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  var collections: TransactionCollections | js.Array[String]
  var intermediateCommitCount: js.UndefOr[Double] = js.undefined
  var intermediateCommitSize: js.UndefOr[Double] = js.undefined
  var lockTimeout: js.UndefOr[Double] = js.undefined
  // RocksDB
  var maxTransactionsSize: js.UndefOr[Double] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var waitForSync: js.UndefOr[Boolean] = js.undefined
  def action(params: js.Object): Unit | String
}

object Transaction {
  @scala.inline
  def apply(
    action: js.Object => Unit | String,
    collections: TransactionCollections | js.Array[String],
    intermediateCommitCount: js.UndefOr[Double] = js.undefined,
    intermediateCommitSize: js.UndefOr[Double] = js.undefined,
    lockTimeout: js.UndefOr[Double] = js.undefined,
    maxTransactionsSize: js.UndefOr[Double] = js.undefined,
    params: js.Object = null,
    waitForSync: js.UndefOr[Boolean] = js.undefined
  ): Transaction = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), collections = collections.asInstanceOf[js.Any])
    if (!js.isUndefined(intermediateCommitCount)) __obj.updateDynamic("intermediateCommitCount")(intermediateCommitCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(intermediateCommitSize)) __obj.updateDynamic("intermediateCommitSize")(intermediateCommitSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lockTimeout)) __obj.updateDynamic("lockTimeout")(lockTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTransactionsSize)) __obj.updateDynamic("maxTransactionsSize")(maxTransactionsSize.get.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForSync)) __obj.updateDynamic("waitForSync")(waitForSync.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
}

