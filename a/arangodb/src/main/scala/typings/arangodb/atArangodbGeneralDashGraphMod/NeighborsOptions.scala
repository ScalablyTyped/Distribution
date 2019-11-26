package typings.arangodb.atArangodbGeneralDashGraphMod

import typings.arangodb.ArangoDB.EdgeDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NeighborsOptions extends js.Object {
  var direction: js.UndefOr[EdgeDirection] = js.undefined
  var edgeCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.undefined
  var edgeExamples: js.UndefOr[Example] = js.undefined
  var maxDepth: js.UndefOr[Double] = js.undefined
  var minDepth: js.UndefOr[Double] = js.undefined
  var neighborExamples: js.UndefOr[Example] = js.undefined
  var vertexCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.undefined
}

object NeighborsOptions {
  @scala.inline
  def apply(
    direction: EdgeDirection = null,
    edgeCollectionRestriction: js.Array[String] | String = null,
    edgeExamples: Example = null,
    maxDepth: Int | Double = null,
    minDepth: Int | Double = null,
    neighborExamples: Example = null,
    vertexCollectionRestriction: js.Array[String] | String = null
  ): NeighborsOptions = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (edgeCollectionRestriction != null) __obj.updateDynamic("edgeCollectionRestriction")(edgeCollectionRestriction.asInstanceOf[js.Any])
    if (edgeExamples != null) __obj.updateDynamic("edgeExamples")(edgeExamples.asInstanceOf[js.Any])
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (minDepth != null) __obj.updateDynamic("minDepth")(minDepth.asInstanceOf[js.Any])
    if (neighborExamples != null) __obj.updateDynamic("neighborExamples")(neighborExamples.asInstanceOf[js.Any])
    if (vertexCollectionRestriction != null) __obj.updateDynamic("vertexCollectionRestriction")(vertexCollectionRestriction.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeighborsOptions]
  }
}

