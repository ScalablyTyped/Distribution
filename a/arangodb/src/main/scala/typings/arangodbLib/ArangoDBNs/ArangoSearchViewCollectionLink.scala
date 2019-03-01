package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArangoSearchViewCollectionLink extends js.Object {
  var analyzers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var fields: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]
  ] = js.undefined
  var includeAllFields: js.UndefOr[scala.Boolean] = js.undefined
  var storeValues: js.UndefOr[arangodbLib.arangodbLibStrings.none | arangodbLib.arangodbLibStrings.id] = js.undefined
  var trackListPositions: js.UndefOr[scala.Boolean] = js.undefined
}

object ArangoSearchViewCollectionLink {
  @scala.inline
  def apply(
    analyzers: js.Array[java.lang.String] = null,
    fields: org.scalablytyped.runtime.StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]] = null,
    includeAllFields: js.UndefOr[scala.Boolean] = js.undefined,
    storeValues: arangodbLib.arangodbLibStrings.none | arangodbLib.arangodbLibStrings.id = null,
    trackListPositions: js.UndefOr[scala.Boolean] = js.undefined
  ): ArangoSearchViewCollectionLink = {
    val __obj = js.Dynamic.literal()
    if (analyzers != null) __obj.updateDynamic("analyzers")(analyzers)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(includeAllFields)) __obj.updateDynamic("includeAllFields")(includeAllFields)
    if (storeValues != null) __obj.updateDynamic("storeValues")(storeValues.asInstanceOf[js.Any])
    if (!js.isUndefined(trackListPositions)) __obj.updateDynamic("trackListPositions")(trackListPositions)
    __obj.asInstanceOf[ArangoSearchViewCollectionLink]
  }
}

