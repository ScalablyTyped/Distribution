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
    acquire: js.Function0[scala.Unit],
    createObject: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Uik, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XComponentRegistry = {
    val __obj = js.Dynamic.literal(acquire = acquire, createObject = createObject, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XComponentRegistry]
  }
}

