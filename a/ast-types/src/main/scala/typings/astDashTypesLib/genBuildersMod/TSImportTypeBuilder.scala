package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSImportTypeBuilder extends js.Object {
  def apply(argument: astDashTypesLib.genKindsMod.StringLiteralKind): astDashTypesLib.genNodesMod.TSImportType = js.native
  def apply(
    argument: astDashTypesLib.genKindsMod.StringLiteralKind,
    qualifier: astDashTypesLib.genKindsMod.IdentifierKind
  ): astDashTypesLib.genNodesMod.TSImportType = js.native
  def apply(
    argument: astDashTypesLib.genKindsMod.StringLiteralKind,
    qualifier: astDashTypesLib.genKindsMod.IdentifierKind,
    typeParameters: astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind
  ): astDashTypesLib.genNodesMod.TSImportType = js.native
  def apply(
    argument: astDashTypesLib.genKindsMod.StringLiteralKind,
    qualifier: astDashTypesLib.genKindsMod.TSQualifiedNameKind
  ): astDashTypesLib.genNodesMod.TSImportType = js.native
  def apply(
    argument: astDashTypesLib.genKindsMod.StringLiteralKind,
    qualifier: astDashTypesLib.genKindsMod.TSQualifiedNameKind,
    typeParameters: astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind
  ): astDashTypesLib.genNodesMod.TSImportType = js.native
  def apply(
    argument: astDashTypesLib.genKindsMod.StringLiteralKind,
    qualifier: js.UndefOr[scala.Nothing],
    typeParameters: astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind
  ): astDashTypesLib.genNodesMod.TSImportType = js.native
  def from(params: astDashTypesLib.Anon_ArgumentCommentsLocQualifier): astDashTypesLib.genNodesMod.TSImportType = js.native
}

