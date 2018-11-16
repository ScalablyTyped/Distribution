package typings
package atAngularCompilerLib.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewEncapsulation extends js.Object

@JSImport("@angular/compiler/src/core", "ViewEncapsulation")
@js.native
object ViewEncapsulation extends js.Object {
  @js.native
  sealed trait Emulated
    extends atAngularCompilerLib.srcCoreMod.ViewEncapsulation
  
  @js.native
  sealed trait Native
    extends atAngularCompilerLib.srcCoreMod.ViewEncapsulation
  
  @js.native
  sealed trait None
    extends atAngularCompilerLib.srcCoreMod.ViewEncapsulation
  
  @js.native
  sealed trait ShadowDom
    extends atAngularCompilerLib.srcCoreMod.ViewEncapsulation
  
  /* 0 */ val Emulated: Emulated with scala.Double = js.native
  /* 1 */ val Native: Native with scala.Double = js.native
  /* 2 */ val None: None with scala.Double = js.native
  /* 3 */ val ShadowDom: ShadowDom with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCompilerLib.srcCoreMod.ViewEncapsulation with scala.Double] = js.native
}

