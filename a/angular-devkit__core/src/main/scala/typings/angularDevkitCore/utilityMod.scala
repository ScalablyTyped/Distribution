package typings.angularDevkitCore

import typings.angularDevkitCore.schemaSchemaMod.JsonSchema
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilityMod {
  
  @JSImport("@angular-devkit/core/src/json/schema/utility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTypesOfSchema(schema: JsonSchema): Set[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypesOfSchema")(schema.asInstanceOf[js.Any]).asInstanceOf[Set[String]]
}
