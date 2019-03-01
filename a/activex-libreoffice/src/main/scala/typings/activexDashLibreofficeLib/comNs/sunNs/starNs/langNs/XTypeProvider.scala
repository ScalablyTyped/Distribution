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
  val ImplementationId: activexDashInteropLib.SafeArray[scala.Double]
  /** returns a sequence of all types (usually interface types) provided by the object. */
  val Types: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.`type`]
  /**
    * Obsolete unique identifier.
    *
    * Originally returned a sequence of bytes which, when non-empty, was used as an ID to distinguish unambiguously between two sets of types, for example
    * to realise hashing functionality when the object is introspected. Two objects that returned the same non-empty ID had to return the same set of types
    * in {@link getTypes()} . (If a unique ID could not be provided, this method was always allowed to return an empty sequence, though).
    * @deprecated DeprecatedThis feature should no longer be used, and implementations are encouraged to always return an empty sequence.
    */
  def getImplementationId(): activexDashInteropLib.SafeArray[scala.Double]
  /** returns a sequence of all types (usually interface types) provided by the object. */
  def getTypes(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.`type`]
}

object XTypeProvider {
  @scala.inline
  def apply(
    ImplementationId: activexDashInteropLib.SafeArray[scala.Double],
    Types: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.`type`],
    acquire: js.Function0[scala.Unit],
    getImplementationId: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getTypes: js.Function0[activexDashInteropLib.SafeArray[activexDashLibreofficeLib.`type`]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTypeProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ImplementationId")(ImplementationId)
    __obj.updateDynamic("Types")(Types)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getImplementationId")(getImplementationId)
    __obj.updateDynamic("getTypes")(getTypes)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XTypeProvider]
  }
}

