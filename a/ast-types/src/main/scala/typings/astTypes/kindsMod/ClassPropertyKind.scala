package typings.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.astTypes.namedTypesMod.namedTypes.ClassProperty
  - typings.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty
*/
trait ClassPropertyKind extends StObject
object ClassPropertyKind {
  
  @scala.inline
  def ClassPrivateProperty(key: PrivateNameKind, `type`: typings.astTypes.astTypesStrings.ClassPrivateProperty): typings.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ClassPrivateProperty]
  }
  
  @scala.inline
  def ClassProperty(
    key: LiteralKind | IdentifierKind | ExpressionKind,
    `type`: typings.astTypes.astTypesStrings.ClassProperty
  ): typings.astTypes.namedTypesMod.namedTypes.ClassProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.ClassProperty]
  }
}
