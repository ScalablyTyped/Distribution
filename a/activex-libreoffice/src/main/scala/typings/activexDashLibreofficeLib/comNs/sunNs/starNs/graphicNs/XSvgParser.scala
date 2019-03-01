package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link XSvgParser} interface
  *
  * This interface allows to parse a SVG stream in form of a sequence of bytes to be parsed into a sequence of XPrimitive2Ds
  */
trait XSvgParser
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Retrieve decomposed list of simpler primitives
    * @param xSvgStream The file containing the SVG XML data
    * @param aAbsolutePath The path containing the SVG XML data
    */
  def getDecomposition(
    xSvgStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream,
    aAbsolutePath: java.lang.String
  ): activexDashInteropLib.SafeArray[XPrimitive2D]
}

object XSvgParser {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getDecomposition: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      java.lang.String, 
      activexDashInteropLib.SafeArray[XPrimitive2D]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSvgParser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getDecomposition")(getDecomposition)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XSvgParser]
  }
}

