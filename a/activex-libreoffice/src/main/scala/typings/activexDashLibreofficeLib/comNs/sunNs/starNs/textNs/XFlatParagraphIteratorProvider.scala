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
    acquire: js.Function0[scala.Unit],
    getFlatParagraphIterator: js.Function2[scala.Double, scala.Boolean, XFlatParagraphIterator],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XFlatParagraphIteratorProvider = {
    val __obj = js.Dynamic.literal(acquire = acquire, getFlatParagraphIterator = getFlatParagraphIterator, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XFlatParagraphIteratorProvider]
  }
}

