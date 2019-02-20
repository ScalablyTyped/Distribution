package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this interface does not conform to the SAX-standard.
  *
  * Note: Whether or not every callback is supported is dependent on the parser implementation.
  */
trait XExtendedDocumentHandler extends XDocumentHandler {
  /** informs a writer that it is allowable to insert a line break and indentation before the next XDocumentHandler-call. */
  def allowLineBreak(): scala.Unit
  /** receives notification about a comment in the XML-source. */
  def comment(sComment: java.lang.String): scala.Unit
  /**
    * informs about the end of a CDATA-Section.
    *
    * Note that `startCDATA/endCDATA` MUST NOT enclose any `startElement/endElement` -call!
    */
  def endCDATA(): scala.Unit
  /**
    * receives notification about the start of a CDATA section in the XML-source.
    *
    * Any string coming in via character handler may include chars, that would otherwise be interpreted as markup.
    */
  def startCDATA(): scala.Unit
  /** notifies that any characters that cannot be handled by other callback methods are announced through this method. */
  def unknown(sString: java.lang.String): scala.Unit
}

