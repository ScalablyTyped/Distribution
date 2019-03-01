package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A {@link TextCursor} is a {@link TextRange} which can be moved within a {@link Text} object.
  * @see TextRange
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XParagraphCursor because var conflicts: String. Inlined gotoEndOfParagraph, gotoNextParagraph, gotoPreviousParagraph, gotoStartOfParagraph, isEndOfParagraph, isStartOfParagraph- activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XSentenceCursor because var conflicts: String. Inlined gotoEndOfSentence, gotoNextSentence, gotoPreviousSentence, gotoStartOfSentence, isEndOfSentence, isStartOfSentence- activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XWordCursor because var conflicts: String. Inlined gotoEndOfWord, gotoNextWord, gotoPreviousWord, gotoStartOfWord, isEndOfWord, isStartOfWord */ trait TextCursor
  extends TextRange
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XMultiPropertyStates
     with activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XDocumentInsertable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XSortable {
  /**
    * @param aPropertyName contains the sequence of property names.
    * @returns a sequence of the states of the properties which are specified by their names.  The order of the states is correlating to the order of the given
    * @throws UnknownPropertyException if one property does not exist.
    */
  /* InferMemberOverrides */
  override def getPropertyStates(aPropertyName: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState]
  /**
    * moves the cursor to the end of the current paragraph.
    * @returns `TRUE` if the cursor is now at the end of a paragraph, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoEndOfParagraph(bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the end of the current sentence.
    * @returns `TRUE` if the cursor is now at the end of a sentence, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoEndOfSentence(Expand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the end of the current word.
    * @returns `TRUE` if the cursor is now at the end of a word, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoEndOfWord(bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the next paragraph.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoNextParagraph(bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the start of the next sentence.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoNextSentence(Expand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the next word.
    *
    * Note: the function returning `TRUE` does not necessarily mean that the cursor is located at the next word, or any word at all! This may happen for
    * example if it travels over empty paragraphs.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoNextWord(bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the previous paragraph.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoPreviousParagraph(bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the start of the previous sentence.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoPreviousSentence(Expand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the previous word.
    *
    * Note: the function returning `TRUE` does not necessarily mean that the cursor is located at the previous word, or any word at all! This may happen for
    * example if it travels over empty paragraphs.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoPreviousWord(bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the start of the current paragraph.
    * @returns `TRUE` if the cursor is now at the start of a paragraph, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoStartOfParagraph(bExpand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the start of the current sentence.
    * @returns `TRUE` if the cursor is now at the start of a sentence, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoStartOfSentence(Expand: scala.Boolean): scala.Boolean
  /**
    * moves the cursor to the start of the current word.
    * @returns `TRUE` if the cursor is now at the start of a word, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoStartOfWord(bExpand: scala.Boolean): scala.Boolean
  /** determines if the cursor is positioned at the end of a paragraph. */
  def isEndOfParagraph(): scala.Boolean
  /** determines if the cursor is positioned at the end of a sentence. */
  def isEndOfSentence(): scala.Boolean
  /** determines if the cursor is positioned at the end of a word. */
  def isEndOfWord(): scala.Boolean
  /** determines if the cursor is positioned at the start of a paragraph. */
  def isStartOfParagraph(): scala.Boolean
  /** determines if the cursor is positioned at the start of a sentence. */
  def isStartOfSentence(): scala.Boolean
  /** determines if the cursor is positioned at the start of a word. */
  def isStartOfWord(): scala.Boolean
}

object TextCursor {
  @scala.inline
  def apply(
    XDocumentInsertable: activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XDocumentInsertable = null,
    XMultiPropertyStates: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XMultiPropertyStates = null,
    XParagraphCursor: XParagraphCursor = null,
    XSentenceCursor: XSentenceCursor = null,
    XSortable: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XSortable = null,
    XWordCursor: XWordCursor = null,
    getPropertyStates: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState]
    ],
    TextRange: TextRange = null
  ): TextCursor = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XDocumentInsertable)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XMultiPropertyStates)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XParagraphCursor)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XSentenceCursor)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XSortable)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XWordCursor)
    __obj.updateDynamic("getPropertyStates")(getPropertyStates)
    js.Dynamic.global.Object.assign(__obj, TextRange)
    __obj.asInstanceOf[TextCursor]
  }
}

