package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val ComponentTags: activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Query various optional properties from the color space.
    *
    * If this color space has an ICC color profile, the sequence contains an element named ICCProfile. Some color spaces also have properties Gamma,
    * Whitepoint and Blackpoint. Background information for these is available [here]{@link url="http://en.wikipedia.org/wiki/Color_temperature"} .
    */
  val Properties: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * Query rendering intent of this color space.
    * @returns a value from the {@link RenderingIntent} constant group.
    */
  val RenderingIntent: scala.Double
  /**
    * Query type of this color space.
    * @returns a value from the {@link ColorSpaceType} constant group.
    */
  val Type: scala.Double
  /**
    * Convert to color of another color space.
    * @param deviceColor Sequence of device color components. Is permitted to contain more than one device color element, therefore, batch conversion of multi
    * @param targetColorSpace the color space to convert to.
    * @returns the corresponding sequence of device colors in the target color space (e.g. `sequence<double>` or `sequence<byte>` ).
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format (e.g. if the number of compon
    */
  def convertColorSpace(
    deviceColor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[ColorComponent],
    targetColorSpace: XColorSpace
  ): activexDashInteropLib.SafeArray[ColorComponent]
  /**
    * Convert sRGB color with linear alpha into this color space.
    *
    * If this color space does not convey alpha information, the specified alpha value is silently ignored.
    * @param rgbColor Sequence of sRGB color components. Is permitted to contain more than one color element, therefore, batch conversion of multiple color va
    * @returns the corresponding sequence of device colors.
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertFromARGB(rgbColor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[ARGBColor]): activexDashInteropLib.SafeArray[ColorComponent]
  /**
    * Convert premultiplied sRGB color with linear alpha into this color space.
    *
    * If this color space does not convey alpha information, the specified alpha value is silently ignored.
    * @param rgbColor Sequence of sRGB color components. Is permitted to contain more than one color element, therefore, batch conversion of multiple color va
    * @returns the corresponding sequence of device colors.
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertFromPARGB(rgbColor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[ARGBColor]): activexDashInteropLib.SafeArray[ColorComponent]
  /**
    * Convert sRGB color to a representation in this color space.
    *
    * If this color space conveys alpha information, it is assumed be fully opaque for the given RGB color value.
    * @param rgbColor Sequence of sRGB color components. Is permitted to contain more than one color element, therefore, batch conversion of multiple color va
    * @returns the corresponding sequence of device colors.
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertFromRGB(rgbColor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[RGBColor]): activexDashInteropLib.SafeArray[ColorComponent]
  /**
    * Convert color value in this color space to sRGB color values, with linear alpha.
    *
    * If the given input color does not carry alpha information, an alpha value of 1.0 (fully opaque) is assumed.
    * @param deviceColor Sequence of device color components. Is permitted to contain more than one device color element, therefore, batch conversion of multi
    * @returns the corresponding sequence of colors in the sRGB color space.
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertToARGB(deviceColor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[ColorComponent]): activexDashInteropLib.SafeArray[ARGBColor]
  /**
    * Convert color value in this color space to premultiplied sRGB color values, with linear alpha.
    *
    * If the given input color does not carry alpha information, an alpha value of 1.0 (fully opaque) is assumed. The resulting individual RGB color values
    * are premultiplied by the alpha value (e.g. if alpha is 0.5, each color value has only half of the original intensity).
    * @param deviceColor Sequence of device color components. Is permitted to contain more than one device color element, therefore, batch conversion of multi
    * @returns the corresponding sequence of colors in the sRGB color space.
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertToPARGB(deviceColor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[ColorComponent]): activexDashInteropLib.SafeArray[ARGBColor]
  /**
    * Convert color value in this color space to sRGB color values.
    *
    * Any information not representable in the {@link RGBColor} struct is discarded during the conversion. This includes alpha information.
    * @param deviceColor Sequence of device color components. Is permitted to contain more than one device color element, therefore, batch conversion of multi
    * @returns the corresponding sequence of colors in the sRGB color space.
    * @see convertToARGB()
    * @throws a {@link com.sun.star.lang.IllegalArgumentException} , if the input sequence does not match the device color format.
    */
  def convertToRGB(deviceColor: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[ColorComponent]): activexDashInteropLib.SafeArray[RGBColor]
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
  def getComponentTags(): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Query various optional properties from the color space.
    *
    * If this color space has an ICC color profile, the sequence contains an element named ICCProfile. Some color spaces also have properties Gamma,
    * Whitepoint and Blackpoint. Background information for these is available [here]{@link url="http://en.wikipedia.org/wiki/Color_temperature"} .
    */
  def getProperties(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * Query rendering intent of this color space.
    * @returns a value from the {@link RenderingIntent} constant group.
    */
  def getRenderingIntent(): scala.Double
  /**
    * Query type of this color space.
    * @returns a value from the {@link ColorSpaceType} constant group.
    */
  def getType(): scala.Double
}

