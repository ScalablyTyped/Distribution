package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArgumentType extends js.Object

@JSImport("@angular/core/src/view/types", "ArgumentType")
@js.native
object ArgumentType extends js.Object {
  @js.native
  sealed trait Dynamic
    extends atAngularCoreLib.srcViewTypesMod.ArgumentType
  
  @js.native
  sealed trait Inline
    extends atAngularCoreLib.srcViewTypesMod.ArgumentType
  
  /* 1 */ val Dynamic: Dynamic with scala.Double = js.native
  /* 0 */ val Inline: Inline with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.srcViewTypesMod.ArgumentType with scala.Double] = js.native
}

