package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularCore.anon.R3DeclareDirectiveDepende
  - typings.angularCore.anon.R3DeclarePipeDependencyFa
  - typings.angularCore.anon.R3DeclareNgModuleDependen
*/
trait R3DeclareTemplateDependencyFacade extends StObject
object R3DeclareTemplateDependencyFacade {
  
  inline def R3DeclareDirectiveDepende(selector: String, `type`: OpaqueValue | js.Function0[OpaqueValue]): typings.angularCore.anon.R3DeclareDirectiveDepende = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.anon.R3DeclareDirectiveDepende]
  }
  
  inline def R3DeclareNgModuleDependen(`type`: OpaqueValue | js.Function0[OpaqueValue]): typings.angularCore.anon.R3DeclareNgModuleDependen = {
    val __obj = js.Dynamic.literal(kind = "ngmodule")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.anon.R3DeclareNgModuleDependen]
  }
  
  inline def R3DeclarePipeDependencyFa(name: String, `type`: OpaqueValue | js.Function0[OpaqueValue]): typings.angularCore.anon.R3DeclarePipeDependencyFa = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.anon.R3DeclarePipeDependencyFa]
  }
}
