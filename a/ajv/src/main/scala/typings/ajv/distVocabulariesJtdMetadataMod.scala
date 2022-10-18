package typings.ajv

import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.mod.KeywordCxt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesJtdMetadataMod {
  
  @JSImport("ajv/dist/vocabularies/jtd/metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ajv/dist/vocabularies/jtd/metadata", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  inline def checkMetadata(hasItKeyword: KeywordCxt): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkMetadata")(hasItKeyword.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkMetadata(hasItKeyword: KeywordCxt, metadata: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkMetadata")(hasItKeyword.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
