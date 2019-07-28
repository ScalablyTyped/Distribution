package typings.arangodb.ArangoDBNs

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.Anon_SegmentThresholdThreshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArangoSearchViewPropertiesOptions extends js.Object {
  var cleanupIntervalStep: js.UndefOr[Double] = js.undefined
  var consolidationIntervalMsec: js.UndefOr[Double] = js.undefined
  var consolidationPolicy: js.UndefOr[Anon_SegmentThresholdThreshold] = js.undefined
  var links: js.UndefOr[StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]] = js.undefined
}

object ArangoSearchViewPropertiesOptions {
  @scala.inline
  def apply(
    cleanupIntervalStep: Int | Double = null,
    consolidationIntervalMsec: Int | Double = null,
    consolidationPolicy: Anon_SegmentThresholdThreshold = null,
    links: StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]] = null
  ): ArangoSearchViewPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    if (cleanupIntervalStep != null) __obj.updateDynamic("cleanupIntervalStep")(cleanupIntervalStep.asInstanceOf[js.Any])
    if (consolidationIntervalMsec != null) __obj.updateDynamic("consolidationIntervalMsec")(consolidationIntervalMsec.asInstanceOf[js.Any])
    if (consolidationPolicy != null) __obj.updateDynamic("consolidationPolicy")(consolidationPolicy)
    if (links != null) __obj.updateDynamic("links")(links)
    __obj.asInstanceOf[ArangoSearchViewPropertiesOptions]
  }
}

