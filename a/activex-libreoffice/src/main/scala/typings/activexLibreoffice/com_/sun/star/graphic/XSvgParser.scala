package typings.activexLibreoffice.com_.sun.star.graphic

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link XSvgParser} interface
  *
  * This interface allows to parse a SVG stream in form of a sequence of bytes to be parsed into a sequence of XPrimitive2Ds
  */
@js.native
trait XSvgParser extends XInterface {
  /**
    * Retrieve decomposed list of simpler primitives
    * @param xSvgStream The file containing the SVG XML data
    * @param aAbsolutePath The path containing the SVG XML data
    */
  def getDecomposition(xSvgStream: XInputStream, aAbsolutePath: String): SafeArray[XPrimitive2D] = js.native
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
  @scala.inline
  implicit class XSvgParserOps[Self <: XSvgParser] (val x: Self) extends AnyVal {
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
    def setGetDecomposition(value: (XInputStream, String) => SafeArray[XPrimitive2D]): Self = this.set("getDecomposition", js.Any.fromFunction2(value))
  }
  
}

