package typings.activexLibreoffice.com_.sun.star.graphic

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interfaces exposes the initialize and a rasterize method to rasterize a given data stream to a pixel graphic */
@js.native
trait XGraphicRasterizer extends XInterface {
  
  /**
    * Initializing the rasterizer
    *
    * This method could also be used to determine, if the provided data is able to be rasterized by the implementation. The implementation should take care
    * of this feature as well as setting the default image size in pixel within the given output parameter.
    * @param DataStream The input stream of data that should be rasterized
    * @param DPI_X The horizontal resolution of the callers device in pixel per inch. This value is needed to calculate the correct dimensions of the graphic
    * @param DPI_Y The vertical resolution of the callers device in pixel per inch. This value is needed to calculate the correct dimensions of the graphic to
    * @param DefaultSizePixel The default rendering size in pixel of the underlying graphics data may be available after the call via this output parameter. I
    * @returns A boolean value indicating if rasterizing of the given data is possible at all and if the initialization process happened successfully.
    * @see com.sun.star.io.XInputStream
    * @see com.sun.star.awt.Size
    */
  def initializeData(DataStream: XInputStream, DPI_X: Double, DPI_Y: Double, DefaultSizePixel: js.Array[Size]): Boolean = js.native
  
  /**
    * Rasterizing the initialized data into a {@link XGraphic} container.
    *
    * The {@link XGraphic} container will contain a pixel type graphic after a successful rasterization process
    *
    * In case of any fault during the rasterization process, the {@link XGraphic} container will be empty afterwards and the method will return false
    * @param Width The width in pixel of the graphic to be rasterized. This parameter is used without taking other transformation values into account.
    * @param Height The height in pixel of the graphic to be rasterized. This parameter is used without taking other transformation values into account.
    * @param RotateAngle The rotation angle of the graphic to be rasterized. This parameter is used without taking other transformation values into account. T
    * @param ShearAngle_X The horizontal shear angle of the graphic to be rasterized. This parameter is used without taking other transformation values into a
    * @param ShearAngle_Y The vertical shear angle of the graphic to be rasterized. This parameter is used without taking other transformation values into acc
    * @param RasterizeProperties Additional properties for special needs (undefined by now)
    * @returns {@link com.sun.star.graphic.XGraphic} An interface to a graphic container that holds the rasterized pixel data
    * @see com.sun.star.beans.PropertyValues
    * @see com.sun.star.graphic.XGraphic
    */
  def rasterize(
    Width: Double,
    Height: Double,
    RotateAngle: Double,
    ShearAngle_X: Double,
    ShearAngle_Y: Double,
    RasterizeProperties: PropertyValues
  ): XGraphic = js.native
}
object XGraphicRasterizer {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    initializeData: (XInputStream, Double, Double, js.Array[Size]) => Boolean,
    queryInterface: `type` => js.Any,
    rasterize: (Double, Double, Double, Double, Double, PropertyValues) => XGraphic,
    release: () => Unit
  ): XGraphicRasterizer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), initializeData = js.Any.fromFunction4(initializeData), queryInterface = js.Any.fromFunction1(queryInterface), rasterize = js.Any.fromFunction6(rasterize), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XGraphicRasterizer]
  }
  
  @scala.inline
  implicit class XGraphicRasterizerMutableBuilder[Self <: XGraphicRasterizer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitializeData(value: (XInputStream, Double, Double, js.Array[Size]) => Boolean): Self = StObject.set(x, "initializeData", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRasterize(value: (Double, Double, Double, Double, Double, PropertyValues) => XGraphic): Self = StObject.set(x, "rasterize", js.Any.fromFunction6(value))
  }
}
