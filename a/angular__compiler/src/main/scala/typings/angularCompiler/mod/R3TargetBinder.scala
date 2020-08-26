package typings.angularCompiler.mod

import typings.angularCompiler.t2ApiMod.DirectiveMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "R3TargetBinder")
@js.native
class R3TargetBinder[DirectiveT /* <: DirectiveMeta */] protected ()
  extends typings.angularCompiler.compilerMod.R3TargetBinder[DirectiveT] {
  def this(directiveMatcher: typings.angularCompiler.selectorMod.SelectorMatcher[DirectiveT]) = this()
}

