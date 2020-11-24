package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to register an {@link XDispatchProvider} which intercepts all requests of {@link XDispatch} to this instance.
  *
  * Note: Nobody can guarantee order of used interceptor objects if more than ones exist. Later registered ones will be used at first. But it's possible
  * to increase the chance for that by providing the optional interface {@link XInterceptorInfo} .
  * @see XDispatchProvider
  * @see XDispatch
  * @see XInterceptorInfo
  */
@js.native
trait XDispatchProviderInterception extends XInterface {
  
  /**
    * registers an {@link XDispatchProviderInterceptor} , which will become the first interceptor in the chain of registered interceptors.
    * @param Interceptor the interceptor which wishes to be registered
    * @see XDispatchProviderInterception.releaseDispatchProviderInterceptor()
    */
  def registerDispatchProviderInterceptor(Interceptor: XDispatchProviderInterceptor): Unit = js.native
  
  /**
    * removes an {@link XDispatchProviderInterceptor} which was previously registered
    *
    * The order of removals is arbitrary. It is not necessary to remove the last registered interceptor first.
    * @param Interceptor the interceptor which wishes to be unregistered
    * @see XDispatchProviderInterception.registerDispatchProviderInterceptor()
    */
  def releaseDispatchProviderInterceptor(Interceptor: XDispatchProviderInterceptor): Unit = js.native
}
object XDispatchProviderInterception {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    registerDispatchProviderInterceptor: XDispatchProviderInterceptor => Unit,
    release: () => Unit,
    releaseDispatchProviderInterceptor: XDispatchProviderInterceptor => Unit
  ): XDispatchProviderInterception = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), registerDispatchProviderInterceptor = js.Any.fromFunction1(registerDispatchProviderInterceptor), release = js.Any.fromFunction0(release), releaseDispatchProviderInterceptor = js.Any.fromFunction1(releaseDispatchProviderInterceptor))
    __obj.asInstanceOf[XDispatchProviderInterception]
  }
  
  @scala.inline
  implicit class XDispatchProviderInterceptionOps[Self <: XDispatchProviderInterception] (val x: Self) extends AnyVal {
    
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
    def setRegisterDispatchProviderInterceptor(value: XDispatchProviderInterceptor => Unit): Self = this.set("registerDispatchProviderInterceptor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReleaseDispatchProviderInterceptor(value: XDispatchProviderInterceptor => Unit): Self = this.set("releaseDispatchProviderInterceptor", js.Any.fromFunction1(value))
  }
}
