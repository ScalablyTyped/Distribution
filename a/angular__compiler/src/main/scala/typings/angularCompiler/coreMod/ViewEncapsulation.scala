package typings.angularCompiler.coreMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ViewEncapsulation extends js.Object
@JSImport("@angular/compiler/src/core", "ViewEncapsulation")
@js.native
object ViewEncapsulation extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewEncapsulation with Double] = js.native
  
  @js.native
  sealed trait Emulated extends ViewEncapsulation
  /* 0 */ @js.native
  object Emulated extends TopLevel[Emulated with Double]
  
  @js.native
  sealed trait None extends ViewEncapsulation
  /* 2 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait ShadowDom extends ViewEncapsulation
  /* 3 */ @js.native
  object ShadowDom extends TopLevel[ShadowDom with Double]
}
