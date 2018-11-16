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

