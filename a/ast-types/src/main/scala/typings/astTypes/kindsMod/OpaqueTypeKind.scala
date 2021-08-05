package typings.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.astTypes.namedTypesMod.namedTypes.OpaqueType
  - typings.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
*/
trait OpaqueTypeKind extends StObject
object OpaqueTypeKind {
  
  inline def DeclareOpaqueType(id: IdentifierKind): typings.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = null)
    __obj.updateDynamic("type")("DeclareOpaqueType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType]
  }
  
  inline def OpaqueType(id: IdentifierKind, impltype: FlowTypeKind): typings.astTypes.namedTypesMod.namedTypes.OpaqueType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any], supertype = null, typeParameters = null)
    __obj.updateDynamic("type")("OpaqueType")
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.OpaqueType]
  }
}
