package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects an interface attribute type.
  *
  * This type is superseded by {@link XInterfaceAttributeTypeDescription2} , which supports extended attributes.
  *
  * The type class of this type is TypeClass_INTERFACE_ATTRIBUTE.
  */
trait XInterfaceAttributeTypeDescription extends XInterfaceMemberTypeDescription {
  /**
    * Returns the type of the attribute.
    * @returns type of attribute
    */
  val Type: XTypeDescription
  /**
    * Returns the type of the attribute.
    * @returns type of attribute
    */
  def getType(): XTypeDescription
  /**
    * Returns true, if this attribute is read-only.
    * @returns true, if attribute is read-only
    */
  def isReadOnly(): scala.Boolean
}

