package typings.astTypes.buildersMod

import typings.astTypes.anon.ExpressionStringLiteralKind
import typings.astTypes.kindsMod.StringLiteralKind
import typings.astTypes.namedTypesMod.namedTypes.TSExternalModuleReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSExternalModuleReferenceBuilder extends js.Object {
  
  def apply(expression: StringLiteralKind): TSExternalModuleReference = js.native
  
  def from(params: ExpressionStringLiteralKind): TSExternalModuleReference = js.native
}
