package typings.angularDevkitSchematics

import typings.angularDevkitSchematics.srcEngineInterfaceMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRulesUrlMod {
  
  @JSImport("@angular-devkit/schematics/src/rules/url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def url(urlString: String): Source = ^.asInstanceOf[js.Dynamic].applyDynamic("url")(urlString.asInstanceOf[js.Any]).asInstanceOf[Source]
}
