package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArangoSearchViewPropertiesOptions extends js.Object {
  var cleanupIntervalStep: js.UndefOr[scala.Double] = js.undefined
  var consolidationIntervalMsec: js.UndefOr[scala.Double] = js.undefined
  var consolidationPolicy: js.UndefOr[arangodbLib.Anon_SegmentThresholdThreshold] = js.undefined
  var links: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]
  ] = js.undefined
}

object ArangoSearchViewPropertiesOptions {
  @scala.inline
  def apply(
    cleanupIntervalStep: scala.Int | scala.Double = null,
    consolidationIntervalMsec: scala.Int | scala.Double = null,
    consolidationPolicy: arangodbLib.Anon_SegmentThresholdThreshold = null,
    links: org.scalablytyped.runtime.StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]] = null
  ): ArangoSearchViewPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    if (cleanupIntervalStep != null) __obj.updateDynamic("cleanupIntervalStep")(cleanupIntervalStep.asInstanceOf[js.Any])
    if (consolidationIntervalMsec != null) __obj.updateDynamic("consolidationIntervalMsec")(consolidationIntervalMsec.asInstanceOf[js.Any])
    if (consolidationPolicy != null) __obj.updateDynamic("consolidationPolicy")(consolidationPolicy)
    if (links != null) __obj.updateDynamic("links")(links)
    __obj.asInstanceOf[ArangoSearchViewPropertiesOptions]
  }
}

