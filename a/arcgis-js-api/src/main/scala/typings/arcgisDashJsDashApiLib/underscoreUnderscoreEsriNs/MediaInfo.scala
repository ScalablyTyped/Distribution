package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaInfo extends js.Object {
  /**
    * Defines a caption for the media.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#caption)
    */
  var caption: java.lang.String
  /**
    * The title of the media element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#title)
    */
  var title: java.lang.String
}

@JSGlobal("__esri.MediaInfo")
@js.native
class MediaInfoCls () extends MediaInfo {
  /**
    * Defines a caption for the media.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#caption)
    */
  /* CompleteClass */
  override var caption: java.lang.String = js.native
  /**
    * The title of the media element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-MediaInfo.html#title)
    */
  /* CompleteClass */
  override var title: java.lang.String = js.native
}

object MediaInfo {
  @scala.inline
  def apply(caption: java.lang.String, title: java.lang.String): MediaInfo = {
    val __obj = js.Dynamic.literal(caption = caption, title = title)
  
    __obj.asInstanceOf[MediaInfo]
  }
}

