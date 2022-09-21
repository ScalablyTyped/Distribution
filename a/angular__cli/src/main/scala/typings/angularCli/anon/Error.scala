package typings.angularCli.anon

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var error: Boolean
  
  var files: Set[String]
  
  def unsubscribe(): Unit
}
object Error {
  
  inline def apply(error: Boolean, files: Set[String], unsubscribe: () => Unit): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: Set[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
  }
}
