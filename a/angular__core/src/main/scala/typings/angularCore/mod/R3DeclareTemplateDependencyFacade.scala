package typings.angularCore.mod

import typings.angularCore.angularCoreStrings.component
import typings.angularCore.angularCoreStrings.directive
import typings.angularCore.angularCoreStrings.ngmodule
import typings.angularCore.angularCoreStrings.pipe
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
  
  inline def R3DeclareDirectiveDepende(
    kind: (js.UndefOr[directive | component]) & String,
    selector: String,
    `type`: OpaqueValue | js.Function0[OpaqueValue]
  ): typings.angularCore.anon.R3DeclareDirectiveDepende = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.anon.R3DeclareDirectiveDepende]
  }
  
  inline def R3DeclareNgModuleDependen(kind: ngmodule & String, `type`: OpaqueValue | js.Function0[OpaqueValue]): typings.angularCore.anon.R3DeclareNgModuleDependen = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.anon.R3DeclareNgModuleDependen]
  }
  
  inline def R3DeclarePipeDependencyFa(kind: js.UndefOr[pipe] & String, name: String, `type`: OpaqueValue | js.Function0[OpaqueValue]): typings.angularCore.anon.R3DeclarePipeDependencyFa = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCore.anon.R3DeclarePipeDependencyFa]
  }
}
