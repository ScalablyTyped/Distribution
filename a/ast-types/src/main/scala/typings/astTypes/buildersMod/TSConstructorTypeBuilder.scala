package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLocParameters
import typings.astTypes.kindsMod.ArrayPatternKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.ObjectPatternKind
import typings.astTypes.kindsMod.RestElementKind
import typings.astTypes.namedTypesMod.namedTypes.TSConstructorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSConstructorTypeBuilder extends js.Object {
  def apply(parameters: js.Array[IdentifierKind | RestElementKind | ArrayPatternKind | ObjectPatternKind]): TSConstructorType = js.native
  def from(params: AnonCommentsLocParameters): TSConstructorType = js.native
}

