package typings
package angularLib.angularMod.angularNs.autoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////
// ProvideService
// see http://docs.angularjs.org/api/AUTO.$provide
///////////////////////////////////////////////////////////////////////
@js.native
trait IProvideService extends js.Object {
  // Documentation says it returns the registered instance, but actual
  // implementation does not return anything.
  // constant(name: string, value: any): any;
  /**
               * Register a constant service, such as a string, a number, an array, an object or a function, with the $injector. Unlike value it can be injected into a module configuration function (see config) and it cannot be overridden by an Angular decorator.
               *
               * @param name The name of the constant.
               * @param value The constant value.
               */
  def constant(name: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
               * Register a service decorator with the $injector. A service decorator intercepts the creation of a service, allowing it to override or modify the behaviour of the service. The object returned by the decorator may be the original service, or a new service object which replaces or wraps and delegates to the original service.
               *
               * @param name The name of the service to decorate.
               * @param decorator This function will be invoked when the service needs to be instantiated and should return the decorated service instance. The function is called using the injector.invoke method and is therefore fully injectable. Local injection arguments:
               *
               * $delegate - The original service instance, which can be monkey patched, configured, decorated or delegated to.
               */
  def decorator(name: java.lang.String, decorator: js.Function): scala.Unit = js.native
  /**
               * Register a service decorator with the $injector. A service decorator intercepts the creation of a service, allowing it to override or modify the behaviour of the service. The object returned by the decorator may be the original service, or a new service object which replaces or wraps and delegates to the original service.
               *
               * @param name The name of the service to decorate.
               * @param inlineAnnotatedFunction This function will be invoked when the service needs to be instantiated and should return the decorated service instance. The function is called using the injector.invoke method and is therefore fully injectable. Local injection arguments:
               *
               * $delegate - The original service instance, which can be monkey patched, configured, decorated or delegated to.
               */
  def decorator(name: java.lang.String, inlineAnnotatedFunction: js.Array[_]): scala.Unit = js.native
  def factory(name: java.lang.String, inlineAnnotatedFunction: js.Array[_]): angularLib.angularMod.angularNs.IServiceProvider = js.native
  def factory(name: java.lang.String, serviceFactoryFunction: js.Function): angularLib.angularMod.angularNs.IServiceProvider = js.native
  def provider(name: java.lang.String, provider: angularLib.angularMod.angularNs.IServiceProvider): angularLib.angularMod.angularNs.IServiceProvider = js.native
  def provider(name: java.lang.String, serviceProviderConstructor: js.Function): angularLib.angularMod.angularNs.IServiceProvider = js.native
  def service(name: java.lang.String, constructor: js.Function): angularLib.angularMod.angularNs.IServiceProvider = js.native
  def service(name: java.lang.String, inlineAnnotatedFunction: js.Array[_]): angularLib.angularMod.angularNs.IServiceProvider = js.native
  def value(name: java.lang.String, value: js.Any): angularLib.angularMod.angularNs.IServiceProvider = js.native
}

