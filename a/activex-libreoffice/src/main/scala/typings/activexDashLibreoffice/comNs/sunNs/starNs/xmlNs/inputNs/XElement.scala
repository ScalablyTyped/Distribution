package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.inputNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Capsule around an XML element. */
trait XElement extends XInterface {
  /**
    * Gets the attributes of this element.
    * @returns attributes of this element
    */
  val Attributes: XAttributes
  /**
    * Gets the local name of this element.
    * @returns local name of this element
    */
  val LocalName: String
  /**
    * Gets the parent context.
    * @returns parent context
    */
  val Parent: XElement
  /**
    * Gets the namespace uid of this element.
    * @returns namespace uid of this element
    */
  val Uid: Double
  /**
    * Called upon retrieval of characters.
    * @param chars characters
    */
  def characters(chars: String): Unit
  /** Receives notification of element closing. */
  def endElement(): Unit
  /**
    * Gets the attributes of this element.
    * @returns attributes of this element
    */
  def getAttributes(): XAttributes
  /**
    * Gets the local name of this element.
    * @returns local name of this element
    */
  def getLocalName(): String
  /**
    * Gets the parent context.
    * @returns parent context
    */
  def getParent(): XElement
  /**
    * Gets the namespace uid of this element.
    * @returns namespace uid of this element
    */
  def getUid(): Double
  /**
    * Receives notification of white space that can be ignored.
    * @param whitespace white space characters
    */
  def ignorableWhitespace(whitespace: String): Unit
  /**
    * Receives notification of a processing instruction.
    * @param target target
    * @param data data
    */
  def processingInstruction(target: String, data: String): Unit
  /**
    * Called upon each occurring child element.
    * @param uid namespace uid of element
    * @param localName local name of element
    * @param xAttributes attributes of element
    * @returns child import context
    */
  def startChildElement(uid: Double, localName: String, xAttributes: XAttributes): XElement
}

object XElement {
  @scala.inline
  def apply(
    Attributes: XAttributes,
    LocalName: String,
    Parent: XElement,
    Uid: Double,
    acquire: () => Unit,
    characters: String => Unit,
    endElement: () => Unit,
    getAttributes: () => XAttributes,
    getLocalName: () => String,
    getParent: () => XElement,
    getUid: () => Double,
    ignorableWhitespace: String => Unit,
    processingInstruction: (String, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    startChildElement: (Double, String, XAttributes) => XElement
  ): XElement = {
    val __obj = js.Dynamic.literal(Attributes = Attributes, LocalName = LocalName, Parent = Parent, Uid = Uid, acquire = js.Any.fromFunction0(acquire), characters = js.Any.fromFunction1(characters), endElement = js.Any.fromFunction0(endElement), getAttributes = js.Any.fromFunction0(getAttributes), getLocalName = js.Any.fromFunction0(getLocalName), getParent = js.Any.fromFunction0(getParent), getUid = js.Any.fromFunction0(getUid), ignorableWhitespace = js.Any.fromFunction1(ignorableWhitespace), processingInstruction = js.Any.fromFunction2(processingInstruction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startChildElement = js.Any.fromFunction3(startChildElement))
  
    __obj.asInstanceOf[XElement]
  }
}

