package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
@js.native
trait XLinguServiceEventBroadcaster extends XInterface {
  /**
    * @param xLstnr the listener to be added.
    * @returns `TRUE` if the listener was successfully added, `FALSE` otherwise.
    */
  def addLinguServiceEventListener(xLstnr: XLinguServiceEventListener): Boolean = js.native
  /**
    * @param xLstnr the listener to be removed.
    * @returns `TRUE` if the listener was successfully removed, `FALSE` otherwise.
    */
  def removeLinguServiceEventListener(xLstnr: XLinguServiceEventListener): Boolean = js.native
}

object XLinguServiceEventBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addLinguServiceEventListener: XLinguServiceEventListener => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeLinguServiceEventListener: XLinguServiceEventListener => Boolean
  ): XLinguServiceEventBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addLinguServiceEventListener = js.Any.fromFunction1(addLinguServiceEventListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeLinguServiceEventListener = js.Any.fromFunction1(removeLinguServiceEventListener))
    __obj.asInstanceOf[XLinguServiceEventBroadcaster]
  }
  @scala.inline
  implicit class XLinguServiceEventBroadcasterOps[Self <: XLinguServiceEventBroadcaster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddLinguServiceEventListener(value: XLinguServiceEventListener => Boolean): Self = this.set("addLinguServiceEventListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveLinguServiceEventListener(value: XLinguServiceEventListener => Boolean): Self = this.set("removeLinguServiceEventListener", js.Any.fromFunction1(value))
  }
  
}

