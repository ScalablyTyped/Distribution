package typings.astTypes.buildersMod

import typings.astTypes.anon.LocSource
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.ImportExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportExpressionBuilder extends StObject {
  
  def apply(source: ExpressionKind): ImportExpression = js.native
  
  def from(params: LocSource): ImportExpression = js.native
}
