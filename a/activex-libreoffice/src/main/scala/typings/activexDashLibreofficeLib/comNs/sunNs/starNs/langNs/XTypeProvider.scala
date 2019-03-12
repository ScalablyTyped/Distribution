package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** interface to get information about the types (usually interface types) supported by an object. */
trait XTypeProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Obsolete unique identifier.
    *
    * Originally returned a sequence of bytes which, when non-empty, was used as an ID to distinguish unambiguously between two sets of types, for example
    * to realise hashing functionality when the object is introspected. Two objects that returned the same non-empty ID had to return the same set of types
    * in {@link getTypes()} . (If a unique ID could not be provided, this method was always allowed to return an empty sequence, though).
    * @deprecated DeprecatedThis feature should no longer be used, and implementations are encouraged to always return an empty sequence.
    */
  val ImplementationId: stdLib.SafeArray[scala.Double]
  /** returns a sequence of all types (usually interface types) provided by the object. */
  val Types: stdLib.SafeArray[activexDashLibreofficeLib.`type`]
  /**
    * Obsolete unique identifier.
    *
    * Originally returned a sequence of bytes which, when non-empty, was used as an ID to distinguish unambiguously between two sets of types, for example
    * to realise hashing functionality when the object is introspected. Two objects that returned the same non-empty ID had to return the same set of types
    * in {@link getTypes()} . (If a unique ID could not be provided, this method was always allowed to return an empty sequence, though).
    * @deprecated DeprecatedThis feature should no longer be used, and implementations are encouraged to always return an empty sequence.
    */
  def getImplementationId(): stdLib.SafeArray[scala.Double]
  /** returns a sequence of all types (usually interface types) provided by the object. */
  def getTypes(): stdLib.SafeArray[activexDashLibreofficeLib.`type`]
}

object XTypeProvider {
  @scala.inline
  def apply(
    ImplementationId: stdLib.SafeArray[scala.Double],
    Types: stdLib.SafeArray[activexDashLibreofficeLib.`type`],
    acquire: () => scala.Unit,
    getImplementationId: () => stdLib.SafeArray[scala.Double],
    getTypes: () => stdLib.SafeArray[activexDashLibreofficeLib.`type`],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XTypeProvider = {
    val __obj = js.Dynamic.literal(ImplementationId = ImplementationId, Types = Types, acquire = js.Any.fromFunction0(acquire), getImplementationId = js.Any.fromFunction0(getImplementationId), getTypes = js.Any.fromFunction0(getTypes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTypeProvider]
  }
}

