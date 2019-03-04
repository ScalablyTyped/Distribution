package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArangoSearchViewProperties extends js.Object {
  var cleanupIntervalStep: scala.Double
  var consolidationIntervalMsec: scala.Double
  var consolidationPolicy: arangodbLib.Anon_SegmentThreshold
  var id: java.lang.String
  var links: org.scalablytyped.runtime.StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]
  var name: java.lang.String
  var `type`: arangodbLib.arangodbLibStrings.arangosearch
}

object ArangoSearchViewProperties {
  @scala.inline
  def apply(
    cleanupIntervalStep: scala.Double,
    consolidationIntervalMsec: scala.Double,
    consolidationPolicy: arangodbLib.Anon_SegmentThreshold,
    id: java.lang.String,
    links: org.scalablytyped.runtime.StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]],
    name: java.lang.String,
    `type`: arangodbLib.arangodbLibStrings.arangosearch
  ): ArangoSearchViewProperties = {
    val __obj = js.Dynamic.literal(cleanupIntervalStep = cleanupIntervalStep, consolidationIntervalMsec = consolidationIntervalMsec, consolidationPolicy = consolidationPolicy, id = id, links = links, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ArangoSearchViewProperties]
  }
}

