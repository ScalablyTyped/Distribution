package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsLocParameters
import typings.astDashTypes.genKindsMod.ArrayPatternKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.ObjectPatternKind
import typings.astDashTypes.genKindsMod.RestElementKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.TSFunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSFunctionTypeBuilder extends js.Object {
  def apply(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): TSFunctionType = js.native
  def from(params: Anon_CommentsLocParameters): TSFunctionType = js.native
}

