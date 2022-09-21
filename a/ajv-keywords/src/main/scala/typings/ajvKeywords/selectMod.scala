package typings.ajvKeywords

import typings.ajv.distTypesMod.ErrorObject
import typings.ajv.distTypesMod.KeywordDefinition
import typings.ajvKeywords.ajvKeywordsStrings.select
import typings.ajvKeywords.anon.FailingCase
import typings.ajvKeywords.typesMod.DefinitionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  @JSImport("ajv-keywords/dist/definitions/select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Array[KeywordDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[KeywordDefinition]]
  inline def default(opts: DefinitionOptions): js.Array[KeywordDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Array[KeywordDefinition]]
  
  type SelectError = ErrorObject[select, FailingCase, Any]
}
