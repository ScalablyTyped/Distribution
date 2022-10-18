package typings.ajv

import typings.ajv.distCompileCodegenCodeMod.Code
import typings.ajv.distCompileCodegenMod.Name
import typings.ajv.distCompileValidateMod.KeywordCxt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesJtdNullableMod {
  
  @JSImport("ajv/dist/vocabularies/jtd/nullable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkNullable(hasGenDataParentSchema: KeywordCxt): js.Tuple2[Name, Code] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkNullable")(hasGenDataParentSchema.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Name, Code]]
  inline def checkNullable(hasGenDataParentSchema: KeywordCxt, cond: Code): js.Tuple2[Name, Code] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNullable")(hasGenDataParentSchema.asInstanceOf[js.Any], cond.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Name, Code]]
  
  inline def checkNullableObject(cxt: KeywordCxt, cond: Code): js.Tuple2[Name, Code] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNullableObject")(cxt.asInstanceOf[js.Any], cond.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Name, Code]]
}
