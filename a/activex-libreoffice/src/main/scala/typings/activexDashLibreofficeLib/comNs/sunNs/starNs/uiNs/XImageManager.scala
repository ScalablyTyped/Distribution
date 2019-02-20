package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

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
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization {
  /**
    * retrieves the list of command URLs which have images associated.
    * @param nImageType specifies the image type for this operation.
    * @returns all command URLs within the images manager that have an image associated.
    */
  def getAllImageNames(nImageType: scala.Double): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * retrieves the associated images of command URLs.
    * @param nImageType specifies the image type for this association operation.
    * @param aCommandURLSequence a sequence of command URLs for which the images are requested.
    * @returns a sequence of graphics object which are associated with the provided command URLs. If an unknown command URL is provided or a command URL has no
    */
  def getImages(
    nImageType: scala.Double,
    aCommandURLSequence: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]
  ): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic]
  /**
    * determines if a command URL has an associated image.
    * @param nImageType specifies the image type for this operation.
    * @param CommandURL a command URL that should be checked for an associated image.
    * @returns `TRUE` if an image is associated, otherwise `FALSE` .
    */
  def hasImage(nImageType: scala.Double, CommandURL: java.lang.String): scala.Boolean
  /**
    * inserts new image/command associations to a image manager.
    * @param nImageType specifies the image type for this association operation.
    * @param aCommandURLSequence a sequence of command URLs which specify which commands get an new image.
    * @param aGraphicSequence a sequence of graphic objects which should be associated with the provided command URLs.  If an association is already present i
    */
  def insertImages(
    nImageType: scala.Double,
    aCommandURLSequence: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    aGraphicSequence: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic]
  ): scala.Unit
  /**
    * removes associated images to a command URL.
    * @param nImageType specifies the image type for this association operation.
    * @param CommandURLs a sequence of command URLs for which the images should be removed.  If the **aCommandURLSequence** contains an invalid command URL a
    */
  def removeImages(
    nImageType: scala.Double,
    CommandURLs: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]
  ): scala.Unit
  /**
    * replaces the associated images of command URLs.
    * @param nImageType specifies the image type for this association operation.
    * @param aCommandURLSequence a sequence of command URLs for which images should be replaced.
    * @param aGraphicsSequence a sequence of graphic objects which should replace the old images of the provided command URLs.  If a command URL cannot be fou
    */
  def replaceImages(
    nImageType: scala.Double,
    aCommandURLSequence: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    aGraphicsSequence: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic]
  ): scala.Unit
  /**
    * resets the image manager to default data.
    *
    * This means that all user images of the instance will be removed.
    */
  def reset(): scala.Unit
}

