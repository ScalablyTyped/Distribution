package typings.activexLibreoffice.com_.sun.star.rendering

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information how to interpret certain color data.
  *
  * This interface encapsulates all information that is necessary to interpret color data, by defining a describing color space, like for example CMYK or
  * sRGB. You can either convert between this and an arbitrary other color space, or into the standard RGB or ARGB formats (because those are so
  * overwhelmingly common in computer graphics).
  *
  * All canvas interfaces standardize to sequences of IEEE doubles for color representation. As this is overly verbose when used for bitmap data, derived
  * interfaces exist, e.g. {@link XIntegerBitmapColorSpace} , which use sequences of integers for color representation.
  */
@js.native
trait XColorSpace extends js.Object {
  
  /**
    * Query the kind for each color component.
    *
    * Color space components tend to correspond to physical attributes like the amount of one specific colorant contained in the final output color. This
    * method returns a sequence of tags, specifying for each component of a color value, to what color attribute (if any) it corresponds. The values must be
    * one of the {@link ColorComponentTag} constants.
    *
    * At the same time, the number of elements in this sequence corresponds to the number of color channels for this color space.
    *
    *
    *
    * **Remark**: For the standard RGB color space, ComponentTags consists of three elements, containing RGB_RED, RGB_GREEN and RGB_BLUE tags, respectively
    */
  val ComponentTags: SafeArray[Double] = js.native
  
  /**
    * Query various optional properties from the color space.
    *
    * If this color space has an ICC color profile, the sequence contains an element named ICCProfile. Some color spaces also have properties Gamma,
    * Whitepoint and Blackpoint. Background information for these is available [here]{@link url="http://en.wikipedia.org/wiki/Color_temperature"} .
    */
  val Properties: SafeArray[PropertyValue] = js.native
  
  /**
    * Query rendering intent of this color space.
    * @returns a value from the {@link RenderingIntent} constant group.
    */
  val RenderingIntent: Double = js.native
  
  /**
    * Query type of this color space.
    * @returns a value from the {@link ColorSpaceType} constant group.
    */
  val Type: Double = js.native
  
  /**
    * Convert to color of another color space.
    * @param deviceColor Sequence of device color components. Is permitted to contain more than one device color element, therefore, batch conversion of multi
    * @param targetColorSpace the color space to convert to.
    * @returns the corresponding sequence of device colors in the target color space (e.g. `sequence<double>` or `sequence<byte>` ).
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format (e.g. if the number of compon
    */
  def convertColorSpace(deviceColor: SeqEquiv[ColorComponent], targetColorSpace: XColorSpace): SafeArray[ColorComponent] = js.native
  
  /**
    * Convert sRGB color with linear alpha into this color space.
    *
    * If this color space does not convey alpha information, the specified alpha value is silently ignored.
    * @param rgbColor Sequence of sRGB color components. Is permitted to contain more than one color element, therefore, batch conversion of multiple color va
    * @returns the corresponding sequence of device colors.
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertFromARGB(rgbColor: SeqEquiv[ARGBColor]): SafeArray[ColorComponent] = js.native
  
  /**
    * Convert premultiplied sRGB color with linear alpha into this color space.
    *
    * If this color space does not convey alpha information, the specified alpha value is silently ignored.
    * @param rgbColor Sequence of sRGB color components. Is permitted to contain more than one color element, therefore, batch conversion of multiple color va
    * @returns the corresponding sequence of device colors.
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertFromPARGB(rgbColor: SeqEquiv[ARGBColor]): SafeArray[ColorComponent] = js.native
  
  /**
    * Convert sRGB color to a representation in this color space.
    *
    * If this color space conveys alpha information, it is assumed be fully opaque for the given RGB color value.
    * @param rgbColor Sequence of sRGB color components. Is permitted to contain more than one color element, therefore, batch conversion of multiple color va
    * @returns the corresponding sequence of device colors.
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertFromRGB(rgbColor: SeqEquiv[RGBColor]): SafeArray[ColorComponent] = js.native
  
  /**
    * Convert color value in this color space to sRGB color values, with linear alpha.
    *
    * If the given input color does not carry alpha information, an alpha value of 1.0 (fully opaque) is assumed.
    * @param deviceColor Sequence of device color components. Is permitted to contain more than one device color element, therefore, batch conversion of multi
    * @returns the corresponding sequence of colors in the sRGB color space.
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertToARGB(deviceColor: SeqEquiv[ColorComponent]): SafeArray[ARGBColor] = js.native
  
  /**
    * Convert color value in this color space to premultiplied sRGB color values, with linear alpha.
    *
    * If the given input color does not carry alpha information, an alpha value of 1.0 (fully opaque) is assumed. The resulting individual RGB color values
    * are premultiplied by the alpha value (e.g. if alpha is 0.5, each color value has only half of the original intensity).
    * @param deviceColor Sequence of device color components. Is permitted to contain more than one device color element, therefore, batch conversion of multi
    * @returns the corresponding sequence of colors in the sRGB color space.
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertToPARGB(deviceColor: SeqEquiv[ColorComponent]): SafeArray[ARGBColor] = js.native
  
  /**
    * Convert color value in this color space to sRGB color values.
    *
    * Any information not representable in the {@link RGBColor} struct is discarded during the conversion. This includes alpha information.
    * @param deviceColor Sequence of device color components. Is permitted to contain more than one device color element, therefore, batch conversion of multi
    * @returns the corresponding sequence of colors in the sRGB color space.
    * @see convertToARGB()
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertToRGB(deviceColor: SeqEquiv[ColorComponent]): SafeArray[RGBColor] = js.native
  
  /**
    * Query the kind for each color component.
    *
    * Color space components tend to correspond to physical attributes like the amount of one specific colorant contained in the final output color. This
    * method returns a sequence of tags, specifying for each component of a color value, to what color attribute (if any) it corresponds. The values must be
    * one of the {@link ColorComponentTag} constants.
    *
    * At the same time, the number of elements in this sequence corresponds to the number of color channels for this color space.
    *
    *
    *
    * **Remark**: For the standard RGB color space, ComponentTags consists of three elements, containing RGB_RED, RGB_GREEN and RGB_BLUE tags, respectively
    */
  def getComponentTags(): SafeArray[Double] = js.native
  
