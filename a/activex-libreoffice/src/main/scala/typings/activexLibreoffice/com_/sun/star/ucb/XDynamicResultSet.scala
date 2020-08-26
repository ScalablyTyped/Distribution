package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.sdbc.XResultSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides read access to a {@link ContentResultSet} .
  *
  * You can either get a simple static {@link ContentResultSet} or you can listen to change-notifications and than swap from the old to a new {@link
  * ContentResultSet} .
  *
  * The following describes the dynamic use:
  *
  * {@link XDynamicResultSet} provides the possibility to get notifications about changes on a {@link ContentResultSet} and have an listener-controlled
  * update from one version to the next version. Two {@link ContentResultSet} implementations were given to the listener in the first notification as
  * interface {@link com.sun.star.sdbc.XResultSet} .
  *
  * To get notifications the listener has to be of type {@link XDynamicResultSetListener} .
  *
  * After registration you will get notifications for events of type {@link ListEvent} .
  *
  * The calling of {@link XDynamicResultSetListener.notify()} has to happen in an own thread, because it could take a longer time and any actions ???
  * until the listener returns the call. So don't block the notify-causing action.
  *
  * While one notify-call is going on:
  *
  *  1. The listener is allowed to access both ContentResultSets, they must be both valid. 2. It is not allowed to start a second notify-call. 3. All
  * additional things we want to send as notification are to be queued. 4. Any other calls are to be accepted and treated.
  *
  * After the listener has returned the notify-call:
  *
  *  1. The listener is allowed to access the new {@link ContentResultSet} . The new one is first assigned in the WELCOME-event and than the ResultSets
  * are always swapped. 2. The listener is not allowed to access the old {@link ContentResultSet} .
  */
@js.native
trait XDynamicResultSet extends XComponent {
  /**
    * Using this method you can get information, whether the offered ContentResultSets are sorted or filtered etc correctly as demanded during the creation
    * of the {@link XDynamicResultSet} .
    * @returns zero or more constants of the {@link ContentResultSetCapability} constants group.
    */
  val Capabilities: Double = js.native
  /**
    * Call this, if you don't care about any changes.
    * @returns an {@link com.sun.star.sdbc.XResultSet} that is implemented as {@link ContentResultSet} . Its content will never change.
    * @throws ListenerAlreadySetException if someone already has registered as listener via {@link XDynamicResultSet.setListener()} or if someone has establish
    */
  val StaticResultSet: XResultSet = js.native
  /**
    * Connects this to a {@link CachedDynamicResultSet} for optimized remote data transport.
    *
    * This method creates a {@link CachedDynamicResultSetStub} and sets it as Source to the given cache.
    *
    * After this method has returned you can and have to use the given result set cache for further access.
    * @param Cache has to be an implementation of the service {@link CachedDynamicResultSet} . In particular it has to support the interface {@link XSourceIni
    * @throws ListenerAlreadySetException if someone already has fetched the {@link ContentResultSet} via {@link XDynamicResultSet.getStaticResultSet()} .
    * @throws AlreadyInitializedException if **Cache** was already initialized with another source.
    * @throws ServiceNotFoundException
    */
  def connectToCache(Cache: XDynamicResultSet): Unit = js.native
  /**
    * Using this method you can get information, whether the offered ContentResultSets are sorted or filtered etc correctly as demanded during the creation
    * of the {@link XDynamicResultSet} .
    * @returns zero or more constants of the {@link ContentResultSetCapability} constants group.
    */
  def getCapabilities(): Double = js.native
  /**
    * Call this, if you don't care about any changes.
    * @returns an {@link com.sun.star.sdbc.XResultSet} that is implemented as {@link ContentResultSet} . Its content will never change.
    * @throws ListenerAlreadySetException if someone already has registered as listener via {@link XDynamicResultSet.setListener()} or if someone has establish
    */
  def getStaticResultSet(): XResultSet = js.native
  /**
    * Call this, if you want to get notifications about changes.
    *
    * The implementor has to call {@link com.sun.star.lang.XComponent.addEventListener()} in this method, so that we can call {@link
    * com.sun.star.lang.XEventListener.disposing()} at the listener
    * @param Listener a listener for result set notifications
    * @throws ListenerAlreadySetException if this method is called more than once during the life of the implementation object or if this method is called if s
    */
  def setListener(Listener: XDynamicResultSetListener): Unit = js.native
}

object XDynamicResultSet {
  @scala.inline
  def apply(
    Capabilities: Double,
    StaticResultSet: XResultSet,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    connectToCache: XDynamicResultSet => Unit,
    dispose: () => Unit,
    getCapabilities: () => Double,
    getStaticResultSet: () => XResultSet,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setListener: XDynamicResultSetListener => Unit
  ): XDynamicResultSet = {
    val __obj = js.Dynamic.literal(Capabilities = Capabilities.asInstanceOf[js.Any], StaticResultSet = StaticResultSet.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), connectToCache = js.Any.fromFunction1(connectToCache), dispose = js.Any.fromFunction0(dispose), getCapabilities = js.Any.fromFunction0(getCapabilities), getStaticResultSet = js.Any.fromFunction0(getStaticResultSet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setListener = js.Any.fromFunction1(setListener))
    __obj.asInstanceOf[XDynamicResultSet]
  }
  @scala.inline
  implicit class XDynamicResultSetOps[Self <: XDynamicResultSet] (val x: Self) extends AnyVal {
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
    def setCapabilities(value: Double): Self = this.set("Capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def setStaticResultSet(value: XResultSet): Self = this.set("StaticResultSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectToCache(value: XDynamicResultSet => Unit): Self = this.set("connectToCache", js.Any.fromFunction1(value))
    @scala.inline
    def setGetCapabilities(value: () => Double): Self = this.set("getCapabilities", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStaticResultSet(value: () => XResultSet): Self = this.set("getStaticResultSet", js.Any.fromFunction0(value))
    @scala.inline
    def setSetListener(value: XDynamicResultSetListener => Unit): Self = this.set("setListener", js.Any.fromFunction1(value))
  }
  
}

