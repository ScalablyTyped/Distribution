package typings.ajv

import typings.ajv.anon.AdditionalPropertyError
import typings.ajv.anon.MissingProperty
import typings.ajv.distCompileValidateMod.KeywordCxt
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distTypesMod.ErrorObject
import typings.ajv.distTypesMod.KeywordErrorDefinition
import typings.ajv.distVocabulariesJtdErrorMod.JTDTypeError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesJtdPropertiesMod {
  
  @JSImport("ajv/dist/vocabularies/jtd/properties", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ajv/dist/vocabularies/jtd/properties", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  @js.native
  sealed trait PropError extends StObject
  @JSImport("ajv/dist/vocabularies/jtd/properties", "PropError")
  @js.native
  object PropError extends StObject {
    
    @js.native
    sealed trait Additional
      extends StObject
         with PropError
    
    @js.native
    sealed trait Missing
      extends StObject
         with PropError
  }
  
  @JSImport("ajv/dist/vocabularies/jtd/properties", "error")
  @js.native
  val error: KeywordErrorDefinition = js.native
  
  inline def validateProperties(cxt: KeywordCxt): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateProperties")(cxt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type JTDPropertiesError = (JTDTypeError[PropKeyword, "object", PropSchema]) | (ErrorObject[PropKeyword, AdditionalPropertyError | MissingProperty, PropSchema])
  
  object PropKeyword {
    
    inline def optionalProperties: "optionalProperties" = "optionalProperties".asInstanceOf["optionalProperties"]
    
    inline def properties: "properties" = "properties".asInstanceOf["properties"]
  }
  type PropKeyword = "properties" | "optionalProperties"
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in string ]:? ajv.ajv/dist/types.SchemaObject}
    }}}
    */
  @js.native
  trait PropSchema extends StObject
}
