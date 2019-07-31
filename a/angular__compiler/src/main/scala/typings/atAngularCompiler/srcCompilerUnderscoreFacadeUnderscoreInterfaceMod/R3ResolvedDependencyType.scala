package typings.atAngularCompiler.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait R3ResolvedDependencyType extends js.Object

@JSImport("@angular/compiler/src/compiler_facade_interface", "R3ResolvedDependencyType")
@js.native
object R3ResolvedDependencyType extends js.Object {
  @js.native
  sealed trait Attribute extends R3ResolvedDependencyType
  
  @js.native
  sealed trait ChangeDetectorRef extends R3ResolvedDependencyType
  
  @js.native
  sealed trait Token extends R3ResolvedDependencyType
  
  /* 1 */ val Attribute: typings.atAngularCompiler.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.R3ResolvedDependencyType.Attribute with Double = js.native
  /* 2 */ val ChangeDetectorRef: typings.atAngularCompiler.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.R3ResolvedDependencyType.ChangeDetectorRef with Double = js.native
  /* 0 */ val Token: typings.atAngularCompiler.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.R3ResolvedDependencyType.Token with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[R3ResolvedDependencyType with Double] = js.native
}

