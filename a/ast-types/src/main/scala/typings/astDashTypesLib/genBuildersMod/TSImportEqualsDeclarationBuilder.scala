package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSImportEqualsDeclarationBuilder extends js.Object {
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    moduleReference: astDashTypesLib.genKindsMod.IdentifierKind
  ): astDashTypesLib.genNodesMod.TSImportEqualsDeclaration = js.native
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    moduleReference: astDashTypesLib.genKindsMod.TSExternalModuleReferenceKind
  ): astDashTypesLib.genNodesMod.TSImportEqualsDeclaration = js.native
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    moduleReference: astDashTypesLib.genKindsMod.TSQualifiedNameKind
  ): astDashTypesLib.genNodesMod.TSImportEqualsDeclaration = js.native
  def from(params: astDashTypesLib.Anon_CommentsIdIsExport): astDashTypesLib.genNodesMod.TSImportEqualsDeclaration = js.native
}

