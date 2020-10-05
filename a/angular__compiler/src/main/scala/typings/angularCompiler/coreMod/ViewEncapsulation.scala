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
  @js.native
  sealed trait Emulated extends ViewEncapsulation
  
  @js.native
  sealed trait Native extends ViewEncapsulation
  
  @js.native
  sealed trait None extends ViewEncapsulation
  
  @js.native
  sealed trait ShadowDom extends ViewEncapsulation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewEncapsulation with Double] = js.native
  /* 0 */ @js.native
  object Emulated extends TopLevel[Emulated with Double]
  
  /* 1 */ @js.native
  object Native extends TopLevel[Native with Double]
  
  /* 2 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 3 */ @js.native
  object ShadowDom extends TopLevel[ShadowDom with Double]
  
}

