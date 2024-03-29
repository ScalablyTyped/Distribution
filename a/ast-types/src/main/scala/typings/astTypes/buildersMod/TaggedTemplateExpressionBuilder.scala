package typings.astTypes.buildersMod

import typings.astTypes.anon.Quasi
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.TemplateLiteralKind
import typings.astTypes.namedTypesMod.namedTypes.TaggedTemplateExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaggedTemplateExpressionBuilder extends StObject {
  
  def apply(tag: ExpressionKind, quasi: TemplateLiteralKind): TaggedTemplateExpression = js.native
  
  def from(params: Quasi): TaggedTemplateExpression = js.native
}
