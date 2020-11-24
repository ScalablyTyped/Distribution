package typings.astTypes.buildersMod

import typings.astTypes.anon.Implements
import typings.astTypes.kindsMod.ClassBodyKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.ClassDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassDeclarationBuilder extends js.Object {
  
  def apply(id: Null, body: ClassBodyKind): ClassDeclaration = js.native
  def apply(id: Null, body: ClassBodyKind, superClass: ExpressionKind): ClassDeclaration = js.native
  def apply(id: IdentifierKind, body: ClassBodyKind): ClassDeclaration = js.native
  def apply(id: IdentifierKind, body: ClassBodyKind, superClass: ExpressionKind): ClassDeclaration = js.native
  
  def from(params: Implements): ClassDeclaration = js.native
}
