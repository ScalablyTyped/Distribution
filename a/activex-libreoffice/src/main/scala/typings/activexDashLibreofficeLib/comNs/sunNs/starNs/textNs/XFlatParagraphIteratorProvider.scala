package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides functionality to ...
  * @since OOo 3.0
  */
trait XFlatParagraphIteratorProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * get {@link XFlatParagraphIterator}
    * @param nType Type of text markup see {@link TextMarkupType} .
    * @param bAutomatic Automatic or interactive checking.
    * @returns the iterator.
    * @throws IllegalArgumentException if any argument is wrong.
    */
  def getFlatParagraphIterator(nType: scala.Double, bAutomatic: scala.Boolean): XFlatParagraphIterator
}

object XFlatParagraphIteratorProvider {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getFlatParagraphIterator: (scala.Double, scala.Boolean) => XFlatParagraphIterator,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XFlatParagraphIteratorProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getFlatParagraphIterator = js.Any.fromFunction2(getFlatParagraphIterator), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFlatParagraphIteratorProvider]
  }
}

