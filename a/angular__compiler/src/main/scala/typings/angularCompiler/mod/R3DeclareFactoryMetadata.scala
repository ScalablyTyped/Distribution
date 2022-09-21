package typings.angularCompiler.mod

import typings.angularCompiler.angularCompilerStrings.invalid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclareFactoryMetadata
  extends StObject
     with R3PartialDeclaration {
  
  /**
    * A collection of dependencies that this factory relies upon.
    *
    * If this is `null`, then the type's constructor is nonexistent and will be inherited from an
    * ancestor of the type.
    *
    * If this is `'invalid'`, then one or more of the parameters wasn't resolvable and any attempt to
    * use these deps will result in a runtime error.
    */
  var deps: js.Array[R3DeclareDependencyMetadata] | invalid | Null
  
  /**
    * Type of the target being created by the factory.
    */
  var target: FactoryTarget2
}
object R3DeclareFactoryMetadata {
  
  inline def apply(
    minVersion: String,
    ngImport: Expression,
    target: FactoryTarget2,
    `type`: Expression,
    version: String
  ): R3DeclareFactoryMetadata = {
    val __obj = js.Dynamic.literal(minVersion = minVersion.asInstanceOf[js.Any], ngImport = ngImport.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], deps = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclareFactoryMetadata]
  }
  
  extension [Self <: R3DeclareFactoryMetadata](x: Self) {
    
    inline def setDeps(value: js.Array[R3DeclareDependencyMetadata] | invalid): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsNull: Self = StObject.set(x, "deps", null)
    
    inline def setDepsVarargs(value: R3DeclareDependencyMetadata*): Self = StObject.set(x, "deps", js.Array(value*))
    
    inline def setTarget(value: FactoryTarget2): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
