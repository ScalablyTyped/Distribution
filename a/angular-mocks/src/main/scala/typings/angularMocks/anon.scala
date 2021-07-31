package typings.angularMocks

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(modules: js.Any*): js.Any = js.native
    
    def sharedInjector(): Unit = js.native
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    @JSName("$scope")
    var $scope: js.UndefOr[IScope] = js.undefined
  }
  object Dictkey {
    
    @scala.inline
    def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$scope(value: IScope): Self = StObject.set(x, "$scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$scopeUndefined: Self = StObject.set(x, "$scope", js.undefined)
    }
  }
}
