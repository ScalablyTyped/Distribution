package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsLocOptional
import typings.astDashTypes.genKindsMod.TSTypeKind
import typings.astDashTypes.genKindsMod.TSTypeParameterKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.TSMappedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSMappedTypeBuilder extends js.Object {
  def apply(typeParameter: TSTypeParameterKind): TSMappedType = js.native
  def apply(typeParameter: TSTypeParameterKind, typeAnnotation: TSTypeKind): TSMappedType = js.native
  def from(params: Anon_CommentsLocOptional): TSMappedType = js.native
}

