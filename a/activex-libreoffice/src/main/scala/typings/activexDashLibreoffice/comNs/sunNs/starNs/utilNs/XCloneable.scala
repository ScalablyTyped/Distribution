package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to create a copy of the object which supports this interface. */
trait XCloneable extends XInterface {
  /** creates a copy of the object. */
  def createClone(): XCloneable
}

object XCloneable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createClone: () => XCloneable,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCloneable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createClone = js.Any.fromFunction0(createClone), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XCloneable]
  }
}

