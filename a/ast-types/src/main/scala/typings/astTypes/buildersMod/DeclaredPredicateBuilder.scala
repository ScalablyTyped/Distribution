package typings.astTypes.buildersMod

import typings.astTypes.anon.LocValue
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclaredPredicateBuilder extends StObject {
  
  def apply(value: ExpressionKind): DeclaredPredicate = js.native
  
  def from(params: LocValue): DeclaredPredicate = js.native
}
