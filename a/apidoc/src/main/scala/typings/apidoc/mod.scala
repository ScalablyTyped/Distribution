package typings.apidoc

import org.scalablytyped.runtime.StringDictionary
import typings.apidoc.anon.Data
import typings.apidoc.anon.DocBlocksRegExp
import typings.apidoc.anon.GetGroup
import typings.apidoc.anon.Global
import typings.apidoc.anon.PostFilter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("apidoc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDoc(options: DocOptions): Boolean | Data = ^.asInstanceOf[js.Dynamic].applyDynamic("createDoc")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean | Data]
  
  trait DocOptions extends StObject {
    
    var apiprivate: js.UndefOr[Boolean] = js.undefined
    
    var colorize: js.UndefOr[Boolean] = js.undefined
    
    var config: js.UndefOr[String] = js.undefined
    
    var copyDefinitions: js.UndefOr[Boolean] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var dest: js.UndefOr[String] = js.undefined
    
    var dryRun: js.UndefOr[Boolean] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var excludeFilters: js.UndefOr[js.Array[String]] = js.undefined
    
    var filterBy: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var filters: js.UndefOr[(Record[String, String]) | StringDictionary[PostFilter]] = js.undefined
    
    var includeFilters: js.UndefOr[js.Array[String]] = js.undefined
    
    var languages: js.UndefOr[(Record[String, String]) | StringDictionary[DocBlocksRegExp]] = js.undefined
    
    var lineEnding: js.UndefOr[String] = js.undefined
    
    var markdown: js.UndefOr[Boolean] = js.undefined
    
    var parsers: js.UndefOr[(Record[String, String]) | GetGroup] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var single: js.UndefOr[Boolean] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var templateSingleFile: js.UndefOr[String] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    var workers: js.UndefOr[(Record[String, String]) | StringDictionary[Any]] = js.undefined
  }
  object DocOptions {
    
    inline def apply(): DocOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocOptions]
    }
    
    extension [Self <: DocOptions](x: Self) {
      
      inline def setApiprivate(value: Boolean): Self = StObject.set(x, "apiprivate", value.asInstanceOf[js.Any])
      
      inline def setApiprivateUndefined: Self = StObject.set(x, "apiprivate", js.undefined)
      
      inline def setColorize(value: Boolean): Self = StObject.set(x, "colorize", value.asInstanceOf[js.Any])
      
      inline def setColorizeUndefined: Self = StObject.set(x, "colorize", js.undefined)
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setCopyDefinitions(value: Boolean): Self = StObject.set(x, "copyDefinitions", value.asInstanceOf[js.Any])
      
      inline def setCopyDefinitionsUndefined: Self = StObject.set(x, "copyDefinitions", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setExcludeFilters(value: js.Array[String]): Self = StObject.set(x, "excludeFilters", value.asInstanceOf[js.Any])
      
      inline def setExcludeFiltersUndefined: Self = StObject.set(x, "excludeFilters", js.undefined)
      
      inline def setExcludeFiltersVarargs(value: String*): Self = StObject.set(x, "excludeFilters", js.Array(value*))
      
      inline def setFilterBy(value: String | js.Array[String]): Self = StObject.set(x, "filterBy", value.asInstanceOf[js.Any])
      
      inline def setFilterByUndefined: Self = StObject.set(x, "filterBy", js.undefined)
      
      inline def setFilterByVarargs(value: String*): Self = StObject.set(x, "filterBy", js.Array(value*))
      
      inline def setFilters(value: (Record[String, String]) | StringDictionary[PostFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setIncludeFilters(value: js.Array[String]): Self = StObject.set(x, "includeFilters", value.asInstanceOf[js.Any])
      
      inline def setIncludeFiltersUndefined: Self = StObject.set(x, "includeFilters", js.undefined)
      
      inline def setIncludeFiltersVarargs(value: String*): Self = StObject.set(x, "includeFilters", js.Array(value*))
      
      inline def setLanguages(value: (Record[String, String]) | StringDictionary[DocBlocksRegExp]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
      
      inline def setLineEnding(value: String): Self = StObject.set(x, "lineEnding", value.asInstanceOf[js.Any])
      
      inline def setLineEndingUndefined: Self = StObject.set(x, "lineEnding", js.undefined)
      
      inline def setMarkdown(value: Boolean): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
      
      inline def setMarkdownUndefined: Self = StObject.set(x, "markdown", js.undefined)
      
      inline def setParsers(value: (Record[String, String]) | GetGroup): Self = StObject.set(x, "parsers", value.asInstanceOf[js.Any])
      
      inline def setParsersUndefined: Self = StObject.set(x, "parsers", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
      
      inline def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateSingleFile(value: String): Self = StObject.set(x, "templateSingleFile", value.asInstanceOf[js.Any])
      
      inline def setTemplateSingleFileUndefined: Self = StObject.set(x, "templateSingleFile", js.undefined)
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setWorkers(value: (Record[String, String]) | StringDictionary[Any]): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      inline def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
    }
  }
  
  trait ParsedFile extends StObject {
    
    var blocks: js.Array[Global]
    
    var `extension`: String
    
    var filename: String
    
    var src: String
  }
  object ParsedFile {
    
    inline def apply(blocks: js.Array[Global], `extension`: String, filename: String, src: String): ParsedFile = {
      val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedFile]
    }
    
    extension [Self <: ParsedFile](x: Self) {
      
      inline def setBlocks(value: js.Array[Global]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setBlocksVarargs(value: Global*): Self = StObject.set(x, "blocks", js.Array(value*))
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
}
