package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionProperties extends js.Object {
  var indexBuckets: scala.Double
  var isSystem: scala.Boolean
  var isVolatile: scala.Boolean
  var journalSize: scala.Double
  var keyOptions: js.UndefOr[arangodbLib.Anon_AllowUserKeys] = js.undefined
  var numberOfShards: js.UndefOr[scala.Double] = js.undefined
  var replicationFactor: js.UndefOr[scala.Double] = js.undefined
  var shardKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var waitForSync: scala.Boolean
}

