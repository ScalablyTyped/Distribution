package typings.activexLibreoffice.com_.sun.star.rendering

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A color space for integer bitmap formats
  *
  * This interface encapsulates all information specific to a certain integer bitmap color space, like for example 1555 ARGB. Note that the individual
  * elements of the integer color representation sequence need not correspond to the color space's components - instead, the color components might be
  * packed back-to-back into those bytes, as they appear in the raw bitmap data.
  */
@js.native
trait XIntegerBitmapColorSpace extends XColorSpace {
  
  /**
    * Query number of bits used per bitmap pixel.
    *
    * This method yields the total number of bits used for a color value. At the associated {@link XIntegerBitmap} , the {@link XIntegerBitmap.setPixel()}
    * method will expect a sequence of ceil(BitsPerPixel/8) bytes, and the {@link XIntegerReadOnlyBitmap.getPixel()} will return that number of bytes.
    * Similarly, the color conversion expect input data in multiples of ceil(BitsPerPixel/8), and also return converted data in chunks of this.
    */
  val BitsPerPixel: Double = js.native
  
  /**
    * Query the number of bits used for each component.
    *
    * This method returns a sequence of integers, each denoting the number of bits occupied by the respective component. The sum of all component bits must
    * be less or equal than the value returned from {@link getBitsPerPixel()} . If the sum is less, excess bits are always kept in the most significant bits
    * of a pixel. Color components will appear in the byte sequences returned from the {@link XIntegerBitmap} methods in the order defined here, with the
    * first element starting from the least significant bits of the pixel, etc.
    *
    *
    *
    * **Remark**: For the typical 32 bit RGBA color data, the four values would all contain the value eight. For a 16 bit 1555 ARGB format, with mask values
    * 0x8000 for alpha, 0x7C for red, 0x3E for green and 0x1F for blue, the values would be 5, 5, 5, 1, in that order.
    */
  val ComponentBitCounts: SafeArray[Double] = js.native
  
  /**
    * Query whether color data bytes need to be swapped.
    * @returns `TRUE` , This method returns the endianness of the color data. The value is one of the Endianness constants. If color data is represented using m
    */
  val Endianness: Double = js.native
  
  /**
    * Convert integer bitmap color to generic IEEE double device color of another color space.
    *
    * Color values are properly rounded and clipped, to be valid in the target color space.
    * @param deviceColor Sequence of device color components. Is permitted to contain more than one device color element, therefore, batch conversion of multi
    * @param targetColorSpace the color space to convert to.
    * @returns the corresponding sequence of device colors in the target color space
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertFromIntegerColorSpace(deviceColor: SeqEquiv[Double], targetColorSpace: XColorSpace): SafeArray[ColorComponent] = js.native
  
  /**
    * Convert sRGB color with linear alpha into this color space.
    *
    * If this color space does not convey alpha information, the specified alpha value is silently ignored. Color values are properly rounded and clipped,
    * to be valid in the target color space.
    * @param rgbColor Sequence of sRGB color components. Is permitted to contain more than one color element, therefore, batch conversion of multiple color va
    * @returns the corresponding sequence of device colors.
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertIntegerFromARGB(rgbColor: SeqEquiv[ARGBColor]): SafeArray[Double] = js.native
  
  /**
    * Convert premultiplied sRGB color with linear alpha into this color space.
    *
    * If this color space does not convey alpha information, the specified alpha value is silently ignored. Color values are properly rounded and clipped,
    * to be valid in the target color space.
    * @param rgbColor Sequence of sRGB color components. Is permitted to contain more than one color element, therefore, batch conversion of multiple color va
    * @returns the corresponding sequence of device colors.
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertIntegerFromPARGB(rgbColor: SeqEquiv[ARGBColor]): SafeArray[Double] = js.native
  
  /**
    * Convert sRGB color to an integer representation in this color space.
    *
    * If this color space conveys alpha information, it is assumed be fully opaque for the given RGB color value. Color values are properly rounded and
    * clipped, to be valid in the target color space.
    * @param rgbColor Sequence of sRGB color components. Is permitted to contain more than one color element, therefore, batch conversion of multiple color va
    * @returns the corresponding sequence of device colors.
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertIntegerFromRGB(rgbColor: SeqEquiv[RGBColor]): SafeArray[Double] = js.native
  
  /**
    * Convert color value in this color space to sRGB color values, with linear alpha.
    *
    * If the given input color does not carry alpha information, an alpha value of 1.0 (fully opaque) is assumed. Color values are properly rounded and
    * clipped, to be valid in the target color space.
    * @param deviceColor Sequence of device color components. Is permitted to contain more than one device color element, therefore, batch conversion of multi
    * @returns the corresponding sequence of sRGB colors.
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertIntegerToARGB(deviceColor: SeqEquiv[Double]): SafeArray[ARGBColor] = js.native
  
  /**
    * Convert color value in this color space to premultiplied sRGB color values, with linear alpha.
    *
    * If the given input color does not carry alpha information, an alpha value of 1.0 (fully opaque) is assumed. Color values are properly rounded and
    * clipped, to be valid in the target color space. The resulting individual RGB color values are premultiplied by the alpha value (e.g. if alpha is 0.5,
    * each color value has only half of the original intensity).
    * @param deviceColor Sequence of device color components. Is permitted to contain more than one device color element, therefore, batch conversion of multi
    * @returns the corresponding sequence of sRGB colors.
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertIntegerToPARGB(deviceColor: SeqEquiv[Double]): SafeArray[ARGBColor] = js.native
  
  /**
    * Convert color value in this color space to sRGB color values.
    *
    * Any information not representable in the {@link RGBColor} struct is discarded during the conversion. This includes alpha information. Color values are
    * properly rounded and clipped, to be valid in the target color space.
    * @param deviceColor Sequence of device color components. Is permitted to contain more than one device color element, therefore, batch conversion of multi
    * @returns the corresponding sequence of sRGB colors.
    * @see XIntegerBitmapColorSpace.convertIntegerToARGB()
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertIntegerToRGB(deviceColor: SeqEquiv[Double]): SafeArray[RGBColor] = js.native
  
  /**
    * Convert integer bitmap color to integer bitmap color of another integer bitmap color space.
    *
    * Color values are properly rounded and clipped, to be valid in the target color space.
    * @param deviceColor Sequence of device color components. Is permitted to contain more than one device color element, therefore, batch conversion of multi
    * @param targetColorSpace the color space to convert to.
    * @returns the corresponding sequence of device colors in the target color space
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertToIntegerColorSpace(deviceColor: SeqEquiv[Double], targetColorSpace: XIntegerBitmapColorSpace): SafeArray[Double] = js.native
  
  /**
    * Query number of bits used per bitmap pixel.
    *
    * This method yields the total number of bits used for a color value. At the associated {@link XIntegerBitmap} , the {@link XIntegerBitmap.setPixel()}
    * method will expect a sequence of ceil(BitsPerPixel/8) bytes, and the {@link XIntegerReadOnlyBitmap.getPixel()} will return that number of bytes.
    * Similarly, the color conversion expect input data in multiples of ceil(BitsPerPixel/8), and also return converted data in chunks of this.
    */
  def getBitsPerPixel(): Double = js.native
  
