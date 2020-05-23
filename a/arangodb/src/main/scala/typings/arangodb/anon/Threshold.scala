package typings.arangodb.anon

import typings.arangodb.ArangoDB.ArangoSearchViewConsolidationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Threshold extends js.Object {
  var segmentThreshold: js.UndefOr[Double] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[ArangoSearchViewConsolidationType] = js.undefined
}

object Threshold {
  @scala.inline
  def apply(
    segmentThreshold: js.UndefOr[Double] = js.undefined,
    threshold: js.UndefOr[Double] = js.undefined,
    `type`: ArangoSearchViewConsolidationType = null
  ): Threshold = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(segmentThreshold)) __obj.updateDynamic("segmentThreshold")(segmentThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Threshold]
  }
}

