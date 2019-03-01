package typings
package arangodbLib.atArangodbGeneralDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NeighborsOptions extends js.Object {
  var direction: js.UndefOr[arangodbLib.ArangoDBNs.EdgeDirection] = js.undefined
  var edgeCollectionRestriction: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var edgeExamples: js.UndefOr[Example] = js.undefined
  var maxDepth: js.UndefOr[scala.Double] = js.undefined
  var minDepth: js.UndefOr[scala.Double] = js.undefined
  var neighborExamples: js.UndefOr[Example] = js.undefined
  var vertexCollectionRestriction: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
}

object NeighborsOptions {
  @scala.inline
  def apply(
    direction: arangodbLib.ArangoDBNs.EdgeDirection = null,
    edgeCollectionRestriction: js.Array[java.lang.String] | java.lang.String = null,
    edgeExamples: Example = null,
    maxDepth: scala.Int | scala.Double = null,
    minDepth: scala.Int | scala.Double = null,
    neighborExamples: Example = null,
    vertexCollectionRestriction: js.Array[java.lang.String] | java.lang.String = null
  ): NeighborsOptions = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (edgeCollectionRestriction != null) __obj.updateDynamic("edgeCollectionRestriction")(edgeCollectionRestriction.asInstanceOf[js.Any])
    if (edgeExamples != null) __obj.updateDynamic("edgeExamples")(edgeExamples.asInstanceOf[js.Any])
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (minDepth != null) __obj.updateDynamic("minDepth")(minDepth.asInstanceOf[js.Any])
    if (neighborExamples != null) __obj.updateDynamic("neighborExamples")(neighborExamples.asInstanceOf[js.Any])
    if (vertexCollectionRestriction != null) __obj.updateDynamic("vertexCollectionRestriction")(vertexCollectionRestriction.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeighborsOptions]
  }
}

