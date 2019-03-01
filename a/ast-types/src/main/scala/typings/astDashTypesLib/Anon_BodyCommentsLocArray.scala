package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommentsLocArray extends js.Object {
  var body: js.Array[
    astDashTypesLib.genKindsMod.MethodDefinitionKind | astDashTypesLib.genKindsMod.VariableDeclaratorKind | astDashTypesLib.genKindsMod.ClassPropertyDefinitionKind | astDashTypesLib.genKindsMod.ClassPropertyKind | astDashTypesLib.genKindsMod.ClassPrivatePropertyKind | astDashTypesLib.genKindsMod.ClassMethodKind | astDashTypesLib.genKindsMod.ClassPrivateMethodKind | astDashTypesLib.genKindsMod.TSDeclareMethodKind | astDashTypesLib.genKindsMod.TSCallSignatureDeclarationKind | astDashTypesLib.genKindsMod.TSConstructSignatureDeclarationKind | astDashTypesLib.genKindsMod.TSIndexSignatureKind | astDashTypesLib.genKindsMod.TSMethodSignatureKind | astDashTypesLib.genKindsMod.TSPropertySignatureKind
  ]
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
}

object Anon_BodyCommentsLocArray {
  @scala.inline
  def apply(
    body: js.Array[
      astDashTypesLib.genKindsMod.MethodDefinitionKind | astDashTypesLib.genKindsMod.VariableDeclaratorKind | astDashTypesLib.genKindsMod.ClassPropertyDefinitionKind | astDashTypesLib.genKindsMod.ClassPropertyKind | astDashTypesLib.genKindsMod.ClassPrivatePropertyKind | astDashTypesLib.genKindsMod.ClassMethodKind | astDashTypesLib.genKindsMod.ClassPrivateMethodKind | astDashTypesLib.genKindsMod.TSDeclareMethodKind | astDashTypesLib.genKindsMod.TSCallSignatureDeclarationKind | astDashTypesLib.genKindsMod.TSConstructSignatureDeclarationKind | astDashTypesLib.genKindsMod.TSIndexSignatureKind | astDashTypesLib.genKindsMod.TSMethodSignatureKind | astDashTypesLib.genKindsMod.TSPropertySignatureKind
    ],
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_BodyCommentsLocArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_BodyCommentsLocArray]
  }
}

