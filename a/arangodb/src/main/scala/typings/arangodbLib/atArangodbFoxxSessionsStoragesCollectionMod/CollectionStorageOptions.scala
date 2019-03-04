package typings
package arangodbLib.atArangodbFoxxSessionsStoragesCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionStorageOptions extends js.Object {
  var autoUpdate: js.UndefOr[scala.Boolean] = js.undefined
  var collection: java.lang.String | arangodbLib.ArangoDBNs.Collection[_]
  var pruneExpired: js.UndefOr[scala.Boolean] = js.undefined
  var ttl: js.UndefOr[scala.Double] = js.undefined
}

object CollectionStorageOptions {
  @scala.inline
  def apply(
    collection: java.lang.String | arangodbLib.ArangoDBNs.Collection[_],
    autoUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    pruneExpired: js.UndefOr[scala.Boolean] = js.undefined,
    ttl: scala.Int | scala.Double = null
  ): CollectionStorageOptions = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
    if (!js.isUndefined(autoUpdate)) __obj.updateDynamic("autoUpdate")(autoUpdate)
    if (!js.isUndefined(pruneExpired)) __obj.updateDynamic("pruneExpired")(pruneExpired)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionStorageOptions]
  }
}

