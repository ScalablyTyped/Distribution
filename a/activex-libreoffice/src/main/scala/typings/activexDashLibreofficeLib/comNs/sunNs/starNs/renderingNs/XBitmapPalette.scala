package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to access the palette of a color-indexed bitmap.
  * @since OOo 2.0
  */
trait XBitmapPalette
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Query associated color space.
    * @returns the color space that is associated with this palette.
    */
  val ColorSpace: XColorSpace
  /**
    * Request the number of palette entries available.
    * @returns the number of entries in this palette.
    */
  val NumberOfEntries: scala.Double
  /**
    * Query associated color space.
    * @returns the color space that is associated with this palette.
    */
  def getColorSpace(): XColorSpace
  /**
    * Request the color for the given palette entry.
    * @param entry Output parameter for the color components at the given palette entry.
    * @param nIndex The index of the palette entry to be retrieved. Valid range is [0, {@link getNumberOfEntries()} -1].
    * @returns `TRUE` , if the given palette entry should be displayed opaque, and `FALSE` if the entry should be displayed transparent. This is sometimes used
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the index is smaller than zero or larger than {@link XBitmapPalette.getNumberOfEntries()} -1.
    */
  def getIndex(
    entry: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[ColorComponent]],
    nIndex: scala.Double
  ): scala.Boolean
  /**
    * Request the number of palette entries available.
    * @returns the number of entries in this palette.
    */
  def getNumberOfEntries(): scala.Double
  /**
    * Set the color for the given palette entry.
    * @param color Sequence of device color values in the associated bitmap's device color format.
    * @param transparency When `TRUE` , the specified palette entry is displayed as opaque color. When `FALSE` , the given entry displays as fully transparent
    * @param nIndex The index of the palette entry to be changed. Valid range is [0, {@link getNumberOfEntries()} -1].
    * @returns whether the palette entry was changed. For read-only entries, this method always returns `FALSE` .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the index is smaller than zero or larger than {@link XBitmapPalette.getNumberOfEntries()} -1.
    * @throws com::sun::star::lang::IllegalArgumentException if the given sequence of color components does not match the associated bitmap's device color format.
    */
  def setIndex(
    color: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[ColorComponent],
    transparency: scala.Boolean,
    nIndex: scala.Double
  ): scala.Boolean
}

