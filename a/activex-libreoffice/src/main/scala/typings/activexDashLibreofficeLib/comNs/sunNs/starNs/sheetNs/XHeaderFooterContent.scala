package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the text contents of a header or footer on a page.
  * @see com.sun.star.sheet.HeaderFooterContent
  * @see com.sun.star.sheet.TablePageStyle
  */
trait XHeaderFooterContent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the text which is printed in the center part of the header or footer.
    * @see com.sun.star.text.Text
    */
  val CenterText: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText
  /**
    * returns the text which is printed in the left part of the header or footer.
    * @see com.sun.star.text.Text
    */
  val LeftText: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText
  /**
    * returns the text which is printed in the right part of the header or footer.
    * @see com.sun.star.text.Text
    */
  val RightText: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText
  /**
    * returns the text which is printed in the center part of the header or footer.
    * @see com.sun.star.text.Text
    */
  def getCenterText(): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText
  /**
    * returns the text which is printed in the left part of the header or footer.
    * @see com.sun.star.text.Text
    */
  def getLeftText(): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText
  /**
    * returns the text which is printed in the right part of the header or footer.
    * @see com.sun.star.text.Text
    */
  def getRightText(): activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText
}

object XHeaderFooterContent {
  @scala.inline
  def apply(
    CenterText: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText,
    LeftText: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText,
    RightText: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText,
    acquire: () => scala.Unit,
    getCenterText: () => activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText,
    getLeftText: () => activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText,
    getRightText: () => activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XHeaderFooterContent = {
    val __obj = js.Dynamic.literal(CenterText = CenterText, LeftText = LeftText, RightText = RightText, acquire = js.Any.fromFunction0(acquire), getCenterText = js.Any.fromFunction0(getCenterText), getLeftText = js.Any.fromFunction0(getLeftText), getRightText = js.Any.fromFunction0(getRightText), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XHeaderFooterContent]
  }
}

