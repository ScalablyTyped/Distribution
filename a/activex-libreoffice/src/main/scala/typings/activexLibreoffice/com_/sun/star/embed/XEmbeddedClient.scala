package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.util.XCloseable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents common functionality for embedded clients. */
@js.native
trait XEmbeddedClient extends XComponentSupplier {
  /**
    * asks client to let the object store itself.
    * @throws com::sun::star::uno::ObjectSaveVetoException in case container chants to avoid saving of object
    * @throws com::sun::star::uno::Exception in case of problems during saving
    */
  def saveObject(): Unit = js.native
  /**
    * An object can use this method to notify the client when the object outplace window becomes visible or invisible.
    * @param bVisible visibility state of the window
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  def visibilityChanged(bVisible: Boolean): Unit = js.native
}

object XEmbeddedClient {
  @scala.inline
  def apply(
    Component: XCloseable,
    acquire: () => Unit,
    getComponent: () => XCloseable,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    saveObject: () => Unit,
    visibilityChanged: Boolean => Unit
  ): XEmbeddedClient = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getComponent = js.Any.fromFunction0(getComponent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), saveObject = js.Any.fromFunction0(saveObject), visibilityChanged = js.Any.fromFunction1(visibilityChanged))
    __obj.asInstanceOf[XEmbeddedClient]
  }
  @scala.inline
  implicit class XEmbeddedClientOps[Self <: XEmbeddedClient] (val x: Self) extends AnyVal {
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
    def setSaveObject(value: () => Unit): Self = this.set("saveObject", js.Any.fromFunction0(value))
    @scala.inline
    def setVisibilityChanged(value: Boolean => Unit): Self = this.set("visibilityChanged", js.Any.fromFunction1(value))
  }
  
}

