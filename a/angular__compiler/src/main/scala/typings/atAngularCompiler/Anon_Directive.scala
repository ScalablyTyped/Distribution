package typings.atAngularCompiler

import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.Element
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.Template
import typings.atAngularCompiler.srcRender3ViewT2UnderscoreApiMod.DirectiveMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Directive[DirectiveT /* <: DirectiveMeta */] extends js.Object {
  var directive: DirectiveT
  var node: Element | Template
}

object Anon_Directive {
  @scala.inline
  def apply[DirectiveT /* <: DirectiveMeta */](directive: DirectiveT, node: Element | Template): Anon_Directive[DirectiveT] = {
    val __obj = js.Dynamic.literal(directive = directive.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Directive[DirectiveT]]
  }
}

