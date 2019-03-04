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
    acquire: js.Function0[scala.Unit],
    compareRegionEnds: js.Function2[XTextRange, XTextRange, scala.Double],
    compareRegionStarts: js.Function2[XTextRange, XTextRange, scala.Double],
    createEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    createTextCursor: js.Function0[XTextCursor],
    createTextCursorByRange: js.Function1[XTextRange, XTextCursor],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getEnd: js.Function0[XTextRange],
    getStart: js.Function0[XTextRange],
    getString: js.Function0[java.lang.String],
    getText: js.Function0[XText],
    hasElements: js.Function0[scala.Boolean],
    insertControlCharacter: js.Function3[XTextRange, scala.Double, scala.Boolean, scala.Unit],
    insertString: js.Function3[XTextRange, java.lang.String, scala.Boolean, scala.Unit],
    insertTextContent: js.Function3[XTextRange, XTextContent, scala.Boolean, scala.Unit],
    insertTextContentAfter: js.Function2[XTextContent, XTextContent, scala.Unit],
    insertTextContentBefore: js.Function2[XTextContent, XTextContent, scala.Unit],
    moveTextRange: js.Function2[XTextRange, scala.Double, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeTextContent: js.Function1[XTextContent, scala.Unit],
    setString: js.Function1[java.lang.String, scala.Unit]
  ): Text = {
    val __obj = js.Dynamic.literal(ElementType = ElementType, End = End, EndRedline = EndRedline.asInstanceOf[js.Any], Start = Start, StartRedline = StartRedline.asInstanceOf[js.Any], String = String, acquire = acquire, compareRegionEnds = compareRegionEnds, compareRegionStarts = compareRegionStarts, createEnumeration = createEnumeration, createTextCursor = createTextCursor, createTextCursorByRange = createTextCursorByRange, getElementType = getElementType, getEnd = getEnd, getStart = getStart, getString = getString, getText = getText, hasElements = hasElements, insertControlCharacter = insertControlCharacter, insertString = insertString, insertTextContent = insertTextContent, insertTextContentAfter = insertTextContentAfter, insertTextContentBefore = insertTextContentBefore, moveTextRange = moveTextRange, queryInterface = queryInterface, release = release, removeTextContent = removeTextContent, setString = setString)
  
    __obj.asInstanceOf[Text]
  }
}

