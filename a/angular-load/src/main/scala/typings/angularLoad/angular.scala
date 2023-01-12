package typings.angularLoad

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angular {
  
  object load {
    
    trait IAngularLoadService extends StObject {
      
      def loadCSS(url: String): IPromise[Any]
      
      def loadScript(url: String): IPromise[Any]
    }
    object IAngularLoadService {
      
      inline def apply(loadCSS: String => IPromise[Any], loadScript: String => IPromise[Any]): IAngularLoadService = {
        val __obj = js.Dynamic.literal(loadCSS = js.Any.fromFunction1(loadCSS), loadScript = js.Any.fromFunction1(loadScript))
        __obj.asInstanceOf[IAngularLoadService]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IAngularLoadService] (val x: Self) extends AnyVal {
        
        inline def setLoadCSS(value: String => IPromise[Any]): Self = StObject.set(x, "loadCSS", js.Any.fromFunction1(value))
        
        inline def setLoadScript(value: String => IPromise[Any]): Self = StObject.set(x, "loadScript", js.Any.fromFunction1(value))
      }
    }
  }
}
