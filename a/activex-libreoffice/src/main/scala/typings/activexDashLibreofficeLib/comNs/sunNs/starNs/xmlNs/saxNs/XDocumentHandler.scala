package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * receives notification of general document events.
  *
  * This interface is an IDL version of the Java interface **org.xml.sax.DocumentHandler** with some smaller adaptations.
  */
trait XDocumentHandler
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** receives notification of character data. */
  def characters(aChars: java.lang.String): scala.Unit
  /** receives notification of the end of a document. */
  def endDocument(): scala.Unit
  /** receives notification of the end of an element. */
  def endElement(aName: java.lang.String): scala.Unit
  /** receives notification of white space that can be ignored. */
  def ignorableWhitespace(aWhitespaces: java.lang.String): scala.Unit
  /** receives notification of a processing instruction. */
  def processingInstruction(aTarget: java.lang.String, aData: java.lang.String): scala.Unit
  /** receives an object for locating the origin of SAX document events. */
  def setDocumentLocator(xLocator: XLocator): scala.Unit
  /** receives notification of the beginning of a document. */
  def startDocument(): scala.Unit
  /** receives notification of the beginning of an element . */
  def startElement(aName: java.lang.String, xAttribs: XAttributeList): scala.Unit
}

