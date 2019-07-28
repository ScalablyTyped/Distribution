package typings.arangodb.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionPropertiesOptions extends js.Object {
  var indexBuckets: js.UndefOr[Double] = js.undefined
  var journalSize: js.UndefOr[Double] = js.undefined
  var replicationFactor: js.UndefOr[Double] = js.undefined
  var waitForSync: js.UndefOr[Boolean] = js.undefined
}

object CollectionPropertiesOptions {
  @scala.inline
  def apply(
    indexBuckets: Int | Double = null,
    journalSize: Int | Double = null,
    replicationFactor: Int | Double = null,
    waitForSync: js.UndefOr[Boolean] = js.undefined
  ): CollectionPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    if (indexBuckets != null) __obj.updateDynamic("indexBuckets")(indexBuckets.asInstanceOf[js.Any])
    if (journalSize != null) __obj.updateDynamic("journalSize")(journalSize.asInstanceOf[js.Any])
    if (replicationFactor != null) __obj.updateDynamic("replicationFactor")(replicationFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForSync)) __obj.updateDynamic("waitForSync")(waitForSync)
    __obj.asInstanceOf[CollectionPropertiesOptions]
  }
}

