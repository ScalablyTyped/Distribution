package typings.ajv

import org.scalablytyped.runtime.TopLevel
import typings.ajv.ajvStrings.`object`
import typings.ajv.anon.AdditionalPropertyError
import typings.ajv.anon.MissingProperty
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distTypesMod.ErrorObject
import typings.ajv.distTypesMod.KeywordErrorDefinition
import typings.ajv.errorMod.JTDTypeError
import typings.ajv.validateMod.KeywordCxt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jtdPropertiesMod {
  
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
  
  type JTDPropertiesError = (JTDTypeError[PropKeyword, `object`, PropSchema]) | (ErrorObject[PropKeyword, AdditionalPropertyError | MissingProperty, PropSchema])
  
  /* Rewritten from type alias, can be one of: 
    - typings.ajv.ajvStrings.properties
    - typings.ajv.ajvStrings.optionalProperties
  */
  trait PropKeyword extends StObject
  object PropKeyword {
    
    inline def optionalProperties: typings.ajv.ajvStrings.optionalProperties = "optionalProperties".asInstanceOf[typings.ajv.ajvStrings.optionalProperties]
    
    inline def properties: typings.ajv.ajvStrings.properties = "properties".asInstanceOf[typings.ajv.ajvStrings.properties]
  }
  
  type PropSchema = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]:? ajv.ajv/dist/types.SchemaObject}
    */ typings.ajv.ajvStrings.PropSchema & TopLevel[Any]
}
