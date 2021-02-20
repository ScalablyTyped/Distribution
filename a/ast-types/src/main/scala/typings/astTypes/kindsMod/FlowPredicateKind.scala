package typings.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.astTypes.namedTypesMod.namedTypes.InferredPredicate
  - typings.astTypes.namedTypesMod.namedTypes.DeclaredPredicate
*/
trait FlowPredicateKind extends StObject
object FlowPredicateKind {
  
  @scala.inline
  def DeclaredPredicate(`type`: typings.astTypes.astTypesStrings.DeclaredPredicate, value: ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.DeclaredPredicate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DeclaredPredicate]
  }
  
  @scala.inline
  def InferredPredicate(`type`: typings.astTypes.astTypesStrings.InferredPredicate): typings.astTypes.namedTypesMod.namedTypes.InferredPredicate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.InferredPredicate]
  }
}
