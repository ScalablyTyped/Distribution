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

object XElement {
  @scala.inline
  def apply(
    Attributes: XAttributes,
    LocalName: java.lang.String,
    Parent: XElement,
    Uid: scala.Double,
    acquire: js.Function0[scala.Unit],
    characters: js.Function1[java.lang.String, scala.Unit],
    endElement: js.Function0[scala.Unit],
    getAttributes: js.Function0[XAttributes],
    getLocalName: js.Function0[java.lang.String],
    getParent: js.Function0[XElement],
    getUid: js.Function0[scala.Double],
    ignorableWhitespace: js.Function1[java.lang.String, scala.Unit],
    processingInstruction: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    startChildElement: js.Function3[scala.Double, java.lang.String, XAttributes, XElement]
  ): XElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Attributes")(Attributes)
    __obj.updateDynamic("LocalName")(LocalName)
    __obj.updateDynamic("Parent")(Parent)
    __obj.updateDynamic("Uid")(Uid)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("characters")(characters)
    __obj.updateDynamic("endElement")(endElement)
    __obj.updateDynamic("getAttributes")(getAttributes)
    __obj.updateDynamic("getLocalName")(getLocalName)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getUid")(getUid)
    __obj.updateDynamic("ignorableWhitespace")(ignorableWhitespace)
    __obj.updateDynamic("processingInstruction")(processingInstruction)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("startChildElement")(startChildElement)
    __obj.asInstanceOf[XElement]
  }
}

