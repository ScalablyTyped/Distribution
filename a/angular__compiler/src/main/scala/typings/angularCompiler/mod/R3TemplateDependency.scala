package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3TemplateDependency extends StObject {
  
  var kind: R3TemplateDependencyKind
  
  /**
    * The type of the dependency as an expression.
    */
  var `type`: Expression
}
object R3TemplateDependency {
  
  inline def apply(kind: R3TemplateDependencyKind, `type`: Expression): R3TemplateDependency = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3TemplateDependency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R3TemplateDependency] (val x: Self) extends AnyVal {
    
    inline def setKind(value: R3TemplateDependencyKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setType(value: Expression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
