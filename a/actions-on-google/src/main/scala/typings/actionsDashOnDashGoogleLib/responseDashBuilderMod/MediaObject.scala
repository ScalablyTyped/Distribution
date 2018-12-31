package typings
package actionsDashOnDashGoogleLib.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/response-builder", "MediaObject")
@js.native
class MediaObject protected () extends js.Object {
  /**
    * Constructor for MediaObject.
    *
    * @param name Name of the MediaObject.
    * @param contentUrl URL of the MediaObject.
    */
  def this(name: java.lang.String, contentUrl: java.lang.String) = this()
  /**
    * MediaObject URL.
    */
  var contentUrl: java.lang.String = js.native
  /**
    * Description of the MediaObject.
    */
  var description: js.UndefOr[java.lang.String] = js.native
  /**
    * Icon image.
    */
  var icon: js.UndefOr[Image] = js.native
  /**
    * Large image.
    */
  var largeImage: js.UndefOr[Image] = js.native
  /**
    * Name of the MediaObject.
    */
  var name: java.lang.String = js.native
  /**
    * Set the description of the item.
    *
    * @param description Description of the item.
    * @return Returns current constructed MediaObject.
    */
  def setDescription(description: java.lang.String): MediaObject = js.native
  /**
    * Sets the image for this item.
    *
    * @param url Image source URL.
    * @param type Type of image (LARGE or ICON).
    * @return Returns current constructed MediaObject.
    */
  def setImage(
    url: java.lang.String,
    `type`: actionsDashOnDashGoogleLib.responseDashBuilderMod.MediaValuesNs.ImageType
  ): MediaObject = js.native
}

