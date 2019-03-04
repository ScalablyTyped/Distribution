package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated interface. Do not use anymore.
  * @deprecated Deprecated
  */
trait XIdlClassProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  val IdlClasses: activexDashInteropLib.SafeArray[XIdlClass[_]]
  def getIdlClasses(): activexDashInteropLib.SafeArray[XIdlClass[_]]
}

object XIdlClassProvider {
  @scala.inline
  def apply(
    IdlClasses: activexDashInteropLib.SafeArray[XIdlClass[_]],
    acquire: js.Function0[scala.Unit],
    getIdlClasses: js.Function0[activexDashInteropLib.SafeArray[XIdlClass[_]]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XIdlClassProvider = {
    val __obj = js.Dynamic.literal(IdlClasses = IdlClasses, acquire = acquire, getIdlClasses = getIdlClasses, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XIdlClassProvider]
  }
}

