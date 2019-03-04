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
    acquire: js.Function0[scala.Unit],
    getCenterText: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText],
    getLeftText: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText],
    getRightText: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XHeaderFooterContent = {
    val __obj = js.Dynamic.literal(CenterText = CenterText, LeftText = LeftText, RightText = RightText, acquire = acquire, getCenterText = getCenterText, getLeftText = getLeftText, getRightText = getRightText, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XHeaderFooterContent]
  }
}

