package typings.angular.angularMod.autoNs

import typings.angular.angularMod.Global.Function
import typings.angular.angularMod.IServiceProvider
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
  def constant(name: String, value: js.Any): Unit = js.native
  /**
    * Register a service decorator with the $injector. A service decorator intercepts the creation of a service, allowing it to override or modify the behaviour of the service. The object returned by the decorator may be the original service, or a new service object which replaces or wraps and delegates to the original service.
    *
    * @param name The name of the service to decorate.
    * @param decorator This function will be invoked when the service needs to be instantiated and should return the decorated service instance. The function is called using the injector.invoke method and is therefore fully injectable. Local injection arguments:
    *
    * $delegate - The original service instance, which can be monkey patched, configured, decorated or delegated to.
    */
  def decorator(name: String, decorator: Function): Unit = js.native
  /**
    * Register a service decorator with the $injector. A service decorator intercepts the creation of a service, allowing it to override or modify the behaviour of the service. The object returned by the decorator may be the original service, or a new service object which replaces or wraps and delegates to the original service.
    *
    * @param name The name of the service to decorate.
    * @param inlineAnnotatedFunction This function will be invoked when the service needs to be instantiated and should return the decorated service instance. The function is called using the injector.invoke method and is therefore fully injectable. Local injection arguments:
    *
    * $delegate - The original service instance, which can be monkey patched, configured, decorated or delegated to.
    */
  def decorator(name: String, inlineAnnotatedFunction: js.Array[_]): Unit = js.native
  def factory(name: String, inlineAnnotatedFunction: js.Array[_]): IServiceProvider = js.native
  def factory(name: String, serviceFactoryFunction: Function): IServiceProvider = js.native
  def provider(name: String, provider: IServiceProvider): IServiceProvider = js.native
  def provider(name: String, serviceProviderConstructor: Function): IServiceProvider = js.native
  def service(name: String, constructor: Function): IServiceProvider = js.native
  def service(name: String, inlineAnnotatedFunction: js.Array[_]): IServiceProvider = js.native
  def value(name: String, value: js.Any): IServiceProvider = js.native
}

