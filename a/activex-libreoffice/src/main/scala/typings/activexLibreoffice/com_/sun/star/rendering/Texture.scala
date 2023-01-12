package typings.activexLibreoffice.com_.sun.star.rendering

import typings.activexLibreoffice.com_.sun.star.geometry.AffineMatrix2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains all information needed to define a texture.
  *
  * This structure contains all information necessary to define a texture. A texture describes the filled area of polygonal shapes, providing its own
  * transformation matrix, repeat mode, and transparency.
  *
  * To achieve uniformity, if this texture has a bitmap set, it is scaled in such a way that it will cover the same [0,1]x[0,1] box as the hatch and the
  * gradient. The transformation member can then be used to scale the complete texture as it fits suit.
  * @since OOo 2.0
  */
trait Texture extends StObject {
  
  /**
    * {@link Texture} transformation from texture to primitive space.
    *
    * This member allows arbitrary transformations of the texture, relative to the textured primitive. Thus, the total transformation from the [0,1]x[0,1]
    * texture space to the device coordinate space is the concatenation of texture, render state, and view state transformation (with only render state and
    * view state transformation being applied to the textured primitive).
    */
  var AffineTransform: AffineMatrix2D
  
  /**
    * Overall transparency of the texturing.
    *
    * The valid range for this value is [0,1], where 0 denotes complete transparency, and 1 denotes fully opaque.
    */
  var Alpha: Double
  
  /**
    * {@link Texture} bitmap.
    *
    * This member can be used together with gradient and hatching.
    *
    * The bitmap is scaled to a one-by-one rectangle, to cover the same area as both the gradient and the hatching.
    */
  var Bitmap: XBitmap
  
  /**
    * {@link Texture} gradient.
    *
    * This member can be used together with bitmap and hatching. The parametric polygons color value is used to fill the returned polygonal outlines.
    */
  var Gradient: XParametricPolyPolygon2D
  
  /**
    * Specifies the stroke attributes used for hatching.
    *
    * Use 0.0 as the strokeWidth here to indicate hair lines.
    */
  var HatchAttributes: StrokeAttributes
  
  /**
    * {@link Texture} hatching.
    *
    * This member can be used together with bitmap and gradient. The parametric polygons color value is used to stroke the returned polygonal outlines.
    */
  var Hatching: XParametricPolyPolygon2D
  
  /**
    * Specifies the number of parameterized polygons used for the texture.
    *
    * This member specifies the number of polygons the parametric polygon interface is queried. The continuous range [0,1] of the
    * XParametricPolyPolygon::getOutline() method is divided up into numberOfHatchPolygons equal parts, and for everyone of these parts, the start of the
    * interval is plugged into the getOutline method. For example, if numberOfHatchPolygons is 2, then getOutline is called twice, once with 0.0 and once
    * with 0.5. Use this parameter to control the density of the hatching.
    */
  var NumberOfHatchPolygons: Double
  
  /**
    * Repeat mode of the texture, x direction.
    *
    * The repeat mode is separated into x and y direction, this is the x direction part. Permissible values are from the {@link TexturingMode} constants.
    */
  var RepeatModeX: Double
  
  /**
    * Repeat mode of the texture, y direction.
    *
    * The repeat mode is separated into x and y direction, this is the y direction part. Permissible values are from the {@link TexturingMode} constants.
    */
  var RepeatModeY: Double
}
object Texture {
  
  inline def apply(
    AffineTransform: AffineMatrix2D,
    Alpha: Double,
    Bitmap: XBitmap,
    Gradient: XParametricPolyPolygon2D,
    HatchAttributes: StrokeAttributes,
    Hatching: XParametricPolyPolygon2D,
    NumberOfHatchPolygons: Double,
    RepeatModeX: Double,
    RepeatModeY: Double
  ): Texture = {
    val __obj = js.Dynamic.literal(AffineTransform = AffineTransform.asInstanceOf[js.Any], Alpha = Alpha.asInstanceOf[js.Any], Bitmap = Bitmap.asInstanceOf[js.Any], Gradient = Gradient.asInstanceOf[js.Any], HatchAttributes = HatchAttributes.asInstanceOf[js.Any], Hatching = Hatching.asInstanceOf[js.Any], NumberOfHatchPolygons = NumberOfHatchPolygons.asInstanceOf[js.Any], RepeatModeX = RepeatModeX.asInstanceOf[js.Any], RepeatModeY = RepeatModeY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Texture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Texture] (val x: Self) extends AnyVal {
    
    inline def setAffineTransform(value: AffineMatrix2D): Self = StObject.set(x, "AffineTransform", value.asInstanceOf[js.Any])
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "Alpha", value.asInstanceOf[js.Any])
    
    inline def setBitmap(value: XBitmap): Self = StObject.set(x, "Bitmap", value.asInstanceOf[js.Any])
    
    inline def setGradient(value: XParametricPolyPolygon2D): Self = StObject.set(x, "Gradient", value.asInstanceOf[js.Any])
    
    inline def setHatchAttributes(value: StrokeAttributes): Self = StObject.set(x, "HatchAttributes", value.asInstanceOf[js.Any])
    
    inline def setHatching(value: XParametricPolyPolygon2D): Self = StObject.set(x, "Hatching", value.asInstanceOf[js.Any])
    
    inline def setNumberOfHatchPolygons(value: Double): Self = StObject.set(x, "NumberOfHatchPolygons", value.asInstanceOf[js.Any])
    
    inline def setRepeatModeX(value: Double): Self = StObject.set(x, "RepeatModeX", value.asInstanceOf[js.Any])
    
    inline def setRepeatModeY(value: Double): Self = StObject.set(x, "RepeatModeY", value.asInstanceOf[js.Any])
  }
}
