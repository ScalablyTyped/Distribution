package typings.angularResource

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.ICacheObject
import typings.angular.mod.IHttpHeadersGetter
import typings.angular.mod.IHttpRequestTransformer
import typings.angular.mod.IHttpResponseTransformer
import typings.angular.mod.IPromise
import typings.angular.mod.IServiceProvider
import typings.angular.mod.global.Function
import typings.angularResource.angularResourceStrings.$resource
import typings.angularResource.mod.angularAugmentingMod.resource.IResourceService
import typings.angularResource.mod.angularAugmentingMod.resource.IResourceServiceFactoryFunction
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("angular-resource", JSImport.Namespace)
  @js.native
  val ^ : String = js.native
  
  type _To = String
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: String = ^
  
  /* augmented module */
  object angularAugmentingMod {
    
    /** extensions to base ng based on using angular-resource */
    trait IModule extends StObject {
      
      /** creating a resource service factory */
      def factory(name: String, resourceServiceFactoryFunction: IResourceServiceFactoryFunction[Any]): IModule
    }
    object IModule {
      
      inline def apply(factory: (String, IResourceServiceFactoryFunction[Any]) => IModule): IModule = {
        val __obj = js.Dynamic.literal(factory = js.Any.fromFunction2(factory))
        __obj.asInstanceOf[IModule]
      }
      
      extension [Self <: IModule](x: Self) {
        
        inline def setFactory(value: (String, IResourceServiceFactoryFunction[Any]) => IModule): Self = StObject.set(x, "factory", js.Any.fromFunction2(value))
      }
    }
    
    object auto {
      
      trait IInjectorService extends StObject {
        
        @JSName("get")
        def get_resource(name: $resource): IResourceService
      }
      object IInjectorService {
        
        inline def apply(get: $resource => IResourceService): IInjectorService = {
          val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
          __obj.asInstanceOf[IInjectorService]
        }
        
        extension [Self <: IInjectorService](x: Self) {
          
          inline def setGet(value: $resource => IResourceService): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
        }
      }
    }
    
    ///////////////////////////////////////////////////////////////////////////////
    // ngResource module (angular-resource.js)
    ///////////////////////////////////////////////////////////////////////////////
    object resource {
      
      // Just a reference to facilitate describing new actions
      trait IActionDescriptor extends StObject {
        
        var cache: js.UndefOr[Boolean | ICacheObject] = js.undefined
        
        var cancellable: js.UndefOr[Boolean] = js.undefined
        
        var hasBody: js.UndefOr[Boolean] = js.undefined
        
        var headers: js.UndefOr[Any] = js.undefined
        
        var interceptor: js.UndefOr[IResourceInterceptor] = js.undefined
        
        var isArray: js.UndefOr[Boolean] = js.undefined
        
        var method: String
        
        var params: js.UndefOr[Any] = js.undefined
        
        var responseType: js.UndefOr[String] = js.undefined
        
        /**
          * Note: In contrast to $http.config, promises are not supported in $resource, because the same value
          * would be used for multiple requests. If you are looking for a way to cancel requests, you should
          * use the cancellable option.
          */
        var timeout: js.UndefOr[Double] = js.undefined
        
        var transformRequest: js.UndefOr[IHttpRequestTransformer | js.Array[IHttpRequestTransformer]] = js.undefined
        
        var transformResponse: js.UndefOr[IHttpResponseTransformer | js.Array[IHttpResponseTransformer]] = js.undefined
        
        var url: js.UndefOr[String] = js.undefined
        
        var withCredentials: js.UndefOr[Boolean] = js.undefined
      }
      object IActionDescriptor {
        
        inline def apply(method: String): IActionDescriptor = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
          __obj.asInstanceOf[IActionDescriptor]
        }
        
        extension [Self <: IActionDescriptor](x: Self) {
          
          inline def setCache(value: Boolean | ICacheObject): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
          
          inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
          
          inline def setCancellable(value: Boolean): Self = StObject.set(x, "cancellable", value.asInstanceOf[js.Any])
          
          inline def setCancellableUndefined: Self = StObject.set(x, "cancellable", js.undefined)
          
          inline def setHasBody(value: Boolean): Self = StObject.set(x, "hasBody", value.asInstanceOf[js.Any])
          
          inline def setHasBodyUndefined: Self = StObject.set(x, "hasBody", js.undefined)
          
          inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
          
          inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
          
          inline def setInterceptor(value: IResourceInterceptor): Self = StObject.set(x, "interceptor", value.asInstanceOf[js.Any])
          
          inline def setInterceptorUndefined: Self = StObject.set(x, "interceptor", js.undefined)
          
          inline def setIsArray(value: Boolean): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
          
          inline def setIsArrayUndefined: Self = StObject.set(x, "isArray", js.undefined)
          
          inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
          
          inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
          
          inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
          
          inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
          
          inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
          
          inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
          
          inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
          
          inline def setTransformRequest(value: IHttpRequestTransformer | js.Array[IHttpRequestTransformer]): Self = StObject.set(x, "transformRequest", value.asInstanceOf[js.Any])
          
          inline def setTransformRequestFunction2(value: (/* data */ Any, /* headersGetter */ IHttpHeadersGetter) => Any): Self = StObject.set(x, "transformRequest", js.Any.fromFunction2(value))
          
          inline def setTransformRequestUndefined: Self = StObject.set(x, "transformRequest", js.undefined)
          
          inline def setTransformRequestVarargs(value: IHttpRequestTransformer*): Self = StObject.set(x, "transformRequest", js.Array(value*))
          
          inline def setTransformResponse(value: IHttpResponseTransformer | js.Array[IHttpResponseTransformer]): Self = StObject.set(x, "transformResponse", value.asInstanceOf[js.Any])
          
          inline def setTransformResponseFunction3(value: (/* data */ Any, /* headersGetter */ IHttpHeadersGetter, /* status */ Double) => Any): Self = StObject.set(x, "transformResponse", js.Any.fromFunction3(value))
          
          inline def setTransformResponseUndefined: Self = StObject.set(x, "transformResponse", js.undefined)
          
          inline def setTransformResponseVarargs(value: IHttpResponseTransformer*): Self = StObject.set(x, "transformResponse", js.Array(value*))
          
          inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
          
          inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
          
          inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
          
          inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
        }
      }
      
      // Hash of action descriptors allows custom action names
      type IActionHash = StringDictionary[IActionDescriptor]
      
      // Instance calls always return the the promise of the request which retrieved the object
      // https://github.com/angular/js/blob/v1.2.0/src/ngResource/resource.js#L538-L546
      @js.native
      trait IResource[T] extends StObject {
        
        @JSName("$cancelRequest")
        def $cancelRequest(): Unit = js.native
        
        @JSName("$delete")
        def $delete(): IPromise[T] = js.native
        @JSName("$delete")
        def $delete(params: js.Object): IPromise[T] = js.native
        @JSName("$delete")
        def $delete(params: js.Object, success: Unit, error: Function): IPromise[T] = js.native
        @JSName("$delete")
        def $delete(params: js.Object, success: Function): IPromise[T] = js.native
        @JSName("$delete")
        def $delete(params: js.Object, success: Function, error: Function): IPromise[T] = js.native
        @JSName("$delete")
        def $delete(params: Unit, success: Unit, error: Function): IPromise[T] = js.native
        @JSName("$delete")
        def $delete(params: Unit, success: Function): IPromise[T] = js.native
        @JSName("$delete")
        def $delete(params: Unit, success: Function, error: Function): IPromise[T] = js.native
        @JSName("$delete")
        def $delete(success: Function): IPromise[T] = js.native
        @JSName("$delete")
        def $delete(success: Function, error: Function): IPromise[T] = js.native
        
        @JSName("$get")
        def $get(): IPromise[T] = js.native
        @JSName("$get")
        def $get(params: js.Object): IPromise[T] = js.native
        @JSName("$get")
        def $get(params: js.Object, success: Unit, error: Function): IPromise[T] = js.native
        @JSName("$get")
        def $get(params: js.Object, success: Function): IPromise[T] = js.native
        @JSName("$get")
        def $get(params: js.Object, success: Function, error: Function): IPromise[T] = js.native
        @JSName("$get")
        def $get(params: Unit, success: Unit, error: Function): IPromise[T] = js.native
        @JSName("$get")
        def $get(params: Unit, success: Function): IPromise[T] = js.native
        @JSName("$get")
        def $get(params: Unit, success: Function, error: Function): IPromise[T] = js.native
        @JSName("$get")
        def $get(success: Function): IPromise[T] = js.native
        @JSName("$get")
        def $get(success: Function, error: Function): IPromise[T] = js.native
        
        /** The promise of the original server interaction that created this instance. */
        @JSName("$promise")
        var $promise: IPromise[T] = js.native
        
        @JSName("$query")
        def $query(): IPromise[IResourceArray[T]] = js.native
        @JSName("$query")
        def $query(params: js.Object): IPromise[IResourceArray[T]] = js.native
        @JSName("$query")
        def $query(params: js.Object, success: Unit, error: Function): IPromise[IResourceArray[T]] = js.native
        @JSName("$query")
        def $query(params: js.Object, success: Function): IPromise[IResourceArray[T]] = js.native
        @JSName("$query")
        def $query(params: js.Object, success: Function, error: Function): IPromise[IResourceArray[T]] = js.native
        @JSName("$query")
        def $query(params: Unit, success: Unit, error: Function): IPromise[IResourceArray[T]] = js.native
        @JSName("$query")
        def $query(params: Unit, success: Function): IPromise[IResourceArray[T]] = js.native
        @JSName("$query")
        def $query(params: Unit, success: Function, error: Function): IPromise[IResourceArray[T]] = js.native
        @JSName("$query")
        def $query(success: Function): IPromise[IResourceArray[T]] = js.native
        @JSName("$query")
        def $query(success: Function, error: Function): IPromise[IResourceArray[T]] = js.native
        
        @JSName("$remove")
        def $remove(): IPromise[T] = js.native
        @JSName("$remove")
        def $remove(params: js.Object): IPromise[T] = js.native
        @JSName("$remove")
        def $remove(params: js.Object, success: Unit, error: Function): IPromise[T] = js.native
        @JSName("$remove")
        def $remove(params: js.Object, success: Function): IPromise[T] = js.native
        @JSName("$remove")
        def $remove(params: js.Object, success: Function, error: Function): IPromise[T] = js.native
        @JSName("$remove")
        def $remove(params: Unit, success: Unit, error: Function): IPromise[T] = js.native
        @JSName("$remove")
        def $remove(params: Unit, success: Function): IPromise[T] = js.native
        @JSName("$remove")
        def $remove(params: Unit, success: Function, error: Function): IPromise[T] = js.native
        @JSName("$remove")
        def $remove(success: Function): IPromise[T] = js.native
        @JSName("$remove")
        def $remove(success: Function, error: Function): IPromise[T] = js.native
        
        @JSName("$resolved")
        var $resolved: Boolean = js.native
        
        @JSName("$save")
        def $save(): IPromise[T] = js.native
        @JSName("$save")
        def $save(params: js.Object): IPromise[T] = js.native
        @JSName("$save")
        def $save(params: js.Object, success: Unit, error: Function): IPromise[T] = js.native
        @JSName("$save")
        def $save(params: js.Object, success: Function): IPromise[T] = js.native
        @JSName("$save")
        def $save(params: js.Object, success: Function, error: Function): IPromise[T] = js.native
        @JSName("$save")
        def $save(params: Unit, success: Unit, error: Function): IPromise[T] = js.native
        @JSName("$save")
        def $save(params: Unit, success: Function): IPromise[T] = js.native
        @JSName("$save")
        def $save(params: Unit, success: Function, error: Function): IPromise[T] = js.native
        @JSName("$save")
        def $save(success: Function): IPromise[T] = js.native
        @JSName("$save")
        def $save(success: Function, error: Function): IPromise[T] = js.native
        
        def toJSON(): T = js.native
      }
      
      /**
        * Really just a regular Array object with $promise and $resolve attached to it
        */
      @js.native
      trait IResourceArray[T]
        extends StObject
           with Array[T & IResource[T]] {
        
        @JSName("$cancelRequest")
        def $cancelRequest(): Unit = js.native
        
        /** The promise of the original server interaction that created this collection. */
        @JSName("$promise")
        var $promise: IPromise[IResourceArray[T]] = js.native
        
        @JSName("$resolved")
        var $resolved: Boolean = js.native
      }
      
      // Allow specify resource moethod which returns the array
      // No need to add duplicates for all four overloads.
      @js.native
      trait IResourceArrayMethod[T] extends StObject {
        
        def apply(): IResourceArray[T] = js.native
        def apply(params: js.Object): IResourceArray[T] = js.native
        def apply(params: js.Object, data: js.Object): IResourceArray[T] = js.native
        def apply(params: js.Object, data: js.Object, success: Unit, error: Function): IResourceArray[T] = js.native
        def apply(params: js.Object, data: js.Object, success: Function): IResourceArray[T] = js.native
        def apply(params: js.Object, data: js.Object, success: Function, error: Function): IResourceArray[T] = js.native
        def apply(params: js.Object, success: Function): IResourceArray[T] = js.native
        def apply(params: js.Object, success: Function, error: Function): IResourceArray[T] = js.native
        def apply(success: Function): IResourceArray[T] = js.native
        def apply(success: Function, error: Function): IResourceArray[T] = js.native
      }
      
      // Baseclass for everyresource with default actions.
      // If you define your new actions for the resource, you will need
      // to extend this interface and typecast the ResourceClass to it.
      //
      // In case of passing the first argument as anything but a function,
      // it's gonna be considered data if the action method is POST, PUT or
      // PATCH (in other words, methods with body). Otherwise, it's going
      // to be considered as parameters to the request.
      // https://github.com/angular/js/blob/v1.2.0/src/ngResource/resource.js#L461-L465
      //
      // Only those methods with an HTTP body do have 'data' as first parameter:
      // https://github.com/angular/js/blob/v1.2.0/src/ngResource/resource.js#L463
      // More specifically, those methods are POST, PUT and PATCH:
      // https://github.com/angular/js/blob/v1.2.0/src/ngResource/resource.js#L432
      //
      // Also, static calls always return the IResource (or IResourceArray) retrieved
      // https://github.com/angular/js/blob/v1.2.0/src/ngResource/resource.js#L538-L549
      @js.native
      trait IResourceClass[T]
        extends StObject
           with Instantiable0[T & IResource[T]]
           with Instantiable1[/* dataOrParams */ Any, T & IResource[T]] {
        
        def delete(): T = js.native
        def delete(params: js.Object): T = js.native
        def delete(params: js.Object, data: js.Object): T = js.native
        def delete(params: js.Object, data: js.Object, success: Unit, error: Function): T = js.native
        def delete(params: js.Object, data: js.Object, success: Function): T = js.native
        def delete(params: js.Object, data: js.Object, success: Function, error: Function): T = js.native
        def delete(params: js.Object, success: Function): T = js.native
        def delete(params: js.Object, success: Function, error: Function): T = js.native
        def delete(success: Function): T = js.native
        def delete(success: Function, error: Function): T = js.native
        @JSName("delete")
        var delete_Original: IResourceMethod[T] = js.native
        
        def get(): T = js.native
        def get(params: js.Object): T = js.native
        def get(params: js.Object, data: js.Object): T = js.native
        def get(params: js.Object, data: js.Object, success: Unit, error: Function): T = js.native
        def get(params: js.Object, data: js.Object, success: Function): T = js.native
        def get(params: js.Object, data: js.Object, success: Function, error: Function): T = js.native
        def get(params: js.Object, success: Function): T = js.native
        def get(params: js.Object, success: Function, error: Function): T = js.native
        def get(success: Function): T = js.native
        def get(success: Function, error: Function): T = js.native
        @JSName("get")
        var get_Original: IResourceMethod[T] = js.native
        
        def query(): IResourceArray[T] = js.native
        def query(params: js.Object): IResourceArray[T] = js.native
        def query(params: js.Object, data: js.Object): IResourceArray[T] = js.native
        def query(params: js.Object, data: js.Object, success: Unit, error: Function): IResourceArray[T] = js.native
        def query(params: js.Object, data: js.Object, success: Function): IResourceArray[T] = js.native
        def query(params: js.Object, data: js.Object, success: Function, error: Function): IResourceArray[T] = js.native
        def query(params: js.Object, success: Function): IResourceArray[T] = js.native
        def query(params: js.Object, success: Function, error: Function): IResourceArray[T] = js.native
        def query(success: Function): IResourceArray[T] = js.native
        def query(success: Function, error: Function): IResourceArray[T] = js.native
        @JSName("query")
        var query_Original: IResourceArrayMethod[T] = js.native
        
        def remove(): T = js.native
        def remove(params: js.Object): T = js.native
        def remove(params: js.Object, data: js.Object): T = js.native
        def remove(params: js.Object, data: js.Object, success: Unit, error: Function): T = js.native
        def remove(params: js.Object, data: js.Object, success: Function): T = js.native
        def remove(params: js.Object, data: js.Object, success: Function, error: Function): T = js.native
        def remove(params: js.Object, success: Function): T = js.native
        def remove(params: js.Object, success: Function, error: Function): T = js.native
        def remove(success: Function): T = js.native
        def remove(success: Function, error: Function): T = js.native
        @JSName("remove")
        var remove_Original: IResourceMethod[T] = js.native
        
        def save(): T = js.native
        def save(params: js.Object): T = js.native
        def save(params: js.Object, data: js.Object): T = js.native
        def save(params: js.Object, data: js.Object, success: Unit, error: Function): T = js.native
        def save(params: js.Object, data: js.Object, success: Function): T = js.native
        def save(params: js.Object, data: js.Object, success: Function, error: Function): T = js.native
        def save(params: js.Object, success: Function): T = js.native
        def save(params: js.Object, success: Function, error: Function): T = js.native
        def save(success: Function): T = js.native
        def save(success: Function, error: Function): T = js.native
        @JSName("save")
        var save_Original: IResourceMethod[T] = js.native
      }
      
      trait IResourceInterceptor extends StObject {
        
        var response: js.UndefOr[js.Function1[/* response */ IResourceResponse, Any]] = js.undefined
        
        var responseError: js.UndefOr[js.Function1[/* rejection */ Any, Any]] = js.undefined
      }
      object IResourceInterceptor {
        
        inline def apply(): IResourceInterceptor = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IResourceInterceptor]
        }
        
        extension [Self <: IResourceInterceptor](x: Self) {
          
          inline def setResponse(value: /* response */ IResourceResponse => Any): Self = StObject.set(x, "response", js.Any.fromFunction1(value))
          
          inline def setResponseError(value: /* rejection */ Any => Any): Self = StObject.set(x, "responseError", js.Any.fromFunction1(value))
          
          inline def setResponseErrorUndefined: Self = StObject.set(x, "responseError", js.undefined)
          
          inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
        }
      }
      
      // Allow specify more resource methods
      // No need to add duplicates for all four overloads.
      @js.native
      trait IResourceMethod[T] extends StObject {
        
        def apply(): T = js.native
        def apply(params: js.Object): T = js.native
        def apply(params: js.Object, data: js.Object): T = js.native
        def apply(params: js.Object, data: js.Object, success: Unit, error: Function): T = js.native
        def apply(params: js.Object, data: js.Object, success: Function): T = js.native
        def apply(params: js.Object, data: js.Object, success: Function, error: Function): T = js.native
        def apply(params: js.Object, success: Function): T = js.native
        def apply(params: js.Object, success: Function, error: Function): T = js.native
        def apply(success: Function): T = js.native
        def apply(success: Function, error: Function): T = js.native
      }
      
      /**
        * Currently supported options for the $resource factory options argument.
        */
      trait IResourceOptions extends StObject {
        
        /**
          * If true, the request made by a "non-instance" call will be cancelled (if not already completed) by calling
          * $cancelRequest() on the call's return value. This can be overwritten per action. (Defaults to false.)
          */
        var cancellable: js.UndefOr[Boolean] = js.undefined
        
        /**
          * If true then the trailing slashes from any calculated URL will be stripped (defaults to true)
          */
        var stripTrailingSlashes: js.UndefOr[Boolean] = js.undefined
      }
      object IResourceOptions {
        
        inline def apply(): IResourceOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IResourceOptions]
        }
        
        extension [Self <: IResourceOptions](x: Self) {
          
          inline def setCancellable(value: Boolean): Self = StObject.set(x, "cancellable", value.asInstanceOf[js.Any])
          
          inline def setCancellableUndefined: Self = StObject.set(x, "cancellable", js.undefined)
          
          inline def setStripTrailingSlashes(value: Boolean): Self = StObject.set(x, "stripTrailingSlashes", value.asInstanceOf[js.Any])
          
          inline def setStripTrailingSlashesUndefined: Self = StObject.set(x, "stripTrailingSlashes", js.undefined)
        }
      }
      
      trait IResourceResponse extends StObject {
        
        var config: Any
        
        var data: Any
        
        var headers: Any
        
        var resource: Any
        
        var status: Double
        
        var statusText: String
      }
      object IResourceResponse {
        
        inline def apply(config: Any, data: Any, headers: Any, resource: Any, status: Double, statusText: String): IResourceResponse = {
          val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
          __obj.asInstanceOf[IResourceResponse]
        }
        
        extension [Self <: IResourceResponse](x: Self) {
          
          inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
          
          inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
          
          inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
          
          inline def setResource(value: Any): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
          
          inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
          
          inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
        }
      }
      
      ///////////////////////////////////////////////////////////////////////////
      // ResourceService
      // see http://docs.angularjs.org/api/ngResource.$resource
      // Most part of the following definitions were achieved by analyzing the
      // actual implementation, since the documentation doesn't seem to cover
      // that deeply.
      ///////////////////////////////////////////////////////////////////////////
      @js.native
      trait IResourceService extends StObject {
        
        /**
          * A factory which creates a resource object that lets you interact with RESTful server-side data sources.
          * @param url A parameterized URL template with parameters prefixed by : as in /user/:username
          * @param paramDefaults Default values for url parameters.
          * @param actions example: {update: { method: 'PUT' }, delete: deleteDescriptor } where deleteDescriptor: IActionDescriptor
          * @param options Hash with custom settings that should extend the default $resourceProvider behavior
          */
        def apply(url: String): IResourceClass[IResource[Any]] = js.native
        def apply(url: String, paramDefaults: Any): IResourceClass[IResource[Any]] = js.native
        def apply(url: String, paramDefaults: Any, actions: Unit, options: IResourceOptions): IResourceClass[IResource[Any]] = js.native
        def apply(url: String, paramDefaults: Any, actions: IActionHash): IResourceClass[IResource[Any]] = js.native
        def apply(url: String, paramDefaults: Any, actions: IActionHash, options: IResourceOptions): IResourceClass[IResource[Any]] = js.native
        def apply(url: String, paramDefaults: Unit, actions: Unit, options: IResourceOptions): IResourceClass[IResource[Any]] = js.native
        def apply(url: String, paramDefaults: Unit, actions: IActionHash): IResourceClass[IResource[Any]] = js.native
        def apply(url: String, paramDefaults: Unit, actions: IActionHash, options: IResourceOptions): IResourceClass[IResource[Any]] = js.native
      }
      
      /** when creating a resource factory via IModule.factory */
      @js.native
      trait IResourceServiceFactoryFunction[T] extends StObject {
        
        def apply($resource: IResourceService): IResourceClass[T] = js.native
      }
      
      // IResourceServiceProvider used to configure global settings
      trait IResourceServiceProvider
        extends StObject
           with IServiceProvider {
        
        var defaults: IResourceOptions
      }
      object IResourceServiceProvider {
        
        inline def apply($get: Any, defaults: IResourceOptions): IResourceServiceProvider = {
          val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any])
          __obj.asInstanceOf[IResourceServiceProvider]
        }
        
        extension [Self <: IResourceServiceProvider](x: Self) {
          
          inline def setDefaults(value: IResourceOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
        }
      }
    }
  }
  
  object global {
    
    trait Array[T] extends StObject {
      
      /** The promise of the original server interaction that created this collection. */
      @JSName("$promise")
      var $promise: IPromise[typings.angularResource.mod.global.Array[T]]
      
      @JSName("$resolved")
      var $resolved: Boolean
    }
    object Array {
      
      inline def apply[T]($promise: IPromise[typings.angularResource.mod.global.Array[T]], $resolved: Boolean): typings.angularResource.mod.global.Array[T] = {
        val __obj = js.Dynamic.literal($promise = $promise.asInstanceOf[js.Any], $resolved = $resolved.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.angularResource.mod.global.Array[T]]
      }
      
      extension [Self <: typings.angularResource.mod.global.Array[?], T](x: Self & typings.angularResource.mod.global.Array[T]) {
        
        inline def set$promise(value: IPromise[typings.angularResource.mod.global.Array[T]]): Self = StObject.set(x, "$promise", value.asInstanceOf[js.Any])
        
        inline def set$resolved(value: Boolean): Self = StObject.set(x, "$resolved", value.asInstanceOf[js.Any])
      }
    }
  }
}
