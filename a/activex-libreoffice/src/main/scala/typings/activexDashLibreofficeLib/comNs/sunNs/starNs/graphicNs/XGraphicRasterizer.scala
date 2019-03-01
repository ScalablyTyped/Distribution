package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interfaces exposes the initialize and a rasterize method to rasterize a given data stream to a pixel graphic */
trait XGraphicRasterizer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
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
  def initializeData(
    DataStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    DPI_X: scala.Double,
    DPI_Y: scala.Double,
    DefaultSizePixel: js.Array[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size]
  ): scala.Boolean
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
    Width: scala.Double,
    Height: scala.Double,
    RotateAngle: scala.Double,
    ShearAngle_X: scala.Double,
    ShearAngle_Y: scala.Double,
    RasterizeProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  ): XGraphic
}

object XGraphicRasterizer {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    initializeData: js.Function4[
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      scala.Double, 
      scala.Double, 
      js.Array[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size], 
      scala.Boolean
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    rasterize: js.Function6[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, 
      XGraphic
    ],
    release: js.Function0[scala.Unit]
  ): XGraphicRasterizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("initializeData")(initializeData)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("rasterize")(rasterize)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XGraphicRasterizer]
  }
}

