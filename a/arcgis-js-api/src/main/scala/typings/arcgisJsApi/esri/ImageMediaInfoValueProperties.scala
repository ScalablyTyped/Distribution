package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageMediaInfoValueProperties extends js.Object {
  /**
    * A string containing a URL to be launched in a browser when a user clicks the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ImageMediaInfoValue.html#linkURL)
    */
  var linkURL: js.UndefOr[String] = js.undefined
  /**
    * A string containing the URL to the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ImageMediaInfoValue.html#sourceURL)
    */
  var sourceURL: js.UndefOr[String] = js.undefined
}

object ImageMediaInfoValueProperties {
  @scala.inline
  def apply(linkURL: String = null, sourceURL: String = null): ImageMediaInfoValueProperties = {
    val __obj = js.Dynamic.literal()
    if (linkURL != null) __obj.updateDynamic("linkURL")(linkURL.asInstanceOf[js.Any])
    if (sourceURL != null) __obj.updateDynamic("sourceURL")(sourceURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMediaInfoValueProperties]
  }
}

