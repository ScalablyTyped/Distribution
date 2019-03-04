package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.langNs

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
trait XComponent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
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
  def addEventListener(xListener: XEventListener): scala.Unit
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
  def dispose(): scala.Unit
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
  def removeEventListener(aListener: XEventListener): scala.Unit
}

object XComponent {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[XEventListener, scala.Unit],
    dispose: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[XEventListener, scala.Unit]
  ): XComponent = {
    val __obj = js.Dynamic.literal(acquire = acquire, addEventListener = addEventListener, dispose = dispose, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[XComponent]
  }
}

