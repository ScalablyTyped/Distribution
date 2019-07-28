package typings.arangodb.ArangoDBNs

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.arangodbStrings.id
import typings.arangodb.arangodbStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArangoSearchViewCollectionLink extends js.Object {
  var analyzers: js.UndefOr[js.Array[String]] = js.undefined
  var fields: js.UndefOr[StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]] = js.undefined
  var includeAllFields: js.UndefOr[Boolean] = js.undefined
  var storeValues: js.UndefOr[none | id] = js.undefined
  var trackListPositions: js.UndefOr[Boolean] = js.undefined
}

object ArangoSearchViewCollectionLink {
  @scala.inline
  def apply(
    analyzers: js.Array[String] = null,
    fields: StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]] = null,
    includeAllFields: js.UndefOr[Boolean] = js.undefined,
    storeValues: none | id = null,
    trackListPositions: js.UndefOr[Boolean] = js.undefined
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

