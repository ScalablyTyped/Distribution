package typings
package atAngularCoreLib.srcRender3JitCompilerUnderscoreFacadeUnderscoreInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait R3ResolvedDependencyType extends js.Object

@JSImport("@angular/core/src/render3/jit/compiler_facade_interface", "R3ResolvedDependencyType")
@js.native
object R3ResolvedDependencyType extends js.Object {
  @js.native
  sealed trait Attribute
    extends atAngularCoreLib.srcRender3JitCompilerUnderscoreFacadeUnderscoreInterfaceMod.R3ResolvedDependencyType
  
  @js.native
  sealed trait Injector
    extends atAngularCoreLib.srcRender3JitCompilerUnderscoreFacadeUnderscoreInterfaceMod.R3ResolvedDependencyType
  
  @js.native
  sealed trait Token
    extends atAngularCoreLib.srcRender3JitCompilerUnderscoreFacadeUnderscoreInterfaceMod.R3ResolvedDependencyType
  
  /* 1 */ val Attribute: Attribute with scala.Double = js.native
  /* 2 */ val Injector: Injector with scala.Double = js.native
  /* 0 */ val Token: Token with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCoreLib.srcRender3JitCompilerUnderscoreFacadeUnderscoreInterfaceMod.R3ResolvedDependencyType with scala.Double
  ] = js.native
}

