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
      
      @scala.inline
      def apply(get: () => String, set: String => IPromise[ILocaleService]): IDynamicLocale = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
        __obj.asInstanceOf[IDynamicLocale]
      }
      
      @scala.inline
      implicit class IDynamicLocaleMutableBuilder[Self <: IDynamicLocale] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGet(value: () => String): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSet(value: String => IPromise[ILocaleService]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      }
    }
  }
}
