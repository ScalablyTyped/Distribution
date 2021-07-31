package typings.angularLoad

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angular {
  
  object load {
    
    trait IAngularLoadService extends StObject {
      
      def loadCSS(url: String): IPromise[js.Any]
      
      def loadScript(url: String): IPromise[js.Any]
    }
    object IAngularLoadService {
      
      @scala.inline
      def apply(loadCSS: String => IPromise[js.Any], loadScript: String => IPromise[js.Any]): IAngularLoadService = {
        val __obj = js.Dynamic.literal(loadCSS = js.Any.fromFunction1(loadCSS), loadScript = js.Any.fromFunction1(loadScript))
        __obj.asInstanceOf[IAngularLoadService]
      }
      
      @scala.inline
      implicit class IAngularLoadServiceMutableBuilder[Self <: IAngularLoadService] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLoadCSS(value: String => IPromise[js.Any]): Self = StObject.set(x, "loadCSS", js.Any.fromFunction1(value))
        
        @scala.inline
        def setLoadScript(value: String => IPromise[js.Any]): Self = StObject.set(x, "loadScript", js.Any.fromFunction1(value))
      }
    }
  }
}
