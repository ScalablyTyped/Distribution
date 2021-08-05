package typings.aframe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCache extends StObject {
  
  def add(key: String, file: js.Any): Unit
  
  def clear(): Unit
  
  var enabled: Boolean
  
  var files: js.Any
  
  def get(key: String): js.Any
  
  def remove(key: String): Unit
}
object TypeofCache {
  
  inline def apply(
    add: (String, js.Any) => Unit,
    clear: () => Unit,
    enabled: Boolean,
    files: js.Any,
    get: String => js.Any,
    remove: String => Unit
  ): TypeofCache = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), enabled = enabled.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[TypeofCache]
  }
  
  extension [Self <: TypeofCache](x: Self) {
    
    inline def setAdd(value: (String, js.Any) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: js.Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
