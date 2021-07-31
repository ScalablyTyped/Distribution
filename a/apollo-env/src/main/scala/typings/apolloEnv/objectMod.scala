package typings.apolloEnv

import typings.apolloEnv.arrayMod.global.Array
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectMod {
  
  object global {
    
    trait ObjectConstructor extends StObject {
      
      def fromEntries[K /* <: String */, V](map: Array[js.Tuple2[K, V]]): Record[K, V]
    }
    object ObjectConstructor {
      
      @scala.inline
      def apply(fromEntries: Array[js.Tuple2[js.Any, js.Any]] => Record[js.Any, js.Any]): ObjectConstructor = {
        val __obj = js.Dynamic.literal(fromEntries = js.Any.fromFunction1(fromEntries))
        __obj.asInstanceOf[ObjectConstructor]
      }
      
      @scala.inline
      implicit class ObjectConstructorMutableBuilder[Self <: ObjectConstructor] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFromEntries(value: Array[js.Tuple2[js.Any, js.Any]] => Record[js.Any, js.Any]): Self = StObject.set(x, "fromEntries", js.Any.fromFunction1(value))
      }
    }
  }
}
