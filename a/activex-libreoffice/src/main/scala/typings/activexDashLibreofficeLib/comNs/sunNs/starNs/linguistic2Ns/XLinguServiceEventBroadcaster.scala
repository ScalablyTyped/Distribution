package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to register a listener for LinguServiceEvents.
  *
  * This interface may be used by spell checker or hyphenator implementations to allow clients to be registered and informed about
  * com::sun::star::linguistic2::LinguServiceEvents.
  *
  * Note: The {@link LinguServiceManager} forwards the com::sun::star::linguistic2::LinguServiceEvents it receives (from spell checkers or hyphenators) to
  * its own listeners. Thus, there should be no need to register as a listener for a specific implementation./P>
  * @see com.sun.star.linguistic2.XLinguServiceManager
  * @see com.sun.star.linguistic2.XLinguServiceEventListener
  */
trait XLinguServiceEventBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @param xLstnr the listener to be added.
    * @returns `TRUE` if the listener was successfully added, `FALSE` otherwise.
    */
  def addLinguServiceEventListener(xLstnr: XLinguServiceEventListener): scala.Boolean
  /**
    * @param xLstnr the listener to be removed.
    * @returns `TRUE` if the listener was successfully removed, `FALSE` otherwise.
    */
  def removeLinguServiceEventListener(xLstnr: XLinguServiceEventListener): scala.Boolean
}

object XLinguServiceEventBroadcaster {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addLinguServiceEventListener: js.Function1[XLinguServiceEventListener, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeLinguServiceEventListener: js.Function1[XLinguServiceEventListener, scala.Boolean]
  ): XLinguServiceEventBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire, addLinguServiceEventListener = addLinguServiceEventListener, queryInterface = queryInterface, release = release, removeLinguServiceEventListener = removeLinguServiceEventListener)
  
    __obj.asInstanceOf[XLinguServiceEventBroadcaster]
  }
}

