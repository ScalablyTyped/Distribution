package typings.angularLocalStorage

import typings.angular.mod.IScope
import typings.angular.mod.IServiceProvider
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type ICookie = typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ICookie
  
  type ILocalStorageService = typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageService
  
  type ILocalStorageServiceProvider = typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider
  
  /* augmented module */
  object angularAugmentingMod {
    
    object local {
      
      object storage {
        
        // tslint:disable-next-line interface-name
        @js.native
        trait ICookie extends StObject {
          
          /**
            * Remove all data for this app from cookie.
            */
          def clearAll(): js.Any = js.native
          
          /**
            * Directly get a value from a cookie.
            */
          def get(key: String): String = js.native
          
          /**
            * Checks if cookies are enabled in the browser.
            * Returns: Boolean
            */
          val isSupported: Boolean = js.native
          
          /**
            * Remove directly value from a cookie.
            */
          def remove(key: String): Boolean = js.native
          
          /**
            * Directly adds a value to cookies.
            * Note: Typically used as a fallback if local storage is not supported.
            */
          def set(key: String, `val`: String): Boolean = js.native
          def set(key: String, `val`: String, daysToExpiry: Double): Boolean = js.native
        }
        
        // tslint:disable-next-line interface-name
        @js.native
        trait ILocalStorageService extends StObject {
          
          /**
            * Bind $scope key to localStorageService.
            * Usage: localStorageService.bind(scope, property, value[optional], key[optional])
            * Returns: deregistration function for this listener.
            */
          def bind(scope: IScope, property: String): js.Function0[Unit] = js.native
          def bind(
            scope: IScope,
            property: String,
            value: js.UndefOr[scala.Nothing],
            key: js.UndefOr[scala.Nothing],
            storageType: StorageType
          ): js.Function0[Unit] = js.native
          def bind(scope: IScope, property: String, value: js.UndefOr[scala.Nothing], key: String): js.Function0[Unit] = js.native
          def bind(
            scope: IScope,
            property: String,
            value: js.UndefOr[scala.Nothing],
            key: String,
            storageType: StorageType
          ): js.Function0[Unit] = js.native
          def bind(scope: IScope, property: String, value: js.Any): js.Function0[Unit] = js.native
          def bind(
            scope: IScope,
            property: String,
            value: js.Any,
            key: js.UndefOr[scala.Nothing],
            storageType: StorageType
          ): js.Function0[Unit] = js.native
          def bind(scope: IScope, property: String, value: js.Any, key: String): js.Function0[Unit] = js.native
          def bind(scope: IScope, property: String, value: js.Any, key: String, storageType: StorageType): js.Function0[Unit] = js.native
          
          /**
            * Change the local storage prefix during execution
            */
          def changePrefix(newPrefix: String): Unit = js.native
          
          /**
            * Remove all data for this app from local storage.
            * If local storage is not supported, use cookies instead.
            * Note: Optionally takes a regular expression string and removes matching.
            */
          def clearAll(): Boolean = js.native
          def clearAll(regularExpression: js.UndefOr[scala.Nothing], storageType: StorageType): Boolean = js.native
          def clearAll(regularExpression: RegExp): Boolean = js.native
          def clearAll(regularExpression: RegExp, storageType: StorageType): Boolean = js.native
          
          /**
            * Deal with browser's cookies directly.
            */
          var cookie: typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ICookie = js.native
          
          /**
            * Return the derive key
            */
          def deriveKey(key: String): String = js.native
          
          /**
            * Directly get a value from local storage.
            * If local storage is not supported, use cookies instead.
            * Returns: value from local storage
            */
          def get(key: String): js.Any = js.native
          def get(key: String, storageType: StorageType): js.Any = js.native
          
          /**
            * Returns: String
            */
          def getStorageType(): String = js.native
          
          /**
            * Checks if the browser support the current storage type(e.g: localStorage, sessionStorage).
            * Returns: Boolean
            */
          var isSupported: Boolean = js.native
          
          /**
            * Return array of keys for local storage, ignore keys that not owned.
            * Returns: value from local storage
            */
          def keys(): js.Array[String] = js.native
          def keys(storageType: StorageType): js.Array[String] = js.native
          
          /**
            * Return localStorageService.length, ignore keys that not owned.
            */
          def length(): Double = js.native
          def length(storageType: StorageType): Double = js.native
          
          /**
            * Remove a list of items from the local storage by their given keys.
            * The last item in the variable argument list can optionally be the StorageType.
            * Which specifies whether to remove from the session storage or the local storage.
            * If the last argument is not a valid storage type it is considered to be a key,
            * and localStorage is used by default .
            * If local storage is not supported, use cookies instead.
            * Returns: Boolean
            * @param key
            */
          def remove(args: String*): Boolean = js.native
          
          /**
            * Directly adds a value to local storage.
            * If local storage is not supported, use cookies instead.
            */
          def set(key: String, value: js.Any): Boolean = js.native
          def set(key: String, value: js.Any, storageType: StorageType): Boolean = js.native
        }
        
        // tslint:disable-next-line interface-name
        @js.native
        trait ILocalStorageServiceProvider extends IServiceProvider {
          
          /**
            * If localStorage is not supported, the library will default to cookies instead. This behavior can be disabled
            * default: true
            */
          def setDefaultToCookie(shouldDefault: Boolean): typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider = js.native
          
          /**
            * Send signals for each of the following actions:
            * @param setItem default: true
            * @param removeItem default: false
            */
          def setNotify(setItem: Boolean, removeItem: Boolean): typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider = js.native
          
          /**
            * Setter for the prefix
            * You should set a prefix to avoid overwriting any local storage variables from the rest of your app
            * e.g. localStorageServiceProvider.setPrefix('youAppName');
            * With provider you can use config as this:
            * myApp.config(function (localStorageServiceProvider) {
            *  localStorageServiceProvider.prefix = 'yourAppName';
            * });
            * @param prefix default: ls.<your-key>
            */
          def setPrefix(prefix: String): typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider = js.native
          
          /**
            * Setter for cookie config
            * @param exp number of days before cookies expire (0 = does not expire). default: 30
            * @param path the web path the cookie represents. default: '/'
            * @param secure to store cookies as secure. default: false
            */
          def setStorageCookie(exp: Double, path: String, secure: Boolean): typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider = js.native
          
          /**
            * Set the cookie domain, since this runs inside a the config() block,
            * only providers and constants can be injected.
            * As a result, $location service can't be used here,
            * use a hardcoded string or window.location.
            * No default value
            */
          def setStorageCookieDomain(domain: String): typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider = js.native
          
          /**
            * Setter for the storageType
            * localstorage or sessionStorage. default: localStorage
            */
          def setStorageType(storageType: String): typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider = js.native
        }
        object ILocalStorageServiceProvider {
          
          @scala.inline
          def apply(
            $get: js.Any,
            setDefaultToCookie: Boolean => typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider,
            setNotify: (Boolean, Boolean) => typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider,
            setPrefix: String => typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider,
            setStorageCookie: (Double, String, Boolean) => typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider,
            setStorageCookieDomain: String => typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider,
            setStorageType: String => typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider
          ): typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider = {
            val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], setDefaultToCookie = js.Any.fromFunction1(setDefaultToCookie), setNotify = js.Any.fromFunction2(setNotify), setPrefix = js.Any.fromFunction1(setPrefix), setStorageCookie = js.Any.fromFunction3(setStorageCookie), setStorageCookieDomain = js.Any.fromFunction1(setStorageCookieDomain), setStorageType = js.Any.fromFunction1(setStorageType))
            __obj.asInstanceOf[typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider]
          }
          
          @scala.inline
          implicit class ILocalStorageServiceProviderMutableBuilder[Self <: typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setSetDefaultToCookie(
              value: Boolean => typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider
            ): Self = StObject.set(x, "setDefaultToCookie", js.Any.fromFunction1(value))
            
            @scala.inline
            def setSetNotify(
              value: (Boolean, Boolean) => typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider
            ): Self = StObject.set(x, "setNotify", js.Any.fromFunction2(value))
            
            @scala.inline
            def setSetPrefix(
              value: String => typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider
            ): Self = StObject.set(x, "setPrefix", js.Any.fromFunction1(value))
            
            @scala.inline
            def setSetStorageCookie(
              value: (Double, String, Boolean) => typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider
            ): Self = StObject.set(x, "setStorageCookie", js.Any.fromFunction3(value))
            
            @scala.inline
            def setSetStorageCookieDomain(
              value: String => typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider
            ): Self = StObject.set(x, "setStorageCookieDomain", js.Any.fromFunction1(value))
            
            @scala.inline
            def setSetStorageType(
              value: String => typings.angularLocalStorage.mod.angularAugmentingMod.local.storage.ILocalStorageServiceProvider
            ): Self = StObject.set(x, "setStorageType", js.Any.fromFunction1(value))
          }
        }
        
        /* Rewritten from type alias, can be one of: 
          - typings.angularLocalStorage.angularLocalStorageStrings.localStorage
          - typings.angularLocalStorage.angularLocalStorageStrings.sessionStorage
        */
        trait StorageType extends StObject
        object StorageType {
          
          @scala.inline
          def localStorage: typings.angularLocalStorage.angularLocalStorageStrings.localStorage = "localStorage".asInstanceOf[typings.angularLocalStorage.angularLocalStorageStrings.localStorage]
          
          @scala.inline
          def sessionStorage: typings.angularLocalStorage.angularLocalStorageStrings.sessionStorage = "sessionStorage".asInstanceOf[typings.angularLocalStorage.angularLocalStorageStrings.sessionStorage]
        }
      }
    }
  }
}
