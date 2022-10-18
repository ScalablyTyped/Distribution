package typings.angularCompilerCli.srcNgtscIndexerSrcApiMod

import typings.angularCompiler.mod.ParseSourceFile
import typings.angularCompilerCli.anon.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexedComponent extends StObject {
  
  var errors: js.Array[js.Error]
  
  var file: ParseSourceFile
  
  var name: String
  
  var selector: String | Null
  
  var template: File
}
object IndexedComponent {
  
  inline def apply(errors: js.Array[js.Error], file: ParseSourceFile, name: String, template: File): IndexedComponent = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], selector = null)
    __obj.asInstanceOf[IndexedComponent]
  }
  
  extension [Self <: IndexedComponent](x: Self) {
    
    inline def setErrors(value: js.Array[js.Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: js.Error*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setFile(value: ParseSourceFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorNull: Self = StObject.set(x, "selector", null)
    
    inline def setTemplate(value: File): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
