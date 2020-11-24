package typings.astTypes.buildersMod

import typings.astTypes.anon.CommentsExpressionLoc
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.TypeAnnotationKind
import typings.astTypes.namedTypesMod.namedTypes.TypeCastExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeCastExpressionBuilder extends js.Object {
  
  def apply(expression: ExpressionKind, typeAnnotation: TypeAnnotationKind): TypeCastExpression = js.native
  
  def from(params: CommentsExpressionLoc): TypeCastExpression = js.native
}
