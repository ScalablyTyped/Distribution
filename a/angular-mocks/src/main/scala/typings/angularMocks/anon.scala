package typings.angularMocks

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(modules: Any*): Any = js.native
    
    def sharedInjector(): Unit = js.native
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    @JSName("$scope")
    var $scope: js.UndefOr[IScope] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      inline def set$scope(value: IScope): Self = StObject.set(x, "$scope", value.asInstanceOf[js.Any])
      
      inline def set$scopeUndefined: Self = StObject.set(x, "$scope", js.undefined)
    }
  }
}
