package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XContainerListener
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
trait XAnimatedImages extends XContainer {
  /**
    * specifies whether the animation should start over with the first image of the image series when the last image has been played.
    *
    * The default value for this attribute is `TRUE` .
    */
  var AutoRepeat: Boolean
  /** returns the number of images sets maintained by the component. */
  val ImageSetCount: Double
  /**
    * controls the way the images are scaled up or down, when the available space is larger or smaller than what is needed for them.
    *
    * Allowed values are those from the {@link ImageScaleMode} constants group.
    */
  var ScaleMode: Double
  /**
    * specifies the time in milliseconds between two animation steps.
    *
    * This is the minimum time, the actual value might be longer due to system load. The default value will be 100 ms.
    */
  var StepTime: Double
  /**
    * returns the URLs of the image set with the given index
    * @param iIndex the index of the set those image URLs are to be retrieved. Must be greater than or equal to `0` , and smaller than the value returned by {
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the `iIndex` is not a valid index.
    */
  def getImageSet(iIndex: Double): SafeArray[String]
  /** returns the number of images sets maintained by the component. */
  def getImageSetCount(): Double
  /**
    * sets the URLs of the image set with the given index
    * @param iIndex the index at which a new image set should be inserted. Must be greater than or equal to `0` , and smaller than or equal to the value retur
    * @param iImageURLs the URLs for the images for the given set. Will be resolved using a {@link com.sun.star.graphic.GraphicProvider} .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the `iIndex` is not a valid index.
    */
  def insertImageSet(iIndex: Double, iImageURLs: SeqEquiv[String]): Unit
  /**
    * removes the image set with the given index
    * @param iIndex the index of the set to remove. Must be greater than or equal to `0` , and smaller than the value returned by {@link getImageSetCount()} .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the `iIndex` is not a valid index.
    */
  def removeImageSet(iIndex: Double): Unit
  /**
    * replaces the image set given by index with a new one
    * @param iIndex the index of the set those image URLs are to be replaced. Must be greater than or equal to `0` , and smaller than the value returned by {@
    * @param iImageURLs the URLs for the images for the given set. Will be resolved using a {@link com.sun.star.graphic.GraphicProvider} .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the `iIndex` is not a valid index.
    */
  def replaceImageSet(iIndex: Double, iImageURLs: SeqEquiv[String]): Unit
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
    val __obj = js.Dynamic.literal(AutoRepeat = AutoRepeat, ImageSetCount = ImageSetCount, ScaleMode = ScaleMode, StepTime = StepTime, acquire = js.Any.fromFunction0(acquire), addContainerListener = js.Any.fromFunction1(addContainerListener), getImageSet = js.Any.fromFunction1(getImageSet), getImageSetCount = js.Any.fromFunction0(getImageSetCount), insertImageSet = js.Any.fromFunction2(insertImageSet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeContainerListener = js.Any.fromFunction1(removeContainerListener), removeImageSet = js.Any.fromFunction1(removeImageSet), replaceImageSet = js.Any.fromFunction2(replaceImageSet))
  
    __obj.asInstanceOf[XAnimatedImages]
  }
}

