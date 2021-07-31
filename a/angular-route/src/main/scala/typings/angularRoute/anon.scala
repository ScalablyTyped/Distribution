package typings.angularRoute

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictindex
    extends StObject
       with /* index */ StringDictionary[js.Any] {
    
    @JSName("$scope")
    var $scope: IScope
    
    @JSName("$template")
    var $template: String
  }
  object Dictindex {
    
    @scala.inline
    def apply($scope: IScope, $template: String): Dictindex = {
      val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], $template = $template.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictindex]
    }
    
    @scala.inline
    implicit class DictindexMutableBuilder[Self <: Dictindex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$scope(value: IScope): Self = StObject.set(x, "$scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$template(value: String): Self = StObject.set(x, "$template", value.asInstanceOf[js.Any])
    }
  }
}
