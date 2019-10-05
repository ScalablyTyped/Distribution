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
    intermediateCommitCount: Int | Double = null,
    intermediateCommitSize: Int | Double = null,
    lockTimeout: Int | Double = null,
    maxTransactionsSize: Int | Double = null,
    params: js.Object = null,
    waitForSync: js.UndefOr[Boolean] = js.undefined
  ): Transaction = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), collections = collections.asInstanceOf[js.Any])
    if (intermediateCommitCount != null) __obj.updateDynamic("intermediateCommitCount")(intermediateCommitCount.asInstanceOf[js.Any])
    if (intermediateCommitSize != null) __obj.updateDynamic("intermediateCommitSize")(intermediateCommitSize.asInstanceOf[js.Any])
    if (lockTimeout != null) __obj.updateDynamic("lockTimeout")(lockTimeout.asInstanceOf[js.Any])
    if (maxTransactionsSize != null) __obj.updateDynamic("maxTransactionsSize")(maxTransactionsSize.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    if (!js.isUndefined(waitForSync)) __obj.updateDynamic("waitForSync")(waitForSync)
    __obj.asInstanceOf[Transaction]
  }
}

