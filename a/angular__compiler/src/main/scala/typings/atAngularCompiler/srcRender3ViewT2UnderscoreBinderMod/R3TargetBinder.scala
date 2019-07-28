package typings.atAngularCompiler.srcRender3ViewT2UnderscoreBinderMod

import typings.atAngularCompiler.srcRender3ViewT2UnderscoreApiMod.BoundTarget
import typings.atAngularCompiler.srcRender3ViewT2UnderscoreApiMod.DirectiveMeta
import typings.atAngularCompiler.srcRender3ViewT2UnderscoreApiMod.Target
import typings.atAngularCompiler.srcRender3ViewT2UnderscoreApiMod.TargetBinder
import typings.atAngularCompiler.srcSelectorMod.SelectorMatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/t2_binder", "R3TargetBinder")
@js.native
class R3TargetBinder[DirectiveT /* <: DirectiveMeta */] protected () extends TargetBinder[DirectiveT] {
  def this(directiveMatcher: SelectorMatcher[DirectiveT]) = this()
  var directiveMatcher: js.Any = js.native
  /* CompleteClass */
  override def bind(target: Target): BoundTarget[DirectiveT] = js.native
}

