package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RegistryKeyType extends js.Object

/**
  * represents all possible types of a key.
  *
  * A key can be a normal key with a value and subkeys, or it can be a link which references another key.
  */
@JSGlobal("com.sun.star.registry.RegistryKeyType")
@js.native
object RegistryKeyType extends js.Object {
  @js.native
  sealed trait KEY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.RegistryKeyType
  
  @js.native
  sealed trait LINK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.RegistryKeyType
  
  /* 0 */ val KEY: KEY with scala.Double = js.native
  /* 1 */ val LINK: LINK with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs.RegistryKeyType with scala.Double
  ] = js.native
}

