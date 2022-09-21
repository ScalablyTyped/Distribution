package typings.assertrc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("assertrc", "base")
  @js.native
  open class base () extends StObject {
    
    def check(value: Any, rule: String, sample: Any): Boolean = js.native
    
    def equal(value: Any, sample: Any): Boolean = js.native
    
    def equalJson(value: Any, sample: Any): Boolean = js.native
    
    def equalType(value: Any, sample: Any): Boolean = js.native
    
    def greater(value: Any, sample: Any): Boolean = js.native
    
    def length(value: Any, sample: Double): Boolean = js.native
    
    def less(value: Any, sample: Any): Boolean = js.native
    
    def notEqual(value: Any, sample: Any): Boolean = js.native
    
    def tests(testIn: js.Object): Boolean = js.native
    
    def valueEqual(value: Any, sample: String): Boolean = js.native
    
    def valueEqualType(value: Any, sample: String): Boolean = js.native
    
    def valueNotEqual(value: Any, sample: String): Boolean = js.native
    
    def valueNotEqualType(value: Any, sample: String): Boolean = js.native
  }
}
