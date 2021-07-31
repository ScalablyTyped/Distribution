package typings.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.astTypes.namedTypesMod.namedTypes.ClassProperty
  - typings.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
*/
trait ClassPropertyKind extends StObject
object ClassPropertyKind {
  
  @scala.inline
  def ClassPrivateProperty(key: PrivateNameKind): typings.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassPrivateProperty")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty]
  }
  
  @scala.inline
  def ClassProperty(key: LiteralKind | IdentifierKind | ExpressionKind): typings.astTypes.namedTypesMod.namedTypes.ClassProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = null)
    __obj.updateDynamic("type")("ClassProperty")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ClassProperty]
  }
}
