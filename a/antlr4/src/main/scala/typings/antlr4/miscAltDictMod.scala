package typings.antlr4

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscAltDictMod {
  
  @JSImport("antlr4/misc/AltDict", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with AltDict {
    
    /* CompleteClass */
    override val data: Record[String, Any] = js.native
    
    /* CompleteClass */
    override def get(key: String): Any = js.native
    
    /* CompleteClass */
    override def set(key: String, value: Any): Unit = js.native
    
    /* CompleteClass */
    override def values(): js.Array[Any] = js.native
  }
  
  trait AltDict extends StObject {
    
    val data: Record[String, Any]
    
    def get(key: String): Any
    
    def set(key: String, value: Any): Unit
    
    def values(): js.Array[Any]
  }
  object AltDict {
    
    inline def apply(
      data: Record[String, Any],
      get: String => Any,
      set: (String, Any) => Unit,
      values: () => js.Array[Any]
    ): AltDict = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set), values = js.Any.fromFunction0(values))
      __obj.asInstanceOf[AltDict]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AltDict] (val x: Self) extends AnyVal {
      
      inline def setData(value: Record[String, Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setValues(value: () => js.Array[Any]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    }
  }
}
