package typings.activexLibreoffice.com_.sun.star.rendering

import typings.activexLibreoffice.com_.sun.star.geometry.AffineMatrix2D
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This structure contains information passed to each {@link XCanvas} render operation.
  *
  * This structure contains information considered as the render state, i.e. the common setup required to render each individual {@link XCanvas}
  * primitive.
  * @since OOo 2.0
  */
trait RenderState extends StObject {
  
  /**
    * The affine transform associated with this render operation.
    *
    * This is used to transform coordinates of canvas primitives from user space to view space (from which they are subsequently transformed to device space
    * by the view transform).
    */
  var AffineTransform: AffineMatrix2D
  
  /**
    * The clipping area associated with this render operation.
    *
    * This clipping is interpreted in the user coordinate system, i.e. subject to the render state transform followed by the view transform before mapped to
    * device coordinate space.
    *
    * Specifying an empty interface denotes no clipping, i.e. everything rendered to the canvas will be visible (subject to device-dependent constraints, of
    * course). Specifying an empty {@link XPolyPolygon2D} , i.e. a poly-polygon containing zero polygons, or an {@link XPolyPolygon2D} with any number of
    * empty sub-polygons, denotes the NULL clip. That means, nothing rendered to the canvas will be visible.
    */
  var Clip: XPolyPolygon2D
  
  /**
    * The composition mode associated with this render operation.
    *
    * The composite mode determines in which way the primitive and possibly existing background is combined. The permissible values must be one out of the
    * {@link CompositeOperation} constants.
    */
  var CompositeOperation: Double
  
  /**
    * The device color associated with this render operation.
    *
    * Note that this need not be RGB here, but depends on the active device color space.
    * @see XGraphicDevice
    * @see XColorSpace
    */
  var DeviceColor: SafeArray[ColorComponent]
}
object RenderState {
  
  inline def apply(
    AffineTransform: AffineMatrix2D,
    Clip: XPolyPolygon2D,
    CompositeOperation: Double,
    DeviceColor: SafeArray[ColorComponent]
  ): RenderState = {
    val __obj = js.Dynamic.literal(AffineTransform = AffineTransform.asInstanceOf[js.Any], Clip = Clip.asInstanceOf[js.Any], CompositeOperation = CompositeOperation.asInstanceOf[js.Any], DeviceColor = DeviceColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderState] (val x: Self) extends AnyVal {
    
    inline def setAffineTransform(value: AffineMatrix2D): Self = StObject.set(x, "AffineTransform", value.asInstanceOf[js.Any])
    
    inline def setClip(value: XPolyPolygon2D): Self = StObject.set(x, "Clip", value.asInstanceOf[js.Any])
    
    inline def setCompositeOperation(value: Double): Self = StObject.set(x, "CompositeOperation", value.asInstanceOf[js.Any])
    
    inline def setDeviceColor(value: SafeArray[ColorComponent]): Self = StObject.set(x, "DeviceColor", value.asInstanceOf[js.Any])
  }
}
