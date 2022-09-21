package typings.ajv

import typings.ajv.compileMod.SchemaEnv
import typings.ajv.typesMod.SchemaObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializeMod {
  
  @JSImport("ajv/dist/compile/jtd/serialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(sch: SchemaEnv, definitions: SchemaObjectMap): SchemaEnv = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sch.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any])).asInstanceOf[SchemaEnv]
}
