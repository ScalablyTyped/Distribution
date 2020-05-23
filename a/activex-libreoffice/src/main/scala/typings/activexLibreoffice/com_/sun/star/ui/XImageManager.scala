package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.embed.XStorage
import typings.activexLibreoffice.com_.sun.star.graphic.XGraphic
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies access functions to an images manager interface to add, replace and remove images associations to command URLs.
  *
  * An image manager controls a number of image sets which are specified by a {@link ImageType} .
  */
trait XImageManager
  extends XUIConfigurationPersistence
     with XUIConfiguration
     with XComponent
     with XInitialization {
  /**
    * retrieves the list of command URLs which have images associated.
    * @param nImageType specifies the image type for this operation.
    * @returns all command URLs within the images manager that have an image associated.
    */
  def getAllImageNames(nImageType: Double): SafeArray[String]
  /**
    * retrieves the associated images of command URLs.
    * @param nImageType specifies the image type for this association operation.
    * @param aCommandURLSequence a sequence of command URLs for which the images are requested.
    * @returns a sequence of graphics object which are associated with the provided command URLs. If an unknown command URL is provided or a command URL has no
    */
  def getImages(nImageType: Double, aCommandURLSequence: SeqEquiv[String]): SafeArray[XGraphic]
  /**
    * determines if a command URL has an associated image.
    * @param nImageType specifies the image type for this operation.
    * @param CommandURL a command URL that should be checked for an associated image.
    * @returns `TRUE` if an image is associated, otherwise `FALSE` .
    */
  def hasImage(nImageType: Double, CommandURL: String): Boolean
  /**
    * inserts new image/command associations to a image manager.
    * @param nImageType specifies the image type for this association operation.
    * @param aCommandURLSequence a sequence of command URLs which specify which commands get an new image.
    * @param aGraphicSequence a sequence of graphic objects which should be associated with the provided command URLs.  If an association is already present i
    */
  def insertImages(nImageType: Double, aCommandURLSequence: SeqEquiv[String], aGraphicSequence: SeqEquiv[XGraphic]): Unit
  /**
    * removes associated images to a command URL.
    * @param nImageType specifies the image type for this association operation.
    * @param CommandURLs a sequence of command URLs for which the images should be removed.  If the **aCommandURLSequence** contains an invalid command URL a
    */
  def removeImages(nImageType: Double, CommandURLs: SeqEquiv[String]): Unit
  /**
    * replaces the associated images of command URLs.
    * @param nImageType specifies the image type for this association operation.
    * @param aCommandURLSequence a sequence of command URLs for which images should be replaced.
    * @param aGraphicsSequence a sequence of graphic objects which should replace the old images of the provided command URLs.  If a command URL cannot be fou
    */
  def replaceImages(nImageType: Double, aCommandURLSequence: SeqEquiv[String], aGraphicsSequence: SeqEquiv[XGraphic]): Unit
  /**
    * resets the image manager to default data.
    *
    * This means that all user images of the instance will be removed.
    */
  def reset(): Unit
}

object XImageManager {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addConfigurationListener: XUIConfigurationListener => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    getAllImageNames: Double => SafeArray[String],
    getImages: (Double, SeqEquiv[String]) => SafeArray[XGraphic],
    hasImage: (Double, String) => Boolean,
    initialize: SeqEquiv[_] => Unit,
    insertImages: (Double, SeqEquiv[String], SeqEquiv[XGraphic]) => Unit,
    isModified: () => Boolean,
    isReadOnly: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    reload: () => Unit,
    removeConfigurationListener: XUIConfigurationListener => Unit,
    removeEventListener: XEventListener => Unit,
    removeImages: (Double, SeqEquiv[String]) => Unit,
    replaceImages: (Double, SeqEquiv[String], SeqEquiv[XGraphic]) => Unit,
    reset: () => Unit,
    store: () => Unit,
    storeToStorage: XStorage => Unit
  ): XImageManager = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addConfigurationListener = js.Any.fromFunction1(addConfigurationListener), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getAllImageNames = js.Any.fromFunction1(getAllImageNames), getImages = js.Any.fromFunction2(getImages), hasImage = js.Any.fromFunction2(hasImage), initialize = js.Any.fromFunction1(initialize), insertImages = js.Any.fromFunction3(insertImages), isModified = js.Any.fromFunction0(isModified), isReadOnly = js.Any.fromFunction0(isReadOnly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reload = js.Any.fromFunction0(reload), removeConfigurationListener = js.Any.fromFunction1(removeConfigurationListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removeImages = js.Any.fromFunction2(removeImages), replaceImages = js.Any.fromFunction3(replaceImages), reset = js.Any.fromFunction0(reset), store = js.Any.fromFunction0(store), storeToStorage = js.Any.fromFunction1(storeToStorage))
    __obj.asInstanceOf[XImageManager]
  }
}

