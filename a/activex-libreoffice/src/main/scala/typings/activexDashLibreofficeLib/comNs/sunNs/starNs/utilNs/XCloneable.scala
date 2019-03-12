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
    acquire: () => scala.Unit,
    createClone: () => XCloneable,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XCloneable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createClone = js.Any.fromFunction0(createClone), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XCloneable]
  }
}

