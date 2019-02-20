package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reflects a singleton, supporting interface-based singletons.
  *
  * This type supersedes {@link XSingletonTypeDescription} , which only supports obsolete, service-based singletons.
  * @since OOo 2.0
  */
trait XSingletonTypeDescription2 extends XSingletonTypeDescription {
  /**
    * Returns the interface type associated with the singleton.
    * @returns the reflection of the interface type associated with the singleton (of type {@link com.sun.star.reflection.XInterfaceTypeDescription} or, in case
    */
  val Interface: XTypeDescription
  /**
    * Returns the interface type associated with the singleton.
    * @returns the reflection of the interface type associated with the singleton (of type {@link com.sun.star.reflection.XInterfaceTypeDescription} or, in case
    */
  def getInterface(): XTypeDescription
  /**
    * Returns whether this object reflects an interface-based singleton.
    * @returns `TRUE` if this object reflects an interface-based singleton, and `FALSE` if this object reflects an obsolete, service-based singleton
    */
  def isInterfaceBased(): scala.Boolean
}

