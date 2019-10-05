package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.Anon_SegmentThreshold
import typings.arangodb.arangodbStrings.arangosearch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArangoSearchViewProperties extends js.Object {
  var cleanupIntervalStep: Double
  var consolidationIntervalMsec: Double
  var consolidationPolicy: Anon_SegmentThreshold
  var id: String
  var links: StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]
  var name: String
  var `type`: arangosearch
}

object ArangoSearchViewProperties {
  @scala.inline
  def apply(
    cleanupIntervalStep: Double,
    consolidationIntervalMsec: Double,
    consolidationPolicy: Anon_SegmentThreshold,
    id: String,
    links: StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]],
    name: String,
    `type`: arangosearch
  ): ArangoSearchViewProperties = {
    val __obj = js.Dynamic.literal(cleanupIntervalStep = cleanupIntervalStep, consolidationIntervalMsec = consolidationIntervalMsec, consolidationPolicy = consolidationPolicy, id = id, links = links, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ArangoSearchViewProperties]
  }
}

