package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureReductionSelectionProperties extends js.Object {
  /**
    * The feature reduction type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionSelection.html#type)
    */
  var `type`: js.UndefOr[selection] = js.native
}

object FeatureReductionSelectionProperties {
  @scala.inline
  def apply(): FeatureReductionSelectionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureReductionSelectionProperties]
  }
  @scala.inline
  implicit class FeatureReductionSelectionPropertiesOps[Self <: FeatureReductionSelectionProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: selection): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

