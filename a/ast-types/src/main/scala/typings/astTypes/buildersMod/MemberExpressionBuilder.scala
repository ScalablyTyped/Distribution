package typings.astTypes.buildersMod

import typings.astTypes.anon.Optional
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.MemberExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberExpressionBuilder extends StObject {
  
  def apply(`object`: ExpressionKind, property: ExpressionKind): MemberExpression = js.native
  def apply(`object`: ExpressionKind, property: ExpressionKind, computed: Boolean): MemberExpression = js.native
  def apply(`object`: ExpressionKind, property: IdentifierKind): MemberExpression = js.native
  def apply(`object`: ExpressionKind, property: IdentifierKind, computed: Boolean): MemberExpression = js.native
  
  def from(params: Optional): MemberExpression = js.native
}
