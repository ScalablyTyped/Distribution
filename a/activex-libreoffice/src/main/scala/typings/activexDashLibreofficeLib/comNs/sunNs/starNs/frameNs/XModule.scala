package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * can be used to overrule identification of office modules.
  *
  * Normally an office module will be identified by its service name in combination with a set of configuration data. But sometimes whole existing office
  * modules will be used as black box components to implement a different office module on top of it. Patching a service name is not possible. So this
  * optional interface can be used to overwrite identification of a module.
  * @see XModuleManager
  * @since OOo 2.3
  */
trait XModule
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the module identifier. */
  var Identifier: java.lang.String
  /** @returns the module identifier. */
  def getIdentifier(): java.lang.String
  /** @param Identifier a new "name" for this module. */
  def setIdentifier(Identifier: java.lang.String): scala.Unit
}

