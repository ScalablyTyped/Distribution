package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs

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
trait XFastAttributeList
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns a sequence of attributes which names and or namespaces URLS are translated to tokens. */
  val FastAttributes: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.FastAttribute]
  /** returns a sequence of attributes which names and or namespaces URLS can not be translated to tokens. */
  val UnknownAttributes: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.Attribute]
  /** returns a sequence of attributes which names and or namespaces URLS are translated to tokens. */
  def getFastAttributes(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.FastAttribute]
  /**
    * retrieves the value of an attribute. ;
    * @param Token contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} . ;  If the attribute name has a namesp
    * @returns The string value from the attribute or an empty string if the attribute is not available.
    */
  def getOptionalValue(Token: scala.Double): java.lang.String
  /**
    * retrieves the token of an attribute value. ;
    * @param Token contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} . ;  If the attribute name has a namesp
    * @param Default This value will be returned if the attribute is not available
    * @returns If the attribute is available it returns the integer token of the value from the attribute or FastToken::Invalid. If not the value of `Default` i
    */
  def getOptionalValueToken(Token: scala.Double, Default: scala.Double): scala.Double
  /** returns a sequence of attributes which names and or namespaces URLS can not be translated to tokens. */
  def getUnknownAttributes(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.Attribute]
  /**
    * retrieves the value of an attribute. ;
    * @param Token contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} . ;  If the attribute name has a namesp
    * @returns The string value from the attribute.
    * @throws SAXEXception if the attribute is not available
    */
  def getValue(Token: scala.Double): java.lang.String
  /**
    * retrieves the token of an attribute value. ;
    * @param Token contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} . ;  If the attribute name has a namesp
    * @returns The integer token of the value from the attribute or FastToken::Invalid
    * @throws SAXEXception if the attribute is not available
    */
  def getValueToken(Token: scala.Double): scala.Double
  /**
    * checks if an attribute is available. ;
    * @param Token contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} . ;  If the attribute name has a namesp
    * @returns `TRUE` , if the attribute is available
    */
  def hasAttribute(Token: scala.Double): scala.Boolean
}

