package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to create a copy of the object which supports this interface. */
trait XCloneable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** creates a copy of the object. */
  def createClone(): XCloneable
}

object XCloneable {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createClone: js.Function0[XCloneable],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCloneable = {
    val __obj = js.Dynamic.literal(acquire = acquire, createClone = createClone, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XCloneable]
  }
}

