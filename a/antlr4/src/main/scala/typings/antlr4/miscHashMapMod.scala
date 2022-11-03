package typings.antlr4

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscHashMapMod {
  
  @JSImport("antlr4/misc/HashMap", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with HashMap {
    def this(hashFunction: js.Function1[/* a */ Any, Double]) = this()
    def this(
      hashFunction: js.Function1[/* a */ Any, Double],
      equalsFunction: js.Function2[/* a */ Any, /* b */ Any, Boolean]
    ) = this()
    def this(hashFunction: Unit, equalsFunction: js.Function2[/* a */ Any, /* b */ Any, Boolean]) = this()
  }
  
  @js.native
  trait HashMap extends StObject {
    
    def containsKey(key: String): Boolean = js.native
    
    val data: Record[String, Any] = js.native
    
    def entries(): js.Array[Any] = js.native
    
    def equalsFunction(a: Any, b: Any): Boolean = js.native
    
    def get(key: String): Any = js.native
    
    def getKeys(): js.Array[Any] = js.native
    
    def getValues(): js.Array[Any] = js.native
    
    def hashFunction(a: Any): Double = js.native
    
    def length: Double = js.native
    
    def set(key: String, value: Any): Any = js.native
  }
}
