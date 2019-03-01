package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link XPrimitive2DRenderer} interface
  *
  * This interface allows to convert from a sequence of XPrimitive2Ds to a XBitmap
  */
trait XPrimitive2DRenderer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * return rasterized version of given {@link XPrimitive2D}
    * @param Primitive2DSequence The graphic content description
    * @param aViewInformationSequence The ViewInformation2D
    * @param DPI_X The horizontal resolution of the callers device in pixel per inch. This value is needed to calculate the correct dimensions of the graphic
    * @param DPI_Y The vertical resolution of the callers device in pixel per inch. This value is needed to calculate the correct dimensions of the graphic to
    * @param Range The range in 1/100th mm of the graphic to be rasterized
    * @param MaximumQuadraticPixels The maximum allowed number of pixels to be used to allow limiting the possible size of used pixels. The AspectRatio is pre
    */
  def rasterize(
    Primitive2DSequence: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XPrimitive2D],
    aViewInformationSequence: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    DPI_X: scala.Double,
    DPI_Y: scala.Double,
    Range: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealRectangle2D,
    MaximumQuadraticPixels: scala.Double
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XBitmap
}

object XPrimitive2DRenderer {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    rasterize: js.Function6[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XPrimitive2D], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealRectangle2D, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.XBitmap
    ],
    release: js.Function0[scala.Unit]
  ): XPrimitive2DRenderer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("rasterize")(rasterize)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XPrimitive2DRenderer]
  }
}

