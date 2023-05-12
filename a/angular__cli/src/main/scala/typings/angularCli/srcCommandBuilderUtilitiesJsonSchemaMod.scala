package typings.angularCli

import typings.angularDevkitCore.srcJsonSchemaInterfaceMod.SchemaRegistry
import typings.angularDevkitCore.srcJsonUtilsMod.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandBuilderUtilitiesJsonSchemaMod {
  
  @JSImport("@angular/cli/src/command-builder/utilities/json-schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseJsonSchemaToOptions(registry: SchemaRegistry, schema: JsonObject): js.Promise[js.Array[Option]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJsonSchemaToOptions")(registry.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Option]]]
  inline def parseJsonSchemaToOptions(registry: SchemaRegistry, schema: JsonObject, interactive: Boolean): js.Promise[js.Array[Option]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJsonSchemaToOptions")(registry.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], interactive.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Option]]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify yargs.Options * / any */ trait Option extends StObject {
    
    /**
      * Format field of this option.
      */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * Whether this option should be hidden from the help output. It will still show up in JSON help.
      */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of the option.
      */
    var name: String
    
    /**
      * If this option can be used as an argument, the position of the argument. Otherwise omitted.
      */
    var positional: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether this option is required or not.
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not to report this option to the Angular Team, and which custom field to use.
      * If this is falsey, do not report this option.
      */
    var userAnalytics: js.UndefOr[String] = js.undefined
  }
  object Option {
    
    inline def apply(name: String): Option = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPositional(value: Double): Self = StObject.set(x, "positional", value.asInstanceOf[js.Any])
      
      inline def setPositionalUndefined: Self = StObject.set(x, "positional", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setUserAnalytics(value: String): Self = StObject.set(x, "userAnalytics", value.asInstanceOf[js.Any])
      
      inline def setUserAnalyticsUndefined: Self = StObject.set(x, "userAnalytics", js.undefined)
    }
  }
}
