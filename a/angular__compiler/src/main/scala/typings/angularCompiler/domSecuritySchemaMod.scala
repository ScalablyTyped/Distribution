package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.coreMod.SecurityContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domSecuritySchemaMod {
  
  @JSImport("@angular/compiler/src/schema/dom_security_schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def SECURITY_SCHEMA(): StringDictionary[SecurityContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("SECURITY_SCHEMA")().asInstanceOf[StringDictionary[SecurityContext]]
}
