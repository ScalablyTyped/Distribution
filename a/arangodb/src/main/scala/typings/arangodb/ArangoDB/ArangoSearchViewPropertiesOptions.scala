package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.anon.Threshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArangoSearchViewPropertiesOptions extends js.Object {
  var cleanupIntervalStep: js.UndefOr[Double] = js.undefined
  var consolidationIntervalMsec: js.UndefOr[Double] = js.undefined
  var consolidationPolicy: js.UndefOr[Threshold] = js.undefined
  var links: js.UndefOr[StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]] = js.undefined
}

object ArangoSearchViewPropertiesOptions {
  @scala.inline
  def apply(
    cleanupIntervalStep: js.UndefOr[Double] = js.undefined,
    consolidationIntervalMsec: js.UndefOr[Double] = js.undefined,
    consolidationPolicy: Threshold = null,
    links: StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]] = null
  ): ArangoSearchViewPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cleanupIntervalStep)) __obj.updateDynamic("cleanupIntervalStep")(cleanupIntervalStep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(consolidationIntervalMsec)) __obj.updateDynamic("consolidationIntervalMsec")(consolidationIntervalMsec.get.asInstanceOf[js.Any])
    if (consolidationPolicy != null) __obj.updateDynamic("consolidationPolicy")(consolidationPolicy.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArangoSearchViewPropertiesOptions]
  }
}

