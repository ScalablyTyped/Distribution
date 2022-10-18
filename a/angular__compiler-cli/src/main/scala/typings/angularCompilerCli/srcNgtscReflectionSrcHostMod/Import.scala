package typings.angularCompilerCli.srcNgtscReflectionSrcHostMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Import extends StObject {
  
  /**
    * The module from which the symbol was imported.
    *
    * This could either be an absolute module name (@angular/core for example) or a relative path.
    */
  var from: String
  
  /**
    * The name of the imported symbol under which it was exported (not imported).
    */
  var name: String
}
object Import {
  
  inline def apply(from: String, name: String): Import = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Import]
  }
  
  extension [Self <: Import](x: Self) {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
