package typings.angularCompiler.publicApiMod

import typings.angularCompiler.t2ApiMod.DirectiveMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "R3TargetBinder")
@js.native
class R3TargetBinder[DirectiveT /* <: DirectiveMeta */] protected ()
  extends typings.angularCompiler.srcCompilerMod.R3TargetBinder[DirectiveT] {
  def this(directiveMatcher: typings.angularCompiler.selectorMod.SelectorMatcher[DirectiveT]) = this()
}

