package typings.astTypes.buildersMod

import typings.astTypes.anon.Elements
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.RestElementKind
import typings.astTypes.kindsMod.SpreadElementKind
import typings.astTypes.namedTypesMod.namedTypes.ArrayExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayExpressionBuilder extends StObject {
  
  def apply(elements: js.Array[ExpressionKind | SpreadElementKind | RestElementKind | Null]): ArrayExpression = js.native
  
  def from(params: Elements): ArrayExpression = js.native
}
