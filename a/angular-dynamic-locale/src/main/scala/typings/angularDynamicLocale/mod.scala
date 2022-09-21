package typings.angularDynamicLocale

import typings.angular.mod.ILocaleService
import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object tmh {
    
    trait IDynamicLocale extends StObject {
      
      def get(): String
      
      def set(locale: String): IPromise[ILocaleService]
    }
    object IDynamicLocale {
      
      inline def apply(get: () => String, set: String => IPromise[ILocaleService]): IDynamicLocale = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
        __obj.asInstanceOf[IDynamicLocale]
      }
      
      extension [Self <: IDynamicLocale](x: Self) {
        
        inline def setGet(value: () => String): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
        
        inline def setSet(value: String => IPromise[ILocaleService]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      }
    }
    
    trait IDynamicLocaleProvider extends StObject {
      
      def defaultLocale(locale: String): Unit
      
      def localeLocationPattern(locationPattern: String): Unit
    }
    object IDynamicLocaleProvider {
      
      inline def apply(defaultLocale: String => Unit, localeLocationPattern: String => Unit): IDynamicLocaleProvider = {
        val __obj = js.Dynamic.literal(defaultLocale = js.Any.fromFunction1(defaultLocale), localeLocationPattern = js.Any.fromFunction1(localeLocationPattern))
        __obj.asInstanceOf[IDynamicLocaleProvider]
      }
      
      extension [Self <: IDynamicLocaleProvider](x: Self) {
        
        inline def setDefaultLocale(value: String => Unit): Self = StObject.set(x, "defaultLocale", js.Any.fromFunction1(value))
        
        inline def setLocaleLocationPattern(value: String => Unit): Self = StObject.set(x, "localeLocationPattern", js.Any.fromFunction1(value))
      }
    }
  }
}
