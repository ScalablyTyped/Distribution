package typings.arangodb.arangodbGeneralGraphMod

import typings.arangodb.ArangoDB.EdgeDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortestPathOptions extends js.Object {
  var defaultWeight: js.UndefOr[Double] = js.undefined
  var direction: js.UndefOr[EdgeDirection] = js.undefined
  var edgeCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.undefined
  var endVertexCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.undefined
  var startVertexCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.undefined
  var weight: js.UndefOr[String] = js.undefined
}

object ShortestPathOptions {
  @scala.inline
  def apply(
    defaultWeight: Int | Double = null,
    direction: EdgeDirection = null,
    edgeCollectionRestriction: js.Array[String] | String = null,
    endVertexCollectionRestriction: js.Array[String] | String = null,
    startVertexCollectionRestriction: js.Array[String] | String = null,
    weight: String = null
  ): ShortestPathOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultWeight != null) __obj.updateDynamic("defaultWeight")(defaultWeight.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (edgeCollectionRestriction != null) __obj.updateDynamic("edgeCollectionRestriction")(edgeCollectionRestriction.asInstanceOf[js.Any])
    if (endVertexCollectionRestriction != null) __obj.updateDynamic("endVertexCollectionRestriction")(endVertexCollectionRestriction.asInstanceOf[js.Any])
    if (startVertexCollectionRestriction != null) __obj.updateDynamic("startVertexCollectionRestriction")(startVertexCollectionRestriction.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortestPathOptions]
  }
}

