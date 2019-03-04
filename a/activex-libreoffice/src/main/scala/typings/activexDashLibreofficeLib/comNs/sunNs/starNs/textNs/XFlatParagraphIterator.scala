package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides functionality to ...
  * @since OOo 3.0
  */
trait XFlatParagraphIterator
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * get the first flat paragraph to be checked or an empty reference if there are no more paragraphs to check.
    * @returns the paragraph.
    */
  val FirstPara: XFlatParagraph
  /**
    * get the last flat paragraph
    * @returns the paragraph.
    */
  val LastPara: XFlatParagraph
  /**
    * get the next flat paragraph to be checked or an empty reference if there are no more paragraphs to check.
    * @returns the paragraph.
    */
  val NextPara: XFlatParagraph
  /**
    * get the first flat paragraph to be checked or an empty reference if there are no more paragraphs to check.
    * @returns the paragraph.
    */
  def getFirstPara(): XFlatParagraph
  /**
    * get the last flat paragraph
    * @returns the paragraph.
    */
  def getLastPara(): XFlatParagraph
  /**
    * get the next flat paragraph to be checked or an empty reference if there are no more paragraphs to check.
    * @returns the paragraph.
    */
  def getNextPara(): XFlatParagraph
  /**
    * get the flat paragraph just following this one
    * @param xPara the current flat paragraph
    * @returns the flat paragraph.
    * @throws IllegalArgumentException if any argument is wrong.
    */
  def getParaAfter(xPara: XFlatParagraph): XFlatParagraph
  /**
    * get the flat paragraph before this one
    * @param xPara the current flat paragraph
    * @returns the flat paragraph.
    * @throws IllegalArgumentException if any argument is wrong.
    */
  def getParaBefore(xPara: XFlatParagraph): XFlatParagraph
}

object XFlatParagraphIterator {
  @scala.inline
  def apply(
    FirstPara: XFlatParagraph,
    LastPara: XFlatParagraph,
    NextPara: XFlatParagraph,
    acquire: js.Function0[scala.Unit],
    getFirstPara: js.Function0[XFlatParagraph],
    getLastPara: js.Function0[XFlatParagraph],
    getNextPara: js.Function0[XFlatParagraph],
    getParaAfter: js.Function1[XFlatParagraph, XFlatParagraph],
    getParaBefore: js.Function1[XFlatParagraph, XFlatParagraph],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XFlatParagraphIterator = {
    val __obj = js.Dynamic.literal(FirstPara = FirstPara, LastPara = LastPara, NextPara = NextPara, acquire = acquire, getFirstPara = getFirstPara, getLastPara = getLastPara, getNextPara = getNextPara, getParaAfter = getParaAfter, getParaBefore = getParaBefore, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XFlatParagraphIterator]
  }
}

