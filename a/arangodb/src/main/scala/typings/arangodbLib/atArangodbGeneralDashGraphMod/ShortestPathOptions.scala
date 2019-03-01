package typings
package arangodbLib.atArangodbGeneralDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortestPathOptions extends js.Object {
  var defaultWeight: js.UndefOr[scala.Double] = js.undefined
  var direction: js.UndefOr[arangodbLib.ArangoDBNs.EdgeDirection] = js.undefined
  var edgeCollectionRestriction: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var endVertexCollectionRestriction: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var startVertexCollectionRestriction: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var weight: js.UndefOr[java.lang.String] = js.undefined
}

object ShortestPathOptions {
  @scala.inline
  def apply(
    defaultWeight: scala.Int | scala.Double = null,
    direction: arangodbLib.ArangoDBNs.EdgeDirection = null,
    edgeCollectionRestriction: js.Array[java.lang.String] | java.lang.String = null,
    endVertexCollectionRestriction: js.Array[java.lang.String] | java.lang.String = null,
    startVertexCollectionRestriction: js.Array[java.lang.String] | java.lang.String = null,
    weight: java.lang.String = null
  ): ShortestPathOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultWeight != null) __obj.updateDynamic("defaultWeight")(defaultWeight.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (edgeCollectionRestriction != null) __obj.updateDynamic("edgeCollectionRestriction")(edgeCollectionRestriction.asInstanceOf[js.Any])
    if (endVertexCollectionRestriction != null) __obj.updateDynamic("endVertexCollectionRestriction")(endVertexCollectionRestriction.asInstanceOf[js.Any])
    if (startVertexCollectionRestriction != null) __obj.updateDynamic("startVertexCollectionRestriction")(startVertexCollectionRestriction.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[ShortestPathOptions]
  }
}

