package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SegmentThresholdThreshold extends js.Object {
  var segmentThreshold: js.UndefOr[scala.Double] = js.undefined
  var threshold: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[arangodbLib.ArangoDBNs.ArangoSearchViewConsolidationType] = js.undefined
}

object Anon_SegmentThresholdThreshold {
  @scala.inline
  def apply(
    segmentThreshold: scala.Int | scala.Double = null,
    threshold: scala.Int | scala.Double = null,
    `type`: arangodbLib.ArangoDBNs.ArangoSearchViewConsolidationType = null
  ): Anon_SegmentThresholdThreshold = {
    val __obj = js.Dynamic.literal()
    if (segmentThreshold != null) __obj.updateDynamic("segmentThreshold")(segmentThreshold.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_SegmentThresholdThreshold]
  }
}

