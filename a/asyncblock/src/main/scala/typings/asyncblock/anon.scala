package typings.asyncblock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Key extends StObject {
    
    var key: js.Any = js.native
    
    var runtime: Double = js.native
  }
  object Key {
    
    @scala.inline
    def apply(key: js.Any, runtime: Double): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntime(value: Double): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    }
  }
}
