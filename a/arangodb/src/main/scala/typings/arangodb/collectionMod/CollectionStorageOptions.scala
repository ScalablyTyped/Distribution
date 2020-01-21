package typings.arangodb.collectionMod

import typings.arangodb.ArangoDB.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionStorageOptions extends js.Object {
  var autoUpdate: js.UndefOr[Boolean] = js.undefined
  var collection: String | Collection[_]
  var pruneExpired: js.UndefOr[Boolean] = js.undefined
  var ttl: js.UndefOr[Double] = js.undefined
}

object CollectionStorageOptions {
  @scala.inline
  def apply(
    collection: String | Collection[_],
    autoUpdate: js.UndefOr[Boolean] = js.undefined,
    pruneExpired: js.UndefOr[Boolean] = js.undefined,
    ttl: Int | Double = null
  ): CollectionStorageOptions = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
    if (!js.isUndefined(autoUpdate)) __obj.updateDynamic("autoUpdate")(autoUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(pruneExpired)) __obj.updateDynamic("pruneExpired")(pruneExpired.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionStorageOptions]
  }
}

