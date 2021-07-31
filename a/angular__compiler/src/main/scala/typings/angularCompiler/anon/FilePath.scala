package typings.angularCompiler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePath extends StObject {
  
  var filePath: String
  
  var fn: js.Any
  
  var name: String
}
object FilePath {
  
  @scala.inline
  def apply(filePath: String, fn: js.Any, name: String): FilePath = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePath]
  }
  
  @scala.inline
  implicit class FilePathMutableBuilder[Self <: FilePath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFn(value: js.Any): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
