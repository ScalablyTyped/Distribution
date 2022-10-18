package typings.angularCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandBuilderUtilitiesJsonHelpMod {
  
  @JSImport("@angular/cli/src/command-builder/utilities/json-help", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def jsonHelpUsage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonHelpUsage")().asInstanceOf[String]
  
  trait JsonHelp
    extends StObject
       with JsonHelpDescription {
    
    var command: String
    
    var name: String
    
    var options: js.Array[JsonHelpOption]
    
    var subcommands: js.UndefOr[js.Array[JsonHelpSubcommand]] = js.undefined
  }
  object JsonHelp {
    
    inline def apply(command: String, name: String, options: js.Array[JsonHelpOption]): JsonHelp = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonHelp]
    }
    
    extension [Self <: JsonHelp](x: Self) {
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Array[JsonHelpOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: JsonHelpOption*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setSubcommands(value: js.Array[JsonHelpSubcommand]): Self = StObject.set(x, "subcommands", value.asInstanceOf[js.Any])
      
      inline def setSubcommandsUndefined: Self = StObject.set(x, "subcommands", js.undefined)
      
      inline def setSubcommandsVarargs(value: JsonHelpSubcommand*): Self = StObject.set(x, "subcommands", js.Array(value*))
    }
  }
  
  trait JsonHelpDescription extends StObject {
    
    var longDescription: js.UndefOr[String] = js.undefined
    
    var longDescriptionRelativePath: js.UndefOr[String] = js.undefined
    
    var shortDescription: js.UndefOr[String] = js.undefined
  }
  object JsonHelpDescription {
    
    inline def apply(): JsonHelpDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonHelpDescription]
    }
    
    extension [Self <: JsonHelpDescription](x: Self) {
      
      inline def setLongDescription(value: String): Self = StObject.set(x, "longDescription", value.asInstanceOf[js.Any])
      
      inline def setLongDescriptionRelativePath(value: String): Self = StObject.set(x, "longDescriptionRelativePath", value.asInstanceOf[js.Any])
      
      inline def setLongDescriptionRelativePathUndefined: Self = StObject.set(x, "longDescriptionRelativePath", js.undefined)
      
      inline def setLongDescriptionUndefined: Self = StObject.set(x, "longDescription", js.undefined)
      
      inline def setShortDescription(value: String): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
      
      inline def setShortDescriptionUndefined: Self = StObject.set(x, "shortDescription", js.undefined)
    }
  }
  
  trait JsonHelpOption extends StObject {
    
    var default: js.UndefOr[String] = js.undefined
    
    var aliases: js.UndefOr[js.Array[String]] = js.undefined
    
    var deprecated: Boolean | String
    
    var description: js.UndefOr[String] = js.undefined
    
    var `enum`: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: String
    
    var positional: js.UndefOr[Double] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object JsonHelpOption {
    
    inline def apply(deprecated: Boolean | String, name: String): JsonHelpOption = {
      val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonHelpOption]
    }
    
    extension [Self <: JsonHelpOption](x: Self) {
      
      inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDeprecated(value: Boolean | String): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      inline def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPositional(value: Double): Self = StObject.set(x, "positional", value.asInstanceOf[js.Any])
      
      inline def setPositionalUndefined: Self = StObject.set(x, "positional", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait JsonHelpSubcommand
    extends StObject
       with JsonHelpDescription {
    
    var aliases: js.Array[String]
    
    var deprecated: String | Boolean
    
    var name: String
  }
  object JsonHelpSubcommand {
    
    inline def apply(aliases: js.Array[String], deprecated: String | Boolean, name: String): JsonHelpSubcommand = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], deprecated = deprecated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonHelpSubcommand]
    }
    
    extension [Self <: JsonHelpSubcommand](x: Self) {
      
      inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
      
      inline def setDeprecated(value: String | Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
