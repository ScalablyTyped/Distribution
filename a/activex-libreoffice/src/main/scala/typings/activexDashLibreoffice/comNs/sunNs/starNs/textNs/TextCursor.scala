package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyState
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XMultiPropertyStates
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.XDocumentInsertable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XSortable
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A {@link TextCursor} is a {@link TextRange} which can be moved within a {@link Text} object.
  * @see TextRange
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XParagraphCursor because var conflicts: String. Inlined gotoEndOfParagraph, gotoNextParagraph, gotoPreviousParagraph, gotoStartOfParagraph, isEndOfParagraph, isStartOfParagraph- typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XSentenceCursor because var conflicts: String. Inlined gotoEndOfSentence, gotoNextSentence, gotoPreviousSentence, gotoStartOfSentence, isEndOfSentence, isStartOfSentence- typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XWordCursor because var conflicts: String. Inlined gotoEndOfWord, gotoNextWord, gotoPreviousWord, gotoStartOfWord, isEndOfWord, isStartOfWord */ trait TextCursor
  extends TextRange
     with XMultiPropertyStates
     with XDocumentInsertable
     with XSortable {
  /**
    * @param aPropertyName contains the sequence of property names.
    * @returns a sequence of the states of the properties which are specified by their names.  The order of the states is correlating to the order of the given
    * @throws UnknownPropertyException if one property does not exist.
    */
  /* InferMemberOverrides */
  override def getPropertyStates(aPropertyName: SeqEquiv[String]): SafeArray[PropertyState]
  /**
    * moves the cursor to the end of the current paragraph.
    * @returns `TRUE` if the cursor is now at the end of a paragraph, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoEndOfParagraph(bExpand: Boolean): Boolean
  /**
    * moves the cursor to the end of the current sentence.
    * @returns `TRUE` if the cursor is now at the end of a sentence, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoEndOfSentence(Expand: Boolean): Boolean
  /**
    * moves the cursor to the end of the current word.
    * @returns `TRUE` if the cursor is now at the end of a word, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoEndOfWord(bExpand: Boolean): Boolean
  /**
    * moves the cursor to the next paragraph.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoNextParagraph(bExpand: Boolean): Boolean
  /**
    * moves the cursor to the start of the next sentence.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoNextSentence(Expand: Boolean): Boolean
  /**
    * moves the cursor to the next word.
    *
    * Note: the function returning `TRUE` does not necessarily mean that the cursor is located at the next word, or any word at all! This may happen for
    * example if it travels over empty paragraphs.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoNextWord(bExpand: Boolean): Boolean
  /**
    * moves the cursor to the previous paragraph.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoPreviousParagraph(bExpand: Boolean): Boolean
  /**
    * moves the cursor to the start of the previous sentence.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoPreviousSentence(Expand: Boolean): Boolean
  /**
    * moves the cursor to the previous word.
    *
    * Note: the function returning `TRUE` does not necessarily mean that the cursor is located at the previous word, or any word at all! This may happen for
    * example if it travels over empty paragraphs.
    * @returns `TRUE` if the cursor was moved. It returns `FALSE` it the cursor can not advance further.
    */
  def gotoPreviousWord(bExpand: Boolean): Boolean
  /**
    * moves the cursor to the start of the current paragraph.
    * @returns `TRUE` if the cursor is now at the start of a paragraph, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoStartOfParagraph(bExpand: Boolean): Boolean
  /**
    * moves the cursor to the start of the current sentence.
    * @returns `TRUE` if the cursor is now at the start of a sentence, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoStartOfSentence(Expand: Boolean): Boolean
  /**
    * moves the cursor to the start of the current word.
    * @returns `TRUE` if the cursor is now at the start of a word, `FALSE` otherwise. If `FALSE` was returned the cursor will remain at its original position.
    */
  def gotoStartOfWord(bExpand: Boolean): Boolean
  /** determines if the cursor is positioned at the end of a paragraph. */
  def isEndOfParagraph(): Boolean
  /** determines if the cursor is positioned at the end of a sentence. */
  def isEndOfSentence(): Boolean
  /** determines if the cursor is positioned at the end of a word. */
  def isEndOfWord(): Boolean
  /** determines if the cursor is positioned at the start of a paragraph. */
  def isStartOfParagraph(): Boolean
  /** determines if the cursor is positioned at the start of a sentence. */
  def isStartOfSentence(): Boolean
  /** determines if the cursor is positioned at the start of a word. */
  def isStartOfWord(): Boolean
}

object TextCursor {
  @scala.inline
  def apply(
    XDocumentInsertable: XDocumentInsertable = null,
    XMultiPropertyStates: XMultiPropertyStates = null,
    XParagraphCursor: XParagraphCursor = null,
    XSentenceCursor: XSentenceCursor = null,
    XSortable: XSortable = null,
    XWordCursor: XWordCursor = null,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    TextRange: TextRange = null
  ): TextCursor = {
    val __obj = js.Dynamic.literal(getPropertyStates = js.Any.fromFunction1(getPropertyStates))
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XDocumentInsertable)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XMultiPropertyStates)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XParagraphCursor)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XSentenceCursor)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XSortable)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XWordCursor)
    js.Dynamic.global.Object.assign(__obj, TextRange)
    __obj.asInstanceOf[TextCursor]
  }
}

