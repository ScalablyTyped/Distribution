package typings.arangodb.Foxx

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Manifest extends StObject {
  
  var author: String
  
  var configuration: js.UndefOr[StringDictionary[ConfigurationDefinition]] = js.undefined
  
  var contributors: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var defaultDocument: js.UndefOr[String] = js.undefined
  
  var dependencies: js.UndefOr[StringDictionary[DependencyDefinition]] = js.undefined
  
  var description: String
  
  var engines: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  
  var files: js.UndefOr[StringDictionary[AssetDefinition]] = js.undefined
  
  var keywords: js.UndefOr[String] = js.undefined
  
  var lib: String
  
  var license: js.UndefOr[String] = js.undefined
  
  var main: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var provides: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  
  var repository: js.UndefOr[Type] = js.undefined
  
  var scripts: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  
  var tests: js.UndefOr[js.Array[String]] = js.undefined
  
  var thumbnail: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object Manifest {
  
  inline def apply(author: String, description: String, lib: String): Manifest = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], lib = lib.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
  
  extension [Self <: Manifest](x: Self) {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setConfiguration(value: StringDictionary[ConfigurationDefinition]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setContributors(value: js.Array[js.Any]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
    
    inline def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
    
    inline def setContributorsVarargs(value: js.Any*): Self = StObject.set(x, "contributors", js.Array(value :_*))
    
    inline def setDefaultDocument(value: String): Self = StObject.set(x, "defaultDocument", value.asInstanceOf[js.Any])
    
    inline def setDefaultDocumentUndefined: Self = StObject.set(x, "defaultDocument", js.undefined)
    
    inline def setDependencies(value: StringDictionary[DependencyDefinition]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEngines(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
    
    inline def setEnginesUndefined: Self = StObject.set(x, "engines", js.undefined)
    
    inline def setFiles(value: StringDictionary[AssetDefinition]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setLib(value: String): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
    
    inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProvides(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "provides", value.asInstanceOf[js.Any])
    
    inline def setProvidesUndefined: Self = StObject.set(x, "provides", js.undefined)
    
    inline def setRepository(value: Type): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setScripts(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    inline def setTests(value: js.Array[String]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
    
    inline def setTestsUndefined: Self = StObject.set(x, "tests", js.undefined)
    
    inline def setTestsVarargs(value: String*): Self = StObject.set(x, "tests", js.Array(value :_*))
    
    inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
