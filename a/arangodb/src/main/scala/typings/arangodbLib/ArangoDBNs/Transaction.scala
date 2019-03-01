package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  var collections: TransactionCollections | js.Array[java.lang.String]
  var intermediateCommitCount: js.UndefOr[scala.Double] = js.undefined
  var intermediateCommitSize: js.UndefOr[scala.Double] = js.undefined
  var lockTimeout: js.UndefOr[scala.Double] = js.undefined
  // RocksDB
  var maxTransactionsSize: js.UndefOr[scala.Double] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var waitForSync: js.UndefOr[scala.Boolean] = js.undefined
  def action(params: js.Object): scala.Unit | java.lang.String
}

object Transaction {
  @scala.inline
  def apply(
    action: js.Function1[js.Object, scala.Unit | java.lang.String],
    collections: TransactionCollections | js.Array[java.lang.String],
    intermediateCommitCount: scala.Int | scala.Double = null,
    intermediateCommitSize: scala.Int | scala.Double = null,
    lockTimeout: scala.Int | scala.Double = null,
    maxTransactionsSize: scala.Int | scala.Double = null,
    params: js.Object = null,
    waitForSync: js.UndefOr[scala.Boolean] = js.undefined
  ): Transaction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("collections")(collections.asInstanceOf[js.Any])
    if (intermediateCommitCount != null) __obj.updateDynamic("intermediateCommitCount")(intermediateCommitCount.asInstanceOf[js.Any])
    if (intermediateCommitSize != null) __obj.updateDynamic("intermediateCommitSize")(intermediateCommitSize.asInstanceOf[js.Any])
    if (lockTimeout != null) __obj.updateDynamic("lockTimeout")(lockTimeout.asInstanceOf[js.Any])
    if (maxTransactionsSize != null) __obj.updateDynamic("maxTransactionsSize")(maxTransactionsSize.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    if (!js.isUndefined(waitForSync)) __obj.updateDynamic("waitForSync")(waitForSync)
    __obj.asInstanceOf[Transaction]
  }
}

