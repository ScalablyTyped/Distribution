package typings.astTypes.buildersMod

import typings.astTypes.anon.Id
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.namedTypesMod.namedTypes.VariableDeclarator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableDeclaratorBuilder extends StObject {
  
  def apply(id: PatternKind): VariableDeclarator = js.native
  def apply(id: PatternKind, init: ExpressionKind): VariableDeclarator = js.native
  
  def from(params: Id): VariableDeclarator = js.native
}
