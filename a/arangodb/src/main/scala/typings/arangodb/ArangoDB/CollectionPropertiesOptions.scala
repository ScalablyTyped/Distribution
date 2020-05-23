package typings.arangodb.ArangoDB

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
    indexBuckets: js.UndefOr[Double] = js.undefined,
    journalSize: js.UndefOr[Double] = js.undefined,
    replicationFactor: js.UndefOr[Double] = js.undefined,
    waitForSync: js.UndefOr[Boolean] = js.undefined
  ): CollectionPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(indexBuckets)) __obj.updateDynamic("indexBuckets")(indexBuckets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(journalSize)) __obj.updateDynamic("journalSize")(journalSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(replicationFactor)) __obj.updateDynamic("replicationFactor")(replicationFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForSync)) __obj.updateDynamic("waitForSync")(waitForSync.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionPropertiesOptions]
  }
}

