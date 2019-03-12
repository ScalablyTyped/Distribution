package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is an independent piece of text which consists of a series of one or more paragraphs.
  *
  * This service is used, for example, for the text of a {@link TextDocument} or the text in a cell or {@link TextFrame} .
  * @see com.sun.star.text.TextDocument
  * @see com.sun.star.text.TextFrame
  * @see com.sun.star.table.Cell
  */
trait Text
  extends XText
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
     with XTextRangeCompare
     with XTextRangeMover
     with XRelativeTextContentInsert {
  /**
    * contains the properties of a redline at the start of the document. The sequence contains the following properties
    *
    * string RedlineAuthor
    *
    *
    *
    * {@link com.sun.star.util.DateTime} RedlineDate_Time
    *
    *
    *
    * string RedlineComment
    *
    *
    *
    * string RedlineType
    *
    *
    *
    * string RedlineIdentifier
    *
    *
    *
    * boolean IsCollapsed
    *
    *
    *
    * boolean IsStart
    *
    *
    *
    * boolean MergeLastPara
    *
    *
    *
    * [maybevoid] {@link com.sun.star.text.XText} RedlineText (maybevoid)
    *
    *
    *
    * {@link com.sun.star.beans.PropertyValues} RedlineSuccessorData (contains the same properties except for the RedlineSuccessorData)
    * @see StartRedline
    */
  var EndRedline: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  /**
    * contains the properties of a redline at the start of the document. ;  The sequence contains the following properties
    *
    * string RedlineAuthor
    *
    *
    *
    * {@link com.sun.star.util.DateTime} RedlineDate_Time
    *
    *
    *
    * string RedlineComment
    *
    *
    *
    * string RedlineType
    *
    *
    *
    * string RedlineIdentifier
    *
    *
    *
    * boolean IsCollapsed
    *
    *
    *
    * boolean IsStart
    *
    *
    *
    * boolean MergeLastPara
    *
    *
    *
    * [maybevoid] {@link com.sun.star.text.XText} RedlineText (maybevoid)
    *
    *
    *
    * {@link com.sun.star.beans.PropertyValues} RedlineSuccessorData (contains the same properties except for the RedlineSuccessorData)
    * @see EndRedline
    */
  var StartRedline: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
}

object Text {
  @scala.inline
  def apply(
    ElementType: activexDashLibreofficeLib.`type`,
    End: XTextRange,
    EndRedline: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues,
    Start: XTextRange,
    StartRedline: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues,
    String: java.lang.String,
    acquire: () => scala.Unit,
    compareRegionEnds: (XTextRange, XTextRange) => scala.Double,
    compareRegionStarts: (XTextRange, XTextRange) => scala.Double,
    createEnumeration: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    createTextCursor: () => XTextCursor,
    createTextCursorByRange: XTextRange => XTextCursor,
    getElementType: () => activexDashLibreofficeLib.`type`,
    getEnd: () => XTextRange,
    getStart: () => XTextRange,
    getString: () => java.lang.String,
    getText: () => XText,
    hasElements: () => scala.Boolean,
    insertControlCharacter: (XTextRange, scala.Double, scala.Boolean) => scala.Unit,
    insertString: (XTextRange, java.lang.String, scala.Boolean) => scala.Unit,
    insertTextContent: (XTextRange, XTextContent, scala.Boolean) => scala.Unit,
    insertTextContentAfter: (XTextContent, XTextContent) => scala.Unit,
    insertTextContentBefore: (XTextContent, XTextContent) => scala.Unit,
    moveTextRange: (XTextRange, scala.Double) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeTextContent: XTextContent => scala.Unit,
    setString: java.lang.String => scala.Unit
  ): Text = {
    val __obj = js.Dynamic.literal(ElementType = ElementType, End = End, EndRedline = EndRedline.asInstanceOf[js.Any], Start = Start, StartRedline = StartRedline.asInstanceOf[js.Any], String = String, acquire = js.Any.fromFunction0(acquire), compareRegionEnds = js.Any.fromFunction2(compareRegionEnds), compareRegionStarts = js.Any.fromFunction2(compareRegionStarts), createEnumeration = js.Any.fromFunction0(createEnumeration), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), getElementType = js.Any.fromFunction0(getElementType), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), hasElements = js.Any.fromFunction0(hasElements), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), insertTextContent = js.Any.fromFunction3(insertTextContent), insertTextContentAfter = js.Any.fromFunction2(insertTextContentAfter), insertTextContentBefore = js.Any.fromFunction2(insertTextContentBefore), moveTextRange = js.Any.fromFunction2(moveTextRange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTextContent = js.Any.fromFunction1(removeTextContent), setString = js.Any.fromFunction1(setString))
  
    __obj.asInstanceOf[Text]
  }
}

