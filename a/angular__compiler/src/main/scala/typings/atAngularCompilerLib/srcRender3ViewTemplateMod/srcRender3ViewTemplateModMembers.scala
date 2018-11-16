package typings
package atAngularCompilerLib.srcRender3ViewTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/template", JSImport.Namespace)
@js.native
object srcRender3ViewTemplateModMembers extends js.Object {
  def makeBindingParser(): atAngularCompilerLib.srcTemplateUnderscoreParserBindingUnderscoreParserMod.BindingParser = js.native
  def parseTemplate(
    template: java.lang.String,
    templateUrl: java.lang.String,
    options: atAngularCompilerLib.Anon_PreserveWhitespaces,
    relativeContextFilePath: java.lang.String
  ): atAngularCompilerLib.Anon_RelativeContextFilePath = js.native
  def parseTemplate(
    template: java.lang.String,
    templateUrl: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    relativeContextFilePath: java.lang.String
  ): atAngularCompilerLib.Anon_RelativeContextFilePath = js.native
  def renderFlagCheckIfStmt(
    flags: atAngularCompilerLib.srcCoreMod.RenderFlags,
    statements: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement]
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.IfStmt = js.native
}

