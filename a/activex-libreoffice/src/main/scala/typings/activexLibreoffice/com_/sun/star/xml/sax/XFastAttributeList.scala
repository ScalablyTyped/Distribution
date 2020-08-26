package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.xml.Attribute
import typings.activexLibreoffice.com_.sun.star.xml.FastAttribute
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a container for the attributes of an XML element.
  *
  * ;  Attributes are separated into known attributes and unknown attributes.
  *
  * Known attributes have a local name that is known to the {@link XFastTokenHandler} registered at the {@link XFastParser} which created the sax event
  * containing this attributes. If an attribute also has a namespace, that must be registered at the {@link XFastParser} , else this attribute is also
  * unknown even if the local name is known.
  */
@js.native
trait XFastAttributeList extends XInterface {
  /** returns a sequence of attributes which names and or namespaces URLS are translated to tokens. */
  val FastAttributes: SafeArray[FastAttribute] = js.native
  /** returns a sequence of attributes which names and or namespaces URLS can not be translated to tokens. */
  val UnknownAttributes: SafeArray[Attribute] = js.native
  /** returns a sequence of attributes which names and or namespaces URLS are translated to tokens. */
  def getFastAttributes(): SafeArray[FastAttribute] = js.native
  /**
    * retrieves the value of an attribute. ;
    * @param Token contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} . ;  If the attribute name has a namesp
    * @returns The string value from the attribute or an empty string if the attribute is not available.
    */
  def getOptionalValue(Token: Double): String = js.native
  /**
    * retrieves the token of an attribute value. ;
    * @param Token contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} . ;  If the attribute name has a namesp
    * @param Default This value will be returned if the attribute is not available
    * @returns If the attribute is available it returns the integer token of the value from the attribute or FastToken::Invalid. If not the value of `Default` i
    */
  def getOptionalValueToken(Token: Double, Default: Double): Double = js.native
  /** returns a sequence of attributes which names and or namespaces URLS can not be translated to tokens. */
  def getUnknownAttributes(): SafeArray[Attribute] = js.native
  /**
    * retrieves the value of an attribute. ;
    * @param Token contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} . ;  If the attribute name has a namesp
    * @returns The string value from the attribute.
    * @throws SAXEXception if the attribute is not available
    */
  def getValue(Token: Double): String = js.native
  /**
    * retrieves the token of an attribute value. ;
    * @param Token contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} . ;  If the attribute name has a namesp
    * @returns The integer token of the value from the attribute or FastToken::Invalid
    * @throws SAXEXception if the attribute is not available
    */
  def getValueToken(Token: Double): Double = js.native
  /**
    * checks if an attribute is available. ;
    * @param Token contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} . ;  If the attribute name has a namesp
    * @returns `TRUE` , if the attribute is available
    */
  def hasAttribute(Token: Double): Boolean = js.native
}

object XFastAttributeList {
  @scala.inline
  def apply(
    FastAttributes: SafeArray[FastAttribute],
    UnknownAttributes: SafeArray[Attribute],
    acquire: () => Unit,
    getFastAttributes: () => SafeArray[FastAttribute],
    getOptionalValue: Double => String,
    getOptionalValueToken: (Double, Double) => Double,
    getUnknownAttributes: () => SafeArray[Attribute],
    getValue: Double => String,
    getValueToken: Double => Double,
    hasAttribute: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFastAttributeList = {
    val __obj = js.Dynamic.literal(FastAttributes = FastAttributes.asInstanceOf[js.Any], UnknownAttributes = UnknownAttributes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFastAttributes = js.Any.fromFunction0(getFastAttributes), getOptionalValue = js.Any.fromFunction1(getOptionalValue), getOptionalValueToken = js.Any.fromFunction2(getOptionalValueToken), getUnknownAttributes = js.Any.fromFunction0(getUnknownAttributes), getValue = js.Any.fromFunction1(getValue), getValueToken = js.Any.fromFunction1(getValueToken), hasAttribute = js.Any.fromFunction1(hasAttribute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFastAttributeList]
  }
  @scala.inline
  implicit class XFastAttributeListOps[Self <: XFastAttributeList] (val x: Self) extends AnyVal {
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
    def setFastAttributes(value: SafeArray[FastAttribute]): Self = this.set("FastAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnknownAttributes(value: SafeArray[Attribute]): Self = this.set("UnknownAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetFastAttributes(value: () => SafeArray[FastAttribute]): Self = this.set("getFastAttributes", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOptionalValue(value: Double => String): Self = this.set("getOptionalValue", js.Any.fromFunction1(value))
    @scala.inline
    def setGetOptionalValueToken(value: (Double, Double) => Double): Self = this.set("getOptionalValueToken", js.Any.fromFunction2(value))
    @scala.inline
    def setGetUnknownAttributes(value: () => SafeArray[Attribute]): Self = this.set("getUnknownAttributes", js.Any.fromFunction0(value))
    @scala.inline
    def setGetValue(value: Double => String): Self = this.set("getValue", js.Any.fromFunction1(value))
    @scala.inline
    def setGetValueToken(value: Double => Double): Self = this.set("getValueToken", js.Any.fromFunction1(value))
    @scala.inline
    def setHasAttribute(value: Double => Boolean): Self = this.set("hasAttribute", js.Any.fromFunction1(value))
  }
  
}

