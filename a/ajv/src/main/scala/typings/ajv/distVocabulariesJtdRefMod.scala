package typings.ajv

import typings.ajv.distTypesMod.AnySchemaObject
import typings.ajv.distTypesMod.CodeKeywordDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesJtdRefMod {
  
  @JSImport("ajv/dist/vocabularies/jtd/ref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ajv/dist/vocabularies/jtd/ref", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  inline def hasRef(schema: AnySchemaObject): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasRef")(schema.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
