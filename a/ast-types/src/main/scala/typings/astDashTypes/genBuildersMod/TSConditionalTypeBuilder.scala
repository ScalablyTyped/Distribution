package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CheckType
import typings.astDashTypes.genKindsMod.TSTypeKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.TSConditionalType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSConditionalTypeBuilder extends js.Object {
  def apply(checkType: TSTypeKind, extendsType: TSTypeKind, trueType: TSTypeKind, falseType: TSTypeKind): TSConditionalType = js.native
  def from(params: Anon_CheckType): TSConditionalType = js.native
}

