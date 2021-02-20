package typings.arangodb.Foxx

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Manifest extends StObject {
  
  var author: String = js.native
  
  var configuration: js.UndefOr[StringDictionary[ConfigurationDefinition]] = js.native
  
  var contributors: js.UndefOr[js.Array[_]] = js.native
  
  var defaultDocument: js.UndefOr[String] = js.native
  
  var dependencies: js.UndefOr[StringDictionary[DependencyDefinition]] = js.native
  
  var description: String = js.native
  
  var engines: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
  
  var files: js.UndefOr[StringDictionary[AssetDefinition]] = js.native
  
  var keywords: js.UndefOr[String] = js.native
  
  var lib: String = js.native
  
  var license: js.UndefOr[String] = js.native
  
  var main: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var provides: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
  
  var repository: js.UndefOr[Type] = js.native
  
  var scripts: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
  
  var tests: js.UndefOr[js.Array[String]] = js.native
  
  var thumbnail: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object Manifest {
  
  @scala.inline
  def apply(author: String, description: String, lib: String): Manifest = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], lib = lib.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
  
  @scala.inline
  implicit class ManifestMutableBuilder[Self <: Manifest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguration(value: StringDictionary[ConfigurationDefinition]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    @scala.inline
    def setContributors(value: js.Array[_]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
    
    @scala.inline
    def setContributorsVarargs(value: js.Any*): Self = StObject.set(x, "contributors", js.Array(value :_*))
    
    @scala.inline
    def setDefaultDocument(value: String): Self = StObject.set(x, "defaultDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDocumentUndefined: Self = StObject.set(x, "defaultDocument", js.undefined)
    
    @scala.inline
    def setDependencies(value: StringDictionary[DependencyDefinition]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngines(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnginesUndefined: Self = StObject.set(x, "engines", js.undefined)
    
    @scala.inline
    def setFiles(value: StringDictionary[AssetDefinition]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    @scala.inline
    def setLib(value: String): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    @scala.inline
    def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProvides(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "provides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidesUndefined: Self = StObject.set(x, "provides", js.undefined)
    
    @scala.inline
    def setRepository(value: Type): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    @scala.inline
    def setScripts(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    @scala.inline
    def setTests(value: js.Array[String]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestsUndefined: Self = StObject.set(x, "tests", js.undefined)
    
    @scala.inline
    def setTestsVarargs(value: String*): Self = StObject.set(x, "tests", js.Array(value :_*))
    
    @scala.inline
    def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
