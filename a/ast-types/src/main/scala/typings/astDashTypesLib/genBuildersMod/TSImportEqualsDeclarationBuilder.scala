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
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.TSImportEqualsDeclaration = js.native
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    moduleReference: astDashTypesLib.genKindsMod.TSExternalModuleReferenceKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.TSImportEqualsDeclaration = js.native
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    moduleReference: astDashTypesLib.genKindsMod.TSQualifiedNameKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.TSImportEqualsDeclaration = js.native
  def from(params: astDashTypesLib.Anon_CommentsIdIsExport): astDashTypesLib.genNamedTypesMod.namedTypesNs.TSImportEqualsDeclaration = js.native
}

