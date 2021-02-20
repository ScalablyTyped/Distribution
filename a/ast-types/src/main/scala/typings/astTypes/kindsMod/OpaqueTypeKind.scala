package typings.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.astTypes.namedTypesMod.namedTypes.OpaqueType
  - typings.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
*/
trait OpaqueTypeKind extends StObject
object OpaqueTypeKind {
  
  @scala.inline
  def DeclareOpaqueType(id: IdentifierKind, `type`: typings.astTypes.astTypesStrings.DeclareOpaqueType): typings.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType]
  }
  
  @scala.inline
  def OpaqueType(id: IdentifierKind, impltype: FlowTypeKind, `type`: typings.astTypes.astTypesStrings.OpaqueType): typings.astTypes.namedTypesMod.namedTypes.OpaqueType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.OpaqueType]
  }
}
