package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaInfoProperties extends js.Object {
  /**
    * Provides an alternate text for an image if the image cannot be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#altText)
    */
  var altText: js.UndefOr[String] = js.native
  /**
    * Defines a caption for the media.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#caption)
    */
  var caption: js.UndefOr[String] = js.native
  /**
    * The title of the media element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#title)
    */
  var title: js.UndefOr[String] = js.native
}

object MediaInfoProperties {
  @scala.inline
  def apply(): MediaInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaInfoProperties]
  }
  @scala.inline
  implicit class MediaInfoPropertiesOps[Self <: MediaInfoProperties] (val x: Self) extends AnyVal {
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
    def setAltText(value: String): Self = this.set("altText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltText: Self = this.set("altText", js.undefined)
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

