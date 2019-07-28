package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsLocParameters
import typings.astDashTypes.genKindsMod.ArrayPatternKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.ObjectPatternKind
import typings.astDashTypes.genKindsMod.RestElementKind
import typings.astDashTypes.genNamedTypesMod.namedTypesNs.TSConstructorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSConstructorTypeBuilder extends js.Object {
  def apply(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): TSConstructorType = js.native
  def from(params: Anon_CommentsLocParameters): TSConstructorType = js.native
}

