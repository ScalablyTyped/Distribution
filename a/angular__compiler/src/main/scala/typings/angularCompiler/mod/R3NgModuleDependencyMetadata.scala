package typings.angularCompiler.mod

import typings.angularCompiler.mod.R3TemplateDependencyKind.NgModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3NgModuleDependencyMetadata
  extends StObject
     with R3TemplateDependency
     with R3TemplateDependencyMetadata {
  
  @JSName("kind")
  var kind_R3NgModuleDependencyMetadata: NgModule
}
object R3NgModuleDependencyMetadata {
  
  inline def apply(kind: NgModule, `type`: Expression): R3NgModuleDependencyMetadata = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3NgModuleDependencyMetadata]
  }
  
  extension [Self <: R3NgModuleDependencyMetadata](x: Self) {
    
    inline def setKind(value: NgModule): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
