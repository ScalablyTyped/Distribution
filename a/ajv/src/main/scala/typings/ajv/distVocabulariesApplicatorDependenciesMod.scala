package typings.ajv

import typings.ajv.ajvStrings.dependencies
import typings.ajv.distCompileValidateMod.KeywordCxt
import typings.ajv.distTypesMod.CodeKeywordDefinition
import typings.ajv.distTypesMod.ErrorObject
import typings.ajv.distTypesMod.KeywordErrorDefinition
import typings.ajv.distTypesMod.SchemaMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesApplicatorDependenciesMod {
  
  @JSImport("ajv/dist/vocabularies/applicator/dependencies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ajv/dist/vocabularies/applicator/dependencies", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  @JSImport("ajv/dist/vocabularies/applicator/dependencies", "error")
  @js.native
  val error: KeywordErrorDefinition = js.native
  
  inline def validatePropertyDeps(cxt: KeywordCxt): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePropertyDeps")(cxt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def validatePropertyDeps(
    cxt: KeywordCxt,
    propertyDeps: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in string ]:? std.Array<string>} */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validatePropertyDeps")(cxt.asInstanceOf[js.Any], propertyDeps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateSchemaDeps(cxt: KeywordCxt): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateSchemaDeps")(cxt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def validateSchemaDeps(cxt: KeywordCxt, schemaDeps: SchemaMap): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateSchemaDeps")(cxt.asInstanceOf[js.Any], schemaDeps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type DependenciesError = ErrorObject[
    dependencies, 
    DependenciesErrorParams, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in string ]:? std.Array<string> | ajv.ajv/dist/types.AnySchema} */ js.Any
  ]
  
  trait DependenciesErrorParams extends StObject {
    
    var deps: String
    
    var depsCount: Double
    
    var missingProperty: String
    
    var property: String
  }
  object DependenciesErrorParams {
    
    inline def apply(deps: String, depsCount: Double, missingProperty: String, property: String): DependenciesErrorParams = {
      val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], depsCount = depsCount.asInstanceOf[js.Any], missingProperty = missingProperty.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependenciesErrorParams]
    }
    
    extension [Self <: DependenciesErrorParams](x: Self) {
      
      inline def setDeps(value: String): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      inline def setDepsCount(value: Double): Self = StObject.set(x, "depsCount", value.asInstanceOf[js.Any])
      
      inline def setMissingProperty(value: String): Self = StObject.set(x, "missingProperty", value.asInstanceOf[js.Any])
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in string ]:? std.Array<string>}
    }}}
    */
  @js.native
  trait PropertyDependencies extends StObject
}
