package typings.angularlocalstorage

import typings.angular.mod.IScope
import typings.angularlocalstorage.anon.DefaultValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("angular", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object localStorage extends js.Object {
    
    @js.native
    trait ILocalStorageService extends js.Object {
      
      def bind($scope: IScope, key: String): js.Any = js.native
      def bind($scope: IScope, key: String, opts: DefaultValue): js.Any = js.native
      
      def clearAll(): Unit = js.native
      
      def get(key: String): js.Any = js.native
      
      def remove(key: String): Boolean = js.native
      
      def set(key: String, value: js.Any): js.Any = js.native
      
      def unbind($scope: IScope, key: String): Unit = js.native
      def unbind($scope: IScope, key: String, storeName: String): Unit = js.native
    }
  }
}
