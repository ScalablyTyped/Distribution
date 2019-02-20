package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A {@link TextPortion} is a piece of text within a paragraph that does not contain changes of its attributes inside.
  *
  * It is created by an enumeration implemented in a paragraph service. It may be used to export the content of the paragraph to an external document
  * format.
  * @see com.sun.star.text.TextPortionEnumeration
  * @see com.sun.star.text.XTextPortionEnumeration
  */
trait TextPortion
  extends TextRange
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XTolerantMultiPropertySet {
  /** contains the bookmark of a text portion of type {@link Bookmark} . */
  var Bookmark: XTextContent
  /**
    * contains the control character of a text portion of type {@link ControlCharacter} .
    * @deprecated Deprecatedtype ControlCharacter no longer implemented
    */
  var ControlCharacter: scala.Double
  /** contains the document index mark of a text portion of type {@link DocumentIndexMark} . */
  var DocumentIndexMark: XTextContent
  /** contains the footnote of a text portion of type {@link Footnote} . */
  var Footnote: XFootnote
  /**
    * contains the text range of a text portion of type {@link InContentMetadata} .
    * @since OOo 3.2
    */
  var InContentMetadata: XTextContent
  /** contains whether the portion is a point only. */
  var IsCollapsed: scala.Boolean
  /**
    * contains whether the portion is the start of the portion.
    *
    * This is used for portions which are represented by 2 {@link TextPortion} objects (e.g., DocmentIndexMark).
    */
  var IsStart: scala.Boolean
  /** contains the bookmark of a text portion of type {@link ReferenceMark} . */
  var ReferenceMark: XTextContent
  /** contains the text field of a text portion of type {@link TextField} . */
  var TextField: XTextField
  /**
    * contains the type of the text portion.
    *
    * Valid content type names are:
    *
    * **Text**: string content
    *
    * **TextField**: a text field
    *
    * **TextContent**: text content - supplied via the interface {@link com.sun.star.container.XContentEnumerationAccess}
    *
    * **ControlCharacter**: a control character
    *
    * **Footnote**: a footnote or an endnote
    *
    * **ReferenceMark**: a reference mark
    *
    * **DocumentIndexMark**: a document index mark
    *
    * **Bookmark**: a bookmark
    *
    * **Redline**: a redline portion which is a result of the change tracking feature
    *
    * **Ruby**: a ruby attribute which is used in Asian text
    *
    * **Frame**: a frame
    *
    * **SoftPageBreak**: a soft page break
    *
    * **InContentMetadata**: a text range with attached metadata
    *
    *
    *
    * For Reference marks, document index marks, etc., 2 text portions will be generated, one for the start position and one for the end position.
    */
  var TextPortionType: java.lang.String
}

