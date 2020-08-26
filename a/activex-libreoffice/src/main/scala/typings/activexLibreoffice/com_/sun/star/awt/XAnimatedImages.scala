package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XContainer
import typings.activexLibreoffice.com_.sun.star.container.XContainerListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows administrating a set of images, to be displayed as animated seres.
  *
  * Components implementing this interface maintain a variable number of image sets. Components displaying those images will choose the best-fitting image
  * set depending on the available space, and possibly other restrictions.
  * @since OOo 3.4
  */
@js.native
trait XAnimatedImages extends XContainer {
  /**
    * specifies whether the animation should start over with the first image of the image series when the last image has been played.
    *
    * The default value for this attribute is `TRUE` .
    */
  var AutoRepeat: Boolean = js.native
  /** returns the number of images sets maintained by the component. */
  val ImageSetCount: Double = js.native
  /**
    * controls the way the images are scaled up or down, when the available space is larger or smaller than what is needed for them.
    *
    * Allowed values are those from the {@link ImageScaleMode} constants group.
    */
  var ScaleMode: Double = js.native
  /**
    * specifies the time in milliseconds between two animation steps.
    *
    * This is the minimum time, the actual value might be longer due to system load. The default value will be 100 ms.
    */
  var StepTime: Double = js.native
  /**
    * returns the URLs of the image set with the given index
    * @param iIndex the index of the set those image URLs are to be retrieved. Must be greater than or equal to `0` , and smaller than the value returned by {
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the `iIndex` is not a valid index.
    */
  def getImageSet(iIndex: Double): SafeArray[String] = js.native
  /** returns the number of images sets maintained by the component. */
  def getImageSetCount(): Double = js.native
  /**
    * sets the URLs of the image set with the given index
    * @param iIndex the index at which a new image set should be inserted. Must be greater than or equal to `0` , and smaller than or equal to the value retur
    * @param iImageURLs the URLs for the images for the given set. Will be resolved using a {@link com.sun.star.graphic.GraphicProvider} .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the `iIndex` is not a valid index.
    */
  def insertImageSet(iIndex: Double, iImageURLs: SeqEquiv[String]): Unit = js.native
  /**
    * removes the image set with the given index
    * @param iIndex the index of the set to remove. Must be greater than or equal to `0` , and smaller than the value returned by {@link getImageSetCount()} .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the `iIndex` is not a valid index.
    */
  def removeImageSet(iIndex: Double): Unit = js.native
  /**
    * replaces the image set given by index with a new one
    * @param iIndex the index of the set those image URLs are to be replaced. Must be greater than or equal to `0` , and smaller than the value returned by {@
    * @param iImageURLs the URLs for the images for the given set. Will be resolved using a {@link com.sun.star.graphic.GraphicProvider} .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the `iIndex` is not a valid index.
    */
  def replaceImageSet(iIndex: Double, iImageURLs: SeqEquiv[String]): Unit = js.native
}

object XAnimatedImages {
  @scala.inline
  def apply(
    AutoRepeat: Boolean,
    ImageSetCount: Double,
    ScaleMode: Double,
    StepTime: Double,
    acquire: () => Unit,
    addContainerListener: XContainerListener => Unit,
    getImageSet: Double => SafeArray[String],
    getImageSetCount: () => Double,
    insertImageSet: (Double, SeqEquiv[String]) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeContainerListener: XContainerListener => Unit,
    removeImageSet: Double => Unit,
    replaceImageSet: (Double, SeqEquiv[String]) => Unit
  ): XAnimatedImages = {
    val __obj = js.Dynamic.literal(AutoRepeat = AutoRepeat.asInstanceOf[js.Any], ImageSetCount = ImageSetCount.asInstanceOf[js.Any], ScaleMode = ScaleMode.asInstanceOf[js.Any], StepTime = StepTime.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addContainerListener = js.Any.fromFunction1(addContainerListener), getImageSet = js.Any.fromFunction1(getImageSet), getImageSetCount = js.Any.fromFunction0(getImageSetCount), insertImageSet = js.Any.fromFunction2(insertImageSet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeContainerListener = js.Any.fromFunction1(removeContainerListener), removeImageSet = js.Any.fromFunction1(removeImageSet), replaceImageSet = js.Any.fromFunction2(replaceImageSet))
    __obj.asInstanceOf[XAnimatedImages]
  }
  @scala.inline
  implicit class XAnimatedImagesOps[Self <: XAnimatedImages] (val x: Self) extends AnyVal {
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
    def setAutoRepeat(value: Boolean): Self = this.set("AutoRepeat", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageSetCount(value: Double): Self = this.set("ImageSetCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleMode(value: Double): Self = this.set("ScaleMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepTime(value: Double): Self = this.set("StepTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetImageSet(value: Double => SafeArray[String]): Self = this.set("getImageSet", js.Any.fromFunction1(value))
    @scala.inline
    def setGetImageSetCount(value: () => Double): Self = this.set("getImageSetCount", js.Any.fromFunction0(value))
    @scala.inline
    def setInsertImageSet(value: (Double, SeqEquiv[String]) => Unit): Self = this.set("insertImageSet", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveImageSet(value: Double => Unit): Self = this.set("removeImageSet", js.Any.fromFunction1(value))
    @scala.inline
    def setReplaceImageSet(value: (Double, SeqEquiv[String]) => Unit): Self = this.set("replaceImageSet", js.Any.fromFunction2(value))
  }
  
}

