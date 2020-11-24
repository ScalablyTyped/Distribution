package typings.astTypes.buildersMod

import typings.astTypes.anon.LocValue
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclaredPredicateBuilder extends js.Object {
  
  def apply(value: ExpressionKind): DeclaredPredicate = js.native
  
  def from(params: LocValue): DeclaredPredicate = js.native
}
