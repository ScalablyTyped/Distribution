package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

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
- activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextDocument because var conflicts: CurrentController. Inlined getText, reformat, Text */ @js.native
trait GenericTextDocument
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.OfficeDocument
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiServiceFactory
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.tiledrenderingNs.XTiledRenderable
     with XFootnotesSupplier
     with XEndnotesSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XReplaceable
     with XPagePrintable
     with XReferenceMarksSupplier
     with XChapterNumberingSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with XTextGraphicObjectsSupplier
     with XTextEmbeddedObjectsSupplier
     with XTextTablesSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.XStyleFamiliesSupplier
     with XBookmarksSupplier
     with XDocumentIndexesSupplier
     with XTextFieldsSupplier
     with XTextFramesSupplier
     with XTextSectionsSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XNumberFormatsSupplier {
  /** contains the identifier of the default locale of the document. */
  var CharLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale = js.native
  /** contains the count of all characters in the document. */
  var CharacterCount: scala.Double = js.native
  /**
    * specifies the concordance file taken into account when creating an index.
    *
    * When no concordance file should be used the string is empty. Used for text documents only.
    * @since OOo 1.1.2
    */
  var IndexAutoMarkFileURL: java.lang.String = js.native
  /** contains the count of all paragraphs in the document. */
  var ParagraphCount: scala.Double = js.native
  /**
    * specifies if change recording is active.
    * @since OOo 1.1.2
    */
  var RecordChanges: scala.Boolean = js.native
  /** @returns the major {@link com.sun.star.text.Text} of the text document.  This text does not contain texts in {@link TextFrames} , or cells of {@link TextT */
  val Text: XText = js.native
  /**
    * specifies the first 4 digit year to be used when years are given in 2 digits.
    *
    * Example: if set to 1930 Oct-12-29 will be interpreted as Oct-12-2029 Oct-12-30 will be interpreted as Oct-12-1930 Oct-12-02 will be interpreted as
    * Oct-12-2002
    * @since OOo 1.1.2
    */
  var TwoDigitYear: scala.Double = js.native
  /**
    * contains the count of all words in the document.
    * @see WordSeparator
    */
  var WordCount: scala.Double = js.native
  /**
    * contains a string that consists of characters that mark the separation of words in counting the words in a document.
    *
    * I.e. slash and backslash. Whitespace (tab stop, space, paragraph break, line break) always separate words.
    * @see WordCount
    */
  var WordSeparator: java.lang.String = js.native
  /** @returns the major {@link com.sun.star.text.Text} of the text document.  This text does not contain texts in {@link TextFrames} , or cells of {@link TextT */
  def getText(): XText = js.native
  /** reformats the contents of the document. */
  def reformat(): scala.Unit = js.native
}

