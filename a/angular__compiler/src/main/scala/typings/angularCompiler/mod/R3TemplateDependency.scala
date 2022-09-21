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
  
  extension [Self <: R3TemplateDependency](x: Self) {
    
    inline def setKind(value: R3TemplateDependencyKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setType(value: Expression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
