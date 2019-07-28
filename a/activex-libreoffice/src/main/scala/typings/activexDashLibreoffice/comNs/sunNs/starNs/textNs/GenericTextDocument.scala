package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.OfficeDocument
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XMultiServiceFactory
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.XStyleFamiliesSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tiledrenderingNs.XTiledRenderable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XNumberFormatsSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XRefreshable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XReplaceable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A text document is a model component which contains text structured by paragraphs.
  *
  * Each paragraph and each portion of text can be fitted with some attributes (technically properties).
  *
  * Its declared as generic text document, because its function is needed by different derived services (TextDocument/WebDocument/GlobalDocument).
  *
  * In addition, all text objects can be searched.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XTextDocument because var conflicts: CurrentController. Inlined getText, reformat, Text */ @js.native
trait GenericTextDocument
  extends OfficeDocument
     with XMultiServiceFactory
     with XRefreshable
     with XTiledRenderable
     with XFootnotesSupplier
     with XEndnotesSupplier
     with XReplaceable
     with XPagePrintable
     with XReferenceMarksSupplier
     with XChapterNumberingSupplier
     with XPropertySet
     with XTextGraphicObjectsSupplier
     with XTextEmbeddedObjectsSupplier
     with XTextTablesSupplier
     with XStyleFamiliesSupplier
     with XBookmarksSupplier
     with XDocumentIndexesSupplier
     with XTextFieldsSupplier
     with XTextFramesSupplier
     with XTextSectionsSupplier
     with XNumberFormatsSupplier {
  /** contains the identifier of the default locale of the document. */
  var CharLocale: Locale = js.native
  /** contains the count of all characters in the document. */
  var CharacterCount: Double = js.native
  /**
    * specifies the concordance file taken into account when creating an index.
    *
    * When no concordance file should be used the string is empty. Used for text documents only.
    * @since OOo 1.1.2
    */
  var IndexAutoMarkFileURL: String = js.native
  /** contains the count of all paragraphs in the document. */
  var ParagraphCount: Double = js.native
  /**
    * specifies if change recording is active.
    * @since OOo 1.1.2
    */
  var RecordChanges: Boolean = js.native
  /** @returns the major {@link com.sun.star.text.Text} of the text document.  This text does not contain texts in {@link TextFrames} , or cells of {@link TextT */
  val Text: XText = js.native
  /**
    * specifies the first 4 digit year to be used when years are given in 2 digits.
    *
    * Example: if set to 1930 Oct-12-29 will be interpreted as Oct-12-2029 Oct-12-30 will be interpreted as Oct-12-1930 Oct-12-02 will be interpreted as
    * Oct-12-2002
    * @since OOo 1.1.2
    */
  var TwoDigitYear: Double = js.native
  /**
    * contains the count of all words in the document.
    * @see WordSeparator
    */
  var WordCount: Double = js.native
  /**
    * contains a string that consists of characters that mark the separation of words in counting the words in a document.
    *
    * I.e. slash and backslash. Whitespace (tab stop, space, paragraph break, line break) always separate words.
    * @see WordCount
    */
  var WordSeparator: String = js.native
  /** @returns the major {@link com.sun.star.text.Text} of the text document.  This text does not contain texts in {@link TextFrames} , or cells of {@link TextT */
  def getText(): XText = js.native
  /** reformats the contents of the document. */
  def reformat(): Unit = js.native
}

