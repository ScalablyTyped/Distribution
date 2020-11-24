package typings.activexLibreoffice.com_.sun.star.xml.input

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Capsule around an XML element. */
@js.native
trait XElement extends XInterface {
  
  /**
    * Gets the attributes of this element.
    * @returns attributes of this element
    */
  val Attributes: XAttributes = js.native
  
  /**
    * Gets the local name of this element.
    * @returns local name of this element
    */
  val LocalName: String = js.native
  
  /**
    * Gets the parent context.
    * @returns parent context
    */
  val Parent: XElement = js.native
  
  /**
    * Gets the namespace uid of this element.
    * @returns namespace uid of this element
    */
  val Uid: Double = js.native
  
  /**
    * Called upon retrieval of characters.
    * @param chars characters
    */
  def characters(chars: String): Unit = js.native
  
  /** Receives notification of element closing. */
  def endElement(): Unit = js.native
  
  /**
    * Gets the attributes of this element.
    * @returns attributes of this element
    */
  def getAttributes(): XAttributes = js.native
  
  /**
    * Gets the local name of this element.
    * @returns local name of this element
    */
  def getLocalName(): String = js.native
  
  /**
    * Gets the parent context.
    * @returns parent context
    */
  def getParent(): XElement = js.native
  
  /**
    * Gets the namespace uid of this element.
    * @returns namespace uid of this element
    */
  def getUid(): Double = js.native
  
  /**
    * Receives notification of white space that can be ignored.
    * @param whitespace white space characters
    */
  def ignorableWhitespace(whitespace: String): Unit = js.native
  
  /**
    * Receives notification of a processing instruction.
    * @param target target
    * @param data data
    */
  def processingInstruction(target: String, data: String): Unit = js.native
  
  /**
    * Called upon each occurring child element.
    * @param uid namespace uid of element
    * @param localName local name of element
    * @param xAttributes attributes of element
    * @returns child import context
    */
  def startChildElement(uid: Double, localName: String, xAttributes: XAttributes): XElement = js.native
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
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], LocalName = LocalName.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Uid = Uid.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), characters = js.Any.fromFunction1(characters), endElement = js.Any.fromFunction0(endElement), getAttributes = js.Any.fromFunction0(getAttributes), getLocalName = js.Any.fromFunction0(getLocalName), getParent = js.Any.fromFunction0(getParent), getUid = js.Any.fromFunction0(getUid), ignorableWhitespace = js.Any.fromFunction1(ignorableWhitespace), processingInstruction = js.Any.fromFunction2(processingInstruction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startChildElement = js.Any.fromFunction3(startChildElement))
    __obj.asInstanceOf[XElement]
  }
  
  @scala.inline
  implicit class XElementOps[Self <: XElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributes(value: XAttributes): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalName(value: String): Self = this.set("LocalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: XElement): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: Double): Self = this.set("Uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacters(value: String => Unit): Self = this.set("characters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndElement(value: () => Unit): Self = this.set("endElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAttributes(value: () => XAttributes): Self = this.set("getAttributes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLocalName(value: () => String): Self = this.set("getLocalName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParent(value: () => XElement): Self = this.set("getParent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUid(value: () => Double): Self = this.set("getUid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIgnorableWhitespace(value: String => Unit): Self = this.set("ignorableWhitespace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProcessingInstruction(value: (String, String) => Unit): Self = this.set("processingInstruction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartChildElement(value: (Double, String, XAttributes) => XElement): Self = this.set("startChildElement", js.Any.fromFunction3(value))
  }
}
