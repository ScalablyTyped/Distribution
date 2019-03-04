package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to register an {@link XDispatchProvider} which intercepts all requests of {@link XDispatch} to this instance.
  *
  * Note: Nobody can guarantee order of used interceptor objects if more than ones exist. Later registered ones will be used at first. But it's possible
  * to increase the chance for that by providing the optional interface {@link XInterceptorInfo} .
  * @see XDispatchProvider
  * @see XDispatch
  * @see XInterceptorInfo
  */
trait XDispatchProviderInterception
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * registers an {@link XDispatchProviderInterceptor} , which will become the first interceptor in the chain of registered interceptors.
    * @param Interceptor the interceptor which wishes to be registered
    * @see XDispatchProviderInterception.releaseDispatchProviderInterceptor()
    */
  def registerDispatchProviderInterceptor(Interceptor: XDispatchProviderInterceptor): scala.Unit
  /**
    * removes an {@link XDispatchProviderInterceptor} which was previously registered
    *
    * The order of removals is arbitrary. It is not necessary to remove the last registered interceptor first.
    * @param Interceptor the interceptor which wishes to be unregistered
    * @see XDispatchProviderInterception.registerDispatchProviderInterceptor()
    */
  def releaseDispatchProviderInterceptor(Interceptor: XDispatchProviderInterceptor): scala.Unit
}

object XDispatchProviderInterception {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerDispatchProviderInterceptor: js.Function1[XDispatchProviderInterceptor, scala.Unit],
    release: js.Function0[scala.Unit],
    releaseDispatchProviderInterceptor: js.Function1[XDispatchProviderInterceptor, scala.Unit]
  ): XDispatchProviderInterception = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, registerDispatchProviderInterceptor = registerDispatchProviderInterceptor, release = release, releaseDispatchProviderInterceptor = releaseDispatchProviderInterceptor)
  
    __obj.asInstanceOf[XDispatchProviderInterception]
  }
}

