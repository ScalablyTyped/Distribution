package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsExpressionLocArray
import typings.astTypes.kindsMod.StringLiteralKind
import typings.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSExternalModuleReferenceBuilder extends js.Object {
  def apply(expression: StringLiteralKind): TSExternalModuleReference = js.native
  def from(params: AnonCommentsExpressionLocArray): TSExternalModuleReference = js.native
}

