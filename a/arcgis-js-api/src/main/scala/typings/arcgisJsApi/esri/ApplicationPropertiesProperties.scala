package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationPropertiesProperties extends js.Object {
  /**
    * View-specific properties of application and UI elements for the web map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-ApplicationProperties.html#viewing)
    */
  var viewing: js.UndefOr[ViewingProperties] = js.native
}

object ApplicationPropertiesProperties {
  @scala.inline
  def apply(): ApplicationPropertiesProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationPropertiesProperties]
  }
  @scala.inline
  implicit class ApplicationPropertiesPropertiesOps[Self <: ApplicationPropertiesProperties] (val x: Self) extends AnyVal {
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
    def setViewing(value: ViewingProperties): Self = this.set("viewing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewing: Self = this.set("viewing", js.undefined)
  }
  
}

