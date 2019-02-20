package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a service, supporting single-interface  -  based services.
  *
  * This type supersedes {@link XServiceTypeDescription} , which only supports obsolete, accumulation-based services.
  * @since OOo 2.0
  */
trait XServiceTypeDescription2 extends XServiceTypeDescription {
  /**
    * Returns the constructors of the service.
    * @returns the reflections of all constructors of the service, in no particular order
    */
  val Constructors: activexDashInteropLib.SafeArray[XServiceConstructorDescription]
  /**
    * Returns the interface type associated with the service.
    * @returns the reflection of the interface type associated with the service (of type {@link com.sun.star.reflection.XInterfaceTypeDescription} or, in case o
    */
  val Interface: XTypeDescription
  /**
    * Returns the constructors of the service.
    * @returns the reflections of all constructors of the service, in no particular order
    */
  def getConstructors(): activexDashInteropLib.SafeArray[XServiceConstructorDescription]
  /**
    * Returns the interface type associated with the service.
    * @returns the reflection of the interface type associated with the service (of type {@link com.sun.star.reflection.XInterfaceTypeDescription} or, in case o
    */
  def getInterface(): XTypeDescription
  /**
    * Returns whether this object reflects a single-interface  -  based service.
    * @returns `TRUE` if this object reflects a single-interface  -  based service, and `FALSE` if this object reflects an obsolete, accumulation-based service
    */
  def isSingleInterfaceBased(): scala.Boolean
}

