package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XText
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the text contents of a header or footer on a page.
  * @see com.sun.star.sheet.HeaderFooterContent
  * @see com.sun.star.sheet.TablePageStyle
  */
trait XHeaderFooterContent extends XInterface {
  /**
    * returns the text which is printed in the center part of the header or footer.
    * @see com.sun.star.text.Text
    */
  val CenterText: XText
  /**
    * returns the text which is printed in the left part of the header or footer.
    * @see com.sun.star.text.Text
    */
  val LeftText: XText
  /**
    * returns the text which is printed in the right part of the header or footer.
    * @see com.sun.star.text.Text
    */
  val RightText: XText
  /**
    * returns the text which is printed in the center part of the header or footer.
    * @see com.sun.star.text.Text
    */
  def getCenterText(): XText
  /**
    * returns the text which is printed in the left part of the header or footer.
    * @see com.sun.star.text.Text
    */
  def getLeftText(): XText
  /**
    * returns the text which is printed in the right part of the header or footer.
    * @see com.sun.star.text.Text
    */
  def getRightText(): XText
}

object XHeaderFooterContent {
  @scala.inline
  def apply(
    CenterText: XText,
    LeftText: XText,
    RightText: XText,
    acquire: () => Unit,
    getCenterText: () => XText,
    getLeftText: () => XText,
    getRightText: () => XText,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XHeaderFooterContent = {
    val __obj = js.Dynamic.literal(CenterText = CenterText, LeftText = LeftText, RightText = RightText, acquire = js.Any.fromFunction0(acquire), getCenterText = js.Any.fromFunction0(getCenterText), getLeftText = js.Any.fromFunction0(getLeftText), getRightText = js.Any.fromFunction0(getRightText), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XHeaderFooterContent]
  }
}

