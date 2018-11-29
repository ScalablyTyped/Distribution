package typings
package atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait R3ResolvedDependencyType extends js.Object

@JSImport("@angular/compiler/src/compiler_facade_interface", "R3ResolvedDependencyType")
@js.native
object R3ResolvedDependencyType extends js.Object {
  @js.native
  sealed trait Attribute
    extends atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.R3ResolvedDependencyType
  
  @js.native
  sealed trait Token
    extends atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.R3ResolvedDependencyType
  
  /* 1 */ val Attribute: Attribute with scala.Double = js.native
  /* 0 */ val Token: Token with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod.R3ResolvedDependencyType with scala.Double
  ] = js.native
}

