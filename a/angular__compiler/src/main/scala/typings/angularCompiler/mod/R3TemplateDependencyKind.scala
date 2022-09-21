package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait R3TemplateDependencyKind extends StObject
@JSImport("@angular/compiler", "R3TemplateDependencyKind")
@js.native
object R3TemplateDependencyKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[R3TemplateDependencyKind & Double] = js.native
  
  @js.native
  sealed trait Directive
    extends StObject
       with R3TemplateDependencyKind
  /* 0 */ val Directive: typings.angularCompiler.mod.R3TemplateDependencyKind.Directive & Double = js.native
  
  @js.native
  sealed trait NgModule
    extends StObject
       with R3TemplateDependencyKind
  /* 2 */ val NgModule: typings.angularCompiler.mod.R3TemplateDependencyKind.NgModule & Double = js.native
  
  @js.native
  sealed trait Pipe
    extends StObject
       with R3TemplateDependencyKind
  /* 1 */ val Pipe: typings.angularCompiler.mod.R3TemplateDependencyKind.Pipe & Double = js.native
}
