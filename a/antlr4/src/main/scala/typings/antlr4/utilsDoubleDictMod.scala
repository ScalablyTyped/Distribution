package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsDoubleDictMod {
  
  @JSImport("antlr4/utils/DoubleDict", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DoubleDict {
    def this(defaultMapCtor: Any) = this()
    
    /* CompleteClass */
    override val cacheMap: Any = js.native
    
    /* CompleteClass */
    override val defaultMapCtor: Any = js.native
    
    /* CompleteClass */
    override def get(a: Any, b: Any): Any = js.native
    
    /* CompleteClass */
    override def set(a: Any, b: Any, o: Any): Unit = js.native
  }
  
  trait DoubleDict extends StObject {
    
    val cacheMap: Any
    
    val defaultMapCtor: Any
    
    def get(a: Any, b: Any): Any
    
    def set(a: Any, b: Any, o: Any): Unit
  }
  object DoubleDict {
    
    inline def apply(cacheMap: Any, defaultMapCtor: Any, get: (Any, Any) => Any, set: (Any, Any, Any) => Unit): DoubleDict = {
      val __obj = js.Dynamic.literal(cacheMap = cacheMap.asInstanceOf[js.Any], defaultMapCtor = defaultMapCtor.asInstanceOf[js.Any], get = js.Any.fromFunction2(get), set = js.Any.fromFunction3(set))
      __obj.asInstanceOf[DoubleDict]
    }
    
    extension [Self <: DoubleDict](x: Self) {
      
      inline def setCacheMap(value: Any): Self = StObject.set(x, "cacheMap", value.asInstanceOf[js.Any])
      
      inline def setDefaultMapCtor(value: Any): Self = StObject.set(x, "defaultMapCtor", value.asInstanceOf[js.Any])
      
      inline def setGet(value: (Any, Any) => Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setSet(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
    }
  }
}
