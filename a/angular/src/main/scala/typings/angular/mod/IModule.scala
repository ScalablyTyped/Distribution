package typings.angular.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQLite
import typings.angular.mod.global.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Module
// see http://docs.angularjs.org/api/angular.Module
///////////////////////////////////////////////////////////////////////////
@js.native
trait IModule extends StObject {
  
  /**
    * Use this method to register a component.
    *
    * @param name The name of the component.
    * @param options A definition object passed into the component.
    */
  def component(name: String, options: IComponentOptions): IModule = js.native
  /**
    * Use this method to register a component.
    *
    * @param object Object map of components where the keys are the names and the values are the component definition objects
    */
  def component(`object`: StringDictionary[IComponentOptions]): IModule = js.native
  
  /**
    * Use this method to register work which needs to be performed on module loading.
    *
    * @param configFn Execute this function on module load. Useful for service configuration.
    */
  def config(configFn: Function): IModule = js.native
  /**
    * Use this method to register work which needs to be performed on module loading.
    *
    * @param inlineAnnotatedFunction Execute this function on module load. Useful for service configuration.
    */
  def config(inlineAnnotatedFunction: js.Array[Any]): IModule = js.native
  def config(`object`: js.Object): IModule = js.native
  
  def constant(`object`: js.Object): IModule = js.native
  /**
    * Register a constant service, such as a string, a number, an array, an object or a function, with the $injector. Unlike value it can be injected into a module configuration function (see config) and it cannot be overridden by an Angular decorator.
    *
    * @param name The name of the constant.
    * @param value The constant value.
    */
  def constant[T](name: String, value: T): IModule = js.native
  
  /**
    * The $controller service is used by Angular to create new controllers.
    *
    * This provider allows controller registration via the register method.
    *
    * @param name Controller name, or an object map of controllers where the keys are the names and the values are the constructors.
    * @param controllerConstructor Controller constructor fn (optionally decorated with DI annotations in the array notation).
    */
  def controller(name: String, controllerConstructor: Injectable[IControllerConstructor]): IModule = js.native
  def controller(`object`: StringDictionary[Injectable[IControllerConstructor]]): IModule = js.native
  
  /**
    * Register a service decorator with the $injector. A service decorator intercepts the creation of a service, allowing it to override or modify the behaviour of the service. The object returned by the decorator may be the original service, or a new service object which replaces or wraps and delegates to the original service.
    * @param name The name of the service to decorate
    * @param decorator This function will be invoked when the service needs to be instantiated and should return the decorated service instance. The function is called using the injector.invoke method and is therefore fully injectable. Local injection arguments: $delegate - The original service instance, which can be monkey patched, configured, decorated or delegated to.
    */
  def decorator(name: String, decorator: Injectable[Function]): IModule = js.native
  
  /**
    * Register a new directive with the compiler.
    *
    * @param name Name of the directive in camel-case (i.e. ngBind which will match as ng-bind)
    * @param directiveFactory An injectable directive factory function.
    */
  def directive[TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */](
    name: String,
    directiveFactory: Injectable[IDirectiveFactory[TScope, TElement, TAttributes, TController]]
  ): IModule = js.native
  def directive[TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */](
    `object`: StringDictionary[Injectable[IDirectiveFactory[TScope, TElement, TAttributes, TController]]]
  ): IModule = js.native
  
  /**
    * Register a service factory, which will be called to return the service instance. This is short for registering a service where its provider consists of only a $get property, which is the given service factory function. You should use $provide.factory(getFn) if you do not need to configure your service in a provider.
    *
    * @param name The name of the instance.
    * @param $getFn The $getFn for the instance creation. Internally this is a short hand for $provide.provider(name, {$get: $getFn}).
    */
  def factory(name: String, $getFn: Injectable[Function]): IModule = js.native
  def factory(`object`: StringDictionary[Injectable[Function]]): IModule = js.native
  
  def filter(name: String, filterFactoryFunction: Injectable[FilterFactory]): IModule = js.native
  def filter(`object`: StringDictionary[Injectable[FilterFactory]]): IModule = js.native
  
  // Properties
  var name: String = js.native
  
  def provider(name: String, inlineAnnotatedConstructor: js.Array[Any]): IModule = js.native
  def provider(name: String, providerObject: IServiceProvider): IModule = js.native
  def provider(name: String, serviceProviderConstructor: IServiceProviderClass): IModule = js.native
  def provider(name: String, serviceProviderFactory: IServiceProviderFactory): IModule = js.native
  def provider(`object`: js.Object): IModule = js.native
  
  var requires: js.Array[String] = js.native
  
  /**
    * Run blocks are the closest thing in Angular to the main method. A run block is the code which needs to run to kickstart the application. It is executed after all of the service have been configured and the injector has been created. Run blocks typically contain code which is hard to unit-test, and for this reason should be declared in isolated modules, so that they can be ignored in the unit-tests.
    */
  def run(initializationFunction: Injectable[Function]): IModule = js.native
  
  /**
    * Register a service constructor, which will be invoked with new to create the service instance. This is short for registering a service where its provider's $get property is a factory function that returns an instance instantiated by the injector from the service constructor function.
    *
    * @param name The name of the instance.
    * @param serviceConstructor An injectable class (constructor function) that will be instantiated.
    */
  def service(name: String, serviceConstructor: Injectable[Function]): IModule = js.native
  def service(`object`: StringDictionary[Injectable[Function]]): IModule = js.native
  
  def value(`object`: js.Object): IModule = js.native
  /**
    * Register a value service with the $injector, such as a string, a number, an array, an object or a function. This is short for registering a service where its provider's $get property is a factory function that takes no arguments and returns the value service.
    Value services are similar to constant services, except that they cannot be injected into a module configuration function (see config) but they can be overridden by an Angular decorator.
    *
    * @param name The name of the instance.
    * @param value The value.
    */
  def value[T](name: String, value: T): IModule = js.native
}
