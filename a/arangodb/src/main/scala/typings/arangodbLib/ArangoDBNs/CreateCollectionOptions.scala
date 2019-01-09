package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCollectionOptions extends js.Object {
  var isSystem: js.UndefOr[scala.Boolean] = js.undefined
  var isVolatile: js.UndefOr[scala.Boolean] = js.undefined
  var journalSize: js.UndefOr[scala.Double] = js.undefined
  var keyOptions: js.UndefOr[arangodbLib.Anon_AllowUserKeys] = js.undefined
  var numberOfShards: js.UndefOr[scala.Double] = js.undefined
  var replicationFactor: js.UndefOr[scala.Double] = js.undefined
  var shardKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var waitForSync: js.UndefOr[scala.Boolean] = js.undefined
}

