package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implement this interface to represent images and icons.
  *
  * This interface is used for a representation of images like icons of buttons. The corresponding interface of the Java Accessibility API is
  * AccessibleIcon. This interface lets you retrieve an image's size and description.
  * @since OOo 1.1.2
  */
@js.native
trait XAccessibleImage extends XInterface {
  /**
    * Returns the localized description of the image.
    *
    * It depends on the usage of an image whether the description should express the image's function (e.g. for icons) or the actual content of the image
    * (e.g. for image maps or non-iconic images embedded into a document.)
    * @returns Returns a localized string that describes the image's function or content.
    */
  val AccessibleImageDescription: String = js.native
  /**
    * Returns the height of the image.
    *
    * The height is returned in units specified by the parents coordinate system.
    * @returns Returns the image's height with respect to the parent's coordinate system.
    */
  val AccessibleImageHeight: Double = js.native
  /**
    * Returns the width of the image.
    *
    * The width is returned in units specified by the parents coordinate system.
    * @returns Returns the image's width with respect to the parent's coordinate system.
    */
  val AccessibleImageWidth: Double = js.native
  /**
    * Returns the localized description of the image.
    *
    * It depends on the usage of an image whether the description should express the image's function (e.g. for icons) or the actual content of the image
    * (e.g. for image maps or non-iconic images embedded into a document.)
    * @returns Returns a localized string that describes the image's function or content.
    */
  def getAccessibleImageDescription(): String = js.native
  /**
    * Returns the height of the image.
    *
    * The height is returned in units specified by the parents coordinate system.
    * @returns Returns the image's height with respect to the parent's coordinate system.
    */
  def getAccessibleImageHeight(): Double = js.native
  /**
    * Returns the width of the image.
    *
    * The width is returned in units specified by the parents coordinate system.
    * @returns Returns the image's width with respect to the parent's coordinate system.
    */
  def getAccessibleImageWidth(): Double = js.native
}

object XAccessibleImage {
  @scala.inline
  def apply(
    AccessibleImageDescription: String,
    AccessibleImageHeight: Double,
    AccessibleImageWidth: Double,
    acquire: () => Unit,
    getAccessibleImageDescription: () => String,
    getAccessibleImageHeight: () => Double,
    getAccessibleImageWidth: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAccessibleImage = {
    val __obj = js.Dynamic.literal(AccessibleImageDescription = AccessibleImageDescription.asInstanceOf[js.Any], AccessibleImageHeight = AccessibleImageHeight.asInstanceOf[js.Any], AccessibleImageWidth = AccessibleImageWidth.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAccessibleImageDescription = js.Any.fromFunction0(getAccessibleImageDescription), getAccessibleImageHeight = js.Any.fromFunction0(getAccessibleImageHeight), getAccessibleImageWidth = js.Any.fromFunction0(getAccessibleImageWidth), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAccessibleImage]
  }
  @scala.inline
  implicit class XAccessibleImageOps[Self <: XAccessibleImage] (val x: Self) extends AnyVal {
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
    def setAccessibleImageDescription(value: String): Self = this.set("AccessibleImageDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessibleImageHeight(value: Double): Self = this.set("AccessibleImageHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessibleImageWidth(value: Double): Self = this.set("AccessibleImageWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAccessibleImageDescription(value: () => String): Self = this.set("getAccessibleImageDescription", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAccessibleImageHeight(value: () => Double): Self = this.set("getAccessibleImageHeight", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAccessibleImageWidth(value: () => Double): Self = this.set("getAccessibleImageWidth", js.Any.fromFunction0(value))
  }
  
}

