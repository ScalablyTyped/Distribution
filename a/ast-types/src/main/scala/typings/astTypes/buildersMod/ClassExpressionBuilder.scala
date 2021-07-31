package typings.astTypes.buildersMod

import typings.astTypes.anon.SuperClass
import typings.astTypes.kindsMod.ClassBodyKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.ClassExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassExpressionBuilder extends StObject {
  
  def apply(id: Null, body: ClassBodyKind): ClassExpression = js.native
  def apply(id: Null, body: ClassBodyKind, superClass: ExpressionKind): ClassExpression = js.native
  def apply(id: Unit, body: ClassBodyKind): ClassExpression = js.native
  def apply(id: Unit, body: ClassBodyKind, superClass: ExpressionKind): ClassExpression = js.native
  def apply(id: IdentifierKind, body: ClassBodyKind): ClassExpression = js.native
  def apply(id: IdentifierKind, body: ClassBodyKind, superClass: ExpressionKind): ClassExpression = js.native
  
  def from(params: SuperClass): ClassExpression = js.native
}
