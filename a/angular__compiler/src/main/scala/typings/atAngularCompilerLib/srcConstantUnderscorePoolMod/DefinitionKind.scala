package typings
package atAngularCompilerLib.srcConstantUnderscorePoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DefinitionKind extends js.Object

@JSImport("@angular/compiler/src/constant_pool", "DefinitionKind")
@js.native
object DefinitionKind extends js.Object {
  @js.native
  sealed trait Component
    extends atAngularCompilerLib.srcConstantUnderscorePoolMod.DefinitionKind
  
  @js.native
  sealed trait Directive
    extends atAngularCompilerLib.srcConstantUnderscorePoolMod.DefinitionKind
  
  @js.native
  sealed trait Injector
    extends atAngularCompilerLib.srcConstantUnderscorePoolMod.DefinitionKind
  
  @js.native
  sealed trait Pipe
    extends atAngularCompilerLib.srcConstantUnderscorePoolMod.DefinitionKind
  
  /* 2 */ val Component: Component with scala.Double = js.native
  /* 1 */ val Directive: Directive with scala.Double = js.native
  /* 0 */ val Injector: Injector with scala.Double = js.native
  /* 3 */ val Pipe: Pipe with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atAngularCompilerLib.srcConstantUnderscorePoolMod.DefinitionKind with scala.Double
  ] = js.native
}

