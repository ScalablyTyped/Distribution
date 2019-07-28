package typings.activexDashLibreoffice.comNs.sunNs.starNs.graphicNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XInputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link XSvgParser} interface
  *
  * This interface allows to parse a SVG stream in form of a sequence of bytes to be parsed into a sequence of XPrimitive2Ds
  */
trait XSvgParser extends XInterface {
  /**
    * Retrieve decomposed list of simpler primitives
    * @param xSvgStream The file containing the SVG XML data
    * @param aAbsolutePath The path containing the SVG XML data
    */
  def getDecomposition(xSvgStream: XInputStream, aAbsolutePath: String): SafeArray[XPrimitive2D]
}

object XSvgParser {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getDecomposition: (XInputStream, String) => SafeArray[XPrimitive2D],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSvgParser = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDecomposition = js.Any.fromFunction2(getDecomposition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSvgParser]
  }
}

