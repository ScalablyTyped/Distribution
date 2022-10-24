package typings.ajvKeywords

import typings.ajv.distTypesMod.SchemaObject
import typings.ajv.mod.KeywordCxt
import typings.ajv.mod.Name
import typings.ajvKeywords.distDefinitionsTypesMod.DefinitionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDefinitionsUtilMod {
  
  @JSImport("ajv-keywords/dist/definitions/_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def metaSchemaRef(): SchemaObject = ^.asInstanceOf[js.Dynamic].applyDynamic("metaSchemaRef")().asInstanceOf[SchemaObject]
  inline def metaSchemaRef(param0: DefinitionOptions): SchemaObject = ^.asInstanceOf[js.Dynamic].applyDynamic("metaSchemaRef")(param0.asInstanceOf[js.Any]).asInstanceOf[SchemaObject]
  
  inline def usePattern(param0: KeywordCxt, pattern: String): Name = (^.asInstanceOf[js.Dynamic].applyDynamic("usePattern")(param0.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Name]
  inline def usePattern(param0: KeywordCxt, pattern: String, flags: String): Name = (^.asInstanceOf[js.Dynamic].applyDynamic("usePattern")(param0.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Name]
}
