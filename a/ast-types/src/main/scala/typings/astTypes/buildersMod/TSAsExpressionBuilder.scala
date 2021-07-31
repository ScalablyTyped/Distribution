package typings.astTypes.buildersMod

import typings.astTypes.anon.ExpressionExtra
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.namedTypesMod.namedTypes.TSAsExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSAsExpressionBuilder extends StObject {
  
  def apply(expression: ExpressionKind, typeAnnotation: TSTypeKind): TSAsExpression = js.native
  
  def from(params: ExpressionExtra): TSAsExpression = js.native
}
