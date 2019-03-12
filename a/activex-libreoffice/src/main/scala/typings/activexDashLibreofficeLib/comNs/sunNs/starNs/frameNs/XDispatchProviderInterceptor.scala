package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to intercept request of {@link XDispatch} .
  *
  * Can be registered as an interceptor by using interface {@link XDispatchProviderInterception} .
  * @see XDispatchProviderInterception
  */
trait XDispatchProviderInterceptor extends XDispatchProvider {
  /**
    * access to the master {@link XDispatchProvider} of this interceptor
    * @returns the master of this interceptor
    * @see XDispatchProviderInterceptor.setMasterDispatchProvider()
    */
  var MasterDispatchProvider: XDispatchProvider
  /**
    * access to the slave {@link XDispatchProvider} of this interceptor
    * @returns the slave of this interceptor
    * @see XDispatchProviderInterceptor.setSlaveDispatchProvider()
    */
  var SlaveDispatchProvider: XDispatchProvider
  /**
    * access to the master {@link XDispatchProvider} of this interceptor
    * @returns the master of this interceptor
    * @see XDispatchProviderInterceptor.setMasterDispatchProvider()
    */
  def getMasterDispatchProvider(): XDispatchProvider
  /**
    * access to the slave {@link XDispatchProvider} of this interceptor
    * @returns the slave of this interceptor
    * @see XDispatchProviderInterceptor.setSlaveDispatchProvider()
    */
  def getSlaveDispatchProvider(): XDispatchProvider
  /**
    * sets the master {@link XDispatchProvider} , which may forward calls to its {@link XDispatchProvider.queryDispatch()} to this dispatch provider.
    * @param NewSupplier the master of this interceptor
    * @see XDispatchProviderInterceptor.getMasterDispatchProvider()
    */
  def setMasterDispatchProvider(NewSupplier: XDispatchProvider): scala.Unit
  /**
    * sets the slave {@link XDispatchProvider} to which calls to {@link XDispatchProvider.queryDispatch()} can be forwarded under control of this dispatch
    * provider.
    * @param NewDispatchProvider the new slave of this interceptor
    * @see XDispatchProviderInterceptor.getSlaveDispatchProvider()
    */
  def setSlaveDispatchProvider(NewDispatchProvider: XDispatchProvider): scala.Unit
}

object XDispatchProviderInterceptor {
  @scala.inline
  def apply(
    MasterDispatchProvider: XDispatchProvider,
    SlaveDispatchProvider: XDispatchProvider,
    acquire: () => scala.Unit,
    getMasterDispatchProvider: () => XDispatchProvider,
    getSlaveDispatchProvider: () => XDispatchProvider,
    queryDispatch: (activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, java.lang.String, scala.Double) => XDispatch,
    queryDispatches: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DispatchDescriptor] => stdLib.SafeArray[XDispatch],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setMasterDispatchProvider: XDispatchProvider => scala.Unit,
    setSlaveDispatchProvider: XDispatchProvider => scala.Unit
  ): XDispatchProviderInterceptor = {
    val __obj = js.Dynamic.literal(MasterDispatchProvider = MasterDispatchProvider, SlaveDispatchProvider = SlaveDispatchProvider, acquire = js.Any.fromFunction0(acquire), getMasterDispatchProvider = js.Any.fromFunction0(getMasterDispatchProvider), getSlaveDispatchProvider = js.Any.fromFunction0(getSlaveDispatchProvider), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setMasterDispatchProvider = js.Any.fromFunction1(setMasterDispatchProvider), setSlaveDispatchProvider = js.Any.fromFunction1(setSlaveDispatchProvider))
  
    __obj.asInstanceOf[XDispatchProviderInterceptor]
  }
}

