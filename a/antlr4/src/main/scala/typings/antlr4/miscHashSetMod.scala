package typings.antlr4

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscHashSetMod {
  
  @JSImport("antlr4/misc/HashSet", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with HashSet {
    def this(hashFunction: js.Function1[/* a */ Any, Double]) = this()
    def this(
      hashFunction: js.Function1[/* a */ Any, Double],
      equalsFunction: js.Function2[/* a */ Any, /* b */ Any, Boolean]
    ) = this()
    def this(hashFunction: Unit, equalsFunction: js.Function2[/* a */ Any, /* b */ Any, Boolean]) = this()
  }
  
  @js.native
  trait HashSet extends StObject {
    
    def add(value: Any): Any = js.native
    
    val data: Record[String, js.Array[Any]] = js.native
    
    def get(value: Any): Any = js.native
    
    def has(value: Any): Boolean = js.native
    
    def length: Double = js.native
    
    def values(): js.Array[Any] = js.native
  }
}
