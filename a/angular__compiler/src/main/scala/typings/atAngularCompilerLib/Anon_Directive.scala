package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Directive[DirectiveT /* <: atAngularCompilerLib.srcRender3ViewT2UnderscoreApiMod.DirectiveMeta */] extends js.Object {
  var directive: DirectiveT
  var node: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Element | atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Template
}

object Anon_Directive {
  @scala.inline
  def apply[DirectiveT /* <: atAngularCompilerLib.srcRender3ViewT2UnderscoreApiMod.DirectiveMeta */](
    directive: DirectiveT,
    node: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Element | atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Template
  ): Anon_Directive[DirectiveT] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("directive")(directive.asInstanceOf[js.Any])
    __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Directive[DirectiveT]]
  }
}

