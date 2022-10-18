package typings.ajv

import typings.ajv.distCompileValidateMod.KeywordCxt
import typings.ajv.distTypesMod.AnySchema
import typings.ajv.distTypesMod.CodeKeywordDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesApplicatorItemsMod {
  
  @JSImport("ajv/dist/vocabularies/applicator/items", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ajv/dist/vocabularies/applicator/items", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  inline def validateTuple(cxt: KeywordCxt, extraItems: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateTuple")(cxt.asInstanceOf[js.Any], extraItems.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateTuple(cxt: KeywordCxt, extraItems: String, schArr: js.Array[AnySchema]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateTuple")(cxt.asInstanceOf[js.Any], extraItems.asInstanceOf[js.Any], schArr.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
