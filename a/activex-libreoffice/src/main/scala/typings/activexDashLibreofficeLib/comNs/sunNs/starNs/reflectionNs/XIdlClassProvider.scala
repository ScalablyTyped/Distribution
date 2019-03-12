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
  val IdlClasses: stdLib.SafeArray[XIdlClass[_]]
  def getIdlClasses(): stdLib.SafeArray[XIdlClass[_]]
}

object XIdlClassProvider {
  @scala.inline
  def apply(
    IdlClasses: stdLib.SafeArray[XIdlClass[_]],
    acquire: () => scala.Unit,
    getIdlClasses: () => stdLib.SafeArray[XIdlClass[_]],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XIdlClassProvider = {
    val __obj = js.Dynamic.literal(IdlClasses = IdlClasses, acquire = js.Any.fromFunction0(acquire), getIdlClasses = js.Any.fromFunction0(getIdlClasses), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XIdlClassProvider]
  }
}

