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
  ): stdLib.SafeArray[XPrimitive2D]
}

object XSvgParser {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getDecomposition: (activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, java.lang.String) => stdLib.SafeArray[XPrimitive2D],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XSvgParser = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDecomposition = js.Any.fromFunction2(getDecomposition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSvgParser]
  }
}

