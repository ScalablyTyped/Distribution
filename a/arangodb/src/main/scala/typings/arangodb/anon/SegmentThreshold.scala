package typings.arangodb.anon

import typings.arangodb.ArangoDB.ArangoSearchViewConsolidationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentThreshold extends js.Object {
  var segmentThreshold: Double
  var threshold: Double
  var `type`: ArangoSearchViewConsolidationType
}

object SegmentThreshold {
  @scala.inline
  def apply(segmentThreshold: Double, threshold: Double, `type`: ArangoSearchViewConsolidationType): SegmentThreshold = {
    val __obj = js.Dynamic.literal(segmentThreshold = segmentThreshold.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentThreshold]
  }
}