  /**
    * Query various optional properties from the color space.
    *
    * If this color space has an ICC color profile, the sequence contains an element named ICCProfile. Some color spaces also have properties Gamma,
    * Whitepoint and Blackpoint. Background information for these is available [here]{@link url="http://en.wikipedia.org/wiki/Color_temperature"} .
    */
  def getProperties(): SafeArray[PropertyValue] = js.native
  
  /**
    * Query rendering intent of this color space.
    * @returns a value from the {@link RenderingIntent} constant group.
    */
  def getRenderingIntent(): Double = js.native
  
  /**
    * Query type of this color space.
    * @returns a value from the {@link ColorSpaceType} constant group.
    */
  def getType(): Double = js.native
}
object XColorSpace {
  
  @scala.inline
  def apply(
    ComponentTags: SafeArray[Double],
    Properties: SafeArray[PropertyValue],
    RenderingIntent: Double,
    Type: Double,
    convertColorSpace: (SeqEquiv[ColorComponent], XColorSpace) => SafeArray[ColorComponent],
    convertFromARGB: SeqEquiv[ARGBColor] => SafeArray[ColorComponent],
    convertFromPARGB: SeqEquiv[ARGBColor] => SafeArray[ColorComponent],
    convertFromRGB: SeqEquiv[RGBColor] => SafeArray[ColorComponent],
    convertToARGB: SeqEquiv[ColorComponent] => SafeArray[ARGBColor],
    convertToPARGB: SeqEquiv[ColorComponent] => SafeArray[ARGBColor],
    convertToRGB: SeqEquiv[ColorComponent] => SafeArray[RGBColor],
    getComponentTags: () => SafeArray[Double],
    getProperties: () => SafeArray[PropertyValue],
    getRenderingIntent: () => Double,
    getType: () => Double
  ): XColorSpace = {
    val __obj = js.Dynamic.literal(ComponentTags = ComponentTags.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], RenderingIntent = RenderingIntent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], convertColorSpace = js.Any.fromFunction2(convertColorSpace), convertFromARGB = js.Any.fromFunction1(convertFromARGB), convertFromPARGB = js.Any.fromFunction1(convertFromPARGB), convertFromRGB = js.Any.fromFunction1(convertFromRGB), convertToARGB = js.Any.fromFunction1(convertToARGB), convertToPARGB = js.Any.fromFunction1(convertToPARGB), convertToRGB = js.Any.fromFunction1(convertToRGB), getComponentTags = js.Any.fromFunction0(getComponentTags), getProperties = js.Any.fromFunction0(getProperties), getRenderingIntent = js.Any.fromFunction0(getRenderingIntent), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[XColorSpace]
  }
  
  @scala.inline
  implicit class XColorSpaceOps[Self <: XColorSpace] (val x: Self) extends AnyVal {
    
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
    def setComponentTags(value: SafeArray[Double]): Self = this.set("ComponentTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: SafeArray[PropertyValue]): Self = this.set("Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderingIntent(value: Double): Self = this.set("RenderingIntent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertColorSpace(value: (SeqEquiv[ColorComponent], XColorSpace) => SafeArray[ColorComponent]): Self = this.set("convertColorSpace", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConvertFromARGB(value: SeqEquiv[ARGBColor] => SafeArray[ColorComponent]): Self = this.set("convertFromARGB", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvertFromPARGB(value: SeqEquiv[ARGBColor] => SafeArray[ColorComponent]): Self = this.set("convertFromPARGB", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvertFromRGB(value: SeqEquiv[RGBColor] => SafeArray[ColorComponent]): Self = this.set("convertFromRGB", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvertToARGB(value: SeqEquiv[ColorComponent] => SafeArray[ARGBColor]): Self = this.set("convertToARGB", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvertToPARGB(value: SeqEquiv[ColorComponent] => SafeArray[ARGBColor]): Self = this.set("convertToPARGB", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConvertToRGB(value: SeqEquiv[ColorComponent] => SafeArray[RGBColor]): Self = this.set("convertToRGB", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetComponentTags(value: () => SafeArray[Double]): Self = this.set("getComponentTags", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProperties(value: () => SafeArray[PropertyValue]): Self = this.set("getProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRenderingIntent(value: () => Double): Self = this.set("getRenderingIntent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => Double): Self = this.set("getType", js.Any.fromFunction0(value))
  }
}