  /**
    * Query the number of bits used for each component.
    *
    * This method returns a sequence of integers, each denoting the number of bits occupied by the respective component. The sum of all component bits must
    * be less or equal than the value returned from {@link getBitsPerPixel()} . If the sum is less, excess bits are always kept in the most significant bits
    * of a pixel. Color components will appear in the byte sequences returned from the {@link XIntegerBitmap} methods in the order defined here, with the
    * first element starting from the least significant bits of the pixel, etc.
    *
    *
    *
    * **Remark**: For the typical 32 bit RGBA color data, the four values would all contain the value eight. For a 16 bit 1555 ARGB format, with mask values
    * 0x8000 for alpha, 0x7C for red, 0x3E for green and 0x1F for blue, the values would be 5, 5, 5, 1, in that order.
    */
  def getComponentBitCounts(): SafeArray[Double] = js.native
  
  /**
    * Query whether color data bytes need to be swapped.
    * @returns `TRUE` , This method returns the endianness of the color data. The value is one of the Endianness constants. If color data is represented using m
    */
  def getEndianness(): Double = js.native
}
object XIntegerBitmapColorSpace {
  
  @scala.inline
  def apply(
    BitsPerPixel: Double,
    ComponentBitCounts: SafeArray[Double],
    ComponentTags: SafeArray[Double],
    Endianness: Double,
    Properties: SafeArray[PropertyValue],
    RenderingIntent: Double,
    Type: Double,
    convertColorSpace: (SeqEquiv[ColorComponent], XColorSpace) => SafeArray[ColorComponent],
    convertFromARGB: SeqEquiv[ARGBColor] => SafeArray[ColorComponent],
    convertFromIntegerColorSpace: (SeqEquiv[Double], XColorSpace) => SafeArray[ColorComponent],
    convertFromPARGB: SeqEquiv[ARGBColor] => SafeArray[ColorComponent],
    convertFromRGB: SeqEquiv[RGBColor] => SafeArray[ColorComponent],
    convertIntegerFromARGB: SeqEquiv[ARGBColor] => SafeArray[Double],
    convertIntegerFromPARGB: SeqEquiv[ARGBColor] => SafeArray[Double],
    convertIntegerFromRGB: SeqEquiv[RGBColor] => SafeArray[Double],
    convertIntegerToARGB: SeqEquiv[Double] => SafeArray[ARGBColor],
    convertIntegerToPARGB: SeqEquiv[Double] => SafeArray[ARGBColor],
    convertIntegerToRGB: SeqEquiv[Double] => SafeArray[RGBColor],
    convertToARGB: SeqEquiv[ColorComponent] => SafeArray[ARGBColor],
    convertToIntegerColorSpace: (SeqEquiv[Double], XIntegerBitmapColorSpace) => SafeArray[Double],
    convertToPARGB: SeqEquiv[ColorComponent] => SafeArray[ARGBColor],
    convertToRGB: SeqEquiv[ColorComponent] => SafeArray[RGBColor],
    getBitsPerPixel: () => Double,
    getComponentBitCounts: () => SafeArray[Double],
    getComponentTags: () => SafeArray[Double],
    getEndianness: () => Double,
    getProperties: () => SafeArray[PropertyValue],
    getRenderingIntent: () => Double,
    getType: () => Double
  ): XIntegerBitmapColorSpace = {
    val __obj = js.Dynamic.literal(BitsPerPixel = BitsPerPixel.asInstanceOf[js.Any], ComponentBitCounts = ComponentBitCounts.asInstanceOf[js.Any], ComponentTags = ComponentTags.asInstanceOf[js.Any], Endianness = Endianness.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], RenderingIntent = RenderingIntent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], convertColorSpace = js.Any.fromFunction2(convertColorSpace), convertFromARGB = js.Any.fromFunction1(convertFromARGB), convertFromIntegerColorSpace = js.Any.fromFunction2(convertFromIntegerColorSpace), convertFromPARGB = js.Any.fromFunction1(convertFromPARGB), convertFromRGB = js.Any.fromFunction1(convertFromRGB), convertIntegerFromARGB = js.Any.fromFunction1(convertIntegerFromARGB), convertIntegerFromPARGB = js.Any.fromFunction1(convertIntegerFromPARGB), convertIntegerFromRGB = js.Any.fromFunction1(convertIntegerFromRGB), convertIntegerToARGB = js.Any.fromFunction1(convertIntegerToARGB), convertIntegerToPARGB = js.Any.fromFunction1(convertIntegerToPARGB), convertIntegerToRGB = js.Any.fromFunction1(convertIntegerToRGB), convertToARGB = js.Any.fromFunction1(convertToARGB), convertToIntegerColorSpace = js.Any.fromFunction2(convertToIntegerColorSpace), convertToPARGB = js.Any.fromFunction1(convertToPARGB), convertToRGB = js.Any.fromFunction1(convertToRGB), getBitsPerPixel = js.Any.fromFunction0(getBitsPerPixel), getComponentBitCounts = js.Any.fromFunction0(getComponentBitCounts), getComponentTags = js.Any.fromFunction0(getComponentTags), getEndianness = js.Any.fromFunction0(getEndianness), getProperties = js.Any.fromFunction0(getProperties), getRenderingIntent = js.Any.fromFunction0(getRenderingIntent), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[XIntegerBitmapColorSpace]
  }
  
  @scala.inline
  implicit class XIntegerBitmapColorSpaceOps[Self <: XIntegerBitmapColorSpace] (val x: Self) extends AnyVal {
    
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
    def setBitsPerPixel(value: Double): Self = this.set("BitsPerPixel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentBitCounts(value: SafeArray[Double]): Self = this.set("ComponentBitCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndianness(value: Double): Self = this.set("Endianness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertFromIntegerColorSpace(value: (SeqEquiv[Double], XColorSpace) => SafeArray[ColorComponent]): Self = this.set("convertFromIntegerColorSpace", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConvertIntegerFromARGB(value: SeqEquiv[ARGBColor] => SafeArray[Double]): Self = this.set("convertIntegerFromARGB", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvertIntegerFromPARGB(value: SeqEquiv[ARGBColor] => SafeArray[Double]): Self = this.set("convertIntegerFromPARGB", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvertIntegerFromRGB(value: SeqEquiv[RGBColor] => SafeArray[Double]): Self = this.set("convertIntegerFromRGB", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvertIntegerToARGB(value: SeqEquiv[Double] => SafeArray[ARGBColor]): Self = this.set("convertIntegerToARGB", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvertIntegerToPARGB(value: SeqEquiv[Double] => SafeArray[ARGBColor]): Self = this.set("convertIntegerToPARGB", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvertIntegerToRGB(value: SeqEquiv[Double] => SafeArray[RGBColor]): Self = this.set("convertIntegerToRGB", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvertToIntegerColorSpace(value: (SeqEquiv[Double], XIntegerBitmapColorSpace) => SafeArray[Double]): Self = this.set("convertToIntegerColorSpace", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetBitsPerPixel(value: () => Double): Self = this.set("getBitsPerPixel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetComponentBitCounts(value: () => SafeArray[Double]): Self = this.set("getComponentBitCounts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEndianness(value: () => Double): Self = this.set("getEndianness", js.Any.fromFunction0(value))
  }
}
