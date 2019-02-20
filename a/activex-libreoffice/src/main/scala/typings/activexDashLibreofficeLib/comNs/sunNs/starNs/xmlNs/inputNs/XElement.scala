package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.inputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Capsule around an XML element. */
trait XElement
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Gets the attributes of this element.
    * @returns attributes of this element
    */
  val Attributes: XAttributes
  /**
    * Gets the local name of this element.
    * @returns local name of this element
    */
  val LocalName: java.lang.String
  /**
    * Gets the parent context.
    * @returns parent context
    */
  val Parent: XElement
  /**
    * Gets the namespace uid of this element.
    * @returns namespace uid of this element
    */
  val Uid: scala.Double
  /**
    * Called upon retrieval of characters.
    * @param chars characters
    */
  def characters(chars: java.lang.String): scala.Unit
  /** Receives notification of element closing. */
  def endElement(): scala.Unit
  /**
    * Gets the attributes of this element.
    * @returns attributes of this element
    */
  def getAttributes(): XAttributes
  /**
    * Gets the local name of this element.
    * @returns local name of this element
    */
  def getLocalName(): java.lang.String
  /**
    * Gets the parent context.
    * @returns parent context
    */
  def getParent(): XElement
  /**
    * Gets the namespace uid of this element.
    * @returns namespace uid of this element
    */
  def getUid(): scala.Double
  /**
    * Receives notification of white space that can be ignored.
    * @param whitespace white space characters
    */
  def ignorableWhitespace(whitespace: java.lang.String): scala.Unit
  /**
    * Receives notification of a processing instruction.
    * @param target target
    * @param data data
    */
  def processingInstruction(target: java.lang.String, data: java.lang.String): scala.Unit
  /**
    * Called upon each occurring child element.
    * @param uid namespace uid of element
    * @param localName local name of element
    * @param xAttributes attributes of element
    * @returns child import context
    */
  def startChildElement(uid: scala.Double, localName: java.lang.String, xAttributes: XAttributes): XElement
}

