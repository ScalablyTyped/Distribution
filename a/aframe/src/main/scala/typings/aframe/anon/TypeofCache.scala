package typings.aframe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCache extends StObject {
  
  def add(key: String, file: js.Any): Unit = js.native
  
  def clear(): Unit = js.native
  
  var enabled: Boolean = js.native
  
  var files: js.Any = js.native
  
  def get(key: String): js.Any = js.native
  
  def remove(key: String): Unit = js.native
}
object TypeofCache {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class TypeofCacheMutableBuilder[Self <: TypeofCache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (String, js.Any) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiles(value: js.Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
