package typings.angularCompilerCli.anon

import typings.typescript.mod.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var name: Identifier
}
object Name {
  
  inline def apply(name: Identifier): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    inline def setName(value: Identifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
