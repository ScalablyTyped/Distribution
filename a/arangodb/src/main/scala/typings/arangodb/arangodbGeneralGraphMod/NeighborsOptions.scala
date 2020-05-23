package typings.arangodb.arangodbGeneralGraphMod

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
    edgeExamples: js.UndefOr[Null | Example] = js.undefined,
    maxDepth: js.UndefOr[Double] = js.undefined,
    minDepth: js.UndefOr[Double] = js.undefined,
    neighborExamples: js.UndefOr[Null | Example] = js.undefined,
    vertexCollectionRestriction: js.Array[String] | String = null
  ): NeighborsOptions = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (edgeCollectionRestriction != null) __obj.updateDynamic("edgeCollectionRestriction")(edgeCollectionRestriction.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeExamples)) __obj.updateDynamic("edgeExamples")(edgeExamples.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDepth)) __obj.updateDynamic("maxDepth")(maxDepth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minDepth)) __obj.updateDynamic("minDepth")(minDepth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(neighborExamples)) __obj.updateDynamic("neighborExamples")(neighborExamples.asInstanceOf[js.Any])
    if (vertexCollectionRestriction != null) __obj.updateDynamic("vertexCollectionRestriction")(vertexCollectionRestriction.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeighborsOptions]
  }
}

