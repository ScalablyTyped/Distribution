package typings.activexDashLibreoffice.comNs.sunNs.starNs.renderingNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to access the palette of a color-indexed bitmap.
  * @since OOo 2.0
  */
trait XBitmapPalette extends XInterface {
  /**
    * Query associated color space.
    * @returns the color space that is associated with this palette.
    */
  val ColorSpace: XColorSpace
  /**
    * Request the number of palette entries available.
    * @returns the number of entries in this palette.
    */
  val NumberOfEntries: Double
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
  def getIndex(entry: js.Array[SeqEquiv[ColorComponent]], nIndex: Double): Boolean
  /**
    * Request the number of palette entries available.
    * @returns the number of entries in this palette.
    */
  def getNumberOfEntries(): Double
  /**
    * Set the color for the given palette entry.
    * @param color Sequence of device color values in the associated bitmap's device color format.
    * @param transparency When `TRUE` , the specified palette entry is displayed as opaque color. When `FALSE` , the given entry displays as fully transparent
    * @param nIndex The index of the palette entry to be changed. Valid range is [0, {@link getNumberOfEntries()} -1].
    * @returns whether the palette entry was changed. For read-only entries, this method always returns `FALSE` .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the index is smaller than zero or larger than {@link XBitmapPalette.getNumberOfEntries()} -1.
    * @throws com::sun::star::lang::IllegalArgumentException if the given sequence of color components does not match the associated bitmap's device color format.
    */
  def setIndex(color: SeqEquiv[ColorComponent], transparency: Boolean, nIndex: Double): Boolean
}

object XBitmapPalette {
  @scala.inline
  def apply(
    ColorSpace: XColorSpace,
    NumberOfEntries: Double,
    acquire: () => Unit,
    getColorSpace: () => XColorSpace,
    getIndex: (js.Array[SeqEquiv[ColorComponent]], Double) => Boolean,
    getNumberOfEntries: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setIndex: (SeqEquiv[ColorComponent], Boolean, Double) => Boolean
  ): XBitmapPalette = {
    val __obj = js.Dynamic.literal(ColorSpace = ColorSpace, NumberOfEntries = NumberOfEntries, acquire = js.Any.fromFunction0(acquire), getColorSpace = js.Any.fromFunction0(getColorSpace), getIndex = js.Any.fromFunction2(getIndex), getNumberOfEntries = js.Any.fromFunction0(getNumberOfEntries), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setIndex = js.Any.fromFunction3(setIndex))
  
    __obj.asInstanceOf[XBitmapPalette]
  }
}

