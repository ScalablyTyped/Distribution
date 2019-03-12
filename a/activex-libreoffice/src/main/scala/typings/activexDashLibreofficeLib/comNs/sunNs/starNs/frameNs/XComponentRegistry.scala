package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XComponentRegistry
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @deprecated Deprecated */
  def createObject(URL: java.lang.String, Uik: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Uik): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
}

object XComponentRegistry {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    createObject: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Uik) => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XComponentRegistry = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createObject = js.Any.fromFunction2(createObject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XComponentRegistry]
  }
}

