package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RegistryValueType extends js.Object

/**
  * represents all possible types of a key value.
  *
  * An ASCII value and a string value will both be handled with type string. But interns will be handled differently. Normally the idl string represents a
  * unicode string.
  */
@JSGlobal("com.sun.star.registry.RegistryValueType")
@js.native
object RegistryValueType extends js.Object {
  /** the type of the key is ASCII. */
  @js.native
  sealed trait ASCII
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.RegistryValueType
  
  /** the type of the key is a ASCIILIST. */
  @js.native
  sealed trait ASCIILIST
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.RegistryValueType
  
  /** the type of the key is binary. */
  @js.native
  sealed trait BINARY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.RegistryValueType
  
  /** the type of the key is long. */
  @js.native
  sealed trait LONG
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.RegistryValueType
  
  /** the type of the key is LONGLIST. */
  @js.native
  sealed trait LONGLIST
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.RegistryValueType
  
  /** the type of the key is not defined. */
  @js.native
  sealed trait NOT_DEFINED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.RegistryValueType
  
  /** the type of the key is a string. */
  @js.native
  sealed trait STRING
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.RegistryValueType
  
  /** the type of the key is a STRINGLIST. */
  @js.native
  sealed trait STRINGLIST
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.RegistryValueType
  
  /* 2 */ val ASCII: ASCII with scala.Double = js.native
  /* 6 */ val ASCIILIST: ASCIILIST with scala.Double = js.native
  /* 4 */ val BINARY: BINARY with scala.Double = js.native
  /* 1 */ val LONG: LONG with scala.Double = js.native
  /* 5 */ val LONGLIST: LONGLIST with scala.Double = js.native
  /* 0 */ val NOT_DEFINED: NOT_DEFINED with scala.Double = js.native
  /* 3 */ val STRING: STRING with scala.Double = js.native
  /* 7 */ val STRINGLIST: STRINGLIST with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.RegistryValueType with scala.Double
  ] = js.native
}

