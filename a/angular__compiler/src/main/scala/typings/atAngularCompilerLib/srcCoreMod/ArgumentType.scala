package typings
package atAngularCompilerLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArgumentType extends js.Object

@JSImport("@angular/compiler/src/core", "ArgumentType")
@js.native
object ArgumentType extends js.Object {
  @js.native
  sealed trait Dynamic
    extends atAngularCompilerLib.srcCoreMod.ArgumentType
  
  @js.native
  sealed trait Inline
    extends atAngularCompilerLib.srcCoreMod.ArgumentType
  
  /* 1 */ val Dynamic: Dynamic with scala.Double = js.native
  /* 0 */ val Inline: Inline with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.ArgumentType with scala.Double] = js.native
}

