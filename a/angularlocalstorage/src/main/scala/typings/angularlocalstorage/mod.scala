package typings.angularlocalstorage

import typings.angular.mod.IScope
import typings.angularlocalstorage.anon.DefaultValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object localStorage {
    
    @js.native
    trait ILocalStorageService extends StObject {
      
      def bind($scope: IScope, key: String): Any = js.native
      def bind($scope: IScope, key: String, opts: DefaultValue): Any = js.native
      
      def clearAll(): Unit = js.native
      
      def get(key: String): Any = js.native
      
      def remove(key: String): Boolean = js.native
      
      def set(key: String, value: Any): Any = js.native
      
      def unbind($scope: IScope, key: String): Unit = js.native
      def unbind($scope: IScope, key: String, storeName: String): Unit = js.native
    }
  }
}
