package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is an independent piece of text which consists of a series of one or more paragraphs.
  *
  * This service is used, for example, for the text of a {@link TextDocument} or the text in a cell or {@link TextFrame} .
  * @see com.sun.star.text.TextDocument
  * @see com.sun.star.text.TextFrame
  * @see com.sun.star.table.Cell
  */
trait Text
  extends StObject
     with XEnumerationAccess
     with XText
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
  var EndRedline: PropertyValues
  
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
  var StartRedline: PropertyValues
}
object Text {
  
  inline def apply(
    ElementType: `type`,
    End: XTextRange,
    EndRedline: PropertyValues,
    Start: XTextRange,
    StartRedline: PropertyValues,
    String: String,
    acquire: () => Unit,
    compareRegionEnds: (XTextRange, XTextRange) => Double,
    compareRegionStarts: (XTextRange, XTextRange) => Double,
    createEnumeration: () => XEnumeration,
    createTextCursor: () => XTextCursor,
    createTextCursorByRange: XTextRange => XTextCursor,
    getElementType: () => `type`,
    getEnd: () => XTextRange,
    getStart: () => XTextRange,
    getString: () => String,
    getText: () => XText,
    hasElements: () => Boolean,
    insertControlCharacter: (XTextRange, Double, Boolean) => Unit,
    insertString: (XTextRange, String, Boolean) => Unit,
    insertTextContent: (XTextRange, XTextContent, Boolean) => Unit,
    insertTextContentAfter: (XTextContent, XTextContent) => Unit,
    insertTextContentBefore: (XTextContent, XTextContent) => Unit,
    moveTextRange: (XTextRange, Double) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeTextContent: XTextContent => Unit,
    setString: String => Unit
  ): Text = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], EndRedline = EndRedline.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], StartRedline = StartRedline.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), compareRegionEnds = js.Any.fromFunction2(compareRegionEnds), compareRegionStarts = js.Any.fromFunction2(compareRegionStarts), createEnumeration = js.Any.fromFunction0(createEnumeration), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), getElementType = js.Any.fromFunction0(getElementType), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), hasElements = js.Any.fromFunction0(hasElements), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), insertTextContent = js.Any.fromFunction3(insertTextContent), insertTextContentAfter = js.Any.fromFunction2(insertTextContentAfter), insertTextContentBefore = js.Any.fromFunction2(insertTextContentBefore), moveTextRange = js.Any.fromFunction2(moveTextRange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTextContent = js.Any.fromFunction1(removeTextContent), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[Text]
  }
  
  extension [Self <: Text](x: Self) {
    
    inline def setEndRedline(value: PropertyValues): Self = StObject.set(x, "EndRedline", value.asInstanceOf[js.Any])
    
    inline def setEndRedlineVarargs(value: PropertyValue*): Self = StObject.set(x, "EndRedline", js.Array(value :_*))
    
    inline def setStartRedline(value: PropertyValues): Self = StObject.set(x, "StartRedline", value.asInstanceOf[js.Any])
    
    inline def setStartRedlineVarargs(value: PropertyValue*): Self = StObject.set(x, "StartRedline", js.Array(value :_*))
  }
}
