package typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs

import typings.activexDashLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the server-side interface to a weak object.
  *
  * This interface is proxy to the adapted object. In order to make it possible to have weak references to objects, the {@link XAdapter} interface must be
  * implemented to provide a weak adapter for the clients.
  *
  * **Concept of weak referencing:**
  *
  * This module specifies the interfaces for implementing and using weak references.
  *
  * The sense of weak references is to hold a reference to an object without affecting the lifetime of the object. That means that a weak reference may
  * become invalid, at any time, if the referenced object dies.
  *
  * The following interfaces describe one way to handle weak references by providing a weak adapter. The weak object has to provide this adapter if anyone
  * wants to hold a weak reference. To separate their lifetimes, the adapter and the original object must not share the same reference counter. The weak
  * reference is in fact only a hard reference to the adapter, which knows - but does not hold - the original object. That means that the implementation
  * and synchronization of weak referencing is the responsibility of the object. The following interfaces are involved in the concept of weak referencing:
  *
  * **XWeak**: is the server-side interface of the referred object. This referred object must support the {@link XAdapter} interface.;
  *
  * **XReference**: is a client-side interface which must be implemented by the holder of any weak reference. It is used for notification when the adapted
  * object dies.;
  */
trait XWeak extends XInterface {
  /**
    * queries the weak adapter.
    *
    * It is important that the adapter must know, but not hold the adapted object. If the adapted object dies, all references to the adapter have to be
    * notified to release the adapter.
    */
  def queryAdapter(): XAdapter
}

object XWeak {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryAdapter: () => XAdapter,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XWeak = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryAdapter = js.Any.fromFunction0(queryAdapter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XWeak]
  }
}

