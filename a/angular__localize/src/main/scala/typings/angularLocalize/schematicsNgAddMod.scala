package typings.angularLocalize

import typings.angularDevkitSchematics.srcEngineInterfaceMod.Rule
import typings.angularLocalize.schematicsNgAddSchemaMod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsNgAddMod {
  
  @JSImport("@angular/localize/schematics/ng-add", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Schema): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Rule]
  
  @JSImport("@angular/localize/schematics/ng-add", "localizePolyfill")
  @js.native
  val localizePolyfill: /* "import '@angular/localize/init';" */ String = js.native
}
