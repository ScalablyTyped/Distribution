package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects an interface attribute, supporting extended attributes that are bound or raise exceptions.
  *
  * This type supersedes {@link XInterfaceAttributeTypeDescription} , which does not support extended attributes.
  * @since OOo 2.0
  */
trait XInterfaceAttributeTypeDescription2 extends XInterfaceAttributeTypeDescription {
  /**
    * Returns the exceptions that can be raised by the attribute's getter.
    * @returns the reflections of all the exceptions that are listed in the `raises` specification of the attribute's getter (if any), in no particular order; a
    */
  val GetExceptions: activexDashInteropLib.SafeArray[XCompoundTypeDescription]
  /**
    * Returns the exceptions that can be raised by the attribute's setter.
    * @returns the reflections of all the exceptions that are listed in the `raises` specification of the attribute's setter (if any), in no particular order; a
    */
  val SetExceptions: activexDashInteropLib.SafeArray[XCompoundTypeDescription]
  /**
    * Returns the exceptions that can be raised by the attribute's getter.
    * @returns the reflections of all the exceptions that are listed in the `raises` specification of the attribute's getter (if any), in no particular order; a
    */
  def getGetExceptions(): activexDashInteropLib.SafeArray[XCompoundTypeDescription]
  /**
    * Returns the exceptions that can be raised by the attribute's setter.
    * @returns the reflections of all the exceptions that are listed in the `raises` specification of the attribute's setter (if any), in no particular order; a
    */
  def getSetExceptions(): activexDashInteropLib.SafeArray[XCompoundTypeDescription]
  /**
    * Returns whether this object reflects a bound attribute.
    * @returns `TRUE` iff this object reflects a bound attribute
    */
  def isBound(): scala.Boolean
}

