package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Notify about changes to a {@link XRemoteContentProviderSupplier} .
  * @author Stephan Bergmann
  * @version 1.0
  */
@js.native
trait XRemoteContentProviderChangeNotifier extends XInterface {
  /**
    * Add a listener.
    * @param Listener Some listener.
    */
  def addRemoteContentProviderChangeListener(Listener: XRemoteContentProviderChangeListener): Unit = js.native
  /**
    * Remove a listener.
    * @param Listener Some listener previously added via {@link XRemoteContentProviderChangeNotifier.addRemoteContentProviderChangeListener()} .
    */
  def removeRemoteContentProviderChangeListener(Listener: XRemoteContentProviderChangeListener): Unit = js.native
}

object XRemoteContentProviderChangeNotifier {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addRemoteContentProviderChangeListener: XRemoteContentProviderChangeListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeRemoteContentProviderChangeListener: XRemoteContentProviderChangeListener => Unit
  ): XRemoteContentProviderChangeNotifier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addRemoteContentProviderChangeListener = js.Any.fromFunction1(addRemoteContentProviderChangeListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeRemoteContentProviderChangeListener = js.Any.fromFunction1(removeRemoteContentProviderChangeListener))
    __obj.asInstanceOf[XRemoteContentProviderChangeNotifier]
  }
  @scala.inline
  implicit class XRemoteContentProviderChangeNotifierOps[Self <: XRemoteContentProviderChangeNotifier] (val x: Self) extends AnyVal {
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
    def setAddRemoteContentProviderChangeListener(value: XRemoteContentProviderChangeListener => Unit): Self = this.set("addRemoteContentProviderChangeListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveRemoteContentProviderChangeListener(value: XRemoteContentProviderChangeListener => Unit): Self = this.set("removeRemoteContentProviderChangeListener", js.Any.fromFunction1(value))
  }
  
}

