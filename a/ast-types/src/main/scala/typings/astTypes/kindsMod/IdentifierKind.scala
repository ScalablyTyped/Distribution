package typings.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.astTypes.namedTypesMod.namedTypes.Identifier
  - typings.astTypes.namedTypesMod.namedTypes.JSXIdentifier
  - typings.astTypes.namedTypesMod.namedTypes.TSTypeParameter
*/
trait IdentifierKind extends StObject
object IdentifierKind {
  
  inline def Identifier(name: String): typings.astTypes.namedTypesMod.namedTypes.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.Identifier]
  }
  
  inline def JSXIdentifier(name: String): typings.astTypes.namedTypesMod.namedTypes.JSXIdentifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXIdentifier")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.JSXIdentifier]
  }
  
  inline def TSTypeParameter(name: String): typings.astTypes.namedTypesMod.namedTypes.TSTypeParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeParameter")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.TSTypeParameter]
  }
}
