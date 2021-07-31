package typings.angularLocalforage

import typings.angular.mod.IPromise
import typings.angular.mod.IScope
import typings.angularLocalforage.anon.DefaultValue
import typings.localforage.LocalForageDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object localForage {
    
    trait ILocalForageProvider extends StObject {
      
      def config(config: LocalForageConfig): Unit
      
      def setNotify(onItemSet: Boolean, onItemRemove: Boolean): Unit
    }
    object ILocalForageProvider {
      
      @scala.inline
      def apply(config: LocalForageConfig => Unit, setNotify: (Boolean, Boolean) => Unit): ILocalForageProvider = {
        val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config), setNotify = js.Any.fromFunction2(setNotify))
        __obj.asInstanceOf[ILocalForageProvider]
      }
      
      @scala.inline
      implicit class ILocalForageProviderMutableBuilder[Self <: ILocalForageProvider] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConfig(value: LocalForageConfig => Unit): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetNotify(value: (Boolean, Boolean) => Unit): Self = StObject.set(x, "setNotify", js.Any.fromFunction2(value))
      }
    }
    
    @js.native
    trait ILocalForageService extends StObject {
      
      def bind($scope: IScope, config: DefaultValue): IPromise[js.Any] = js.native
      def bind($scope: IScope, key: String): IPromise[js.Any] = js.native
      
      def clear(): IPromise[Unit] = js.native
      
      def createInstance(config: LocalForageConfig): ILocalForageService = js.native
      
      def driver(): LocalForageDriver = js.native
      
      def getItem(key: String): IPromise[js.Any] = js.native
      def getItem(keys: js.Array[String]): IPromise[js.Array[js.Any]] = js.native
      
      def instance(name: String): ILocalForageService = js.native
      
      def iterate[T](iteratorCallback: js.Function2[/* value */ String | Double, /* key */ String, T]): IPromise[T] = js.native
      
      def key(n: Double): IPromise[String] = js.native
      
      def keys(): IPromise[String] = js.native
      
      def length(): IPromise[Double] = js.native
      
      def pull(key: String): IPromise[js.Any] = js.native
      def pull(keys: js.Array[String]): IPromise[js.Array[js.Any]] = js.native
      
      def removeItem(key: String): IPromise[Unit] = js.native
      def removeItem(key: js.Array[String]): IPromise[Unit] = js.native
      
      def setDriver(name: String): IPromise[Unit] = js.native
      def setDriver(name: js.Array[String]): IPromise[Unit] = js.native
      
      def setItem(key: String, value: js.Any): IPromise[Unit] = js.native
      def setItem(keys: js.Array[String], values: js.Array[js.Any]): IPromise[Unit] = js.native
      
      def unbind($scope: IScope, key: String): Unit = js.native
      def unbind($scope: IScope, key: String, scopeKey: String): Unit = js.native
    }
    
    trait LocalForageConfig extends StObject {
      
      var description: js.UndefOr[String] = js.undefined
      
      var driver: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String | Double] = js.undefined
      
      var storeName: js.UndefOr[String] = js.undefined
      
      var version: js.UndefOr[Double] = js.undefined
    }
    object LocalForageConfig {
      
      @scala.inline
      def apply(): LocalForageConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LocalForageConfig]
      }
      
      @scala.inline
      implicit class LocalForageConfigMutableBuilder[Self <: LocalForageConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setDriver(value: String): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
        
        @scala.inline
        def setName(value: String | Double): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStoreNameUndefined: Self = StObject.set(x, "storeName", js.undefined)
        
        @scala.inline
        def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
  }
}
