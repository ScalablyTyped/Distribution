package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureReductionSelectionProperties extends js.Object {
  /**
    * The feature reduction type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionSelection.html#type)
    */
  var `type`: js.UndefOr[selection] = js.undefined
}

object FeatureReductionSelectionProperties {
  @scala.inline
  def apply(`type`: selection = null): FeatureReductionSelectionProperties = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureReductionSelectionProperties]
  }
}

