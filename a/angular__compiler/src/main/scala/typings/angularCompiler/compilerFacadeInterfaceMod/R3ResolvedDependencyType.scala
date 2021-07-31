package typings.angularCompiler.compilerFacadeInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait R3ResolvedDependencyType extends StObject
@JSImport("@angular/compiler/src/compiler_facade_interface", "R3ResolvedDependencyType")
@js.native
object R3ResolvedDependencyType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[R3ResolvedDependencyType & Double] = js.native
  
  @js.native
  sealed trait Attribute
    extends StObject
       with R3ResolvedDependencyType
  /* 1 */ val Attribute: typings.angularCompiler.compilerFacadeInterfaceMod.R3ResolvedDependencyType.Attribute & Double = js.native
  
  @js.native
  sealed trait ChangeDetectorRef
    extends StObject
       with R3ResolvedDependencyType
  /* 2 */ val ChangeDetectorRef: typings.angularCompiler.compilerFacadeInterfaceMod.R3ResolvedDependencyType.ChangeDetectorRef & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with R3ResolvedDependencyType
  /* 3 */ val Invalid: typings.angularCompiler.compilerFacadeInterfaceMod.R3ResolvedDependencyType.Invalid & Double = js.native
  
  @js.native
  sealed trait Token
    extends StObject
       with R3ResolvedDependencyType
  /* 0 */ val Token: typings.angularCompiler.compilerFacadeInterfaceMod.R3ResolvedDependencyType.Token & Double = js.native
}
