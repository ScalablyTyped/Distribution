package typings.activexLibreoffice.com_.sun.star.rendering

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure describes the memory layout of a bitmap having integer color channels.
  *
  * This structure collects all necessary information to describe the memory layout of a bitmap having integer color channels
  * @since OOo 2.0
  */
@js.native
trait IntegerBitmapLayout extends StObject {
  
  /**
    * Color space the bitmap colors shall be interpreted within.
    *
    * Note that the actual pixel layout is specified at the color space. If this layout describes a palette bitmap format, this color space describes the
    * index format (plus maybe an extra alpha channel). The palette itself references another color space, which describes the layout of the palette
    * entries.
    * @see XBitmapPalette
    */
  var ColorSpace: XIntegerBitmapColorSpace = js.native
  
  /**
    * This member determines the bit order (only relevant if a pixel uses less than 8 bits, of course).
    *
    * When `TRUE` , this member denotes that the leftmost pixel from an 8 bit amount of pixel data consists of the bits starting with the most significant
    * bit. When `FALSE` , it's starting with the least significant bit.
    *
    * Example: for a 1bpp bitmap, each pixel is represented by exactly one bit. If this member is `TRUE` , the first pixel is the MSB of the first byte, and
    * the eighth pixel is the LSB of the first byte. If this member is `FALSE` , it's just the opposite.
    */
  var IsMsbFirst: Boolean = js.native
  
  /**
    * This member determines whether the bitmap data are actually indices into a color map.
    *
    * When set to the nil reference, the bitmap data is assumed to contain direct color values (to be interpreted according to the associated color space).
    * If this member references a valid palette, one of the pixel components as returned by the color space referenced from the {@link ColorSpace} is
    * required to be of type {@link ColorComponentTag.INDEX} . That component is then used to index the palette.
    */
  var Palette: XBitmapPalette = js.native
  
  /**
    * Byte offset between the start of two consecutive planes.
    *
    * This value is permitted to be negative. If this value is zero, the bitmap is assumed to be in chunky format, otherwise it is assumed to be planar. The
    * difference between chunky and planar layout lies in the way how color channels are interleaved. For a chunky format, all channel data for a single
    * pixel lies consecutively in memory. For a planar layout, the first channel of all pixel is stored consecutive, followed by the second channel, and so
    * forth.
    */
  var PlaneStride: Double = js.native
  
  /**
    * Number of data bytes per scanline.
    *
    * This value must not be negative
    */
  var ScanLineBytes: Double = js.native
  
  /**
    * Byte offset between the start of two consecutive scanlines.
    *
    * This value is permitted to be negative, denoting a bitmap whose content is flipped at the x axis.
    */
  var ScanLineStride: Double = js.native
  
  /**
    * Number of scanlines for this bitmap.
    *
    * This value must not be negative
    */
  var ScanLines: Double = js.native
}
object IntegerBitmapLayout {
  
  @scala.inline
  def apply(
    ColorSpace: XIntegerBitmapColorSpace,
    IsMsbFirst: Boolean,
    Palette: XBitmapPalette,
    PlaneStride: Double,
    ScanLineBytes: Double,
    ScanLineStride: Double,
    ScanLines: Double
  ): IntegerBitmapLayout = {
    val __obj = js.Dynamic.literal(ColorSpace = ColorSpace.asInstanceOf[js.Any], IsMsbFirst = IsMsbFirst.asInstanceOf[js.Any], Palette = Palette.asInstanceOf[js.Any], PlaneStride = PlaneStride.asInstanceOf[js.Any], ScanLineBytes = ScanLineBytes.asInstanceOf[js.Any], ScanLineStride = ScanLineStride.asInstanceOf[js.Any], ScanLines = ScanLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerBitmapLayout]
  }
  
  @scala.inline
  implicit class IntegerBitmapLayoutMutableBuilder[Self <: IntegerBitmapLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorSpace(value: XIntegerBitmapColorSpace): Self = StObject.set(x, "ColorSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMsbFirst(value: Boolean): Self = StObject.set(x, "IsMsbFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPalette(value: XBitmapPalette): Self = StObject.set(x, "Palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaneStride(value: Double): Self = StObject.set(x, "PlaneStride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanLineBytes(value: Double): Self = StObject.set(x, "ScanLineBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanLineStride(value: Double): Self = StObject.set(x, "ScanLineStride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanLines(value: Double): Self = StObject.set(x, "ScanLines", value.asInstanceOf[js.Any])
  }
}
