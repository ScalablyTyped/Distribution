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

