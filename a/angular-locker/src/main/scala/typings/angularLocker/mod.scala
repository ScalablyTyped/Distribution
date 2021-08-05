package typings.angularLocker

import typings.angular.mod.IScope
import typings.angular.mod.IServiceProvider
import typings.angular.mod.global.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object locker {
    
    trait ILockerProvider
      extends StObject
         with IServiceProvider {
      
      /**
        * Allow the defaults to be specified via the `lockerProvider`
        *
        * @param  lockerSettings  The defaults to override
        */
      def defaults(lockerSettings: ILockerSettings): Unit
    }
    object ILockerProvider {
      
      inline def apply($get: js.Any, defaults: ILockerSettings => Unit): ILockerProvider = {
        val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], defaults = js.Any.fromFunction1(defaults))
        __obj.asInstanceOf[ILockerProvider]
      }
      
      extension [Self <: ILockerProvider](x: Self) {
        
        inline def setDefaults(value: ILockerSettings => Unit): Self = StObject.set(x, "defaults", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait ILockerService extends StObject {
      
      /**
        * Add an item to storage if it doesn't already exist
        *
        * @param  key    The key to add
        * @param  value  The value to add
        */
      def add(key: String, value: js.Any): Boolean = js.native
      
      /**
        * Return all items in storage within the current namespace/driver
        *
        */
      def all(): js.Any = js.native
      
      /**
        * Bind a storage key to a $scope property
        *
        * @param  $scope  The angular $scope object
        * @param  key     The key in storage to bind to
        * @param   def     The default value to initially bind
        */
      def bind(scope: IScope, property: String): ILockerService = js.native
      def bind(scope: IScope, property: String, defaultPropertyValue: js.Any): ILockerService = js.native
      
      /**
        * Remove all items set within the current namespace/driver
        */
      def clean(): ILockerService = js.native
      
      /**
        * Get the total number of items within the current namespace
        */
      def count(): Double = js.native
      
      /**
        * Set the storage driver on a new instance to enable overriding defaults
        *
        * @param  driver  The driver to switch to
        */
      def driver(localStorageType: String): ILockerService = js.native
      
      /**
        * Empty the current storage driver completely. careful now.
        */
      def empty(): ILockerService = js.native
      
      /**
        * Remove specified item(s) from storage
        *
        * @param  key  The key to remove
        */
      def forget(key: String): ILockerService = js.native
      /**
        * Remove specified item(s) from storage
        *
        * @param  keys  The array of keys to remove
        *
        */
      def forget(keys: js.Array[String]): ILockerService = js.native
      
      /**
        * Retrieve the specified item from storage
        *
        * @param  key  The key to get
        * @param         def  The default value if it does not exist
        */
      def get(key: String): js.Any = js.native
      def get(key: String, defaultValue: js.Any): js.Any = js.native
      def get(key: js.Array[String]): js.Any = js.native
      def get(key: js.Array[String], defaultValue: js.Any): js.Any = js.native
      
      /**
        * Get the currently set namespace
        */
      def getNamespace(): String = js.native
      
      /**
        * Determine whether the item exists in storage
        *
        * @param  key  -  The key to remove
        */
      def has(key: String): Boolean = js.native
      
      /**
        * Get a new instance of Locker
        *
        * @param  options  The config options to instantiate with
        */
      def instance(lockerSettings: ILockerSettings): ILockerService = js.native
      
      /**
        * Get the storage keys as an array
        */
      def keys(): js.Array[String] = js.native
      
      /**
        * Set the namespace on a new instance to enable overriding defaults
        *
        * @param  namespace  The namespace to switch to
        */
      def namespace(name: String): ILockerService = js.native
      
      /**
        * Retrieve the specified item from storage and then remove it
        *
        * @param  key  The key to pull from storage
        * @param   def  The default value if it does not exist
        */
      def pull(key: String): js.Any = js.native
      def pull(key: String, defaultValue: js.Any): js.Any = js.native
      def pull(key: js.Array[String]): js.Any = js.native
      def pull(key: js.Array[String], defaultValue: js.Any): js.Any = js.native
      
      /**
        * Add a new item to storage (even if it already exists)
        *
        * @param  keyValuePairs    Key value object
        */
      def put(keyValuePairs: js.Object): ILockerService | Boolean = js.native
      /**
        * Add a new item to storage (even if it already exists)
        *
        * @param  key    The key to add
        * @param  putFunction    The default to pass to function if doesn't already exist
        * @param  value  The value to add
        */
      def put(key: String, putFunction: ILockerServicePutFunction, value: js.Any): ILockerService | Boolean = js.native
      /**
        * Add a new item to storage (even if it already exists)
        *
        * @param  key    The key to add
        * @param  value  The value to add
        */
      def put(key: String, value: js.Any): ILockerService | Boolean = js.native
      /**
        * Add a new item to storage (even if it already exists)
        *
        * @param  putFunction    The default to pass to function if doesn't already exist
        */
      def put(putFunction: Function): ILockerService | Boolean = js.native
      
      /**
        * Check browser support
        *
        * @see github.com/Modernizr/Modernizr/blob/master/feature-detects/storage/localstorage.js#L38-L47
        *
        * @param  driver  The driver to check support with
        */
      def supported(driver: String): Boolean = js.native
      
      /**
        * Unbind a storage key from a $scope property
        *
        * @param  $scope  The angular $scope object
        * @param  key     The key to remove from bindings
        */
      def unbind(scope: IScope, property: String): ILockerService = js.native
    }
    
    type ILockerServicePutFunction = js.Function1[/* current */ js.Any, js.Any]
    
    trait ILockerSettings extends StObject {
      
      var driver: js.UndefOr[String] = js.undefined
      
      var eventsEnabled: js.UndefOr[Boolean] = js.undefined
      
      var extend: js.UndefOr[js.Object] = js.undefined
      
      var namespace: js.UndefOr[String | Boolean] = js.undefined
      
      var separator: js.UndefOr[String] = js.undefined
    }
    object ILockerSettings {
      
      inline def apply(): ILockerSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ILockerSettings]
      }
      
      extension [Self <: ILockerSettings](x: Self) {
        
        inline def setDriver(value: String): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
        
        inline def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
        
        inline def setEventsEnabled(value: Boolean): Self = StObject.set(x, "eventsEnabled", value.asInstanceOf[js.Any])
        
        inline def setEventsEnabledUndefined: Self = StObject.set(x, "eventsEnabled", js.undefined)
        
        inline def setExtend(value: js.Object): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
        
        inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
        
        inline def setNamespace(value: String | Boolean): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
        
        inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
        
        inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      }
    }
  }
}
