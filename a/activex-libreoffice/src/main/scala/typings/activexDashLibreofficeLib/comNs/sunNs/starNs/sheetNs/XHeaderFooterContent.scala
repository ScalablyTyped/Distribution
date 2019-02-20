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

