package typings.angularCompiler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceNameToFileName extends StObject {
  
  def resourceNameToFileName(resourceName: String, containingFileName: String): String | Null
}
object ResourceNameToFileName {
  
  @scala.inline
  def apply(resourceNameToFileName: (String, String) => String | Null): ResourceNameToFileName = {
    val __obj = js.Dynamic.literal(resourceNameToFileName = js.Any.fromFunction2(resourceNameToFileName))
    __obj.asInstanceOf[ResourceNameToFileName]
  }
  
  @scala.inline
  implicit class ResourceNameToFileNameMutableBuilder[Self <: ResourceNameToFileName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceNameToFileName(value: (String, String) => String | Null): Self = StObject.set(x, "resourceNameToFileName", js.Any.fromFunction2(value))
  }
}
