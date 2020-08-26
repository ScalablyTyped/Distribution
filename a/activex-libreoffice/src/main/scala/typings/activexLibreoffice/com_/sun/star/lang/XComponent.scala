package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to exclicitly free resources and break cyclic references.
  *
  * Actually the real lifetime of an UNO object is controlled by references kept on interfaces of this object. But there are two distinct meanings in
  * keeping a reference to an interface: 1st to own the object and 2nd to know the object.
  *
  * You are only allowed to keep references of interfaces to UNO objects if you are by definition the owner of that object or your reference is very
  * temporary or you have registered an EventListener at that object and release the reference when "disposing" is called.
  */
@js.native
trait XComponent extends XInterface {
  /**
    * adds an event listener to the object.
    *
    * The broadcaster fires the disposing method of this listener if the {@link XComponent.dispose()} method is called.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    *
    * If this {@link XComponent} is already disposed when {@link XComponent.addEventListener()} is called, the call will not fail with a {@link
    * DisposedException} , but the caller will be notified via the {@link XEventListener.disposing()} callback. This callback can occur synchronously within
    * the {@link addEventListener()} call.
    * @see XComponent.removeEventListener
    */
  def addEventListener(xListener: XEventListener): Unit = js.native
  /**
    * The owner of an object calls this method to explicitly free all resources kept by this object and thus break cyclic references.
    *
    * Only the owner of this object is allowed to call this method. The object should release all resources and references in the easiest possible manner (
    * for instance no serialization should take place anymore ).
    *
    * The object must notify all registered listeners using the method {@link XEventListener.disposing()} . All notfied objects should release there
    * references to this object without calling {@link XComponent.removeEventListener()} (the disposed object will release the listeners eitherway).
    *
    * After this method has been called, the object should behave as passive as possible, thus it should ignore all calls in case it can comply with its
    * specification (for instance {@link addEventListener()} ). Often the object can't fulfill its specification anymore, in this case it must throw the
    * {@link DisposedException} (which is derived from {@link com.sun.star.uno.RuntimeException} ) when it gets called.
    *
    * For some objects no real owner can be identified, thus it can be disposed from multiple reference holders. In this case the object should be able to
    * cope with multiple {@link dispose()} -calls (which are inevitable in a multithreaded environment).
    */
  def dispose(): Unit = js.native
  /**
    * removes an event listener from the listener list.
    *
    * It is a "noop" if the specified listener is not registered.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    *
    * If this {@link XComponent} is already disposed when {@link XComponent.removeEventListener()} is called, the call will not fail with a {@link
    * DisposedException} , but will rather be ignored silently.
    * @see XComponent.addEventListener
    */
  def removeEventListener(aListener: XEventListener): Unit = js.native
}

object XComponent {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XComponent = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[XComponent]
  }
  @scala.inline
  implicit class XComponentOps[Self <: XComponent] (val x: Self) extends AnyVal {
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
    def setAddEventListener(value: XEventListener => Unit): Self = this.set("addEventListener", js.Any.fromFunction1(value))
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveEventListener(value: XEventListener => Unit): Self = this.set("removeEventListener", js.Any.fromFunction1(value))
  }
  
}

